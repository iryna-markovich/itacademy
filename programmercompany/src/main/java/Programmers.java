import domain.Company;
import domain.Mastery;
import domain.Programmer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Programmers {
    String url = "jdbc:mysql://localhost:3308/jd01_08_2018";
    String user = "root";
    String password = "1234";

    public List<Programmer> find(String language) throws ProgrammerFindException, SQLException {
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = set(connection.prepareStatement(
                     "select * from programmer inner join company on programmer.company_id=company.id where language=?"), language);
             ResultSet resultSet = pstmt.executeQuery()) {
            List<Programmer> programmers = new ArrayList<>();
            while (resultSet.next()) {
                Programmer programmer = new Programmer.Builder()
                        .name(resultSet.getString(2))
                        .salary(resultSet.getInt(3))
                        .mastery(Mastery.valueOf(resultSet.getString(4)))
                        .language(resultSet.getString(5))
                        .company(new Company.Builder()
                                .name(resultSet.getString(8))
                                .build())
                        .build();
                programmers.add(programmer);
            }
            return programmers;
        } catch (SQLException e) {
            throw new ProgrammerFindException(e);
        }
    }

    private PreparedStatement set(PreparedStatement pstmt, String language) throws SQLException {
        pstmt.setString(1, language);
        return pstmt;
    }
}

