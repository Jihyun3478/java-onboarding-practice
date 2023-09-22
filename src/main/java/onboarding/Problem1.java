package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        // 각 자리의 수를 더하거나 곱했을 때, 가장 큰 수
        // 포비가 크면 1, 크롱이 크면 2, 같으면 0, 예외 -1

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