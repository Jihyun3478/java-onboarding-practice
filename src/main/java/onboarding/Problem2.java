package onboarding;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Problem2 {
    /*
     * 📚 기능 목록
     * 1. 중복된 문자가 있는지 확인
     * 2. 중복 문자 제거
     */
    public static String solution(String cryptogram) {
        String answer = cryptogram;
        answer = removeAll(cryptogram);
        return answer;
    }

    public static String removeAll(String s) {
        String result = s.replaceAll("(\\w)\\1+", "");

        if(checkDuplicate(s)) {
            result = removeAll(s);
        }
        return result;
    }

    public static boolean checkDuplicate(String cryptogram) {
        Pattern pattern = Pattern.compile("(\\w)\\1+");
        Matcher matcher = pattern.matcher(cryptogram);

        return matcher.find();
    }
}
