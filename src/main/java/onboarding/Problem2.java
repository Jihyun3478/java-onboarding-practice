package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {
    public static String solution(String cryptogram) {
        // 처음부터 끝까지 연속된 2개의 문자가 있는지 체크 후, 있다면 둘 다 제거
        // 연속된 문자가 없을 때까지 위 과정 반복
        return removeAll(cryptogram);
    }

    public static String removeAll(String s) {
        List<String> list = new ArrayList<>(Arrays.asList(s.split("")));


    }
}
