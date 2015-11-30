<?php

require_once "CRUD.php";
require_once '../entity/Nazionalita.php';

/**
 * Created by PhpStorm.
 * User: ScumpinatoS
 * Date: 13/10/2015
 * Time: 15:42
 */
class NazionalitaManager extends CRUD {

    function insert($obj) {
        if (!($obj instanceof Nazionalita))
            return false;

        $this->open();
        $query = 'INSERT INTO nazionalita VALUES ("%s","%s")';
        $query = sprintf($query, $obj->getAbbreviazione(), $obj->getValore());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function update($obj) {
        if (!($obj instanceof Nazionalita))
            return false;

        if (!$this->read($obj))
            return false;

        $this->open();
        $query = 'UPDATE nazionalita SET valore = "%s"';
        $query = sprintf($query, $obj->getValore());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function read($obj) {
        if (!($obj instanceof Nazionalita))
            return false;

        $this->open();
        $query = 'SELECT * FROM nazionalita WHERE abbreviazione = "%s"';
        $query = sprintf($query, $obj->getAbbreviazione());
        $result = mysql_query($query);
        if (mysql_num_rows($result) <= 0)
            return false;

        $res = mysql_fetch_assoc($result);
        $this->close();

        $toReturn = new Nazionalita();
        $toReturn->setAbbreviazione($res['abbreviazione']);
        $toReturn->setValore($res['valore']);

        return $toReturn;
    }

    function delete($obj) {
        if (!($obj instanceof Nazionalita))
            return false;

        $this->open();
        $query = 'DELETE FROM nazionalita WHERE abbreviazione = "%s"';
        $query = sprintf($query, $obj->getAbbreviazione());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function readAll() {
        $this->open();
        $query = 'SELECT * FROM nazionalita';

        $result = mysql_query($query);
        if (mysql_num_rows($result) <= 0)
            return false;

        $this->close();
        $toReturn = array();
        for ($i = 0; $i < mysql_num_rows($result); $i++) {
            $res = mysql_fetch_assoc($result);
            $tmp = new Nazionalita();
            $tmp->setAbbreviazione($res['abbreviazione']);
            $tmp->setValore($res['valore']);
            $toReturn[$i] = $tmp;
        }

        return $toReturn;
    }
}