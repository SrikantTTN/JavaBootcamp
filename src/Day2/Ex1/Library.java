package Day2.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Books> books = new ArrayList<>();

    public void addDefaultBooks(){
        MystryBooks mb1 = new MystryBooks("Sherlock","Available",321);
        RomanticBooks rm1 = new RomanticBooks("Titanic","Not_Available",123);
        RomanticBooks rm2 = new RomanticBooks("Tinic","Available",323);
        RomanticBooks rm3 = new RomanticBooks("One Night in Paris","Available",1232);
        FantasyBooks fm1 =new FantasyBooks("Avatar","Issued",1000);
        FantasyBooks fm2 =new FantasyBooks("Zoro","Available",500);
        FantasyBooks fm3 =new FantasyBooks("Micky","Issued",1500);
        books.add(mb1);
        books.add(rm1);
        books.add(rm2);
        books.add(rm3);
        books.add(fm1);
        books.add(fm2);
        books.add(fm3);
    }

    public List<Books> getBooks(){
        return books;
    }

    public void addBook(Books b){
        books.add(b);
    }

}
