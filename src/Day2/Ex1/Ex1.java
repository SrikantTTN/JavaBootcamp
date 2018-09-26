package Day2.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        Library library = new Library();
        library.addDefaultBooks();
        List<Books> booksInLibrary = new ArrayList<>();
        booksInLibrary = library.getBooks();
        for(Books b : booksInLibrary){
            System.out.println(b.toString());
        }
    }

}
