<html>
    <head>
        <title>Test Anagrafica</title>
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
require_once '../manager/AnagraficaManager.php';

$manager = new AnagraficaManager();
$prova = new Anagrafica();

$prova->setNome("Nome");
$prova->setCognome("Cognome");
$prova->setCodiceFiscale("CODICEFISCALE");
$prova->setDataNascita("11/1/1111");
$prova->setIndirizzo("Via/Strada/Piazza");
$prova->setTipoDocumento("1");
$prova->setNumeroDocumento("NDOC");
$prova->setNazionalita("ITA");
$prova->setCellulare("3333333333");
$prova->setTelefono("0123456789");
$prova->setEmail("prova@prova.it");

if (isset($_POST['op'])) {
    switch ($_POST["op"]) {
        case "1":
            $manager->insert($prova);
            echo 'INSERT Ok<br>';
            break;
        case "2":
            var_dump($manager->read($prova));
            break;
        case "3":
            var_dump($manager->readAll());
            break;
        case "4":
            $prova->setNome("Giandomenico");
            $manager->update($prova);
            echo 'UPDATE Ok';
            break;
        case "5":
            $manager->delete($prova);
            echo 'DELETE Ok';
            break;
    }
}
