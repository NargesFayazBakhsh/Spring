package ir.freeland.springboot.persistence.base;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import ir.freeland.springboot.persistence.model.Catalog;
import ir.freeland.springboot.persistence.model.Item;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class JpaBaseInRun {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	 // narges fayazbakhsh
	public void sampleRun() {
		entityManager=entityManager.getEntityManagerFactory().createEntityManager();		
		Session session = entityManager.unwrap(Session.class);
		Transaction transaction = session.getTransaction();


    	//Save*****************************************
		transaction.begin();
		Item item1 = new Item();
    	item1.setName("laptob");
    	item1.setCatalog(Catalog.Electrical);
    	item1.setPrise(1500);
    	session.persist(item1);
		
    	transaction.commit();

    	//Save*****************************************
		transaction.begin();
		Item item2 = new Item();
    	item2.setName("milk");
    	item2.setCatalog(Catalog.food);
    	item2.setPrise(40);
    	session.persist(item2);
		
    	transaction.commit();

    	//Save*****************************************
		transaction.begin();
		Item item3 = new Item();
    	item3.setName("ball");
    	item3.setCatalog(Catalog.sport);
    	item3.setPrise(20);
    	session.persist(item3);
		
    	transaction.commit();
    	
    	
    	//Find*****************************************
    	transaction.begin();
    	List<Item> allItem = session.createQuery("from Item" , Item.class).getResultList();
    	allItem.stream().forEach( s -> System.out.println(s));    	
    	transaction.commit();

    	//Update *****************************************
    	transaction.begin();
    	allItem.get(0).setName("Tablet");
    	transaction.commit();
    	
    	//Delete *****************************************
    	//transaction.begin();
    	//session.remove(  allItem.get(1) );
    	//transaction.commit();
    	
	}
}
