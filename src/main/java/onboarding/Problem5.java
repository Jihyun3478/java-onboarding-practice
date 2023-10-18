package onboarding;

import java.util.Arrays;
import java.util.List;

public class Problem5 {
    /*
     * 📚 기능 목록
     * 1. 금액이 해당 금액 권보다 큰지 작은지 판단하는 기능
     * 2. 금액이 일정 금액보다 작거나 같으면
     */
    public static List<Integer> solution(int money) {
        int[] bills = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 };
        Integer[] answer = new Integer[9];

        for(int i = 0; i < bills.length; i++) {
            answer[i] = moneyAmount(money, bills[i]);
            money = divideMoney(money, bills[i]);
        }
        return Arrays.asList(answer);
    }

    public static int divideMoney(int money, int bills) {
        if(money >= bills) {
            money %= bills;
        }
        return money;
    }

    public static int moneyAmount(int money, int bills) {
        return money / bills;
    }
}
