package testcases;

public class ReverseInteger2 {
    public static void main(String[] args) {

        long num = 765456895;//598654567
        long rev = 0;
        while(num !=0){
            rev = rev * 10 + num % 10;
            num = num/10;
        }
        System.out.println("The reverse number is :" + rev);

        long num1 = 765456895;
        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
    }

    }

