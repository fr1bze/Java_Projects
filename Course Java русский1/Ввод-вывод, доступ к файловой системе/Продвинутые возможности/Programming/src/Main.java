import java.io.*;
import java.util.Objects;

class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }

    public static Animal[] deserializeAnimalArray(byte[] data) throws IOException {
        Animal[] animals = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int n = objectInputStream.readInt();
            animals = new Animal[n];
            for (int i = 0; i < n; ++i) {
                animals[i] = (Animal) objectInputStream.readObject();
            }
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
        return animals;
    }
}