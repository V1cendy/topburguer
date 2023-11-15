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
       
    	DepartamentoDao depDao = DaoFactory.createDepartamentoDao();
    	/*List<Departamento> lista = depDao.procurarTodos();
    	for(Departamento dep:lista) {
    		System.out.println(dep.toString());
    	}*/
    	Departamento dep = new Departamento(15,"Teste Atualizar");
    	depDao.atualizar(dep);
    	System.out.println(dep.toString());
    }
    
}
