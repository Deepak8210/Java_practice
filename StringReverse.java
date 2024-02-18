public class StringReverse {
    public static void main(String[] args) {
        String result = strReverse("Hello World");
       System.out.println(result);
    }


    public static String strReverse(String str) {
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }

        return newStr;
    }

}
