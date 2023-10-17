package onboarding;

import java.util.List;

class Problem1 {
    /*
    * 📚 기능 목록
    * 1. 두 수의 합과 곱을 구해 가장 큰 수를 구하는 기능
    * 2. 주어진 페이지의 유효성을 검증하는 기능
    */
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        String[] pobiArr = new String[2];
        pobiArr[0] = String.valueOf(pobi.get(0));
        pobiArr[1] = String.valueOf(pobi.get(1));
        int pobiNum = max(pobiArr);

        String[] crongArr = new String[2];
        crongArr[0] = String.valueOf(crong.get(0));
        crongArr[1] = String.valueOf(crong.get(1));
        int crongNum = max(crongArr);

        int answer = 0;
        if(pobiNum > crongNum) {
            answer =  1;
        }
        else if(pobiNum < crongNum) {
            answer =  2;
        }

        if((Integer.parseInt(pobiArr[0]) != Integer.parseInt(pobiArr[1])-1)
                || (Integer.parseInt(crongArr[0]) != Integer.parseInt(crongArr[1])-1)) {
            answer =  -1;
        }
        return answer;
    }

    public static int max(String[] list) {
        int sum = 0, mul = 1, answer1 = 0, answer2 = 0;

        for(int i = 0; i < list[0].length(); i++) {
            sum += Character.getNumericValue(list[0].charAt(i));
            mul *= Character.getNumericValue(list[0].charAt(i));
            answer1 = Math.max(sum, mul);
        }

        for(int i = 0; i < list[1].length(); i++) {
            sum += Character.getNumericValue(list[1].charAt(i));
            mul *= Character.getNumericValue(list[1].charAt(i));
            answer2 = Math.max(sum, mul);
        }
        return Math.max(answer1, answer2);
    }
}