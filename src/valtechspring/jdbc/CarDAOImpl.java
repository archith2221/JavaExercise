package valtechspring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import valtechspring.orm.Car;
import valtechspring.orm.CarDetails;

public class CarDAOImpl implements CarDAO  {
	
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	
	
	/* (non-Javadoc)
	 * @see valtechspring.jdbc.CarDAO#save(valtechspring.orm.Car)
	 */
	@Override
	public void save(Car car) {
        JdbcTemplate temp=new JdbcTemplate(dataSource);
        temp.update("insert into car(id,color,make,model,price,version,yearmanufactured, kms,numofowners,validinsurance)"+" values(?,?,?,?,?,?,?,?,?,?) ",car.getId(),car.getColor(),car.getMake(),car.getModel(),car.getPrice(),car.getVersion(),car.getYearManufactured(),car.getCarDetails().getKms(),car.getCarDetails().getNumOfOwners(),car.getCarDetails().isValidInsurance());
    }
	
	
	
	
    /* (non-Javadoc)
	 * @see valtechspring.jdbc.CarDAO#update(valtechspring.orm.Car)
	 */
    @Override
	public void update(Car car) {
        JdbcTemplate temp=new JdbcTemplate(dataSource);
         temp.update("update car set color=?,make=?,model=?,price=?,version=?,yearmanufactured=?,kms= ?,numofowners=?,validinsurance=?, where id=?  ",car.getId(),car.getColor(),car.getMake(),car.getModel(),car.getPrice(),car.getVersion() ,car.getYearManufactured(),car.getCarDetails().getKms(),car.getCarDetails().getNumOfOwners(),car.getCarDetails().isValidInsurance());
            
    }
  
    
    
@Override
public void delete(Car car){
	   JdbcTemplate temp =new JdbcTemplate(dataSource);
	   temp.update("delete from car where id =?",car.getId());
	   
   }
   
    
    	
    	   private static class CarRowMapper implements RowMapper<Car>
    	      {



    	       @Override
    	        public Car mapRow(ResultSet rs, int row) throws SQLException {
    	            //kms,numofowners,validinsurance,color,make,model,price,version,id
    	            CarDetails cd=new CarDetails(rs.getInt(1),rs.getBoolean(3),rs.getInt(2));
    	            String color=rs.getString(4);
    	            String make=rs.getString(5);
    	            String model=rs.getString(6);
    	            float price=rs.getFloat(7);
    	            int yearMFg=rs.getInt(8);
    	            int version=rs.getInt(9);
    	            int id=rs.getInt(10);
    	            Car car=new Car(id,make,model,yearMFg,price,color,cd);
    	            car.setVersion(version);
    	            return car;
    	        }
    	          
    }
   
 
@Override
public Car get(int id){
	JdbcTemplate temp = new JdbcTemplate(dataSource);
	return temp.queryForObject("Select id,color,make,model,price,version,yearmanufactured, kms,numofowners,validinsurance from car where id=?",new CarRowMapper(),id);
	
	   
   }
   
  
@Override
public List<Car> getAll(){
	   JdbcTemplate temp = new JdbcTemplate(dataSource);
	   return temp.query("Select id,color,make,model,price,version,yearmanufactured, kms,numofowners,validinsurance from car ",new CarRowMapper());
			   
	
	   
   }
}
