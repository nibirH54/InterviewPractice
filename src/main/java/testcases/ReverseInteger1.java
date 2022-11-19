package testcases;

public class ReverseInteger1 {

    public static void main(String[] args) {
        long num = 45644476;
        long rev = 0;
        while(num != 0){
            rev = rev * 10 + num %10;
            num = num/10;
        }
        System.out.println("The Reverse Number is: " + rev);

        //Using StringBuffer Function
        long num1 = 47655787;
        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
    }
}
