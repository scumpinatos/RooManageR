<?php


class Visita {
    
    private $numeroStanza;
    private $nomeStruttura;
    private $codiceFiscaleProprietario;
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

    function getCodiceFiscaleProprietario() {
        return $this->codiceFiscaleProprietario;
    }

    function setCodiceFiscaleProprietario($codiceFiscaleProprietario) {
        $this->codiceFiscaleProprietario = $codiceFiscaleProprietario;
        return $this;
    }
    
    function toArray() {
        return array(
            "nomeStruttura" => $this->nomeStruttura,
            "codiceFiscaleProprietario" => $this->codiceFiscaleProprietario,
            "codiceFiscaleAnagrafica" => $this->codiceFiscaleAnagrafica,
            "numeroStanza" => $this->numeroStanza,
            "ingresso" => $this->ingresso,
            "uscita" => $this->uscita,
        );
    }
    
}