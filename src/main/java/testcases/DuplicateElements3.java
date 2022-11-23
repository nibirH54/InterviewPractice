package testcases;

public class DuplicateElements3 {
    public static void main(String[] args) {

        String cars[] = {"Toyota", "Honda", "Nissan", "BMW", "Ford", "Nissan", "Honda"};

        for(int i = 0; i < cars.length; i++){
            for(int j = i + 1; j < cars.length; j++){
                if(cars[i].equals(cars[j])){
                    System.out.println("The duplicate element is : " + cars[i]);
                }
            }
        }

    }
}
