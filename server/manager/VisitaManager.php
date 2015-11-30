<?php

require_once 'CRUD.php';
require_once '../webapp/server/entity/Visita.php';

class VisitaManager extends CRUD {

    function insert($obj) {
        if (!($obj instanceof Visita)) {
            return false;
        }

        $this->open();
        $query = 'INSERT INTO visita VALUES ("%s", "%s", "%s")';
        $query = sprintf($query, $obj->getNumeroStanza(), $obj->getIdStruttura());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function update($obj) {
        if (!($obj instanceof Stanza))
            return false;

        if (!$this->read($obj))
            return false;

        $this->open();
        $query = 'UPDATE stanza SET idstruttura = "%s", numero = "%s", tipo = "%s"';
        $query = sprintf($query, $obj->getIdStruttura(), $obj->getNumero(), $obj->getTipo());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function read($obj) {
        if (!($obj instanceof Stanza))
            return false;

        $this->open();
        $query = 'SELECT * FROM stanza WHERE idstruttura = "%s" AND numero = "%s"';
        $query = sprintf($query, $obj->getIdStruttura(), $obj->getNumero());
        $result = mysql_query($query);
        if (mysql_num_rows($result) <= 0)
            return false;

        $res = mysql_fetch_assoc($result);
        $this->close();

        $toReturn = new Stanza();
        $toReturn->setIdStruttura($res['idstruttura']);
        $toReturn->setNumero($res['numero']);
        $toReturn->setTipo($res['tipo']);

        return $toReturn;
    }

    function delete($obj) {
        if (!($obj instanceof Stanza))
            return false;

        $this->open();
        $query = 'DELETE FROM stanza WHERE idstruttura = "%s" AND numero = "%s"';
        $query = sprintf($query, $obj->getIdStruttura(), $obj->getNumero());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function readAll() {
        $this->open();
        $query = 'SELECT * FROM visita';
        $result = mysql_query($query);
        if (mysql_num_rows($result) <= 0)
            return false;
        $this->close();

        $toReturn = array();
        for ($i = 0; $i < mysql_num_rows($result); $i++) {
            $res = mysql_fetch_assoc($result);
            $tmp = new Visita();
            $tmp->setIdStruttura($res['idstruttura']);
            $tmp->setCodiceFiscaleAnagrafica($res['codicefiscaleanagrafica']);
            $tmp->setNumeroStanza($res['numerostanza']);
            $tmp->setId($res['id']);
            $tmp->setIngresso($res['ingresso']);
            $tmp->setUscita($res['uscita']);

            $toReturn[$i] = $tmp;
        }

        return $toReturn;
    }
}