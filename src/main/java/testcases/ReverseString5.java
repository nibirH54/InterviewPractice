package testcases;

public class ReverseString5 {

    public static void main(String[] args) {

        String s = "Surma";//amrus
        int len = s.length();
        String rev = "";

        for(int i = len -1; i >= 0; i--){
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
    }
}
