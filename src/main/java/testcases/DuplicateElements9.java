package testcases;

public class DuplicateElements9 {

    public static void main(String[] args) {

        String foods[]= {"rice", "Burger", "chips", "Burger", "banana", "chips"};

        for(int i = 0; i < foods.length; i ++){
            for(int j = i + 1; j < foods.length; j ++){
                if(foods[i].equals(foods[j])){
                    System.out.println(foods[i]);
                }
            }
        }
    }
}
