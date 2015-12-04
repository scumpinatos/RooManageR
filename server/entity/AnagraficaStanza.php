<?php

class AnagraficaStanza {

    private $codiceFiscaleAnagrafica;
    private $numeroStanza;
    private $nomeStruttura;
    private $ingresso;
    private $uscita;
    private $costo;

    
    public function __construct() {
    }
 
    function getCodiceFiscaleAnagrafica() {
        return $this->codiceFiscaleAnagrafica;
    }

    function getNumeroStanza() {
        return $this->numeroStanza;
    }

    function getNomeStruttura() {
        return $this->nomeStruttura;
    }

    function getIngresso() {
        return $this->ingresso;
    }

    function getUscita() {
        return $this->uscita;
    }

    function getCosto() {
        return $this->costo;
    }

    function setCodiceFiscaleAnagrafica($codiceFiscaleAnagrafica) {
        $this->codiceFiscaleAnagrafica = $codiceFiscaleAnagrafica;
    }

    function setNumeroStanza($numeroStanza) {
        $this->numeroStanza = $numeroStanza;
    }

    function setNomeStruttura($nomeStruttura) {
        $this->nomeStruttura = $nomeStruttura;
    }

    function setIngresso($ingresso) {
        $this->ingresso = $ingresso;
    }

    function setUscita($uscita) {
        $this->uscita = $uscita;
    }

    function setCosto($costo) {
        $this->costo = $costo;
    }
    
    function toArray() {
        return array(
            "nomeStruttura" => $this->nomeStruttura,
            "codiceFiscaleAnagrafica" => $this->codiceFiscaleAnagrafica,
            "numeroStanza" => $this->numeroStanza,
            "ingresso" => $this->ingresso,
            "uscita" => $this->uscita,
            "costo" => $this->costo
        );
    }
}