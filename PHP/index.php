<!DOCTYPE html>
<html>
<head>
<title> Contatore PHP Visite </title>
</head>
<body>
<?php
    session_start();
    //access = 0;
    if(!isset($_SESSION["access"])){    
    
    $_SESSION["access"] = 1;
    echo "Ciao, benvenuto nella pagina, questa è la prima volta che la visiti!";
    }
    else{
       $_SESSION["access"]++;
       echo"Ciao, questa è la ".$_SESSION["access"]." volta che ti vedo oggi Buona permanenza";    
    }
    
?>
</body>
</html>
