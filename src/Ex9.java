public class Ex9 {
    public static void main(String[] args) {
        for(Houses a : Houses.values()){
            System.out.println("House type is " +a.getName() + " and its price is " + a.getPrice());
        }
    }

}

enum Houses{
    Flat("Flat", 200000),Bunglow("Bunglow", 4000000), Mansion("Mansion",10000000), TreeHouse("TreeHouse", 10000);
    private String name;
    private long price;
    Houses(String name,long price){
        this.name = name;
        this.price = price;
    }
    String getName(){
        return name;
    }
    long getPrice(){
        return price;
    }
}
