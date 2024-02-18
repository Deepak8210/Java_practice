public class Fibonnaci {
    public static void main(String[] args) {
        fibonnaci(10);
    }
    
    public static void fibonnaci(int x) {
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println(a);
        System.out.println(b);
        
    
        while (c < x) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
