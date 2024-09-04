package ir.freeland.springboot.persistence.model;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;


//import ir.freeland.springboot.relation.onetoone.foreignkeybased.Address;
//import ir.freeland.springboot.relation.onetoone.foreignkeybased.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class ForeignKeyRun {

	@PersistenceContext
	private EntityManager entityManager;
	

	
	public void sampleRun() {
		entityManager=entityManager.getEntityManagerFactory().createEntityManager();		
		Session session = entityManager.unwrap(Session.class);
		Transaction transaction = session.getTransaction();
		
		//*****************************************
		transaction.begin();		
		Item Item1 = new Item();
		Item1.setName("apple");
		Item1.setCatalog(Catalog.food);
		Item1.setPrise(9);
		
		CorruptedItem badItem1 = new CorruptedItem();
		badItem1.setReason("The worm in the apple");
		badItem1.setItem(Item1);
		
		session.persist(badItem1);
		
		
    	transaction.commit();
    	
    	//*****************************************
		transaction.begin();		
		Item Item2 = new Item();
		Item2.setName("Tennis racket");
		Item2.setCatalog(Catalog.sport);
		Item2.setPrise(39.5);
		
		CorruptedItem badItem2 = new CorruptedItem();
		badItem2.setReason("Tennis racket is broken.");
		badItem2.setItem(Item2);
		
		session.persist(badItem2);
		
		
    	transaction.commit();
    	   	
    	//*****************************************
    	
		transaction.begin();		
		Item Item3 = new Item();
		Item3.setName("bread");
		Item3.setCatalog(Catalog.food);
		Item3.setPrise(7.5);
		
		CorruptedItem badItem3 = new CorruptedItem();
		badItem3.setReason("Bread is mold.");
		badItem3.setItem(Item3);
		
		session.persist(badItem3);
		
		
    	transaction.commit();
    	   	
    	//*****************************************
 
    	transaction.begin();    	
    	session.remove(badItem1);
    	transaction.commit();
	}
}
