package valtechspring.client;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;


import valtechspring.book.Addressauthor;
import valtechspring.book.Article;
import valtechspring.book.Author;
import valtechspring.book.Blog;
import valtechspring.book.Book;
import valtechspring.book.Hand;
import valtechspring.book.Publisher;
import valtechspring.orm.Account;
import valtechspring.orm.Address1;
import valtechspring.orm.AtmTx;
import valtechspring.orm.BankAccount;
import valtechspring.orm.BankAccountId;
import valtechspring.orm.Car;
import valtechspring.orm.CarDetails;
import valtechspring.orm.CheqeTx;
import valtechspring.orm.Customer;
import valtechspring.orm.TellerTx;
import valtechspring.orm.Tx;
import valtechspring.orm.dao.CustomerDAO;
import valtechspring.orm.dao.CustomerDAOImpl;


public class HibernateClient {
	
	public static void main(String[] args) {
		System.out.println("Hibernate Client...");
	//	SessionFactory sf = new Configuration()
		SessionFactory sf = new AnnotationConfiguration()
				.configure()
		//		.addClass(Car.class)
				.addAnnotatedClass(Car.class)
				.addAnnotatedClass(BankAccount.class)
				.addAnnotatedClass(Tx.class).addAnnotatedClass(TellerTx.class)
				.addAnnotatedClass(AtmTx.class).addAnnotatedClass(CheqeTx.class)
				.addAnnotatedClass(Customer.class).addAnnotatedClass(Address1.class)
				.addAnnotatedClass(Account.class)
				.addAnnotatedClass(Author.class)
				.addAnnotatedClass(Publisher.class)
				.addAnnotatedClass(Book.class)
				.addAnnotatedClass(Addressauthor.class)
				.addAnnotatedClass(Article.class)
				.addAnnotatedClass(Blog.class)
				.addAnnotatedClass(Hand.class)
				
				.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
	
		//Book book=new Book(1," ronaldo",1947);
        //ses.save(book);

   Book book = new Book("arch",2000);
   ses.save(book);
		
//		CustomerDAO customerDAO = new CustomerDAOImpl(); // fetching the data
//   //     for(Customer c : customerDAO. getByTxAmountGreaterThan(ses, 2000)){
//     //       System.out.println(c);
//       // }
//		
//		
//		for(Customer c : customerDAO.getByAccountType(ses, "SB")){
//		           System.out.println(c);
//		        }
//		
//		System.out.println("Combined Bal for Customer 1="+customerDAO.getCombinedBalance(ses,1));
//	    System.out.println("Combined Bal for Customer 2="+customerDAO.getCombinedBalance(ses,2));
//	    System.out.println("Combined Bal for Customer 4="+customerDAO.getCombinedBalance(ses,4));
//	    System.out.println("Combined Bal for Customer 5="+customerDAO.getCombinedBalance(ses,5));
//		
//		Customer c = new Customer("Abc",new Date(74,6,13),1);
//	    Address a = new  Address("JP Nagar","Blr","Kar",560089);
//	    
//	    
//			ses.save(c);
//			ses.save(a);
//			c.setAddress(a);
//		
//		Customer c1 = new Customer("Abc",new Date(74,6,13),1);
//			
//		ses.save(c1);
//		Account ac = new Account(1000,"SB");
//		Account ac1 = new Account(1000,"CA");
//		
////		ses.save(new Tx(1000));
////		ses.save(new CheqeTx(2000,123456,false,2));
////		ses.save(new TellerTx(2500, "Teller", "JP Nagar"));
////		ses.save(new AtmTx(3000,123,"Jayanagar"));
//		
//		ses.save(ac);
//		ses.save(ac1);
//		
//		
//		Account ac2= new Account(2000,"SB");
//		Account ac3= new Account(3000,"SB");
//		ses.save(ac2);
//		ses.save(ac3);
//		
//		c.addAccount(ac);
//		c.addAccount(ac3);
//		c.addAccount(ac2);
//		
//		c1.addAccount(ac3);
//		c1.addAccount(ac1);
		
		
//		List<Tx> txs = ses.createQuery("SELECT tx FROM Tx tx").list();
//		for(Tx t: txs){
////   Ternary Operator boolCOnd ? 			
//			t.setAccount(t.getId() % 2 == 0 ? ac : ac1);
//		}
//		
		
//		Customer c = new Customer("Abc",new Date(74,6,13),1);
//		Address a = new  Address("JP Nagar","Blr","Kar",560089);
//		ses.save(c);
//		ses.save(a);
//		a.setCustomer(c);
//		c.setAddress(a);
//		
	

//ses.save(new Tx(1000));
		
	//	ses.save(new CheqeTx(2000,123456,false,2));
		//ses.save(new TellerTx(2500,"Teller","JP Nagar"));
		//ses.save(new AtmTx(3000,123,"Jayanagar"));
		
		
		//java.util.List<Tx> txs = ses.createQuery("Select t from Tx t").list();
	//	for(Tx t : txs){
		//	System.out.println(t);
	//	}
		
		
		
	
		
	//	BankAccount ba = (BankAccount) ses.load(BankAccount.class, new BankAccountId(1,"SB"));
//		System.out.println(ba);
//		ba.setAccno(1);
	//	ba.setAcctype("SB");
//		ba.setActive(true);
//		ba.setBalance(1000);
//		ba.setOpeningDate(new Date());
		
 //   	Car car = new Car("Honnda","City",2020,110000,"Black",new CarDetails(25000,true,1));
    	
	  // ses.save(ba);
		
//	Car car = (Car) ses.load(Car.class, 1);
//	System.out.println("Car Saved" + car.getClass().getName());
	
//	car.setPrice(125000);
		//car.getMake();
		tx.commit();
		ses.close();
		sf.close();
	}

}
