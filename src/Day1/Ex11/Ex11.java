package Day1.Ex11;

public class Ex11 extends Bank {

    public static void main(String[] args) {
        Bank b = new Bank();
        BOI boi = new BOI();
        SBI s = new SBI();
        ICICI i = new ICICI();

        System.out.println(b.getDetails());
        System.out.println(boi.getDetails());
        System.out.println(s.getDetails());
        System.out.println(i.getDetails());

    }
}
