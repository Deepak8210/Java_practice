public class ReverseNo {
    public static void main(String[] args) {
        reversedNo(123);
    }
    
    public static int reversedNo(int x) {

        int rev = 0;
        int temp = 0;
        
        while (x > 0) {
            temp = x % 10;
            rev = rev * 10 + temp;
            x = x / 10;
        }
         System.out.println(rev);
        return -1;
    }

}
