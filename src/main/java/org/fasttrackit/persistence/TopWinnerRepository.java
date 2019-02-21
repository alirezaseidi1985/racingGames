package org.fasttrackit.persistence;

import org.fasttrackit.domain.TopWinner;

import java.io.IOException;
import java.security.Key;
import java.sql.*;
import java.util.List;

public class TopWinnerRepository {

    public void createTopWinner (TopWinner topWinner) throws SQLException, IOException, ClassNotFoundException {
        Connection connection = DatabaseConfiguration.getConnection();

        String insertSql = "INSERT INTO top_winners (`name`, wonRaces) values (?,?);"ON DUPLICATE Key UPDATE wonRaces = wonRaces + 1;";


        PreparedStatement preparedStatement = connection.prepareStatement(insertSql);
        preparedStatement.setString(1, topWinner.getName());
        preparedStatement.setInt(2, topWinner.getWonRaces());
        preparedStatement.executeUpdate();


    }
    public List<TopWinner> getTopwinners() {
        Connection connection = DatabaseConfiguration.getConnection();

        String query = "SELECT `name`, wonRaces FROM top_winner ORDER BY wonRaces DESC;";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        List<TopWinner> response = new TopWinner();
        while (resultSet.next()) {
            TopWinner topWinner = new TopWinner();
            topWinner.getId(resultSet.getLong("id"));
            topWinner.getName(resultSet.getNString("name"));
            topWinner.setWonRaces(resultSet.getInt("wonRaces"));
            response.add(topWinner);
        }
        return response;
    }
}
