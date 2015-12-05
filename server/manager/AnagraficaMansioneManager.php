<?php

require_once 'CRUD.php';
require_once '../server/entity/AnagraficaMansione.php';


class AnagraficaMansioneManager extends CRUD {

    function insert($obj) {
        if (!($obj instanceof AnagraficaMansione)) {
            return false;
        }

        $this->open();
        $query = 'INSERT INTO anagraficamansione VALUES ("%s", "%s", "%s", "%s", "%d")';
        $query = sprintf($query, $obj->getCodiceFiscaleAnagrafica(), $obj->getPassword(), 
                $obj->getNomeStruttura(), $obj->getCodiceFiscaleProprietario(), $obj->getTipomansione());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function update($obj) {
        if (!($obj instanceof AnagraficaMansione)) {
            return false;
        }

        if (!$this->read($obj)) {
            return false;
        }

        $this->open();
        $query = 'UPDATE anagraficamansione SET codicefiscaleanagrafica = "%s", password = "%s", '
                . 'nomestruttura = "%s", codicefiscaleproprietario = "%s", tipomansione = "%d"';
        $query = sprintf($query, $obj->getCodiceFiscaleAnagrafica(), $obj->getPassword(), 
                $obj->getNomeStruttura(), $obj->getCodiceFiscaleProprietario(), $obj->getTipoMansione());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function read($obj) {
        if (!($obj instanceof AnagraficaMansione))
            return false;

        $this->open();
        $query = 'SELECT * FROM anagraficamansione WHERE codicefiscaleanagrafica = "%s"';
        $query = sprintf($query, $obj->getCodicefiscaleanagrafica());
        $result = mysql_query($query);
        if (mysql_num_rows($result) <= 0)
            return false;

        $res = mysql_fetch_assoc($result);
        $this->close();

        $toReturn = new AnagraficaMansione();
        $toReturn->setCodiceFiscaleAnagrafica($res['codicefiscaleanagrafica']);
        $toReturn->setCodiceFiscaleProprietario($res['codicefiscaleproprietario']);
        $toReturn->setPassword($res['password']);
        $toReturn->setNomeStruttura($res['nomestruttura']);
        $toReturn->setTipoMansione($res['tipomansione']);

        return $toReturn;
    }

    function delete($obj) {
        if (!($obj instanceof AnagraficaMansione)) {
            return false;
        }

        $this->open();
        $query = 'DELETE FROM anagraficamansione WHERE codicefiscaleanagrafica = "%s"';
        $query = sprintf($query, $obj->getCodiceFiscaleAnagrafica());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function readAll() {
        $this->open();
        $query = 'SELECT * FROM anagraficamansione';
        $result = mysql_query($query);
        if (mysql_num_rows($result) <= 0) {
            return false;
        }
        $this->close();

        $toReturn = array();
        for ($i = 0; $i < mysql_num_rows($result); $i++) {
            $res = mysql_fetch_assoc($result);
            $tmp = new AnagraficaMansione();
            $tmp->setCodiceFiscaleAnagrafica($res['codicefiscaleanagrafica']);
            $tmp->setCodiceFiscaleProprietario($res['codicefiscaleproprietario']);
            $tmp->setPassword($res['password']);
            $tmp->setNomeStruttura($res['nomestruttura']);
            $tmp->setTipoMansione($res['tipomansione']);

            $toReturn[$i] = $tmp->toArray();
        }

        return $toReturn;
    }

}
