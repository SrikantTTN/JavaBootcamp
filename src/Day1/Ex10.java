package Day1;

public class Ex10 extends ex10ex {
    public static void main(String[] args) {
        ex10ex op = new ex10ex();
        System.out.println(op.add(10,20));
        System.out.println(op.add(12.342,43.432));
        System.out.println(op.multiply(32,2));
        System.out.println(op.multiply(21.43f,24.5432423f));
        System.out.println(op.concate("Hii ","Sir"));
        System.out.println(op.concate("how ","are ", "you?"));
    }
}
class ex10ex{
    public int add(int a,int b){
        return a + b;
    }

    public double add(double a,double b){
        return a + b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public float multiply(float a, float b){
        return a*b;
    }

    public String concate(String a, String b){
        return a.concat(b);
    }

    public String concate(String a, String b, String c){
        return a.concat(b).concat(c);
    }
}


