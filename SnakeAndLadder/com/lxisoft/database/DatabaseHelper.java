package com.lxisoft.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;

public class DatabaseHelper {
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/snakeandladder", "root", "root");
	}

	public static List<History> getHistory() {
		try (Connection connection = getConnection()) {
			PreparedStatement preparedStatement = connection.prepareStatement("select * from HISTORY order by GameDate desc");
			ResultSet result = preparedStatement.executeQuery();
			List<History> histories = new LinkedList<>();
			while (result.next()) {
				History history = new History();
				history.setGameId(result.getInt(1));
				history.setWinner(result.getString(2));
				history.setLoser(result.getString(3));
				history.setGameDate(result.getDate(4));
				histories.add(history);
			}
			return histories;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void saveHistory(History history) {
		try (Connection connection = getConnection()) {
			PreparedStatement preparedStatement = connection
					.prepareStatement("INSERT INTO HISTORY (`Winner`, `Loser`, `GameDate`) VALUES (?,?,?)");

			preparedStatement.setString(1, history.getWinner());
			preparedStatement.setString(2, history.getLoser());
			preparedStatement.setTimestamp(3, new Timestamp(System.currentTimeMillis()));

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
