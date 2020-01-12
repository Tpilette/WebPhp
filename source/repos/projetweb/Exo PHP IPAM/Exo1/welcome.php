<!DOCTYPE HTML>
<html >
    <head>
        <meta charset="UTF-8">
        <title>Document</title>
    </head>
    <body>
        <h2>Bienvenue</h2>
            <?php
            if(isset($_POST['sexe']) and isset($_POST['prenom']))
            {
                $sexe = $_POST['sexe'];
                $prenom = $_POST['prenom'];
                
    
                echo "Bienvenue ".$sexe." ".$prenom;
            }
            else
            {
                header("Location: unauthorize.php");
            }

            ?>
    </body>
</html>