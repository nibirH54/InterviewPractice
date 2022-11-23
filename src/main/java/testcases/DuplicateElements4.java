package testcases;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements4 {
    public static void main(String[] args) {

        String nums[] = {"1","2","4","7","9","2","5","6","5"};

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i].equals(nums[j])){
                    System.out.println("The duplicate element is : " + nums[i]);
                }
            }
        }

        System.out.println("****************************************************************");

        //Using HashSet

        Set<String> store = new HashSet<String>();
        for(String name : nums){
            if(store.add(name) == false){
                System.out.println("The duplicate element is :" + name);
            }
        }

    }
}
