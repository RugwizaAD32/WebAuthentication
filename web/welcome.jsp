<%-- 
    Document   : welcome
    Created on : Mar 14, 2023, 5:54:25 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>welcome</title>
        <link rel="stylesheet" type="text/css" href="css/sty.css">
         <script type="text/javascript">
		// Define the translations for each language
		var translations = {
			'en': {
				'login': 'WELCOME TO WEBTECH',
                                'email': 'DASHBORD',
				'pass': 'SIGNUP',
				'submit': 'ADMISSION',
				'signup': 'LOG OUT',
                                'intro':' We are  your go-to source for the latest news, reviews, and insights on all things technology. 
                        Our team of experts are constantly on the lookout the newest gadgets, software, and trends, 
                        so you can stay up-to-date on the ever-evolving world of tech.
                       Whether you're a tech enthusiast or just looking for some guidance on the latest tech products, 
                       our website has everything you need. From smartphones to laptops, 
                       from gaming to artificial intelligence, we cover it all.'
			},
			'kinya': {
				'login': 'IKAZE KURI WEBTECH',
                                'email': 'DASHIBODI',
				'pass': 'KWIYANDIKISHA',
				'submit': 'IBARUZE',
				'signup': 'GUSOHOKA',
                                 'intro':'Turi aba-soko yawe kumakuru agezweho, gusubiramo, no gushishoza kubintu byose ikoranabuhanga.
                        Itsinda ryinzobere zacu zihora zishakisha ibikoresho bishya, software, hamwe nibigenda,
                        urashobora rero gukomeza kugezwaho amakuru ku isi yiterambere ryiterambere.
                       Waba ukunda tekinoloji cyangwa ushakisha gusa ubuyobozi kubicuruzwa bigezweho,
                       urubuga rwacu rufite ibyo ukeneye byose. Kuva kuri terefone zigendanwa kugeza kuri mudasobwa zigendanwa,
                       kuva gukina kugeza ubwenge bwubuhanga, turabikurikirana byose.'
                                
			},
			'fr': {
				'login': 'BIENVENUE AU WEBTECH',
                                'email': 'TABLEAU DE BORD',
				'pass': 'SINSCRIRE',
				'submit': 'ADMISSION ',
				'signup': 'SE DÉCONNECTER',
                                'intro':'Nous sommes votre source incontournable pour les dernières nouvelles, critiques et informations sur tout ce qui concerne la technologie.
                        Notre équipe d'experts est constamment à la recherche des derniers gadgets, logiciels et tendances,
                        afin que vous puissiez rester à jour sur le monde en constante évolution de la technologie.
                        
                       Que vous soyez un passionné de technologie ou que vous recherchiez simplement des conseils sur les derniers produits technologiques,
                       notre site Web a tout ce dont vous avez besoin. Des smartphones aux ordinateurs portables,
                       du jeu à l intelligence artificielle, nous couvrons tout.'
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
			document.getElementById('email').innerHTML = translations[currentLang]['email'];
                        document.getElementById('pass').innerHTML = translations[currentLang]['pass'];
			document.getElementById('submit').innerHTML = translations[currentLang]['submit'];
                        document.getElementById('signup').innerHTML = translations[currentLang]['signup'];
                        document.getElementById('intro').innerHTML = translations[currentLang]['intro'];
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
	<select onchange="changeLanguage(this.value)">
               <option ="en">change language</option>
		<option value="en">English</option>
		<option value="kinya">kinyarwanda</option>
		<option value="fr">Français</option>
	</select>
    </head>
    <body>
        
<!--	<img class="wave" src="img/wave.png">-->
	<div class="container">
		<div class="img">
			<img src="img/AP.png">	
		</div>
            <div class="login-content">
		
                <p id="intro">
                <strong id="login">WELCOME TO WEBTECH</strong>
                <br><br><br>
                   We are your go-to source for the latest news, reviews, and insights on all things technology. 
                        Our team of experts are constantly on the lookout for the newest gadgets, software, and trends, 
                        so you can stay up-to-date on the ever-evolving world of tech.
                        <br><br>
                       Whether you're a tech enthusiast or just looking for some guidance on the latest tech products, 
                       our website has everything you need. From smartphones to laptops, 
                       from gaming to artificial intelligence, we cover it all.

                
                        </p>
                        
                </div>
		<div class="login-content">
                    
                    <a href="home.jsp" id="email" class="btni">DASHBOARD</a>
                    <a href="signup.jsp" id="pass" class="btni">SIGN UP</a>
                    <a href="index.jsp"id="submit" class="btni">Admission</a>
                    <a href="logout.jsp"id="signup" class="btni">log out</a>
                    
                </div>
                
                
        </div>
    </body>
</html>
