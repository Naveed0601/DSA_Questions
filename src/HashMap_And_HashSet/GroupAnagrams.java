package HashMap_And_HashSet;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            System.out.println(charArray);
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            System.out.println(sortedStr);
            map.putIfAbsent(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(str);
        }

        System.out.println("Total Value" + map.values());
    }
}
