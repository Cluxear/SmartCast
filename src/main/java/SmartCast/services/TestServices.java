/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SmartCast.services;

import SmartCast.database.DatabaseHandler;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import smartcast.model.Test;

/**
 *
 * @author Walid
 */
public class TestServices implements IService<Test>{

    private final static Logger LOGGER = LogManager.getLogger(DatabaseHandler.class.getName());
	@Override
	public boolean add(Test test) {
	 try {
            PreparedStatement statement = DatabaseHandler.getInstance().getConnection().prepareStatement(
                    "INSERT INTO test(Test_iId,title,QCM_Content_ID,passingScore) VALUES(?,?,?,?)");
            statement.setString(1, test.getTest_ID());
            statement.setString(2, test.getTitle());
            statement.setString(3, test.getPassingScore());
            return statement.executeUpdate() > 0;
        } catch (SQLException ex) {
           // LOGGER.log(Level.ERROR, "{}", ex);
	   LOGGER.debug(ex.getMessage());
        }
        return false;
            }

	@Override
	public boolean delete(Test t) {
		
        try {
            String deleteStatement = "DELETE FROM Test WHERE ID = ?";
            PreparedStatement statement = DatabaseHandler.getInstance().getConnection().prepareStatement(deleteStatement);
            statement.setString(1, t.getTest_ID());
            int res = statement.executeUpdate();
            if (res == 1) {
                return true;
            }
        }
        catch (SQLException ex) {
            LOGGER.log(Level.ERROR, "{}", ex);
        }
	
        return false;
	}

	@Override
	public boolean update(Test t) {
		String c = t.getContent();
        try {
            String updateStatement = "UPDATE Test SET Title=?, passingScore=?, Exam_Content_ID=? WHERE ID=?";
            PreparedStatement statement = DatabaseHandler.getInstance().getConnection().prepareStatement(updateStatement);
            statement.setString(1, t.getTitle());
            statement.setString(2, c);
            statement.setString(3, t.getPassingScore());
            statement.setString(4, t.getTest_ID());
            int res = statement.executeUpdate();
            return (res > 0);
        }
        catch (SQLException ex) {
            LOGGER.log(Level.ERROR, "{}", ex);
        }
        return false;
	}

	public Test getById(String id) {
		try {
            String Statement = "SELECT FROM Test WHERE ID = ?";
            PreparedStatement statement = DatabaseHandler.getInstance().getConnection().prepareStatement(Statement);
            statement.setString(1, id);
	    ResultSet rs = statement.executeQuery();
            if (rs.next()) {
		    String title = rs.getString("Title");
                return null;
            }
		}
        catch (SQLException ex) {
            LOGGER.log(Level.ERROR, "{}", ex);
        }
        return null;
	}
	@Override
	public List<Test> getAll() {
            String Statement = "SELECT * FROM Test";
	    List<Test> Tests = new ArrayList<>();
            PreparedStatement statement;
	    try {
		    statement = DatabaseHandler.getInstance().getConnection().prepareStatement(Statement);
            	    ResultSet res = statement.executeQuery();
            	 while(res.next()) {
			 String id = res.getString("Test_ID");
			 String title = res.getString("Test_ID");
			 String passingScore = res.getString("Test_ID");

			// tests.add(new Test(id,title,passingScore));
			 
	    }
	    } catch (SQLException ex) {
		    java.util.logging.Logger.getLogger(TestServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    }
                return null;
            }
		
	}
	
