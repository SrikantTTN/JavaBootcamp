package Day2;

public class Ex13 {
    public static void main(String[] args) {
        try {
            throw new cE("Something went wrong");
        } catch (cE e) {
            e.printStackTrace();
        }
    }

    private static class cE extends Exception {
        cE(String msg) {
            super(msg);
        }
    }
}


