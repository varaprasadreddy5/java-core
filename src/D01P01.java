import com.learning.core.day1session1.Book;
import com.learning.core.day1session1.ManageBook;


public class D01P01 {
    public static void main(String[] args) {
        ManageBook m = new ManageBook();
        Book b = m.createBook("Java Programming", 350);
        m.showBook(b);

    }
}