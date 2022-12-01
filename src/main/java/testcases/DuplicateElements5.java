package testcases;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements5 {
    public static void main(String[] args) {

        String names[] = {"Python", "C", "Java", "JavaScript", "Go", "Java", "Ruby"};

        Set<String> store = new HashSet<String>();
        for(String name : names){
            if(store.add(name) == false){
                System.out.println("The duplicate element is: " + name);
            }
        }
    }
}
