// 문제
// 두 개의 배열(base, sample)을 입력받아 sample이 base의 부분집합인지 여부를 리턴해야 합니다.
//
// 입력

// 인자 1 : base
// int 타입을 요소로 갖는 임의의 배열
// base.length는 50,000 이하

// 인자 2 : sample
// int 타입을 요소로 갖는 임의의 배열
// sample.length는 50,000 이하

// 출력
// boolean 타입을 리턴해야 합니다.

// 주의사항
// base, sample 내에 중복되는 요소는 없다고 가정합니다.

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        System.out.println(isSubsetOf(new int[]{1, 4, 5, 6, 77, 88, 123335}, new int[]{1, 123335}));
    }

    public static boolean isSubsetOf(int[] base, int[] sample) {

        List<Integer> basearr = new ArrayList<>();
        for (int i : base) {
            basearr.add(i);
        }
        List<Integer> samarr = new ArrayList<>();
        for (int i : sample) {
            samarr.add(i);
        }

        return basearr.containsAll(samarr);
    }
}
