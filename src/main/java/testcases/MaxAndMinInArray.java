package testcases;

public class MaxAndMinInArray {

    public static void main(String[] args) {

        int a[] = {50,30,20,40,60};
        int max = a[0];

        for(int i = 1; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("The Maximum number in array is : " + max);

        int a1[] ={50,30,20,40,60};
        int min = a1[0];

        for(int i = 1; i < a1.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("The minimum number in array is: " + min);
    }




}
