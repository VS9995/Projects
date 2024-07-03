<!DOCTYPE html>
<html>
<head>
    <title>Registration Form</title>
    
    <link href="img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&family=Montserrat:wght@400;500;600;700&display=swap" rel="stylesheet">  

    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="lib/animate/animate.min.css" rel="stylesheet">
    <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
    <link href="lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

    <!-- Customized Bootstrap Stylesheet -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Template Stylesheet -->
    <link href="css/style.css" rel="stylesheet">
    
    
    <style>
 
body {
    font-family: Arial, sans-serif;
    background-color: #f2f2f2;
    margin: 0;
    padding: 0;
}

.container {
    max-width: 500px;
    margin: 50px auto;
    padding: 20px;
    background-color: #fff;
    border-radius: 5px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h2 {
    text-align: center;
}

form {
    display: flex;
    flex-direction: column;
}

label {
    margin-top: 10px;
}

input[type="text"],
input[type="email"],
input[type="password"],
input[type="tel"] {
    padding: 10px;
    margin: 5px 0;
    border: 1px solid #ccc;
    border-radius: 3px;
}

input[type="submit"] {
    background-color:black;
    color: #fff;
    border: none;
    padding: 10px;
    cursor: pointer;
    border-radius: 3px;
}

input[type="submit"]:hover {
    background-color: #45a049;
}
    
    </style>
</head>
<body>

<div class="container-fluid bg-dark px-0">
            <div class="row gx-0">
                <div class="col-lg-3 bg-dark d-none d-lg-block">
                    <a href="index" class="navbar-brand w-100 h-100 m-0 p-0 d-flex align-items-center justify-content-center">
                        <h1 class="m-0 text-primary text-uppercase">Hotelier</h1>
                    </a>
                </div>
                <div class="col-lg-9">
                    <div class="row gx-0 bg-white d-none d-lg-flex">
                        <div class="col-lg-7 px-5 text-start">
                            <div class="h-100 d-inline-flex align-items-center py-2 me-4">
                                <i class="fa fa-envelope text-primary me-2"></i>
                                <p class="mb-0">info@example.com</p>
                            </div>
                            <div class="h-100 d-inline-flex align-items-center py-2">
                                <i class="fa fa-phone-alt text-primary me-2"></i>
                                <p class="mb-0">+012 345 6789</p>
                            </div>
                        </div>
                        <div class="col-lg-5 px-5 text-end">
                            <div class="d-inline-flex align-items-center py-2">
                                <a class="me-3" href=""><i class="fab fa-facebook-f"></i></a>
                                <a class="me-3" href=""><i class="fab fa-twitter"></i></a>
                                <a class="me-3" href=""><i class="fab fa-linkedin-in"></i></a>
                                <a class="me-3" href=""><i class="fab fa-instagram"></i></a>
                                <a class="" href=""><i class="fab fa-youtube"></i></a>
                            </div>
                        </div>
                    </div>
                    <nav class="navbar navbar-expand-lg bg-dark navbar-dark p-3 p-lg-0">
                        <a href="index" class="navbar-brand d-block d-lg-none">
                            <h1 class="m-0 text-primary text-uppercase">Hotelier</h1>
                        </a>
                        <button type="button" class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse justify-content-between" id="navbarCollapse">
                            <div class="navbar-nav mr-auto py-0">
                                <a href="index" class="nav-item nav-link active">Home</a>
                                <a href="about" class="nav-item nav-link">About</a>
                                <a href="service" class="nav-item nav-link">Services</a>
                                <a href="room" class="nav-item nav-link">Rooms</a>
                                <div class="nav-item dropdown">
                                    <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Pages</a>
                                    <div class="dropdown-menu rounded-0 m-0">
                                        <a href="Booking" class="dropdown-item">Booking</a>
                                        <a href="team" class="dropdown-item">Our Team</a>
                                        <a href="testimonial" class="dropdown-item">Testimonial</a>
                                    </div>
                                </div>
                                <a href="contact" class="nav-item nav-link">Contact</a>
                                 <a href="Login" class="nav-item nav-link">Login</a>
                                
                            </div>
                            <a href="https://htmlcodex.com/hotel-html-template-pro" class="btn btn-primary rounded-0 py-4 px-md-5 d-none d-lg-block">Premium Version<i class="fa fa-arrow-right ms-3"></i></a>
                        </div>
                    </nav>
                </div>
            </div>
        </div>
                                                  
    <div class="container">
        <h2>Registration Form</h2>
        <%String s=(String)session.getAttribute("Registermsgfail");
               if(s!=null){
               %>
               <%=s %>
               
               <%}session.removeAttribute("Registermsgfail"); %>
       
       			 <%String s1=(String)session.getAttribute("Registermsg");
               if(s1!=null){
               %>
               <%=s1 %>
               <a href="Login"><br>Login Here</a>
               <%}session.removeAttribute("Registermsg"); %>
        <form action="Registration" method="post" >
            <label for="First Name">First Name :</label>
            <input type="text" id="First Name" name="FirstName" required> <br>
            
            <label for="Last Name">Last Name:</label>
            <input type="text" id="Last Name" name="LastName" required><br>
            
            
            <label for="Address">Address:</label>
            <input type="text" id="Address" name="Address" required><br>
            
            <label for="MobileNo">Mobile No:</label>
            <input type="tel" id="MobileNo" name="MobileNo" required><br>
            
            <label for="Password">Password</label>
            <input type="Password" id="Password" name="Password" required><br>
            
            <label for="Email">Email:</label>
            <input type="Email" id="Email" name="Email" required><br>
            
          
            <input type="submit" value="Submit"><br>
            
            
        </form>
    </div>
</body>
</html>