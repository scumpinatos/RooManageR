<?php


class Stanza {

    private $nomeStruttura;
    private $codiceFiscaleProprietario;
    private $numero;
    private $tipo;
    private $agibile;
    private $libera;
    private $descrizione;
    private $mq;

    public function __construct() {
    }

    function getNomeStruttura() {
        return $this->nomeStruttura;
    }

    function getNumero() {
        return $this->numero;
    }

    function getTipo() {
        return $this->tipo;
    }

    function getAgibile() {
        return $this->agibile;
    }

    function getLibera() {
        return $this->libera;
    }

    function getDescrizione() {
        return $this->descrizione;
    }

    function getMq() {
        return $this->mq;
    }

    function setNomeStruttura($nomeStruttura) {
        $this->nomeStruttura = $nomeStruttura;
        return $this;
    }

    function setNumero($numero) {
        $this->numero = $numero;
        return $this;
    }

    function setTipo($tipo) {
        $this->tipo = $tipo;
        return $this;
    }

    function setAgibile($agibile) {
        $this->agibile = $agibile;
        return $this;
    }

    function setLibera($libera) {
        $this->libera = $libera;
        return $this;
    }

    function setDescrizione($descrizione) {
        $this->descrizione = $descrizione;
        return $this;
    }

    function setMq($mq) {
        $this->mq = $mq;
        return $this;
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
            "numero" => $this->numero,
            "tipo" => $this->tipo,
            "agibile" => $this->agibile,
            "libera" => $this->libera,
            "descrizione" => $this->descrizione,
            "mq" => $this->mq
        );
    }
}