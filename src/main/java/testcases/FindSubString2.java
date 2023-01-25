package testcases;

public class FindSubString2 {

    public static boolean isSubString(String main, String sub){
        return main.matches("(.*)" + sub + "(.*)");
    }


    public static void main(String[] args) {
        System.out.println(isSubString("Selenium Automation", "Testing"));
        System.out.println(isSubString("Java Programming", "ava"));
        System.out.println(isSubString("accessibility Batch 2","2"));

    }
}
