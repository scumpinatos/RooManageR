<html>
    <head>
        <title>Test Nazionalita</title>
    </head>
    <body>
        <form action="<?php echo $_SERVER['PHP_SELF'] ?>" method="POST">
            <input type="radio" name="op" value="1"> INSERT<br>
            <input type="radio" name="op" value="2"> READ<br>
            <input type="radio" name="op" value="3"> READ ALL<br>
            <input type="radio" name="op" value="4"> UPDATE<br>
            <input type="radio" name="op" value="5"> DELETE<br>
            <input type="submit" value="PROVA"/>
        </form>
    </body>
</html>


<?php
require_once '../manager/NazionalitaManager.php';

$manager = new NazionalitaManager();
$prova = new Nazionalita();

$prova->setAbbreviazione("ITA");
$prova->setValore("Italiana");

if (isset($_POST['op'])) {
    switch ($_POST["op"]) {
        case "1":
                $manager->insert($prova);
                echo 'INSERT Ok';
                break;
        case "2": 
                var_dump($manager->read($prova));
                break;
        case "3": 
                var_dump($manager->readAll());
                break;
        case "4": 
                $prova->setValore("New Italiana");
                $manager->update($prova);
                echo 'UPDATE Ok';
                break;
        case "5": 
                $manager->delete($prova);
                echo 'DELETE Ok';
                break;
    }
}
    