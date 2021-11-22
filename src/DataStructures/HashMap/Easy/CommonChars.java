package DataStructures.HashMap.Easy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Given a string array words, return an array of all characters that
 * show up in all strings within the words (including duplicates).
 * You may return the answer in any order.
 *
 * https://leetcode.com/problems/find-common-characters/
 */
public class CommonChars {
    public static void main(String[] args) {
        System.out.println(commonChars());
    }

    static List<String> commonChars() {
        String[] words = {"bella", "label", "roller"};
        HashMap<Character,Integer> res = new HashMap();
        for(char i : words[0].toCharArray() ){
            res.put(i,res.getOrDefault(i,0) + 1);

        }
        for(int i = 1; i < words.length; i++){
            char[] temp = words[i].toCharArray();
            HashMap<Character,Integer> map = new HashMap();

            for(char j : temp){
                if(res.containsKey(j)){
                    map.put(j,Math.min(map.getOrDefault(j,0)+1,res.get(j)));
                }
            }
            res = map;
        }

        List<String> result = new ArrayList();
        for(char i : res.keySet()){
            int idx = res.get(i);
            while(idx > 0){
                result.add(" " + i);
                idx--;
            }
        }
        return result;
    }
}