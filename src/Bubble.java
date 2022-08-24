// 정수를 요소로 갖는 배열을 입력받아 오름차순으로 정렬하여 리턴
// 버블 정렬(bubble sort)은 여러 정렬 알고리즘(삽입 정렬, 퀵 정렬, 병합 정렬, 기수 정렬 등) 중 가장 기본적인 알고리즘
// 1. 첫 번째 요소가 두 번째 요소보다 크면, 두 요소의 위치를 교체 (swap)
// 2. 두 번째 요소와 세 번째 요소보다 크면, 두 요소의 위치를 교체 (swap)
// 3. 1, 2를 마지막까지 반복 (마지막에서 두 번째 요소와 마지막 요소를 비교)
// 4. 1~3의 과정을 한 번 거치게 되면, 가장 큰 요소가 배열의 마지막으로 이동
// 5. 1~3의 과정을 첫 요소부터 다시 반복
// 6. 5를 통해 두 번째로 큰 요소가 배열의 마지막 바로 두 번째로 이동
// 7. 1~3의 과정을 총 n(배열의 크기)번 반복
// 입력으로 주어진 배열은 중첩되지 않은 1차원 배열

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(bubbleSort(new int[]{2, 7, 1, 4, 3})));
    }

    public static int[] bubbleSort(int[] arr) {

        int swap = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if(swap == 0) break;
        }
        return arr;


        // 긴 배열의 경우 시간초과가 나오는 알고리즘
//        for(int j = 0; j < arr.length; j ++) {
//            for(int i = 0; i < arr.length -1; i++) {
//                if(arr[i] > arr[i + 1]) {
//                    int temp = 0;
//                    temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                  }
//                }
//            }
    }
}


//        for(int j = 0; j < arr.length; j ++) {
//        for(int i = 0; i < arr.length -1; i++) {
//        if(arr[i] > arr[i + 1]) {
//        int temp = 0;
//        temp = arr[i];
//        arr[i] = arr[i + 1];
//        arr[i + 1] = temp;
//        }
//        }
//        }