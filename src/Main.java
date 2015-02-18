import java.net.URL;
import java.sql.*;

public class Main {

    //testing to see if this works.  add something please to test -  Toby



    public static void main(String[] args) throws ClassNotFoundException {

        System.out.println("Hello World from Group Project people!");


        GoodReadsResponse grr = new GoodReadsResponse("Great Expectations","Charles Dickens");
        grr.populateFromAPI();

        String s[];


        DB db = new DB();

        db.Connect();

        args= new String[4];
        //DataSource.DataSource(args);



    }


}

