package testcases;

public class ReverseString2 {
    public static void main(String[] args) {

        String s = "Pavilion";// noilivap
        int len = s.length();
        String rev = "";

        for(int i = len -1; i >= 0; i--){
            rev = rev + s.charAt(i);
        }

        System.out.println("The reverse String is: " + rev);

    }
}
