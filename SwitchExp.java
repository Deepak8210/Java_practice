import java.util.*;
public class SwitchExp {
    
    public static void main(String[] args) {

        //switch expression

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day number from 1 to 7");
        int day = sc.nextInt();
        sc.close();
        String Result = switch(day){
            case 1 ->  "MonDay";
            case 2 ->  "TuesDay";
            case 3 ->  "WednesDay";
            case 4 ->  "ThursDay";
            case 5 ->  "FriDay";
            case 6 ->  "SaturDay";
            case 7 ->  "SunDay";
            default -> "Wrong day choosen!";
        };

        System.out.println(Result);
    }
}
