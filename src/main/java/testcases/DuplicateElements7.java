package testcases;

public class DuplicateElements7 {

    public static void main(String[] args) {

        String names[] = {"India", "Pakistan", "Nepal", "Bhutan", "India", "Nepal"};

        for(int i = 0; i< names.length; i++){
            for(int j = i +1; j < names.length; j++){
                if(names[i].equals(names[j])){
                    System.out.println(names[i]);
                }
            }
        }
    }
}
