package testcases;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements2 {
    public static void main(String[] args) {

        String states[] = {"New york", "California", "Chicago", "Atlanta", "Texas", "New york", "Chicago"};

        for(int i = 0; i < states.length; i++){
            for(int j = i + 1; j < states.length; j++){
                if(states[i].equals(states[j])){
                    System.out.println("The duplicate element is: " + states[i]);
                }
            }
        }

        System.out.println("************************************************************************");

        //using HasSet

        Set<String> store = new HashSet<String>();
        for(String name : states){
            if(store.add(name) == false){
                System.out.println("The duplicate element is : " + name);
            }
        }
    }
}
