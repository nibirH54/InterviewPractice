package testcases;

public class FindSubString3 {

    public static boolean isSubString(String main, String sub){
        return main.matches("(.*)" + sub + "(.*)");
    }


    public static void main(String[] args) {
        System.out.println(isSubString("Software Development","Dev"));
        System.out.println(isSubString("Defect Lifecycle","bugs"));
        System.out.println(isSubString("Jira Test Management","ji"));

    }
}
