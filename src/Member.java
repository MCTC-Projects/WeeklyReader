/**
 * Created by Toby on 2/12/2015.
 *
 * makes member class
 */
public class Member {
    private String name, email;
    private int mid;



    public Member(int m, String n, String e)
    {
        mid = m;
        name = n;
        email = e;
    }

    public int getMid() {
        return mid;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
}
