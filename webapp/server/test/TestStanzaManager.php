<html>
    <head>
        <title>Test Stanza</title>
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

require_once '../manager/StanzaManager.php';

$manager = new StanzaManager();
$prova = new Stanza();

$prova->setIdStruttura("Luna Hotel");
$prova->setNumero("1A");
$prova->setTipo("Singola");
$prova->setAgibile(true);
$prova->setLibera(false);

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
            $prova->setNumero("2A");
            $manager->update($prova);
            echo 'UPDATE Ok';
            break;
        case "5":
            $manager->delete($prova);
            echo 'DELETE Ok';
            break;
    }
}