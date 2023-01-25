package testcases;

public class MaxAndMinElementsInArray2 {
    public static void main(String[] args) {

        /*int a[] = {300, 400, 500, 305, 108, 508, 208, 50, 30, 10, 20, 2, 9};

        int max = a[0];

        for(int i = 2; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("The maximum element in array is :" + max);*/

        int a[] = {300, 400, 500, 305, 108, 508, 208, 50, 30, 10, 20, 2, 9};

        int min = a[0];

        for(int i = 2; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("The minimum element in array is :" + min);




    }
}
