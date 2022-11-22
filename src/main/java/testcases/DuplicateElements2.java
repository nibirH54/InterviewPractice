package testcases;

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
    }
}
