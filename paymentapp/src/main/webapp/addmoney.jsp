<html>
<head>
<title>Account Form</title>
</head>
<body>
<h3>Account Details</h3>
<form action="AccountServlet" method="POST">
<table align="center" cellpadding = "10">
<tr>
<td>Account Number</td>
<td><input type="text" name="accountNumber" maxlength="30"/>

</td>
</tr>

<tr>
<td>Account Name</td>
<td><input type="text" name="accountName" maxlength="30"/>

</td>
</tr>
<tr>
<td>Enter Amount</td>
<td><input type="text" name="amount" maxlength="100" /></td>
</tr>

<tr>
<td colspan="2" align="center">
<input type="submit" value="Submit">
<input type="reset" value="Reset">
</td>
</tr>
</table>
</form>
</body>
</html>