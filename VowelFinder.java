/**
 * VowelFinder
 */
public class VowelFinder {

    public static void main(String[] args) {
        char s='k';

        switch (s) {
            case 'A','E','I','O','U','a','e','i','o','u':
                System.out.println("Vowel");
                break;
        
            default:
                System.out.println("Not Vowel");
                break;
        }
    }
}