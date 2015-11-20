<html>
    <head>
        <title>Test Struttura</title>
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

require_once '../manager/StrutturaManager.php';

$manager = new StrutturaManager();
$prova = new Struttura();

$prova->setDescrizione("BELLA STRUTTURA");
$prova->setIndirizzo("Via Ceppa di Cazzo 29");
$prova->setAgibile(true);
$prova->setCodiceFiscaleAnagrafica("ZZIFNC23BF9UTY");
$prova->setId(3);

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
            $prova->setDescrizione("JAMM CHE CAZZ");
            $manager->update($prova);
            echo 'UPDATE Ok';
            break;
        case "5":
            $manager->delete($prova);
            echo 'DELETE Ok';
            break;
    }
}