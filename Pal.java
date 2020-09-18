
package NarekB;

public class Pal {

    
    public static void main(String[] args) {
        Palindrome p = new Palindrome(121);
        Palindrome p1 = new Palindrome(30);
        Palindrome p2 = new Palindrome(206);
        Palindrome p3 = new Palindrome(505);
        
        System.out.println("Reverse is "  + p.reverse() + " Is it Palindromme " 
                +  p.isPalindrome(121));
        System.out.println("Reverse is "  + p1.reverse() + " Is it Palindromme " 
                +  p1.isPalindrome(30));
        System.out.println("Reverse is "  + p2.reverse() + " Is it Palindromme " 
                +  p2.isPalindrome(206));
        System.out.println("Reverse is "  + p3.reverse() + " Is it Palindromme " 
                +  p3.isPalindrome(505));
        
        
    }
    
}
