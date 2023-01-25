package testcases;

public class DuplicateElements8 {

    public static void main(String[] args) {

        String cities[] = {"Dhaka", "Sylhet", "Rangpur", "Sylhet", "Comilla", "Dhaka"};

        for(int i = 0; i < cities.length; i ++){
            for(int j = i + 1; j < cities.length; j++){
                if(cities[i].equals(cities[j])){
                    System.out.println(cities[i]);
                }
            }
        }
    }
}
