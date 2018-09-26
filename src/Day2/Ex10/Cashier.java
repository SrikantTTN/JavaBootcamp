package Day2.Ex10;

public class Cashier {

    int payments=0;
    Barista barista = Barista.getInstance();
    Thread t1 = new Thread(barista.r);
    int takePayment(int cash){
        payments +=cash;
        int token = barista.getToken();
        barista.placeOrder(token);
        if(t1.getState().equals(Thread.State.NEW)){
            t1.start();
        }
        else if(t1.getState().equals(Thread.State.TERMINATED)){
            t1 = new Thread(barista.r);
            t1.start();
        }
        return token;
    }

    int getTotalPayment(){
        return payments;
    }

    Thread getThread(){
        return t1;
    }
}
