package testcases;

public class MaxAndMinElementsInArray1 {

    public static void main(String[] args) {

       int a[] = {100, 80, 200, 400, 256, 5, 15, 206};
        int max = a[0];

        for(int i = 1; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }

        System.out.println("The largest number in array is : " + max);

        int a1[] = {100, 80, 200, 400, 256, 5, 15, 206};

        int min = a1[0];

        for(int i = 1; i < a.length; i++){
            if(a1[i] < min){
                min = a1[i];
            }
        }

        System.out.println("The smallest element in array is :" + min);




    }
}
