<?php

require_once 'CRUD.php';
require_once '../server/entity/Visita.php';

// TUTTE LE FUNZIONI SONO DA RIVEDERE!


class VisitaManager extends CRUD {

    function insert($obj) {
        if (!($obj instanceof Visita)) {
            return false;
        }

        $this->open();
        $query = 'INSERT INTO visita VALUES ("%s", "%s", "%s")';
        $query = sprintf($query, $obj->getNumeroStanza(), $obj->getNomestruttura());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function update($obj) {
        if (!($obj instanceof Visita))
            return false;

        if (!$this->read($obj))
            return false;

        $this->open();
        $query = 'UPDATE visita SET nomestruttura = "%s", numerostanza = "%s", codicefiscaleanagrafica = "%s",ingresso = "%s", uscita = "%s"';
        $query = sprintf($query, $obj->getNomestruttura(), $obj->getNumeroStanza(), $obj->getCodiceFiscaleAnagrafica(), $obj->getIngresso(),$obj->getUscita());
        $result = mysql_query($query);
        $this->close();

        return $result;
    }

    function read($obj) { // da rifare, che variabili usa per la query?
        if (!($obj instanceof Visita))
            return false;

        $this->open();
        $query = 'SELECT * FROM stanza WHERE nomestruttura = "%s" AND numero = "%s"';
        $query = sprintf($query, $obj->getNomeStruttura(), $obj->getNumero());
        $result = mysql_query($query);
        if (mysql_num_rows($result) <= 0)
            return false;

        $res = mysql_fetch_assoc($result);
        $this->close();

        $toReturn = new Stanza();
        $toReturn->setNomeStruttura($res['nomestruttura']);
        $toReturn->setNumero($res['numero']);
        $toReturn->setTipo($res['tipo']);

        return $toReturn;
    }

    function delete($obj) {
        if (!($obj instanceof Visita))
            return false;

        $this->open();
        $query = 'DELETE FROM visita WHERE cf = "%s" AND nomestruttura ="%s"';
        $query = sprintf($query, $obj->getCodiceFiscaleAnagrafica(),$obj->getNomeStruttura());
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
            $tmp->setNomeStruttura($res['nomestruttura']);
            $tmp->setCodiceFiscaleAnagrafica($res['codicefiscaleanagrafica']);
            $tmp->setNumeroStanza($res['numerostanza']);
            $tmp->setIngresso($res['ingresso']);
            $tmp->setUscita($res['uscita']);

            $toReturn[$i] = $tmp;
        }

        return $toReturn;
    }
    
        function readAllVisiteByStruttura($obj) { // Da verificare
              if (!($obj instanceof Struttura))
            return false;
        $this->open();
        $query = 'SELECT * FROM visita WHERE nomestruttura = "%s"';
        $query = sprintf($query, $obj->getNome());

        $result = mysql_query($query);
        if (mysql_num_rows($result) <= 0)
            return false;
        $this->close();

        $toReturn = array();
        for ($i = 0; $i < mysql_num_rows($result); $i++) {
            $res = mysql_fetch_assoc($result);
            $tmp = new Visita();
            $tmp->setNomeStruttura($res['nomestruttura']);
            $tmp->setCodiceFiscaleAnagrafica($res['codicefiscaleanagrafica']);
            $tmp->setNumeroStanza($res['numerostanza']);
            $tmp->setIngresso($res['ingresso']);
            $tmp->setUscita($res['uscita']);

            $toReturn[$i] = $tmp;
        }

        return $toReturn;
    }
}