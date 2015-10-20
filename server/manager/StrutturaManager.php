<?php

/**
 * User: UnisaGiax - Giandomenico Izzo <g.izzo24@studenti.unisa.it>
 * Date: 13/10/2015
 * Time: 19:23
 */
class StrutturaManager extends CRUD {

    function insert($obj) {
        if (!($obj instanceof Struttura))
            return false;

        $this->open();
        $query = 'INSERT INTO struttura(indirizzo, codicefiscaleanagrafica, descrizione) VALUES ("%s","%s","%s")';
        $query = sprintf($query, $obj->getIndirizzo(), $obj->getCodiceFiscaleAnagrafica(), $obj->getDescrizione());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function update($obj) {
        if (!($obj instanceof Struttura))
            return false;

        if (!$this->read($obj))
            return false;

        $this->open();
        $query = 'UPDATE struttura SET indirizzo = "%s", descrizione = "%s", codicefiscaleanagrafica = "%s"';
        $query = sprintf($query, $obj->getIndirizzo(), $obj->getDescrizione(), $obj->getCodiceFiscaleAnagrafica());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function read($obj) {
        if (!($obj instanceof Struttura))
            return false;

        $this->open();
        $query = 'SELECT * FROM struttura WHERE id = "%s"';
        $query = sprintf($query, $obj->getId());
        $result = mysql_query($query);
        if (mysql_num_rows($result) <= 0)
            return false;

        $res = mysql_fetch_assoc($result);
        $this->close();

        $toReturn = new Struttura();
        $toReturn->setId($res['id']);
        $toReturn->setIndirizzo($res['indirizzo']);
        $toReturn->setCodiceFiscaleAnagrafica($res['codicefiscaleanagrafica']);
        $toReturn->setDescrizione($res['descrizione']);

        return $toReturn;
    }

    function delete($obj) {
        if (!($obj instanceof Struttura))
            return false;

        $this->open();
        $query = 'DELETE FROM struttura WHERE id = "%s"';
        $query = sprintf($query, $obj->getId());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function readAll() {
        $this->open();
        $query = 'SELECT * FROM struttura';
        $result = mysql_query($query);
        if (mysql_num_rows($result) <= 0)
            return false;
        $this->close();

        $toReturn = array();
        for ($i = 0; $i < mysql_num_rows($result); $i++) {
            $res = mysql_fetch_assoc($result);
            $tmp = new Struttura();
            $tmp->setId($res['id']);
            $tmp->setCodiceFiscaleAnagrafica($res['codicefiscaleanagrafica']);
            $tmp->setIndirizzo($res['indirizzo']);
            $tmp->setDescrizione($res['descrizione']);

            $toReturn[$i] = $tmp;
        }

        return $toReturn;
    }
}