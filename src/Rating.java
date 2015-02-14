/**
 * Created by Toby on 2/12/2015.
 *
 * makes rating class
 */
public class Rating {
    private String comments;
    private int isbn, mid, rating;



    public Rating(int i, int m, int r, String c)
    {
        isbn = i;
        mid = m;
        rating = r;
        comments = c;
    }

    public int getISBN() {
        return isbn;
    }

    public String getComments() {
        return comments;
    }
    public int getRating() {
        return rating;
    }
    public int getMid(){
        return mid;
    }
}
