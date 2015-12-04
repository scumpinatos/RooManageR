<?php


class Visita {
    
    private $numeroStanza;
    private $nomeStruttura;
    private $codiceFiscaleAnagrafica;
    private $ingresso;
    private $uscita;
    
    function __construct() {
        
    }
    
    function getNumeroStanza() {
        return $this->numeroStanza;
    }

    function getNomeStruttura() {
        return $this->nomeStruttura;
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

    function setNumeroStanza($numeroStanza) {
        $this->numeroStanza = $numeroStanza;
    }

    function setNomeStruttura($nomeStruttura) {
        $this->nomeStruttura = $nomeStruttura;
    }

    function setCodiceFiscaleAnagrafica($codiceFiscaleAnagrafica) {
        $this->codiceFiscaleAnagrafica = $codiceFiscaleAnagrafica;
    }

    function setIngresso($ingresso) {
        $this->ingresso = $ingresso;
    }

    function setUscita($uscita) {
        $this->uscita = $uscita;
    }

    
    function toArray() {
        return array(
            "nomeStruttura" => $this->nomeStruttura,
            "codiceFiscaleAnagrafica" => $this->codicefiscaleanagrafica,
            "numeroStanza" => $this->numerostanza,
            "ingresso" => $this->ingresso,
            "uscita" => $this->uscita,
        );
    }
    
}
