package onboarding;

public class Problem4 {

    /*
     * 📚 기능 목록
     * 1. 엄마의 말씀을 청개구리 사전대로 변환하는 기능
     */
    public static String solution(String word) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < word.length(); i++) {
            answer.append(converseTo(word.charAt(i)));
        }
        return answer.toString();
    }

    public static char converseTo(char letter) {
        char result = letter;
        if(Character.isUpperCase(result)) {
            result = (char)('A' + 'Z' - letter);
        }
        else if(Character.isLowerCase(result)) {
            result = (char)('a' + 'z' - letter);
        }
        return result;
    }
}
