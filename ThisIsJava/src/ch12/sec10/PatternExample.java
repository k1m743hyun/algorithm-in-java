package src.ch12.sec10;

import java.util.*;
import java.util.regex.Pattern;

public class PatternExample {

    public static void main(String[] args) {

        List<Map<String, String>> mapList = new ArrayList<>();
        mapList.add(new HashMap<>(){{
            put("regExp", "(02|010)-\\d{3,4}-\\d{4}");
            put("data", "010-123-4567");
        }});
        mapList.add(new HashMap<>(){{
            put("regExp", "\\w+@\\w+\\.\\w+(\\.\\w+)?");
            put("data", "angel@mycompanycom");
        }});

        for (Map<String, String> map : mapList) {
            String regExp = map.get("regExp");
            String data = map.get("data");
            boolean result = Pattern.matches(regExp, data);
            if (result) {
                System.out.println("정규식과 일치합니다.");
            } else {
                System.out.println("정규식과 일치하지 않습니다.");
            }
        }
    }
}
