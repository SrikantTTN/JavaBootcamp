package Day2;

public class Ex3 {

    public static void main(String[] args) {
        try
        {
            Class.forName("srikant");
        }catch (ClassNotFoundException e)
        {
            e.printStackTrace();

        }
    }
}

class A{}


