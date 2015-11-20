<?php

/**
 * User: UnisaGiax - Giandomenico Izzo <g.izzo24@studenti.unisa.it>
 * Date: 13/10/2015
 * Time: 19:20
 */
class Struttura {

    private $id;
    private $indirizzo;
    private $codicefiscaleanagrafica;
    private $descrizione;
    private $agibile;

    /**
     * Struttura constructor.
     */
    public function __construct() {
    }

    /**
     * @return mixed
     */
    public function getId() {
        return $this->id;
    }

    /**
     * @param mixed $id
     */
    public function setId($id) {
        $this->id = $id;
    }

    /**
     * @return mixed
     */
    public function getIndirizzo() {
        return $this->indirizzo;
    }

    /**
     * @param mixed $indirizzo
     */
    public function setIndirizzo($indirizzo) {
        $this->indirizzo = $indirizzo;
    }

    /**
     * @return mixed
     */
    public function getCodiceFiscaleAnagrafica() {
        return $this->codicefiscaleanagrafica;
    }

    /**
     * @param mixed $codiceFiscaleAnagrafica
     */
    public function setCodiceFiscaleAnagrafica($codiceFiscaleAnagrafica) {
        $this->codicefiscaleanagrafica = $codiceFiscaleAnagrafica;
    }

    /**
     * @return mixed
     */
    public function getDescrizione() {
        return $this->descrizione;
    }

    /**
     * @param mixed $descrizione
     */
    public function setDescrizione($descrizione) {
        $this->descrizione = $descrizione;
    }
    
    function getAgibile() {
        return $this->agibile;
    }

    function setAgibile($agibile) {
        $this->agibile = $agibile;
        return $this;
    }

    function toArray() {
        return array(
            "id" => $this->id,
            "indirizzo" => $this->indirizzo,
            "codicefiscaleanagrafica" => $this->codicefiscaleanagrafica,
            "descrizione" => $this->descrizione,
            "agibile" => $this->agibile
        );
    }
}