<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<script type="text/javascript">

	
	n = parseInt(prompt('Enter The 1 Number:'));

	temp = n;
	rev=0;

	n1=temp/10;
	n2=n1/10;
	n3=n2/10;
	while(temp>0)
		{
          n3 = temp%10;
          rev = (rev*10)+n3;
          temp = temp/10;
		}
		if(n==rev){
			document.write("The Num Is Polindrome");
		}
		else{
			document.write("The Num Is Not Polindrome");
		}




	</script>

</body>
</html>