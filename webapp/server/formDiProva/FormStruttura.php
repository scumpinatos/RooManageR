<?php
    require_once '../manager/AnagraficaManager.php';
?>

<html>
    <head>
        <title>Struttura</title>
    </head>
    <body>
        <form>
            Proprietario <select name="proprietario">
                <?php
                $nazionalita = new AnagraficaManager();
                $array = $nazionalita->readAll();
                for($i=0; $i < count($array); $i++) {
                    $current = '<option name="%d">%s</option>';
                    $current = sprintf($current, $i, $array[$i]->getCodiceFiscale());
                    echo $current;
                }
                ?>
            </select><br>
            Indirizzo <input type="text" name="indirizzo"><br>
            Descrizione <input type="textarea" name="descrizione"><br>
            Agibile <input type="checkbox" name="agibile"><br>
        </form>
    </body>
</html>


