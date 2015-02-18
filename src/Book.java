import java.lang.reflect.Field;

/**
 * Created by Toby on 2/12/2015. Updated by Boyd on 2/17/2015
 *
 * makes a book class These are the books that the group has read
 * and are stored in the database. This class is used by the GoodReads
 * class and the GoodReads class provides methods for getting book
 * information from the GoodReads API.
 */
public class Book {
    private String title,author,description;
    private int isbn;



    //Multiple constructors are needed for when you might have
    //just the title and author and need to get everything else from
    //the GoodReads API. I didn't change the constructor used in DB
    //so as not to throw things off.
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    Book(int i, String t, String a)
    {
        this.isbn = i;
        this.title = t;
        this.author = a;

    }

    public int getISBN() {
        return this.isbn;
    }

    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getDescription() {return this.description;}


    //setters
    public void setDescription(String d){this.description=d;}
    public void setAuthor(String a){this.author = a;}
    public void setIsbn(int i){this.isbn = i;}



}
