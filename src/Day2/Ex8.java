package Day2;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userInput;
        while (true) {
            userInput = in.next();
            if (userInput.equals("done")) {
                break;
            }
            if(userInput.charAt(0)==userInput.charAt(userInput.length()-1)){
                System.out.println("first and last characters equal");
            }
            else{
                System.out.println("first and last characters not equal");
            }
        }
        userInput="";
        System.out.println("Lets try do while");
        do{
            if(userInput.equals("done")){
                break;
            }
            userInput = in.next();
            if(userInput.charAt(0)==userInput.charAt(userInput.length()-1)){
                System.out.println("first and last characters equal");
            }else {
                System.out.println("first and last characters not equal");
            }
        }while(true);

    }
}