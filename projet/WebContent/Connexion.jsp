<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Connexion</title>
</head>
<body>
        <form action="index.php" method="post">
            <table>
	            <tr>
		            <td><label for="login"><strong>Nom de compte ou adresse mail :</strong></label></td>
		            <td><input type="text" name="login" id="login"/></td>
	            </tr>
	            <tr>
		            <td><label for="pass"><strong>Mot de passe :</strong></label></td>
		            <td><input type="password" name="pass" id="pass"/></td>
	            </tr>
            </table>
        <input type="submit" name="identity" value="c'est l'heure du dudududududududuel"/>
        <button href="Home.jsp" value="retour au bercail"/>
        </form>
    
    </body>
</html>