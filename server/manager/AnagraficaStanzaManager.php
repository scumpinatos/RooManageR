<?php

require_once '../server/entity/AnagraficaStanza.php';
require_once '../server/entity/Struttura.php';
require_once 'CRUD.php';

class AnagraficaStanzaManager extends CRUD {

    function insert($obj) {
        if (!($obj instanceof AnagraficaStanza))
            return false;

        $this->open();
        $query = 'INSERT INTO anagraficastanza VALUES ("%s","%s","%s","%s","%s","%s","%s")';
        $query = sprintf($query, $obj->getCodiceFiscaleAnagrafica(), $obj->getNumeroStanza(), 
                $obj->getNomeStruttura(), $obj->getCodiceFiscaleProprietario(), 
                $obj->getIngresso(), $obj->getUscita(), $obj->getCosto());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function update($obj) {
        if (!($obj instanceof AnagraficaStanza))
            return false;

        if (!$this->read($obj))
            return false;

        $this->open();
        $query = 'UPDATE anagraficastanza SET codicefiscaleanagrafica = "%s", numerostanza = "%s", '
                . 'nomestruttura = "%s", codicefiscaleproprietario = "%s", '
                . 'ingresso = "%s", uscita = "%s", costo = "%s" WHERE '
                . 'numerostanza = "%s" AND nomestruttura = "%s" AND codicefiscaleproprietario = "%s"';
        $query = sprintf($query, $obj->getCodiceFiscaleAnagrafica(), $obj->getNumeroStanza(), 
                $obj->getNomeStruttura(), $obj->getCodiceFiscaleProprietario(), 
                $obj->getIngresso(), $obj->getUscita(), $obj->getCosto(),
                $obj->getNumeroStanza(), $obj->getNomeStruttura(), $obj->getCodiceFiscaleProprietario());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function read($obj) {
        if (!($obj instanceof AnagraficaStanza))
            return false;

        $this->open();
        $query = 'SELECT * FROM anagraficastanza WHERE nomestruttura = "%s" '
                . 'AND numerostanza = "%s" AND codicefiscaleproprietario = "%s" ';
        $query = sprintf($query, $obj->getNomeStruttura(), $obj->getNumeroStanza(), $obj->getCodiceFiscaleProprietario());
        $result = mysql_query($query);
        $this->close();

        $res = mysql_fetch_assoc($result);
        $toReturn = new AnagraficaStanza();
        $toReturn->setCodiceFiscaleAnagrafica($res['codicefiscaleanagrafica']);
        $toReturn->setNumeroStanza($res['numerostanza']);
        $toReturn->setNomeStruttura($res['nomestruttura']);
        $toReturn->setCodiceFiscaleProprietario($res['codicefiscaleproprietario']);
        $toReturn->setIngresso($res['ingresso']);
        $toReturn->setUscita($res['uscita']);
        $toReturn->setCosto($res['costo']);

        return $toReturn;
    }

    function delete($obj) {
        return null;
    }

    function readAll($obj) {
        if (!($obj instanceof Struttura))
            return false;
        
        $this->open();
        $query = 'SELECT * FROM anagraficastanza WHERE nomestruttura = "%s" AND codicefiscaleproprietario = "%s"';
        $query = sprintf($query, $obj->getNome(), $obj->getCodiceFiscaleAnagrafica());
        $result = mysql_query($query);
        if (mysql_num_rows($result) <= 0)
            return false;

        $this->close();
        $toReturn = array();
        for ($i = 0; $i < mysql_num_rows($result); $i++) {
            $res = mysql_fetch_assoc($result);
            $tmp = new AnagraficaStanza();
            $tmp->setCodiceFiscaleAnagrafica($res['codicefiscaleanagrafica']);
            $tmp->setNumeroStanza($res['numerostanza']);
            $tmp->setNomeStruttura($res['nomestruttura']);
            $tmp->setCodiceFiscaleProprietario($res['codicefiscaleproprietario']);
            $tmp->setIngresso($res['ingresso']);
            $tmp->setUscita($res['uscita']);
            $tmp->setCosto($res['costo']);
            $toReturn[$i] = $tmp->toArray();
        }

        return $toReturn;
    }

}
