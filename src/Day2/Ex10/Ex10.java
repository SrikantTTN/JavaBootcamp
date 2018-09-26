package Day2.Ex10;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Cashier c1 = new Cashier();
        Scanner in = new Scanner(System.in);
        System.out.println("Hii Barista Cashier are there any customers..? Y or N.");
        String s = in.next(".");
        while(s.equals("y") || s.equals("Y")){
            System.out.println(" Hello please pay coffee price. ");
            int token = c1.takePayment(in.nextInt());
            System.out.println("Your token number is :"+token);
            System.out.println("Please wait for your token number.");
            System.out.println("Are there any more customers..? Y or N.");
            s = in.next(".");
        }
        Thread t1 = c1.getThread();
        if(t1.getState().equals(Thread.State.TIMED_WAITING)){

        }

        System.out.println("Total earning today is :" + c1.getTotalPayment());
    }
}
