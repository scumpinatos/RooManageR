<?php


class Struttura {

    private $nome;
    private $indirizzo;
    private $codiceFiscaleAnagrafica;
    private $nStanze;
    private $descrizione;
    private $agibile;

    public function __construct() {
    }

    function getNome() {
        return $this->nome;
    }

    function getIndirizzo() {
        return $this->indirizzo;
    }

    function getCodiceFiscaleAnagrafica() {
        return $this->codiceFiscaleAnagrafica;
    }

    function setCodiceFiscaleAnagrafica($codiceFiscaleAnagrafica) {
        $this->codiceFiscaleAnagrafica = $codiceFiscaleAnagrafica;
        return $this;
    }

    function getDescrizione() {
        return $this->descrizione;
    }

    function getAgibile() {
        return $this->agibile;
    }

    function setNome($nome) {
        $this->nome = $nome;
        return $this;
    }

    function setIndirizzo($indirizzo) {
        $this->indirizzo = $indirizzo;
        return $this;
    }

    function setDescrizione($descrizione) {
        $this->descrizione = $descrizione;
        return $this;
    }

    function setAgibile($agibile) {
        $this->agibile = $agibile;
        return $this;
    }
    
    function getNstanze() {
        return $this->nStanze;
    }

    function setNstanze($nstanze) {
        $this->nStanze = $nstanze;
    }
    
    function toArray() {
        return array(
            "nome" => $this->nome,
            "indirizzo" => $this->indirizzo,
            "codiceFiscaleAnagrafica" => $this->codiceFiscaleAnagrafica,
            "nStanze" => $this->nStanze,
            "descrizione" => $this->descrizione,
            "agibile" => $this->agibile
        );
    }
}