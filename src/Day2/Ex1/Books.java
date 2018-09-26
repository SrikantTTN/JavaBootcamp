package Day2.Ex1;

public class Books {


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getA() {
        return avail;
    }

    public boolean setA(String a) {
        for(Availability e : Availability.values()){
            if(a.equals(e)){
                this.avail = a;
                return true;
            }
        }
        return false;
    }
    private String name;
    private int price;
    private String avail;
    Books(String name,String a, int price){
        this.name= name;
        this.avail = a;
        this.price = price;
    }
}
enum Availability{
    Available,Not_Available,Issued;
}

