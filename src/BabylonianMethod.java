public class BabylonianMethod {

    public static void main(String[] args) {

        System.out.println(sqrt(15));
    }

    private static String sqrt(long num) {

        double result = 1, j = 1;
        int i = 1;

        //제곱수인 경우
        while(true){
            if(j * j == num){
                return String.format("%.2f", j); //소수점 셋째 자리에서 반올림
            } else if (j * j > num) {
                break;
            }
            j++;
        }

        //바빌로니아 법
        while(i <= 3){ //3부터 문제를 만족하는 정확도 제공
            result = (result * result + num) / (2 * result);
            i++;
        }
        return String.format("%.2f", result); //소수점 셋째 자리에서 반올림
        // return String.valueOf(Math.round(result * 100) / 100.0);
    }
}

