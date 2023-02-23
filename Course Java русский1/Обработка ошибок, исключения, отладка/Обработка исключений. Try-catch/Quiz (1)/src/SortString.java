//import java.util.*;
//
//class SortString {
//    public String frequencySort(String s) {
//        if (s.length() < 3) return s;
//        StringBuilder result = new StringBuilder();
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (char character : s.toCharArray()) {
//            map.merge(character, 1, Integer::sum);
//        }
//        map.entrySet().stream()
//                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//                .forEach(entry -> result.append(String.valueOf(entry.getKey()).repeat(entry.getValue())));
//
//        return result.toString();
//    }
//
//    public static void main(String[] args) {
//        SortString sortString = new SortString();
//        System.out.println(sortString.frequencySort("abgwgabc"));
//    }
//}