package com.deloitte.task;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.mapping.List;
import java.util.*;

import java.sql.*;
import org.hibernate.*;
import org.hibernate.criterion.*;
import com.deloitte.pojo.Product;
import com.deloitte.pojo.Supplier;

public class Main {
	  public static void main(String[] args) {
    HibernateUtil.setup("create table Supplier ( id int, name VARCHAR);");
    HibernateUtil.setup("create table Product ( id int, name VARCHAR, description VARCHAR, price double,supplierId int);");
    
    prepareData();
    Session session = HibernateUtil.currentSession();
    
        String hql = "from Supplier s inner join fetch s.products as p";
        Query query = session.createQuery(hql);
        List results = (List) query.list();
        displaySupplierList(results);
    
    
        HibernateUtil.checkData("select * from Supplier");
        HibernateUtil.checkData("select * from Product");

  }
    static public void displaySupplierList(List list) {
        Iterator iter = ((java.util.List) list).iterator();
        if (!iter.hasNext()) {
            System.out.println("No suppliers to display.");
            return;
        }        
        while (iter.hasNext()) {
            Supplier supplier = (Supplier) iter.next();
            String msg = supplier.getName();
            System.out.println(msg);
        }
    }

 


  private static void prepareData(){
        Session session = HibernateUtil.currentSession();

        Supplier supplier1 = new Supplier();
        supplier1.setName("Supplier Name 1");
        session.save(supplier1);
        
        Supplier supplier2 = new Supplier();
        supplier2.setName("Supplier Name 2");
        session.save(supplier2);        
        
        Product product1 = new Product("Product 1","Name for Product 1", 2.0);
        product1.setSupplier(supplier1);
        supplier1.getProducts().add(product1);
        session.save(product1);
        
        Product product12 = new Product("Product 2","Name for Product 2", 22.0);
        product12.setSupplier(supplier1);
        supplier1.getProducts().add(product12);        
        session.save(product12);
        
        Product product2 = new Product("Product 3", "Name for Product 3", 30.0);
        product2.setSupplier(supplier2);
        supplier2.getProducts().add(product2);
        session.save(product2);
        
        session.flush();
        HibernateUtil.closeSession();
  }
}

