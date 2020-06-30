<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	
<script>

/* $(document).ready(function(){ $("button").click(function() {

$.ajax({
	url : "/surveys/{surveyId}/questions",
	surveyId : "Survey1",
	type:"GET",
	dataType : "json", // type of response data
	//timeout : 500, // timeout milliseconds
	success : function(data, status, xhr) { // success callback function
		alert("Data: " + xhr + "\nStatus: " + status);
	}
});

});
}) */;</script>	
		

</head>
<body>
	Welcome!!!!!
	<div>
		<p class="greeting-id">The ID is</p>
		<p class="greeting-content">The content is</p>
	</div>
	<button id="button">Action</button>
	<script>
	/* 	 $("button").click(function(){
		 $.get("/surveys/{surveyId}/questions/{questionId}",
		 {
		 surveyId: "Survey1",
		 questionId:"Question4",

		
		 },
		 function(data){
		 alert("Data: " + data.id + "\nStatus: " + status);
		 });
		 });   */
		 

		 $("button").click(function() {

			var url = "/surveys/"+"Survey1"+"/questions"
			alert(url);
			 $.ajax({
				url : url,
				//data: { surveyId: "Survey1"} ,
				//surveyId : "Survey1",
				dataType : "json", // type of response data
				//timeout : 500, // timeout milliseconds
				success : function(data, status, xhr) { // success callback function
					alert("Data: " + data.id + "\nStatus: " + status);
				}
			});

		}); 
	</script>
	
	
</body>
</html>