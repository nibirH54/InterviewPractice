package testcases;


//Reverse a given string s= "Salsabil"

public class ReverseString12 {

    public static void main(String[] args) {

        String s = "Salsabil";

        int len = s.length();

        String rev = "";

        for(int i = len -1; i >=0; i--){
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
    }
}
