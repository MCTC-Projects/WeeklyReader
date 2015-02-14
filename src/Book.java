

/**
 * Created by Toby on 2/12/2015.
 *
 * makes a book class
 */
public class Book {
    private String title,author;
    private int isbn;



    public Book(int i, String t, String a)
    {
        isbn = i;
        title = t;
        author = a;
    }

    public int getISBN() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
}
