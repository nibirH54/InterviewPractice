package testcases;

//Finf the missing number from a given array a[] = {1,2,4,5}
public class MissingNumber {

    public static void main(String[] args) {

        int a[] = {1,2,4,5};
        int sum = 0;
        for(int i = 0;i < a.length; i++){
            sum = sum + a[i];
        }
        System.out.println(sum);

        int sum1 = 0;
        for(int j = 1; j <= 5; j++){
            sum1 = sum1 + j;
        }
        System.out.println(sum1);

        System.out.println("The missing number is: " + (sum1 - sum));
    }
}