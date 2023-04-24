import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public String decodeMessage(String key, String message) {
        
        List<String> keyList = new ArrayList<>();
        for (String c: key.replace(" ", "").split("")) {
            if (!keyList.contains(c)) {
                keyList.add(c);
            }
        }

        Map<String, String> keyMap = new HashMap();
        int a = 97;
        for (String s: keyList) {
            keyMap.put(s, String.valueOf((char) a++));
        }

        List<String> result = new ArrayList<>();
        for (String k: message.split("")) {
            if (" ".equals(k)) {
                result.add(k);
            } else {
                result.add(keyMap.get(k));
            }
        }

        return String.join("", result);
    }
}