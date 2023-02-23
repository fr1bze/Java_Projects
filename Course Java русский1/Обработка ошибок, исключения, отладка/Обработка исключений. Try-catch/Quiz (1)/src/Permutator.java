import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutator {
    private static String insertChar(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }
    public static Set<String> permutationFinder(String str)
    {
        Set<String> perm = new HashSet<>();
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0);
        String rem = str.substring(1);
        Set<String> words = permutationFinder(rem);
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){
                perm.add(insertChar(strNew, initial, i));
            }
        }
        return perm;
    }

    public static void main(String[] args) {
        System.out.println(Permutator.permutationFinder("ABC").toString());
    }
}
