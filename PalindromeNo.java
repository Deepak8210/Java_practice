public class PalindromeNo {
    public static void main(String[] args) {
        boolean result = palindromCheck(1226);
       System.out.println(result);
    }

    public static boolean palindromCheck(int x) {
        int originalCopy = x;
        int temp = 0;
        int reverse = 0;

        while (x > 0) {
            temp = x % 10;
            reverse = reverse * 10 + temp;
            x = x / 10;
        }
        if (reverse == originalCopy)
            return true;
        return false;
    }
   
}
