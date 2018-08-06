package com.deloitte.main;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.pojo.Employee;

public class ManageEmployee {
 private static SessionFactory factory;


 @SuppressWarnings("deprecation")
public static void main(String[] args) {
  try {
   factory = new Configuration().configure().buildSessionFactory();
  } catch (Throwable ex) {
   System.err.println("Failed to create sessionFactory object " + ex);
   throw new ExceptionInInitializerError();
  }
  
  ManageEmployee ME = new ManageEmployee();
  
  Integer empID1 = ME.addEmployee("Zara" , "Ali", 1000);
  Integer empID2 = ME.addEmployee("Daisy" , "Das", 5000);
  Integer empID3 = ME.addEmployee("John" , "Paul", 10000);
  
  ME.listEmployees();
  
 }
    /* Method to CREATE an employee in the database */
    public Integer addEmployee(String fname, String lname, int salary){
     
    	 Session session;
    	session = factory.openSession();
       Transaction tx = null;
       Integer employeeID = null;
       
       try {
          tx=session.beginTransaction();
          Employee employee = new Employee(fname, lname, salary);
          employeeID = (Integer) session.save(employee); 
          tx.commit();
       } catch (HibernateException e) {
          if (tx!=null) tx.rollback();
          e.printStackTrace(); 
       } finally {
    	   
          session.close(); 
       }
       return employeeID;
    }
    
    /* Method to  READ all the employees */
    public void listEmployees( ){
    	 Session session;
     	session = factory.openSession();
       Transaction tx = null;
       
       try {
          tx = session.beginTransaction();
         List employees = session.createQuery("FROM Employee").list(); 
      
          for (Iterator iterator = employees.iterator(); iterator.hasNext();){
             Employee employee = (Employee) iterator.next(); 
             System.out.print("First Name: " + employee.getFirstName()); 
             System.out.print("  Last Name: " + employee.getLastName()); 
             System.out.println("  Salary: " + employee.getSalary()); 
          }
          tx.commit();
       } catch (HibernateException e) {
          if (tx!=null) tx.rollback();
          e.printStackTrace(); 
       } finally {
          session.close(); 
       }
    }
 }

