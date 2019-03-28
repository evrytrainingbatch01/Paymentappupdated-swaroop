package com.sp.service;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sp.pojo.Account;
import com.sp.pojo.TransferAccount;
import com.sp.util.HibernateUtil;

public class TransferAccountService {
	public boolean transferMoney(TransferAccount transfer){
		
	     Session session = HibernateUtil.getSessionFactory().openSession();
	     
	    if(isTransferAccountExists(transfer)) return false;  
	     
	     Transaction tx = null;
	     try {
	         tx = session.getTransaction();
	         tx.begin();
	        ;
	         session.saveOrUpdate(transfer);       
	         tx.commit();
	     } catch (Exception e) {
	         if (tx != null) {
	             tx.rollback();
	         }
	         e.printStackTrace();
	     } finally {
	         session.close();
	     } 
	     return true;
	}

	private boolean isTransferAccountExists(TransferAccount transfer) {
	
		Session session = HibernateUtil.getSessionFactory().openSession();
		
	     boolean result = false;
	     Transaction tx = null;
	     try{
	         tx = session.getTransaction();
	         tx.begin();
	         Query query = (Query) session.createQuery("from Transaction where fromaccountNumber='"+transfer.getFromaccountNumber()+",");
	         Account a = (Account)((org.hibernate.Query) query).uniqueResult();
	         tx.commit();
	         if(a!=null) result = true;
	     }catch(Exception ex){
	         if(tx!=null){
	             tx.rollback();
	         }
	     }finally{
	         session.close();
	     }
	     return result;
	    
	}

}
