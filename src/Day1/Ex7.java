package Day1;

public class Ex7{
    public static void main(String[] args) {
        ex7ex.getData();
        System.out.println("Printing via static variables");
        System.out.println(ex7ex.fname + " " + ex7ex.lname + " age = " + ex7ex.age);
    }
}

class ex7ex {
    static {
        String firstName = "Srikant";
        String lastName = "Karnani";
        int age = 22;
        System.out.println("Printing via static");
        System.out.println(firstName + " " + lastName + "'s age is " + age);
        System.out.println();
    }

    static void getData() {
        String firstName = "Srikant";
        String lastName = "Karnani";
        int age = 22;
        System.out.println("Printing via static method");
        System.out.println(firstName + " " + lastName + "'s age is " + age);
        System.out.println();
    }

    static String fname = "Srikant";
    static String lname = "Karnani";
    static int age = 22;
}
