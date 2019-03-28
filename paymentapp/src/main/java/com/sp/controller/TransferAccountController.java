package com.sp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sp.pojo.TransferAccount;
import com.sp.service.TransferAccountService;

public class TransferAccountController extends HttpServlet {
private static final long serialVersionUID = 1L;
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
	     PrintWriter out = response.getWriter();
	     
	      
	     String fromaccountNumber = request.getParameter("fromaccountNumber");
	     String toaccountNumber = request.getParameter("toaccountName");
	     int transferamount=Integer.parseInt(request.getParameter("transferamount"));
	     
	     
	     
	     TransferAccount transfer=new TransferAccount(fromaccountNumber,toaccountNumber, transferamount);
	     
	     try { 
	         TransferAccountService transferService = new TransferAccountService();
	         boolean result =  transferService.transferMoney(transfer);      
	         out.println("<html>");
	         out.println("<head>");      
	         out.println("<title>Account created</title>");    
	         out.println("</head>");
	         out.println("<body>");
	         out.println("<center>");
	         if(result){
	             out.println("<h1>Amount transfer Sucessfully :</h1>");
	             out.println("now if you wnat to transfer amount to account<a href=transaction.jsp>Click here</a>");
	         }else{
	             out.println("<h1>Amount transfer Failed</h1>");
	             out.println("To try again<a href=transaction.jsp>Click here</a>");
	         }
	         out.println("</center>");
	         out.println("</body>");
	         out.println("</html>");
	     } finally {       
	         out.close();
	     }
	}

}
