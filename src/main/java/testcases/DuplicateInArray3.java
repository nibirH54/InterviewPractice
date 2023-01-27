package testcases;

public class DuplicateInArray3 {

    public static void main(String[] args) {

        int a[] = new int[]{5,3,6,8,5,9,2,3,4,9,7,};

        for(int i = 0; i < a.length; i++){
            for(int j = i +1; j < a.length; j++){
                if(a[i] == a[j]){
                    System.out.print(" " + a[j]);
                }
            }
        }

    }
}
