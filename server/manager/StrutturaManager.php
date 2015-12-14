<?php

require_once 'CRUD.php';
require_once '../server/entity/Struttura.php';
require_once '../server/entity/Stanza.php';
require_once '../server/entity/Anagrafica.php';

class StrutturaManager extends CRUD {

    function insert($obj) {
        if (!($obj instanceof Struttura))
            return false;

        $this->open();
        $query = 'INSERT INTO struttura VALUES ("%s","%s","%s","%s","%d")';
        $query = sprintf($query, $obj->getNome(), $obj->getCodiceFiscaleAnagrafica(), 
                $obj->getIndirizzo(), $obj->getDescrizione(), $obj->getAgibile());
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
        $query = 'UPDATE struttura SET indirizzo = "%s", descrizione = "%s", agibile = "%d" WHERE '
                . 'codicefiscaleanagrafica = "%s" AND nome = "%s"';
        $query = sprintf($query, $obj->getIndirizzo(), $obj->getDescrizione(), $obj->getAgibile(),
                $obj->getCodiceFiscaleAnagrafica(), $obj->getNome());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function read($obj) {
        if (!($obj instanceof Struttura))
            return false;

        $this->open();
        $query = 'SELECT * FROM struttura WHERE nome = "%s" AND codicefiscaleanagrafica = "%s"';
        $query = sprintf($query, $obj->getNome(), $obj->getCodiceFiscaleAnagrafica());
        $result = mysql_query($query);
        if (mysql_num_rows($result) <= 0)
            return false;

        $res = mysql_fetch_assoc($result);
        $this->close();

        $toReturn = new Struttura();
        $toReturn->setNome($res['nome']);
        $toReturn->setAgibile($res['agibile']);
        $toReturn->setIndirizzo($res['indirizzo']);
        $toReturn->setCodiceFiscaleAnagrafica($res['codicefiscaleanagrafica']);
        $toReturn->setDescrizione($res['descrizione']);

        return $toReturn;
    }

    function delete($obj) {
        if (!($obj instanceof Struttura))
            return false;

        $this->open();
        $query = 'DELETE FROM struttura WHERE nome = "%s" AND codicefiscaleanagrafica = "%s"';
        $query = sprintf($query, $obj->getNome(), $obj->getCodiceFiscaleAnagrafica());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function readAll($obj) {
        if(!($obj instanceof Anagrafica))
            return false;
        
        $this->open();
        $query = 'SELECT * FROM struttura WHERE codicefiscaleanagrafica = "%s"';
        $query = sprintf($query, $obj->getCodiceFiscale());
        $result = mysql_query($query);
        if (mysql_num_rows($result) <= 0)
            return false;
        $this->close();

        $toReturn = array();
        for ($i = 0; $i < mysql_num_rows($result); $i++) {
            $res = mysql_fetch_assoc($result);
            $tmp = new Struttura();
            $tmp->setNome($res['nome']);
            $tmp->setAgibile($res['agibile']);
            $tmp->setCodiceFiscaleAnagrafica($res['codicefiscaleanagrafica']);
            $tmp->setIndirizzo($res['indirizzo']);
            $tmp->setDescrizione($res['descrizione']);

            $toReturn[$i] = $tmp->toArray();
        }

        return $toReturn;
    }

}
