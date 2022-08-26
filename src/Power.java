// 문제
// 두 수를 입력받아 거듭제곱을 리턴해야 합니다.
//
// 입력
// 인자 1: base
// int 타입의 자연수 (base >= 2)
// 인자 2: exponent
// int 타입의 정수 (exponent >= 0)
//
// 출력
// long 타입을 리턴해야 합니다.
// 실제 계산 결과를 94,906,249로 나눈 나머지를 리턴해야 합니다.

public class Power {
    public static void main(String[] args) {
        System.out.println(power(5,22));
    }
    public static long power(int base, int exponent) {
        long result;

        // 지수가 0인 경우(종료 조건).
        if (exponent == 0) return 1;
        // 반으로 나눈 거듭제곱 계산.
        long res = power(base, exponent / 2);
        // 지수가 짝수인 경우.
        if (exponent % 2 == 0) result = (res * res) % 94906249;
            // 지수가 홀수인 경우
        else result = (res * res * base) % 94906249;

        return result;
    }
}
