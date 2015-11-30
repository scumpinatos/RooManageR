<?php
    require_once '../manager/NazionalitaManager.php';
?>

<html>
    <head>
        <title>Anagrafica</title>
    </head>
    <body>
        <form>
            Nome <input type="text" name="nome"><br>
            Cognome <input type="text" name="cognome"><br>
            Codice fiscale <input type="text" name="cf"><br>
            Data di nascita <input type="date" name="data"><br>
            Indirizzo <input type="text" name="indirizzo"><br>
            Tipo documento <select name="tipodoc">
                <option name="carta">Carta d'identit&agrave;</option>
                <option name="passaporto">Passaporto</option>
                <option name="patente">Patente</option>
                <option name="altro">Altro</option>
            </select><br>
            Numero documento <input type="text" name="numdoc"><br>
            Nazionalit&agrave; <select name="nazionalita">
                <?php
                $nazionalita = new NazionalitaManager();
                $array = $nazionalita->readAll();
                for($i=0; $i < count($array); $i++) {
                    $current = '<option name="%d">%s</option>';
                    $current = sprintf($current, $i, $array[$i]->getAbbreviazione());
                    echo $current;
                }
                ?>
            </select><br>
            Cellulare <input type="number" name="cellulare"><br>
            Telefono <input type="tel" name="telefono"><br>
            Email <input type="email" name="email"><br>
        </form>
    </body>
</html>
