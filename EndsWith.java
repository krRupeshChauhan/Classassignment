public class EndsWith {
    public static void main(String[] args) {

        String s1 = "java by w3school";
        System.out.println(s1.endsWith("t"));  //false
        System.out.println(s1.endsWith("point"));  //false
        String str = "Welcome to Javatpoint.com";
        System.out.println(str.endsWith("point"));  //false
        if (str.endsWith(".com")) {
            System.out.println("String ends with .com");
        } else System.out.println("It does not end with .com");
    }
}