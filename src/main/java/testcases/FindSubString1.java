package testcases;

public class FindSubString1 {
    public static boolean isSubString(String main, String sub){
        return main.matches("(.*)" + sub + "(.*)");
    }


    public static void main(String[] args) {
        System.out.println(isSubString("Scratch Tech Solutions", "Solutions"));

    }
}
