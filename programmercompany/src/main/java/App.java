import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws ProgrammerFindException, SQLException {
        Programmers programmers = new Programmers();
        programmers.find("Java");
        System.out.println(programmers.find("Java"));
    }
}
