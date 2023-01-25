package testcases;

public class MissingNumber6 {

    public static void main(String[] args) {

        int a[] = {1,2,3,5,6,7};

        int sum = 0;

        for(int i = 0; i < a.length; i++){
            sum = sum + a[i];//24
        }
        System.out.println(sum);

        int sum1 = 0;

        for(int j = 1; j <= 7; j++){
            sum1 = sum1 + j;
        }
        System.out.println(sum1);

        System.out.println("The missing number from array is : " + (sum1 - sum));


    }
}
