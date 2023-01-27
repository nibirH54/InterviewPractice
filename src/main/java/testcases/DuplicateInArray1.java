package testcases;

public class DuplicateInArray1 {

    public static void main(String[] args) {

        int a[] = new int[]{1,2,3,1,5,6,7,3,2,};

        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i] == a[j]){
                    System.out.print( " " + a[j]);
                }
            }
        }
    }
}
