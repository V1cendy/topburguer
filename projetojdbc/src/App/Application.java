package App;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import db.DB;
import db.DbIntegrityException;
import model.dao.DaoFactory;
import model.dao.DepartamentoDao;
import model.entities.Departamento;

public class Application {
    public static void main(String []args){
       
		Connection conn = null;
		conn = DB.getConnection();
		DB.closeConnection();
    }
    
}
