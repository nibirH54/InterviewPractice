package testcases;

public class BinarySearch2 {
    public static void main(String[] args) {

        int a[] = {11,12,13,14,15,16,17,18,19,20};
        boolean flag = false;

        int key = 25;
        int l = 0;
        int h = a.length - 1;

        while(l <= h){
            int m = (l + h/2);
            if(a[m] == key){
                System.out.println("ELEMENT FOUND..");
                flag = true;
                break;
            }
            if(a[m] < key){
                l = m+1;
            }
            if(a[m] > key){
                h = m-1;
            }
        }
        if( flag == false){
            System.out.println("ELEMENT NOT FOUND...");
        }
    }
}
