package Concepts.HashMaps.Easy;

import java.util.HashMap;

/**
 * You're given strings jewels representing the types of stones that are jewels,
 * and stones representing the stones you have. Each character in stones is a type
 * of stone you have. You want to know how many of the stones you have are also jewels.
 *
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * https://leetcode.com/problems/jewels-and-stones/
 */
public class JewelAndStones {
    public static void main(String[] args) {
//        System.out.println(numJewelsInStones1("z", "ZZ"));
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

    public static int numJewelsInStones1(String jewels, String stones) {
        int count = 0;

        if (jewels.length() == 0 || stones.length() == 0) {
            return 0;
        }
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i)== stones.charAt(j)) {
                    count ++;
                }
            }
        }
        return count;
     }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashMap<Integer, Character> item_type = new HashMap<>();

        if (jewels.length() == 0 || stones.length() == 0) {
            return 0;
        }
        for (int i = 0; i < jewels.length(); i++) {
            item_type.put(i, jewels.charAt(i));
        }
        for (int i = 0; i < stones.length(); i++) {
            if (item_type.containsValue(stones.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
