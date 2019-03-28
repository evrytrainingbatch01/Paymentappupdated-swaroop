package com.sp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sp.pojo.Account;
import com.sp.service.AccountService;

public class AccountController extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
	     PrintWriter out = response.getWriter();
	     
	      
	     String accountNumber = request.getParameter("accountNumber");
	     String accountName = request.getParameter("accountName");
	     int balance=Integer.parseInt(request.getParameter("balance"));
	     
	     
	     
	     Account account=new Account(accountNumber,  accountName,  balance);
	     
	     try { 
	         AccountService accountService = new AccountService();
	         boolean result = accountService.addMoney(account);      
	         out.println("<html>");
	         out.println("<head>");      
	         out.println("<title>Account created</title>");    
	         out.println("</head>");
	         out.println("<body>");
	         out.println("<center>");
	         if(result){
	             out.println("<h1>Account Created Sucessfully :</h1>");
	             out.println("now if you wnat to transfer amount to account<a href=transaction.jsp>Click here</a>");
	         }else{
	             out.println("<h1>Acccount creation Failed</h1>");
	             out.println("To try again<a href=addmoney.jsp>Click here</a>");
	         }
	         out.println("</center>");
	         out.println("</body>");
	         out.println("</html>");
	     } finally {       
	         out.close();
	     }
	     
	}

}
