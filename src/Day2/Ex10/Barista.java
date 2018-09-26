package Day2.Ex10;

import java.util.LinkedList;
import java.util.Queue;

public class Barista {
    int token = 0;
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    static Barista instance;
    static Barista getInstance(){
        if(instance==null){
            instance = new Barista();
        }
        return instance;
    }

    Runnable r = new Runnable() {
        public void run() {
            while(true) {
                if (orderQueue.size() > 0) {
                    int token = orderQueue.poll();
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(ANSI_PURPLE + token + " order is ready" + ANSI_RESET);
                }else{
                    break;
                }
            }
        }
    };

    Queue<Integer> orderQueue = new LinkedList<>();

    void placeOrder(int token){
        orderQueue.add(token);
    }

    int getToken(){
        token++;
        return token;
    }
}
