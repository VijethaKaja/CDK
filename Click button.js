<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">

function test1(){
	
	console.log(document.getElementById("mynm").value);
	document.getElementById("btn").value = document.getElementById("mynm").value
	
}
</script>

</head>
<body>
Name : <input type="text" id="mynm" /><br/>
<input id="btn" type="button" value="Click Me" onclick="test1()" />
<div id="display">
	aaaaaaaaaaaaaaa
</div>
</body>
</html>
