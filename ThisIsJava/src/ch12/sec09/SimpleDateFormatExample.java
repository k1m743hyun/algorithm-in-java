package src.ch12.sec09;

import java.text.SimpleDateFormat;
import java.util.*;

public class SimpleDateFormatExample {

    public static void main(String[] args) {

        Date now = new Date();

       String[] patternList = {"yyyy-MM-dd", "yyyy년 MM월 dd일", "yyyy.MM.dd a HH:mm:ss", "오늘은 E요일", "올해의 D번째 날", "이달의 d번째 날"};
        SimpleDateFormat sdf;
        for (String pattern : patternList) {
            sdf = new SimpleDateFormat(pattern);
            System.out.println(sdf.format(now));
        }
    }
}
