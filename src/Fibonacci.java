import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    public static int fibonacci(int num) {
        ArrayList<Integer> memo = new ArrayList<>();
        memo.add(0);
        memo.add(1);

        return aux(memo, num);
    }

    public static int aux(ArrayList<Integer> memo, int num) {
        if (memo.size() <= num) {
            memo.add(aux(memo, num - 1) + aux(memo, num - 2));
        }
        return memo.get(num);
    }
}

// int[] memo = new int[num + 2]; // 값을 저장할 배열을 만들어 초기화

// memo[0] = 0;
// memo[1] = 1;

// for(int i = 2; i <= num; i++) { // for문을 이용해 배열 채우기
//     memo[i] = memo[i - 1] + memo[i - 2];
// }

// return memo[num];