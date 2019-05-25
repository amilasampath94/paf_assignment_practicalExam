<!DOCTYPE html>
<html>
<head>
	<meta charset=ISO-8859-1>
	<title>Item</title>
	<script type="text/javascript" src="Controllers/JQuery.js"></script>
	<script type="text/javascript" src="Controllers/controllerMain.js"></script>
</head>

<body>

	<form id="formItems" action="items.jsp" method="post">
	<input id="hidMode" name="hidMode" type="hidden" value="save">
	<input id="hidID" name="hidID" type="hidden" value="0">
	Item Name : <input id="txtItemName" type="text" name="txtItemName"><br>
	Item Description : <input id="txtItemDesc" type="text" name="txtItemDesc"><br> 
	
	<input id = "btnSave" type="button" name="btnSave" value="save"><br>
	<div id="divStsMsgItem"><%out.println(rudFeedback); %>></div>
	<%out.println(itemGrid); %>>
	</form><br>

</body>

</html>