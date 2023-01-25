package testcases;

public class BinarySearch4 {

    public static void main(String[] args) {
        int a[] = {21,22,23,24,25,26,27,28,29,30};
        boolean flag = false;

        int key = 21;
        int l = 0;
        int h = a.length -1;

        while(l <= h){
            int m = l + h/2;
            if(a[m] == key){
                System.out.println("ELEMENT FOUND..");
                flag = true;
                break;
            }

            if(a[m] < key){
                l = m +1;
            }
            if(a[m] > key){
                h = m -1;
            }
        }
        if(flag == false){
            System.out.println("ELEMENT NOT FOUND..");
        }

    }
}
