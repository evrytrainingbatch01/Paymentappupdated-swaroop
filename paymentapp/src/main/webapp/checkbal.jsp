<%@page import="com.sp.pojo.Account"%>
<%@page import="com.sp.pojo.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <link rel="stylesheet" type="text/css" href="css/style.css"/>
     <title>Result Page</title>
</head>
<body>
<center>
      <h1>Account Balance</h1>
                 <%
                 Account account = (Account) session.getAttribute("account");
             %>     
             <h3> <%= account.getAccountName() + " " + account.getAccountName()+" " +account.getBalance()%></h3>     
            
 
        
    </center>
</body>
</html>