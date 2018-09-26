package Day2;

class Ex4 {
    public static void main(String[] args) {
        SingletonE e1 = SingletonE.getInstance();
        SingletonE e2 = SingletonE.getInstance();
        e1.s = 21;
        System.out.println(e1.s);
        System.out.println(e2.s);
    }

}
class SingletonE {
    static SingletonE instance;
    public int s = 0;

    static SingletonE getInstance() {
        if (instance == null) {
            instance = new SingletonE();
        }
        return instance;
    }
}
