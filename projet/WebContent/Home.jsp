<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
   <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Kishishishi</title>

    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">

    <!-- Custom Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css" type="text/css">

    <!-- Plugin CSS -->
    <link rel="stylesheet" href="css/animate.min.css" type="text/css">

    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/creative.css" type="text/css">
  </head>
  <body id="page-top">
  
  <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand page-scroll" href="#page-top"><img src="img/portfolio/logo.jpg" width="30" height="30" BackColor="Transparent"/></a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a class="page-scroll" href="#search">Recherche</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#recap">Tournois r�cents</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#portfolio">Partenaires</a>
                    </li>
                    <li>
                        <a href="Inscription.jsp" class="page-scroll">Inscription</a>
                    </li>
                    <li>
                        <a href="Connexion.jsp"  class="page-scroll">Connexion</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>
    <header>
      <!--   
      		<div class="header-content">
            <div class="header-content-inner">
                <a href="#about" class="btn btn-primary btn-xl page-scroll">Find Out More</a>
            </div>
        </div>   
      -->
    </header>

    <section id="search">			<!-- class="bg-primary"-->
        <div >						<!-- class="container"-->
            <div class="row">
                Choississez un type de tournoi<br/>
                <select name="decision">
						<option selected>Troll � deux t�tes
						<option>Draft
						<option>des
						<option>trucs en
						<option>dur
				</select> 
                <input type="search" placeholder="Choissisez un type de tournoi" name="the_search">
            </div>
        </div>
    </section>

    <section id="recap">
        <img src="img/portfolio/fondRecap.jpg"> <!-- un background normalement -->
       <!--  je sais pas encore comment mettre une bonne liste de r�sum� vu que plusieurs infos, 
       j'avais pu en stage mais j'avais cr�� moi-m�me un type de composant, efficace mais long -->
    </section>

    
    
    <section class="no-padding" id="portfolio">
        <div class="container-fluid">
            <div class="row no-gutter">
                <div class="col-lg-4 col-sm-6">
                    <a href="http://www.9gag.com" class="portfolio-box">
                        <img src="img/portfolio/9gag.jpg" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Category
                                </div>
                                <div class="project-name">
                                    Lawlz
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="https://www.google.fr/search?q=chaton&source=lnms&tbm=isch&sa=X&ved=0CAcQ_AUoAWoVChMI5bv0mNGwyAIVg70aCh0fRQRQ&biw=1787&bih=852&dpr=0.9" class="portfolio-box">
                        <img src="img/portfolio/yeuh.jpg" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Category
                                </div>
                                <div class="project-name">
                                    Cuteness intensifies
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
            </div>
        </div>
    </section>
<!--
    <aside class="bg-dark">
        <div class="container text-center">
            <div class="call-to-action">
                <h2>Free Download at Start Bootstrap!</h2>
                <a href="#" class="btn btn-default btn-xl wow tada">Download Now!</a>
            </div>
        </div>
    </aside>
-->
  
    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="js/jquery.easing.min.js"></script>
    <script src="js/jquery.fittext.js"></script>
    <script src="js/wow.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="js/creative.js"></script>
    
  </body>
</html>