import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
private static void sortWords() {
    Scanner scanner = new Scanner(System.in);
    String input = "";
        while(scanner.hasNextLine())

    {
        input += scanner.nextLine() + "\n";
    }

    String[] finalInput = input.split("[^a-zA-Zа-яА-Я0-9']+");
    Map<String, Long> wordCountMap = Stream.of(finalInput)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    Map<String, Long> sortedWordCountMap = new LinkedHashMap<>();

// Sort the entries by value, then by key if values are equal
    Comparator<Map.Entry<String, Long>> valueComparator = Map.Entry.<String, Long>comparingByValue()
            .reversed().thenComparing(Map.Entry.comparingByKey());

    wordCountMap.entrySet().stream()
            .sorted(valueComparator)
            .forEachOrdered(entry -> sortedWordCountMap.put(entry.getKey(), entry.getValue()));

    List<String> sortedKeys = new ArrayList<>(sortedWordCountMap.keySet());
    if (sortedKeys.size() > 10) {
        sortedKeys = sortedKeys.subList(0, 10);
    }

    for (String key : sortedKeys) {
        //System.out.println(key + " - " + sortedWordCountMap.get(key));
        System.out.println(key);
    }
}

    private static void sortWords(String str) {

        String input = "";

            input = str;

        String[] finalInput = input.toLowerCase().split("[^a-zA-Zа-яА-Я0-9']+");
        Map<String, Long> wordCountMap = Stream.of(finalInput)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> sortedWordCountMap = new LinkedHashMap<>();

// Sort the entries by value, then by key if values are equal
        Comparator<Map.Entry<String, Long>> valueComparator = Map.Entry.<String, Long>comparingByValue()
                .reversed().thenComparing(Map.Entry.comparingByKey());

        wordCountMap.entrySet().stream()
                .sorted(valueComparator)
                .forEachOrdered(entry -> sortedWordCountMap.put(entry.getKey(), entry.getValue()));

        List<String> sortedKeys = new ArrayList<>(sortedWordCountMap.keySet());
        if (sortedKeys.size() > 10) {
            sortedKeys = sortedKeys.subList(0, 10);
        }

        for (String key : sortedKeys) {
            //System.out.println(key + " - " + sortedWordCountMap.get(key));
            System.out.println(key);
        }

    }


    public static void main(String[] args) {
        String strTest1 = "Мама мыла-мыла-мыла раму!";

        String strTest2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.";

        sortWords(strTest1);
        System.out.println("-------------------------");
        sortWords(strTest2);
    }
}