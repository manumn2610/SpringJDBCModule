/**
 * 
 */
document.getElementById("button").addEventListener("click", loadData);

		function loadData() {
			
			alert("I am in new js file");

			//alert("in laodData")

			request = new XMLHttpRequest();

			//open

			//alert("in laodData" + request)
			var surveyId = "Survey1";
			var questionId = "Question1";
			//var url = "/surveys/" + surveyId + "/questions/" + questionId;
			var url = "/surveys/" + surveyId + "/questions/";

			alert("url" + url)

			request.open("GET", url, true);

			//response is ready 

			request.onload = function() {

				if (this.status == 200) {
					//alert("responseText" + this.responseText)

					document.getElementById("output").innerHTML = this.responseText;
					
					var questions=JSON.parse(this.responseText);
					var output="";
					var arrayQuestions=questions.forEach(function(question){
						
						
						var Arroptions = question.options;
						 output += "<ul> <li>ID:" + question.id
						+ "</li> <li>description:" + question.description
						+ "</li> <li>Answer:" + question.correctAnswer
						+ "</li> <li><ul><li>option1:" + Arroptions[0]
						+ "<li>option2:" + Arroptions[1] + "<li>option3:"
						+ Arroptions[2] + "<li>option4:" + Arroptions[3]
						+ "<li></ul></li></ul>";
 					
						
					});

					/* var question = JSON.parse(this.responseText);
					var options = question.options;
					alert("options" + options[0])
					var output = "<ul> <li>ID:" + question.id
							+ "</li> <li>description:" + question.description
							+ "</li> <li>Answer:" + question.correctAnswer
							+ "</li> <li><ul><li>option1:" + options[0]
							+ "<li>option2:" + options[1] + "<li>option3:"
							+ options[2] + "<li>option4:" + options[3]
							+ "<li></ul></li></ul>"; */

					document.getElementById("output").innerHTML = output;

				}

			}

			request.send();

		}