// 문자열을 입력받아 연속되는 문자가 있을 경우, 연속 구간을 반복되는 수와 문자로 조합한 형태로 압축한 문자열을 리턴
// 예시 "wwwggoppopppp" -> "3wggoppo4p"

public class Compress {

    public static void main(String[] args) {
        System.out.println(compressString("wwwggoppopppp"));
    }

    public static String compressString(String str) {

        str = str + ' ';
        String result = "";
        int count = 1;

        char[] a = str.toCharArray();
        char temp = a[0];

        for (int i = 1; i < a.length; i++) {
            if (temp == a[i]) count++;
            else {
                if (count < 3) {
                    for (int j = 0; j < count; j++) {
                        result = result + temp;
                    }
                } else {
                    result = result + count + temp;
                }
                temp = a[i]; //배열의 다음 글자로 이동
                count = 1;
            }
        }
        return result;
    }
}






