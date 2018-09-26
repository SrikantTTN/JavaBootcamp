package Day2;

public class Ex9 {
    public static void main(String[] args) {
        WoodenChair wc = new WoodenChair();
        WoodenTable wt = new WoodenTable();
        MetalChair mc = new MetalChair();
        MetalTable mt = new MetalTable();
        System.out.println(wc.type + " " + wc.material + " price is " + wc.price + " Stress test " + wc.stressTest() + " ans Fire Test " + wc.fireTest());
        System.out.println(wt.type + " " + wt.material + " price is " + wt.price + " Stress test " + wt.stressTest() + " ans Fire Test " + wt.fireTest());
        System.out.println(mc.type + " " + mc.material + " price is " + mc.price + " Stress test " + mc.stressTest() + " ans Fire Test " + mc.fireTest());
        System.out.println(mt.type + " " + mt.material + " price is " + mt.price + " Stress test " + mt.stressTest() + " ans Fire Test " + mt.fireTest());
    }
}

abstract class Furniture {
    abstract String stressTest();

    abstract String fireTest();
}

class WoodenChair extends Furniture {
    int price = 1000;
    String material = "Wood";
    String type = "Chair";

    @Override
    String stressTest() {
        return "Pass";
    }

    @Override
    String fireTest() {
        return "Fail";
    }
}

class MetalChair extends Furniture {
    int price = 2000;
    String material = "Metal";
    String type = "Chair";

    @Override
    String stressTest() {
        return "Fail";
    }

    @Override
    String fireTest() {
        return "Pass";
    }
}

class WoodenTable extends Furniture {
    int price = 3000;
    String material = "Wood";
    String type = "Table";

    @Override
    String stressTest() {
        return "Fail";
    }

    @Override
    String fireTest() {
        return "Fail";
    }
}

class MetalTable extends Furniture {
    int price = 5000;
    String material = "Metal";
    String type = "Table";

    @Override
    String stressTest() {
        return "Pass";
    }

    @Override
    String fireTest() {
        return "Pass";
    }
}
