<%-- 
    Document   : login
    Created on : Mar 15, 2023, 3:45:28 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <title>Login Form</title>
        
        <script type="text/javascript">
		// Define the translations for each language
		var translations = {
			'en': {
				'login': 'LOGIN',
                                'email': 'Email',
				'pass': 'password',
				'submit': 'Submit',
				'signup': 'Do not have an account? signup here.'
			},
			'kinya': {
				'login': 'kwinjira',
                                'email': 'imeri',
				'pass': 'umubare wibanga',
				'submit': 'ohereza',
				'signup': ' udafite konti? Iyandikishe hano'
			},
			'fr': {
				'login': 'connectez-vous',
                                'email': 'e-mail',
				'pass': 'mot de passe',
				'submit': 'envoyer',
				'signup': 'pas de compte? Registrer ici.'
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
			
			document.getElementById('login').innerHTML = translations[currentLang]['login'];
			document.getElementById('email').placeholder = translations[currentLang]['email'];
                        document.getElementById('pass').placeholder = translations[currentLang]['pass'];
			document.getElementById('submit').value = translations[currentLang]['submit'];
                        document.getElementById('signup').innerHTML = translations[currentLang]['signup'];
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
    </head>
    <body onload="updateLanguage()">
<!--	<select onchange="changeLanguage(this.value)">
		<option value="en">English</option>
		<option value="kinya">kinyarwanda</option>
		<option value="fr">Français</option>
	</select>-->
  
	<img class="wave" src="img/wave.png">
	<div class="container">
		<div class="img">
			<img src="img/bg.svg">
			
		</div>
		
		<div class="login-content">
			<form action="loginServlet" method="POST">
				<img src="img/avatar.svg">
				<h1 class="title" id="login">LOGIN </h1>
           		
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
           		<a href="signup.jsp" id="signup">Don't have a account !?</a>
            	<input type="submit" class="btn" value="Register" id="submit">
                   <div>
<!--                          <a href="loginkiny.html">Kinyarwanda</a>      -->
                            </div>
       
                        </form>  
       </div>
        </div>
    <!--<script type="text/javascript" src="js/main.js"></script>-->
      <script type="text/javascript" src="validation.js"></script>
      
</body>
</html>
