package Day2;

public class Ex6 {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Don't know if printed or not but I am now in finally");
        }
    }
}
