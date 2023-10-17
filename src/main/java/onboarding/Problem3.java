package onboarding;

public class Problem3 {

    /*
     * 📚 기능 목록
     * 1. 1부터 number까지 3, 6, 9 가 있는지 판별 후 개수만큼 카운팅
     * 2. 중복 문자 제거
     */

    public static int solution(int number) {
        int answer = 0;

        for(int i = 1; i <= number; i++) {
            String str = String.valueOf(i);
            str = str.replaceAll("([^3|6|9])", "");
            answer += str.length();
        }
        return answer;
    }
}
