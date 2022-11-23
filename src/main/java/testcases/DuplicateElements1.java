package testcases;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements1 {
    public static void main(String[] args) {

        String names[] = {"Sazzad", "Masum", "Bijoy", "Mithun", "Nibir", "Sazzad", "Nibir"};

        for(int i = 0; i < names.length; i++){
            for(int j = i + 1; j < names.length; j++){
                if(names[i].equals(names[j])){
                    System.out.println("The duplicate element is: " + names[i]);
                }
            }
        }

        System.out.println("********************************************************************");

        //Using HasSets

        Set<String> store = new HashSet<String>();
        for(String name : names){
            if(store.add(name) == false){
                System.out.println("The duplicate element is: " + name);
            }
        }
    }
}
