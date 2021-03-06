<?php

require_once '../server/entity/Anagrafica.php';
require_once '../server/entity/Struttura.php';
require_once 'CRUD.php';


class AnagraficaManager extends CRUD {

    function insert($obj) {
        if (!($obj instanceof Anagrafica)) {
            return false;
        }

        $this->open();
        $query = 'INSERT INTO anagrafica VALUES ("%s", "%s", "%s", "%s", "%s", "%s", "%s", "%s", "%s", "%s", "%s")';
        $query = sprintf($query, $obj->getCodiceFiscale(), $obj->getNome(), 
                $obj->getCognome(), $obj->getDataNascita(), $obj->getIndirizzo(), 
                $obj->getNazionalita(), $obj->getNumeroDocumento(), 
                $obj->getTipoDocumento(), $obj->getTelefono(), $obj->getCellulare(), $obj->getEmail());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function update($obj) {
        if (!($obj instanceof Anagrafica)) {
            return false;
        }

        if (!$this->read($obj)) {
            return false;
        }

        $this->open();
        $query = 'UPDATE anagrafica SET codicefiscale = "%s", nome = "%s", cognome = "%s", '
                . 'datanascita = "%s", indirizzo = "%s", nazionalita = "%s", '
                . 'numerodocumento = "%s", tipodocumento = "%s", telefono = "%s", '
                . 'cellulare = "%s", email = "%s" WHERE codicefiscale = "%s"';
        $query = sprintf($query, $obj->getCodiceFiscale(), $obj->getNome(), $obj->getCognome(), 
                $obj->getDataNascita(), $obj->getIndirizzo(), $obj->getNazionalita(), 
                $obj->getNumeroDocumento(), $obj->getTipoDocumento(), 
                $obj->getTelefono(), $obj->getCellulare(), $obj->getEmail(), $obj->getCodiceFiscale());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function read($obj) {
        if (!($obj instanceof Anagrafica))
            return false;

        $this->open();
        $query = 'SELECT * FROM anagrafica WHERE codicefiscale = "%s"';
        $query = sprintf($query, $obj->getCodiceFiscale());
        $result = mysql_query($query);
        if (mysql_num_rows($result) <= 0)
            return false;

        $res = mysql_fetch_assoc($result);
        $this->close();

        $toReturn = new Anagrafica();
        $toReturn->setCodiceFiscale($res['codicefiscale']);
        $toReturn->setNome($res['nome']);
        $toReturn->setCognome($res['cognome']);
        $toReturn->setIndirizzo($res['indirizzo']);
        $toReturn->setNazionalita($res['nazionalita']);
        $toReturn->setDataNascita($res['datanascita']);
        $toReturn->setNumeroDocumento($res['numerodocumento']);
        $toReturn->setTipoDocumento($res['tipodocumento']);
        $toReturn->setTelefono($res['telefono']);
        $toReturn->setCellulare($res['cellulare']);
        $toReturn->setEmail($res['email']);

        return $toReturn;
    }

    function delete($obj) {
        if (!($obj instanceof Anagrafica))
            return false;

        $this->open();
        $query = 'DELETE FROM anagrafica WHERE codicefiscale = "%s"';
        $query = sprintf($query, $obj->getCodiceFiscale());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function readAllAnagraficaStruttura($obj) {
        if (!($obj instanceof Struttura))
            return false;

        $this->open();
        $query = 'SELECT * FROM anagrafica JOIN anagraficastanza ON
                . anagraficastanza.codicefiscaleproprietario = "%s" AND 
                anagraficastanza.nomestruttura = "%s" 
                WHERE anagraficastanza.codicefiscaleanagrafica = anagrafica.codicefiscale';
        $query = sprintf($query, $obj->getCodiceFiscaleAnagrafica(), $obj->getNome());
        $result = mysql_query($query);
        if (mysql_num_rows($result) <= 0)
            return false;
        $this->close();

        $toReturn = array();
        for ($i = 0; $i < mysql_num_rows($result); $i++) {
            $res = mysql_fetch_assoc($result);
            $tmp = new Anagrafica();
            $tmp->setCodiceFiscale($res['codicefiscale']);
            $tmp->setNome($res['nome']);
            $tmp->setCognome($res['cognome']);
            $tmp->setIndirizzo($res['indirizzo']);
            $tmp->setNazionalita($res['nazionalita']);
            $tmp->setDataNascita($res['datanascita']);
            $tmp->setNumeroDocumento($res['numerodocumento']);
            $tmp->setTipoDocumento($res['tipodocumento']);
            $tmp->setTelefono($res['telefono']);
            $tmp->setCellulare($res['cellulare']);
            $tmp->setEmail($res['email']);
            $toReturn[$i] = $tmp->toArray();
        }

        return $toReturn;
    }

}
