package testcases;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements6 {

    public static void main(String[] args) {

        String names [] = {"Bangladesh", "Pakistan", "Brazil", "Argentina", "Poland", "France", "Uruguya", "Japan", "Bangladesh"};

        Set<String> store = new HashSet<String>();
        for(String name : names){
            if(store.add(name) == false){
                System.out.println("The duplicate element is: " + name);
            }
        }
    }
}
