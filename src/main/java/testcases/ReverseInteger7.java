package testcases;

public class ReverseInteger7 {

    public static void main(String[] args) {

        int num = 95678;//87659

        int rev = 0;

        while(num != 0){
            rev = rev * 10 + num % 10;
            num = num/10;
        }
        System.out.println("The reverse number is : " + rev);}
}
