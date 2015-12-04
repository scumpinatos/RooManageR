<?php

require_once '../server/entity/AnagraficaStanza.php';
require_once 'CRUD.php';

// MODIFICATO DA GIANDOMENICO
class AnagraficaStanzaManager extends CRUD {

    function insert($obj) {
        if (!($obj instanceof AnagraficaStanza))
            return false;

        $this->open();
        $query = 'INSERT INTO anagraficastanza(codicefiscaleanagrafica, numerostanza, nomestruttura, ingresso, uscita, costo) '
                . 'VALUES ("%s","%s","%s","%s","%s","%s")';
        $query = sprintf($query, $obj->getCodiceFiscaleAnagrafica(), $obj->getNumeroStanza(), $obj->getNomeStruttura(),
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
        $query = 'UPDATE anagraficastanza SET codicefiscaleanagrafica = "%s", numerostanza = "%s", nomestruttura = "%s", ingresso = "%s", uscita = "%s", costo = "%s"';
        $query = sprintf($query, $obj->getCodiceFiscaleAnagrafica(), $obj->getNumeroStanza(), $obj->getNomeStruttura(),
            $obj->getIngresso(), $obj->getUscita(), $obj->getCosto());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function read($obj) {
        if (!($obj instanceof AnagraficaStanza))
            return false;

        $this->open();
        $query = 'SELECT * FROM anagraficastanza WHERE codicefiscaleanagrafica = "%s", nomestruttura = "%s", numerostanza = "%s"';
        $query = sprintf($query, $obj->getCodiceFiscaleAnagrafica(), $obj->getNomeStruttura(), $obj->getNumeroStanza());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }


    function delete($obj) {
        return null;
    }

    function readAll() {
        $this->open();
        $query = 'SELECT * FROM anagraficastanza';

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
            $tmp->setIngresso($res['ingresso']);
            $tmp->setUscita($res['uscita']);
            $tmp->setCosto($res['costo']);
            $toReturn[$i] = $tmp->toArray();
        }

        return $toReturn;
    }
}