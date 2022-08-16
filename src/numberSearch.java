// 문자열을 입력받아 문자열에서 숫자를 모두 찾아 더한 뒤에 해당 값을
// (숫자와 공백을 제외한 나머지) 문자열의 길이로 나눈 값을 정수로 반올림하여 리턴

public class numberSearch {

    public static void main(String[] args) {
        String str = "Hello6 9World 2, Nic8e D7ay!";

        System.out.println(search(str));
    }

    public static int search(String str) {

        String intStr = str.replaceAll("[^0-9]", ""); // 문자열에서 숫자만 뽑기
        String charStr = str.replaceAll("[^a-z, ^A-Z]", ""); // 문자열에서 문자만 뽑기
        String charStr2 = charStr.replaceAll(" ", ""); // 뽑은 문자에서 공백 제거

        double sum = 0;

        for(int i = 0; i < intStr.length(); i++) {
            sum += Character.getNumericValue(intStr.charAt(i));
        }

        double result = Math.round(sum / charStr2.length());

        return (int)Math.round(result);
    }
}
