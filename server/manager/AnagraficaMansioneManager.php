<?php

require_once 'CRUD.php';
require_once '../entity/AnagraficaMansione.php';

class AnagraficaMansioneManager extends CRUD {

    function insert($obj) {
        if (!($obj instanceof AnagraficaMansione)) {
            return false;
        }

        $this->open();
        $query = 'INSERT INTO anagraficamansione VALUES ("%s", "%s", "%s", "%s")';
        $query = sprintf($query, $obj->getCodicefiscaleanagrafica(), $obj->getPassword(), $obj->getIdstruttura(), $obj->getTipomansione());
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
        $query = 'UPDATE anagraficamansione SET codicefiscaleanagrafica = "%s", password = "%s", idstruttura = "%s", tipomansione = "%"';
        $query = sprintf($query, $obj->getCodicefiscaleanagrafica(), $obj->getPassword(), $obj->getIdstruttura(), $obj->getTipomansione());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function read($obj) {
        if (!($obj instanceof AnagraficaMansione))
            return false;

        $this->open();
        $query = 'SELECT * FROM anagraficamansione WHERE codicefiscaleanagrafica = "%s" AND password = "%s"';
        $query = sprintf($query, $obj->getCodicefiscaleanagrafica(), $obj->getPassword());
        $result = mysql_query($query);
        if (mysql_num_rows($result) <= 0)
            return false;

        $res = mysql_fetch_assoc($result);
        $this->close();

        $toReturn = new AnagraficaMansione();
        $toReturn->setId($res['id']);
        $toReturn->setCodicefiscaleanagrafica($res['codicefiscaleanagrafica']);
        $toReturn->setPassword($res['password']);
        $toReturn->setIdstruttura($res['idstruttura']);
        $toReturn->setTipomansione($res['tipomansione']);

        return $toReturn;
    }

    function delete($obj) {
        if (!($obj instanceof AnagraficaMansione)) {
            return false;
        }

        $this->open();
        $query = 'DELETE FROM anagraficamansione WHERE id = "%s"';
        $query = sprintf($query, $obj->getId());
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
            $tmp->setId($res['id']);
            $tmp->setCodicefiscaleanagrafica($res['codicefiscaleanagrafica']);
            $tmp->setPassword($res['password']);
            $tmp->setIdstruttura($res['idstruttura']);
            $tmp->setTipomansione($res['tipomansione']);

            $toReturn[$i] = $tmp;
        }

        return $toReturn;
    }

}
