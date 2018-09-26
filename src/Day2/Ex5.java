package Day2;

public class Ex5 {

    public static void main(String[] args) throws CloneNotSupportedException{
        Card c1 = new Card();
        c1.a = 21;
        c1.d = "das";
        Card c2 =(Card) c1.clone();
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        Card c3 = new Card();
            c3.a =423;
            c3.d= "dd";
        Card c4 = new Card(c3);

        System.out.println(c3.toString());
        System.out.println(c4.toString());
    }

    static class Card implements Cloneable{

        int a = 9;
        String d = "sdfg";
        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
        Card(){
        }
        Card(Card c){
            this.a = c.a;
            this.d = c.d;
        }

        @Override
        public String toString() {
            return d + "   " +a;
        }
    }
}


