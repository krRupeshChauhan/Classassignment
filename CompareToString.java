public class CompareToString {
    public static void main(String[] args) {
        String str1 = "java is ";
        String str2 = "open source plateform";
        String str3 = "object oriented programing language";
        String str4 = str1.concat("concat 2 string method"+" "+str3);//way of 1 for concat string
        System.out.println("compare to 2 string  "+"  "+str1.compareTo(str2));//way of compare string
        System.out.println("concat of 3 string"+" "+str1.concat(str2).concat(str3));//way of 2 for concat string
        System.out.println(str4);//show output of way 1
        System.out.println("contains data  availableor not "+" "+str3.contains("programing"));//1.find the text is given in str3 means true 2.working as boolean
        System.out.println("conatains data available or not"+" "+str3.contains("programming"));// this is for not same text means false
    System.out.println("String endswih or not"+" "+str3.endsWith("e"));//chect the char is endwit
    }
}