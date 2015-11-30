<?php

require_once 'CRUD.php';
require_once '../webapp/server/entity/Stanza.php';

/**
 * User: UnisaGiax - Giandomenico Izzo <g.izzo24@studenti.unisa.it>
 * Date: 13/10/2015
 * Time: 19:40
 */
class StanzaManager extends CRUD {

    function insert($obj) {
        if (!($obj instanceof Stanza)) {
            return false;
        }

        $this->open();
        $query = 'INSERT INTO stanza VALUES ("%s", "%s", "%s")';
        $query = sprintf($query, $obj->getIdStruttura(), $obj->getNumero(), $obj->getTipo());
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
        $tmp->setIdStruttura($res['idstruttura']);
        $tmp->setNumero($res['numero']);
        $tmp->setTipo($res['tipo']);
        $tmp->setDescrizione($res['descrizione']);
        $tmp->setMq($res['mq']);
        $tmp->setAgibile($res['agibile']);
        $tmp->setLibera($res['libera']);

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
        $query = 'SELECT * FROM stanza';
        $result = mysql_query($query);
        if (mysql_num_rows($result) <= 0)
            return false;
        $this->close();

        $toReturn = array();
        for ($i = 0; $i < mysql_num_rows($result); $i++) {
            $res = mysql_fetch_assoc($result);
            $tmp = new Stanza();
            $tmp->setIdStruttura($res['idstruttura']);
            $tmp->setNumero($res['numero']);
            $tmp->setTipo($res['tipo']);
            $tmp->setDescrizione($res['descrizione']);
            $tmp->setMq($res['mq']);
            $tmp->setAgibile($res['agibile']);
            $tmp->setLibera($res['libera']);

            $toReturn[$i] = $tmp;
        }

        return $toReturn;
    }

}
