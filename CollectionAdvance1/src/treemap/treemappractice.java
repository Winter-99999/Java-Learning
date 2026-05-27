package treemap;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class treemappractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        TreeMap<Character, Integer> tm = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (tm.containsKey(c)) {
                int count = tm.get(c);
                tm.put(c, count + 1);
            } else {
                tm.put(c, 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        tm.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character character, Integer integer) {
                sb.append(character).append("(").append(integer).append(")");
            }
        });
        System.out.println(sb);
    }
}
