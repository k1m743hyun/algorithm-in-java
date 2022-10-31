import java.util.HashMap;

class Solution {

    public String restoreString(String s, int[] indices) {

        HashMap<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], s.charAt(i));
        }

        String result = "";
        for (int j = 0; j < map.size(); j++) {
            result += map.get(j);
        }

        return result;
    }
}