function validateName() {
  const name = document.getElementById("names").value;
  const nameError = document.getElementById("nameError");
  
  if (!name.match(/^[a-zA-Z]+$/)) {
    nameError.textContent = "Invalid Name. Only letters allowed.";
  } else {
    nameError.textContent = "";
  }
}

function validateEmail() {
  const email = document.getElementById("email").value;
  const emailError = document.getElementById("emailError");
  var pat = /^[^ ]+@[^ ]+\.[a-z]{2,3}$/;
  if (!email.match(pat)) {
    emailError.textContent = "Invalid email use appropriate like ss@email.com ";
  } else {
    emailError.textContent = "";
  }
}

function validatePhone() {
  const phone = document.getElementById("phone").value;
  const phoneError = document.getElementById("phoneError");
  if (phone.length === 10) {
    phoneError.textContent = "";
  } else {
    phoneError.textContent = "Invalid Phone";
  }
}
  function validateRadio() {
  const r = document.getElementsByName("gender").value;
  const genderError= document.getElementsByName("genderError");
  const checked = false;
  for (var i = 0; i < r.length; i++) {
    if (r[i].checked) {
      checked = true;
      break;
    }
  }
  if (!checked) {
    genderError.textContent = "Invalid Gender ";
    return false;
  }
 else {
    genderError.textContent = "";
  }}
  
  
  function validatePassword() {
  const pass = document.getElementById("pass").value;
  const passError = document.getElementById("passError");
  //var confpass = document.getElementById("confpass").value;
  const pattern = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$/;
  
  if (!pattern.test(pass)) {
    passError.textContent ="Password must be at least 8 characters long.";
    return false;
  }else {
       passError.textContent = "";
  }
  }
  
  function validateConfPassword() {
   var pass = document.getElementById("pass").value;
   var confpass = document.getElementById("confpass").value;
   const confpassError = document.getElementById("confpassError");
   if (pass !== confpass) {
    confpassError.textContent ="Passwords do not match.";   
   }else {
        confpassError.textContent = "";
  }
  }
  
  function validateFile() {
  const file = document.getElementById("myFile").value;
  if (!file.endsWith(".png") && !file.endsWith(".jpg")) {
    //alert(" PNG or JPG file ");
    imageError.textContent ="Only PNG or JPG file."; 
    document.getElementById("myFile").value = "";
  }
}

function validateFileType(){
var fileInput = document.getElementById("pdfFile");
var filePath = fileInput.value;
var allowedExtensions = /(\.pdf)$/i;
if(!allowedExtensions.exec(filePath)){
//alert('Invalid file type. Only PDF files are allowed.');
pdfError.textContent ="Only PDF files are allowed."; 
fileInput.value = '';
return false;
}
}

function submitForm() {
  const form = document.getElementById("form");
  const fnameError = document.getElementById("nameError").textContent;
  const emailError = document.getElementById("emailError").textContent;
  const dobError = document.getElementById("dobError").textContent;
  const genderError= document.getElementsByName("genderError").textContent;
  const passError = document.getElementById("passError").textContent;
  const confpassError = document.getElementById("confpassError").textContent;
  
  if (!fnameError && !emailError  && !dobError && !genderError  && !passError && !confpassError) 
  {
     
      form.submitForm();
    
}     
   else {
    alert("Please fix the errors before submitting the form.");
    return false;
  }
}
