package testcases;

public class DuplicateElements10 {

    public static void main(String[] args) {

        String cars[] = {"Toyota", "Nissan", "Honda", "Mazda", "Nissan", "Toyota"};//toyota,nissan

        for(int i =0; i < cars.length; i++){
            for(int j = i +1; j < cars.length; j++){
                if(cars[i].equals(cars[j])){
                    System.out.println(cars[i]);
                }
            }
        }

    }
}
