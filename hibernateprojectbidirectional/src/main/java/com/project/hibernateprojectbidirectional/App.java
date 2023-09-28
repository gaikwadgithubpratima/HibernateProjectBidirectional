package com.project.hibernateprojectbidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
        System.out.println( "Project Started!" );

        // Create a configuration 
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        //creating session factory
        SessionFactory sessionFactory = cfg.buildSessionFactory();

        //opening the session
        Session session = sessionFactory.openSession();
        
        //Starting the transaction
        Transaction tx = session.beginTransaction();

        //Create a object in entity class of customer
        Customer cust = new Customer();
        cust.setCid(101);
        cust.setCname("Rohini");

        //Create an object of entity class of product
        Product prod = new Product();
        prod.setPid(201);
        prod.setPname("Laptop");
        prod.setCustomer(cust);
        
        cust.setProduct(prod);
        
        //save the session object
        session.save(prod);
        session.save(cust);
        tx.commit();
        
        //close the session
        session.close();
        
        //Close the session factory
        sessionFactory.close();
    }
}
