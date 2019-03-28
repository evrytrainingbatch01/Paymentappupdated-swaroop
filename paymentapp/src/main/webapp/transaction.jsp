<html>
<head>
<title>Account Form</title>
</head>
<body>
<h3>Transaction Amount Here</h3>
<form action="TransferAccountServlet" method="POST">
<table align="center" cellpadding = "10">
<tr>
<td>From AccountNumber</td>
<td><input type="text" name="fromaccountNumber" maxlength="30"/>

</td>
</tr>

<tr>
<td>To AccountNumber</td>
<td><input type="text" name="toaccountNumber" maxlength="30"/>

</td>
</tr>
<tr>
<td>Transfer Amount</td>
<td><input type="text" name="transeramount" maxlength="100" /></td>
</tr>

<tr>
<td colspan="2" align="center">
<input type="submit" value="Transfer">
<input type="reset" value="Cancle">
</td>
</tr>
</table>
</form>
</body>
</html>