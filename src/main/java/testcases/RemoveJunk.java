package testcases;

public class RemoveJunk {
    public static void main(String[] args) {

        String s = "!?>+<@%&$#) Latin String 0123456789";

        s = s.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(s);
    }
}
