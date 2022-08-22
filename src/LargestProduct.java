// 정수를 요소로 갖는 배열을 입력받아 3개의 요소를 곱해 나올 수 있는 최대값을 리턴
// 입력으로 주어진 배열은 중첩되지 않은 1차원 배열
// 배열의 요소는 음수와 0을 포함하는 정수
// 배열의 길이는 3 이상

import java.util.Arrays;

public class LargestProduct {
    public static void main(String[] args) {
        int[] arr2 = {-5, -4, -3, -1, 999, 10000};
        System.out.println(largestProductOfThree(arr2));
    }

    public static int largestProductOfThree(int[] arr) {

        int result;
        int a = arr.length - 1;
        Arrays.sort(arr);

        if(arr[a] >= 0) {
            if(arr[a - 1] >= 0 && arr[a - 2] >= 0) {
                result = Math.max(arr[a] * arr[a - 1] * arr[a - 2], arr[a] * arr[0] * arr[1]);
            } else { // arr[a] >= 0, arr[a - 1] < 0 , arr[a - 2] < 0
                result = arr[a] * arr[0] * arr[1];
            }
        } else { // arr[a] < 0
            result = arr[a] * arr[a - 1] * arr[a - 2];
        }
        return result;
    }
}