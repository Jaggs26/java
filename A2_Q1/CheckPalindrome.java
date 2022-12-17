import java.util.*;  

class CheckPalindrome {

    public native boolean checkPalindromeNative(String k);
    static {
        System.loadLibrary("CheckPalindrome");
    }
    public static void main(String[] args){
        CheckPalindrome checker = new CheckPalindrome();
        System.out.println("Enter String to check : ");
        Scanner sc=new Scanner(System.in);
        String k=sc.nextLine();
        sc.close();
        if(checker.checkPalindromeNative(k)==true){
            System.out.println("The Entered String is a Palindrome");
        }
        else {
            System.out.println("The Entered String is not a Palindrome");
        }
    }
}
