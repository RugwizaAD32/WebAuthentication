<%-- 
    Document   : index
    Created on : Mar 13, 2023, 3:37:51 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        	<title>Animated Login Form</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<!--<link href="https://fonts.googleapis.com/css?family=Poppins:600&display=swap" rel="stylesheet">-->
	<!--<script src="https://kit.fontawesome.com/a81368914c.js"></script>-->
	<meta name="viewport" content="width=device-width, initial-scale=1">
        <script type="text/javascript">
		// Define the translations for each language
		var translations = {
			'en': {
				'name': 'LOGIN',
                                'email': 'Email',
				'phone': 'password',
				'image': 'Submit',
				'pdf': 'Do not have an account? signup here.',
                                'religion': 'ohereza'
			},
			'kinya': {
				'name': 'kwinjira',
                                'email': 'imeri',
				'phone': 'umubare wibanga',
				'image': 'ohereza',
				'pdf': ' udafite konti? Iyandikishe hano',
                                'religion': 'ohereza'
                                
			},
			'fr': {
				'name': 'connectez-vous',
                                'email': 'e-mail',
				'phone': 'mot de passe',
				'image': 'envoyer',
				'pdf': 'pas de compte? Registrer ici.',
                                'religion': 'ohereza'
			}
		};
		
		// Set the default language to English
		var currentLang = 'en';
		
		// Check if a language preference is stored in the browser's local storage
		if (localStorage.getItem('language')) {
			currentLang = localStorage.getItem('language');
		} else {
			// If no language preference is stored, try to detect the user's browser language
			var userLang = navigator.language || navigator.userLanguage;
			if (userLang.substring(0, 2) in translations) {
				currentLang = userLang.substring(0, 2);
			}
		}
		
		// Update the website content with the translations for the current language
		function updateLanguage() {
			
			document.getElementById('name').innerHTML = translations[currentLang]['name'];
			document.getElementById('email').placeholder = translations[currentLang]['email'];
                        document.getElementById('phone').placeholder = translations[currentLang]['phone'];
			document.getElementById('image').value = translations[currentLang]['image'];
                        document.getElementById('pdf').innerHTML = translations[currentLang]['pdf'];
                        document.getElementById('religion').innerHTML = translations[currentLang]['religion'];
			localStorage.setItem('language', currentLang); // Store the selected language in the browser's local storage
		}
		
		// Update the language when the user selects a different language
		function changeLanguage(lang) {
			currentLang = lang;
			updateLanguage();
		}
	</script>
</head>
    </head>
    <body>
        
<!--	<img class="wave" src="img/wave.jpeg">-->
	<div class="container">
		<div class="img">
			<img src="img/bg.svg">
			
		</div>
		
		<div class="login-content">
                    <form action="AdmissionServlet" method="post" enctype="multipart/form-data">
				<!-- <img src="img/avatar.svg"> -->
				<h1 class="title">USER REGISTRATION </h1>
                                
                                
           		<div class="input-div one">
           		   <div class="i">
           		   		<i class="fas fa-user"></i>
           		   </div>
           		   <div class="div">
           		   		<!-- <h5>Brand</h5> -->
           		   		 <input type="text"  placeholder="Parent/Guardian name" name="fname"  id="names" required  oninput="validateName()"> 
            <span id="nameError" style="color: red;"></span>
           		   </div>
           		</div>
           		<div class="input-div one">
           		   <div class="i">
           		   		<i class="fa fa-envelope"></i>
           		   </div>
           		   <div class="div">
           		   		<!-- <h5>Brand</h5> -->
           		   		 <input type="email" id="email" placeholder="Parent/Guardian email" name="email" required oninput="validateEmail()">
            <span id="emailError" style="color: red;"></span>
           		   </div>
           		</div>
           		<div class="input-div one">
           		   <div class="i">
           		   		<i class="fas fa-phone"></i>
           		   </div>
           		   <div class="div">
           		   		<!-- <h5>Manufacturing Year</h5> -->
           		
            <input type="text" placeholder="Enter phone" name="phone" id="phone" required oninput="validatePhone()">  
            <span id="phoneError" style="color: red;"></span>

           		   </div>
           		</div>
				   <div class="input-div one">
					<div class="i">
							<i class="fas fa-image"></i>
					</div>
					<div class="div">
							<!-- <h5>Brand</h5> -->
                                <input type="file" id="myFile" accept=".png, .jpg" onchange="validateFile()" name="image" style="color: grey;" required>
				<span id="imageError" style="color: red;"></span>	
                                        </div>
				 </div>
				 <div class="input-div one">
					<div class="i">
							<i class="fas fa-file-pdf"></i>
					</div>
					<div class="div">
							<!-- <h5>Imported Date</h5> -->
							<input type="file" id="pdfFile" name="pdf" onchange="validateFileType();" accept=".pdf" style="color: grey;" required> 
					<span id="pdfError" style="color: red;"></span>
                                        </div>
				 </div>
				 <div class="input-div one">
					<div class="i">
							<i class="fas fa-church"></i>
					</div>
					<div class="div">
							<!-- <h5>Imported Date</h5> -->
				<input type="text" class="input" name="password" placeholder="Enter Religion">
					</div>
				 </div>
           		
            	<a href="welcome.jsp"> DONE ?</a>
            	<input type="submit" class="btn" value="Register">
            </form>
        </div>
    </div>
        <script type="text/javascript" src="validation.js"></script>
    <!--<script type="text/javascript" src="js/main.js"></script>-->
        
    </body>
</html>
