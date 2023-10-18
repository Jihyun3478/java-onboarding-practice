package onboarding;

public class Problem3 {

    /*
     * 📚 기능 목록
     * 1. 1부터 number까지 3, 6, 9 가 있는지 판별 후 개수만큼 카운팅하는 기능
     */

    public static int solution(int number) {
        int answer = 0;

        for(int i = 1; i <= number; i++) {
            String string = String.valueOf(i);
            string = string.replaceAll("([^3|6|9])", "");
            answer += string.length();
        }
        return answer;
    }
}
