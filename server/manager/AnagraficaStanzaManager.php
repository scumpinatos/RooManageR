<?php

require_once '../entity/AnagraficaStanza.php';

/**
 * User: UnisaGiax - Giandomenico Izzo <g.izzo24@studenti.unisa.it>
 * Date: 13/10/2015
 * Time: 19:52
 */
class AnagraficaStanzaManager extends CRUD {

    function insert($obj) {
        if (!($obj instanceof AnagraficaStanza))
            return false;

        $this->open();
        $query = 'INSERT INTO anagraficastanza VALUES ("%s","%s","%s","%s","%s","%s")';
        $query = sprintf($query, $obj->getCodicefiscaleanagrafica(), $obj->getNumerostanza(), $obj->getIdstruttura(),
            $obj->getIngresso(), $obj->getUscita(), $obj->getCosto());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    // Non ha senso implementare la READ non avendo una chiave su cui effettuare la lettura

    function update($obj) {
        if (!($obj instanceof AnagraficaStanza))
            return false;

        if (!$this->read($obj))
            return false;

        $this->open();
        $query = 'UPDATE anagraficastanza SET codicefiscaleanagrafica = "%s", numerostanza = "%s", idstruttura = "%s", ingresso = "%s", uscita = "%s", costo = "%s"';
        $query = sprintf($query, $obj->getCodicefiscaleanagrafica(), $obj->getNumerostanza(), $obj->getIdstruttura(),
            $obj->getIngresso(), $obj->getUscita(), $obj->getCosto());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function read($obj) {
        return null;
    }

    // Non ha senso implementare la DELETE in quanto non posso effettuare l'operazione senza la chiave

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
            $tmp->setCodicefiscaleanagrafica($res['codicefiscaleanagrafica']);
            $tmp->setNumerostanza($res['numerostanza']);
            $tmp->setIdstruttura($res['idstruttura']);
            $tmp->setIngresso($res['ingresso']);
            $tmp->setUscita($res['uscita']);
            $tmp->setCosto($res['costo']);
            $toReturn[$i] = $tmp;
        }

        return $toReturn;
    }
}