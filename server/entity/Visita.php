<?php

/**
 * Description of Visita
 *
 * @author Giandomenico
 */
class Visita {
    
    private $id;
    private $numeroStanza;
    private $idStruttura;
    private $codiceFiscaleAnagrafica;
    private $ingresso;
    private $uscita;
    
    function __construct() {
        
    }
    
    function getId() {
        return $this->id;
    }

    function getNumeroStanza() {
        return $this->numeroStanza;
    }

    function getIdStruttura() {
        return $this->idStruttura;
    }

    function getCodiceFiscaleAnagrafica() {
        return $this->codiceFiscaleAnagrafica;
    }

    function getIngresso() {
        return $this->ingresso;
    }

    function getUscita() {
        return $this->uscita;
    }

    function setId($id) {
        $this->id = $id;
        return $this;
    }

    function setNumeroStanza($numeroStanza) {
        $this->numeroStanza = $numeroStanza;
        return $this;
    }

    function setIdStruttura($idStruttura) {
        $this->idStruttura = $idStruttura;
        return $this;
    }

    function setCodiceFiscaleAnagrafica($codiceFiscaleAnagrafica) {
        $this->codiceFiscaleAnagrafica = $codiceFiscaleAnagrafica;
        return $this;
    }

    function setIngresso($ingresso) {
        $this->ingresso = $ingresso;
        return $this;
    }

    function setUscita($uscita) {
        $this->uscita = $uscita;
        return $this;
    }
    
    function getStanza() {
        $toReturn = new Stanza();
        $toReturn->setNumero($this->numeroStanza);
        $toReturn->setIdStruttura($this->idStruttura);
        $manager = new StanzaManager();
        return $manager->read($toReturn);
    }

    function getAnagrafica() {
        $toReturn = new Anagrafica();
        $toReturn->setCodiceFiscale($this->codiceFiscaleAnagrafica);
        $manager = new AnagraficaManager();
        return $manager->read($toReturn);
    }
    
}
