package testcases;

public class ReverseInteger3 {
    public static void main(String[] args) {
         int num = 65786;//68756
         int rev = 0;
         while (num != 0){
             rev = rev * 10 + num % 10;
             num = num/10;
         }
         System.out.println("The reverse integer is: " + rev);
    }
}
