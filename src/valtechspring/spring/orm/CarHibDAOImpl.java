package valtechspring.spring.orm;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import valtechspring.jdbc.CarDAO;
import valtechspring.orm.Car;

public class CarHibDAOImpl extends HibernateDaoSupport implements CarDAO {

	@Override
    public Car get(int id) {
        // TODO Auto-generated method stub
        return getHibernateTemplate().load(Car.class, id);
    }





  @Override
    public List<Car> getAll() {
        // TODO Auto-generated method stub
        return getHibernateTemplate().find("Select c from car c");
    }





  @Override
    public void update(Car bike) {
      
        getHibernateTemplate().update(bike);
    }





  @Override
    public void save(Car Car) {
        
        getHibernateTemplate().save(Car);
        // TODO Auto-generated method stub





  }





  @Override
    public void delete(Car bike) {
        // TODO Auto-generated method stub
        getHibernateTemplate().delete(bike);
    }
}