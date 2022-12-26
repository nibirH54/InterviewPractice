package testcases;

public class ReverseInteger4 {
    public static void main(String[] args) {

        long num = 95487699; // 99678459

        long rev = 0;

        while(num != 0){
            rev = rev * 10 + num % 10;
            num = num/10;
        }

        System.out.println("The reverse integer is :" + rev);


    }
}
