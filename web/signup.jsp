<%-- 
    Document   : signup
    Created on : Mar 18, 2023, 3:49:23 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <title>Sign Up Form</title>
        <script type="text/javascript">
		// Define the translations for each language
		var translations = {
			'en': {
				'signup': 'Sign Up',
				'names': 'name',
                                'email': 'Email',
				'pass': 'password',
				'confpass': 'confirm password',
				'submit': 'Submit',
				'login': 'Already have an account? Login here.'
			},
			'kinya': {
				'signup': 'kwiyandikisha',
				'names': 'amazina',
                                'email': 'imeri',
				'pass': 'umubare wibanga',
				'confpass': 'umubare wibanga nanone',
				'submit': 'ohereza',
				'login': 'wari usanzwe ufite konti?'
			},
			'fr': {
				'signup': 'S\'inscrire',
				'names': 'Nom d\'utilisateur',
                                'email': 'e-mail',
				'pass': 'mot de passe',
				'confpass': 'mot de passe encore',
				'submit': 'envoyer',
				'login': 'Déjà un compte? Connectez-vous ici.'
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
			document.getElementById('signup').innerHTML = translations[currentLang]['signup'];
			document.getElementById('names').placeholder = translations[currentLang]['names'];
			document.getElementById('email').placeholder = translations[currentLang]['email'];
                        document.getElementById('pass').placeholder = translations[currentLang]['pass'];
                        document.getElementById('confpass').placeholder = translations[currentLang]['confpass'];
			document.getElementById('submit').value = translations[currentLang]['submit'];
			document.getElementById('login').innerHTML = translations[currentLang]['login'];
			localStorage.setItem('language', currentLang); // Store the selected language in the browser's local storage
		}
		
		// Update the language when the user selects a different language
		function changeLanguage(lang) {
			currentLang = lang;
			updateLanguage();
		}
	</script>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<!--<link href="https://fonts.googleapis.com/css?family=Poppins:600&display=swap" rel="stylesheet">-->
	<!--<script src="https://kit.fontawesome.com/a81368914c.js"></script>-->
	<meta name="viewport" content="width=device-width, initial-scale=1">
       
    </head>
   <body onload="updateLanguage()">
<!--	<select onchange="changeLanguage(this.value)">
		<option value="en">English</option>
		<option value="kinya">kinyarwanda</option>
		<option value="fr">Français</option>
	</select>-->
    <script type="text/javascript" src="validation.js"></script>
	<img class="wave" src="img/wave.png">
	<div class="container">
		<div class="img">
			<img src="img/bg.svg">
			
		</div>
		
		<div class="login-content">
			<form action="SignUpServlet" method="post">
				<img src="img/avatar.svg">
				<h1 class="title" id="signup">SIGN UP </h1>
           		<div class="input-div one">
           		   <div class="i">
           		   		<i class="fas fa-user"></i>
           		   </div>
           		   <div class="div">
           		   <input type="text"  placeholder=" Names" name="name"  id="name" required  oninput="validateName()"> 
            <span id="nameError" style="color: red;"></span>
           		   </div>
           		</div>
           		<div class="input-div one">
           		   <div class="i">
           		   		<i class="fa fa-envelope"></i>
           		   </div>
           		   <div class="div">
           		   	 <input type="email" id="email" placeholder=" Email" name="email" required oninput="validateEmail()">
            <span id="emailError" style="color: red;"></span>
           		   </div>
           		
           		</div>
           		<div class="input-div pass">
           		   <div class="i"> 
           		    	<i class="fas fa-lock"></i>
           		   </div>
           		   <div class="div">
           		    	<!-- <h5>Password</h5> -->
           		    	<input type="password"  placeholder="Enter Password " name="password" id="password" required oninput="validatePassword()" > 
            <span id="passError" style="color: red;"></span>
            	   </div>
                            </div>
           		<div class="input-div one">
           		   <div class="i">
           		   		<i class="fas fa-lock"></i>
           		   </div>
           		   <div class="div">
           		   		<!-- <h5>Password</h5> -->
            <input type="password"  placeholder="Confirm Password " id="confirmpassword" name="confirmpassword" required oninput="validateConfPassword()" > 
            <span id="confpassError" style="color: red;"></span>
           		   </div>
            	</div>
            	<a href="login.jsp" id="login">already  have a account !?</a>
            	<input type="submit" class="btn" value="Register" id="submit">
            </form>
        </div>
    </div>
         
    <!--<script type="text/javascript" src="js/main.js"></script>-->
<//<body>
</html>
