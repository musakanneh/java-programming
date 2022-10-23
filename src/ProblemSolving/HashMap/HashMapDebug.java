package ProblemSolving.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDebug {
    public static void main(String[] args) {
        System.out.println(putImplementation());
    }

    static int putImplementation() {
        Map<String, Integer> map  = new HashMap<>();
        map.put("aaa", 1);
        System.out.println(map);

        for (String m : map.keySet()) {
            System.out.println(m);
        }
        return map.size();
    }
}