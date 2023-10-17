package onboarding;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Problem2 {
    /*
     * 📚 기능 목록
     * 1. 중복된 문자가 있는지 확인하는 기능
     * 2. 중복 문자를 제거하는 기능
     */
    public static String solution(String cryptogram) {
        String answer = cryptogram;
        answer = removeAll(cryptogram);
        return answer;
    }

    public static String removeAll(String s) {
        String result = s.replaceAll("(\\w)\\1+", "");

        if(checkDuplicate(result)) {
            return removeAll(result);
        }
        return result;
    }

    public static boolean checkDuplicate(String cryptogram) {
        Pattern pattern = Pattern.compile("(\\w)\\1+");
        Matcher matcher = pattern.matcher(cryptogram);

        return matcher.find();
    }
}
