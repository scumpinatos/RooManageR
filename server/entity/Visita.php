<?php

/**
 * Description of Visita
 *
 * @author Giandomenico
 */
class Visita {
    
    private $id;
    private $numerostanza;
    private $idstruttura;
    private $codicefiscaleanagrafica;
    private $ingresso;
    private $uscita;
    
    function __construct() {
        
    }
    
    function getId() {
        return $this->id;
    }

    function getNumeroStanza() {
        return $this->numerostanza;
    }

    function getIdStruttura() {
        return $this->idstruttura;
    }

    function getCodiceFiscaleAnagrafica() {
        return $this->codicefiscaleanagrafica;
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
        $this->numerostanza = $numeroStanza;
        return $this;
    }

    function setIdStruttura($idStruttura) {
        $this->idstruttura = $idStruttura;
        return $this;
    }

    function setCodiceFiscaleAnagrafica($codiceFiscaleAnagrafica) {
        $this->codicefiscaleanagrafica = $codiceFiscaleAnagrafica;
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
        $toReturn->setNumero($this->numerostanza);
        $toReturn->setIdStruttura($this->idstruttura);
        $manager = new StanzaManager();
        return $manager->read($toReturn);
    }

    function getAnagrafica() {
        $toReturn = new Anagrafica();
        $toReturn->setCodiceFiscale($this->codicefiscaleanagrafica);
        $manager = new AnagraficaManager();
        return $manager->read($toReturn);
    }
    
    function toArray() {
        return array(
            "idstruttura" => $this->idstruttura,
            "codicefiscaleanagrafica" => $this->codicefiscaleanagrafica,
            "numerostanza" => $this->numerostanza,
            "ingresso" => $this->ingresso,
            "uscita" => $this->uscita,
            "id" => $this->id
        );
    }
    
}
