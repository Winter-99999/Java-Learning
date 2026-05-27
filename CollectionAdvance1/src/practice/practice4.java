package practice;

import java.util.*;

public class practice4 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>();
        String[] citys1 = {"成都", "汶川", "西昌", "攀枝花"};
        Collections.addAll(list1, citys1);
        hm.put("四川省", list1);
        ArrayList<String> list2 = new ArrayList<>();
        String[] citys2 = {"保定", "沧州", "承德", "廊坊"};
        Collections.addAll(list2, citys2);
        hm.put("河北省", list2);
        ArrayList<String> list3 = new ArrayList<>();
        String[] citys3 = {"大理", "丽江", "香格里拉", "昆明"};
        Collections.addAll(list3, citys3);
        hm.put("云南省", list3);
        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            StringJoiner sj = new StringJoiner(",", "", "");
            ArrayList<String> value = entry.getValue();
            for (String s : value) {
                sj.add(s);
            }
            System.out.println(entry.getKey() + " : " + sj);
        }

    }
}
