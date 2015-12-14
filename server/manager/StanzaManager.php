<?php

require_once 'CRUD.php';
require_once '../server/entity/Stanza.php';
require_once '../server/entity/Struttura.php';

class StanzaManager extends CRUD {

    function insert($obj) {
        if (!($obj instanceof Stanza)) {
            return false;
        }

        $this->open();
        $query = 'INSERT INTO stanza VALUES ("%s", "%s", "%s", "%s", "%s", "%f", "%d", "%d")';
        $query = sprintf($query, $obj->getNomeStruttura(), $obj->getCodiceFiscaleProprietario(),
                $obj->getNumero(), $obj->getTipo(), $obj->getDescrizione(),
                $obj->getMq(), $obj->getAgibile(), $obj->getLibera());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function update($obj) {
        if (!($obj instanceof Stanza))
            return false;

        if ($this->read($obj) == false)
            return false;

        $this->open();
        $query = 'UPDATE stanza SET tipo = "%d", descrizione = "%s",'
                . ' mq = "%f", agibile = "%d", libera = "%d" WHERE'
                . ' nomestruttura = "%s" AND codicefiscaleproprietario = "%s" AND numero = "%s"';
        $query = sprintf($query, $obj->getTipo(), $obj->getDescrizione(),
                $obj->getMq(), $obj->getAgibile(), $obj->getLibera(),
                $obj->getNomeStruttura(), $obj->getCodiceFiscaleProprietario(), $obj->getNumero());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function read($obj) {
        if (!($obj instanceof Stanza))
            return false;

        $this->open();
        $query = 'SELECT * FROM stanza WHERE nomestruttura = "%s" AND numero = "%s" AND codicefiscaleproprietario = "%s"';
        $query = sprintf($query, $obj->getNomeStruttura(), $obj->getNumero(), $obj->getCodiceFiscaleProprietario());
        $result = mysql_query($query);
        if (mysql_num_rows($result) <= 0)
            return false;

        $res = mysql_fetch_assoc($result);
        $this->close();

        $tmp = new Stanza();
        $tmp->setNomeStruttura($res['nomestruttura']);
        $tmp->setCodiceFiscaleProprietario($res['codicefiscaleproprietario']);
        $tmp->setNumero($res['numero']);
        $tmp->setTipo($res['tipo']);
        $tmp->setDescrizione($res['descrizione']);
        $tmp->setMq($res['mq']);
        $tmp->setAgibile($res['agibile']);
        $tmp->setLibera($res['libera']);

        return $tmp;
    }

    function delete($obj) {
        if (!($obj instanceof Stanza))
            return false;

        $this->open();
        $query = 'DELETE FROM stanza WHERE nomestruttura = "%s" AND codicefiscaleproprietario = "%s" AND numero = "%s"';
        $query = sprintf($query, $obj->getNomeStruttura(), $obj->getCodiceFiscaleProprietario(), $obj->getNumero());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function readAll($obj) {
        if (!($obj instanceof Struttura))
            return false;
        
        $this->open();
        $query = 'SELECT * FROM stanza WHERE nomestruttura = "%s" AND codicefiscaleproprietario = "%s"';
        $query = sprintf($query, $obj->getNome(), $obj->getCodiceFiscaleAnagrafica());
        $result = mysql_query($query);
        if (mysql_num_rows($result) <= 0)
            return false;
        $this->close();

        $toReturn = array();
        for ($i = 0; $i < mysql_num_rows($result); $i++) {
            $res = mysql_fetch_assoc($result);
            $tmp = new Stanza();
            $tmp->setNomeStruttura($res['nomestruttura']);
            $tmp->setCodiceFiscaleProprietario($res['codicefiscaleproprietario']);
            $tmp->setNumero($res['numero']);
            $tmp->setTipo($res['tipo']);
            $tmp->setDescrizione($res['descrizione']);
            $tmp->setMq($res['mq']);
            $tmp->setAgibile($res['agibile']);
            $tmp->setLibera($res['libera']);

            $toReturn[$i] = $tmp->toArray();
        }

        return $toReturn;
    }

}