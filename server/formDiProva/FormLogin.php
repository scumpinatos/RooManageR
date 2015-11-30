<html>
    <head>
        <title>LOGIN</title>
    </head>
    <body>
        <form action="<?php echo $_SERVER['PHP_SELF'] ?>" method="POST">
            Codice fiscale <input type="text" name="cf"><br>
            Password <input type="password" name="password"><br>
            <input type="submit" value="Accedi">
        </form>
    </body>
</html>

<?php

require_once '../manager/AnagraficaMansioneManager.php';

if(isset($_POST['cf'])) {
    
    $utente = new AnagraficaMansione();
    $utente->setCodicefiscaleanagrafica($_POST['cf']);
    $utente->setPassword($_POST['password']);
    
    $manager = new AnagraficaMansioneManager();
    echo json_encode($manager->login($utente)->toArray());
}
