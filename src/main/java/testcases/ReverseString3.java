package testcases;

public class ReverseString3 {
    public static void main(String[] args) {

        String s = "Masum"; //musam
        int len = s.length();

        String rev = "";

        for(int i = len -1; i >= 0; i--){
            rev = rev + s.charAt(i);
        }

        System.out.println(rev);
    }
}
