public class Decoding {
    public static void main(String[] args) {
        System.out.println(decryptCaesarCipher("nzop delepd dfaazced jzf", 11));
    }

    public static String decryptCaesarCipher(String str, int secret) {

        String result = ""; // 결과를 담을 빈 배열 선언

        for(int i = 0; i < str.length(); i++) { // 문자열 순회

            if(str.charAt(i) == ' ') {result += ' ';} // 공백은 그대로 더하기
            else
                // 아스키코드 알파벳 소문자(97~122) 범위 벗어나지 않는 경우
                if(str.charAt(i) - secret >= 97) {result += (char)(str.charAt(i) - secret);}
                // 범위를 벗어나는 경우 +26(122에서 빼주기)
                else {result += (char)(str.charAt(i) - secret + 26);}
        }
        return result;
    }
}