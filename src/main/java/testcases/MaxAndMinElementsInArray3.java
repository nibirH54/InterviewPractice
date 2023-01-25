package testcases;

public class MaxAndMinElementsInArray3 {
    public static void main(String[] args) {

        int a[] ={1,5,8,59,37,22,48,94,107};

        int max = a[0];

        for(int i = 1; i < a.length; i++) {
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("The largest number in array is : " + max);

        int a1[] = {1,5,8,59,37,22,48,94,107};
        int min = a[0];

        for(int i = 1; i < a1.length; i++){
            if(a1[i] < min){
                min = a1[i];
            }
        }
        System.out.println("The smallest number in array is: " + min);

    }
}
