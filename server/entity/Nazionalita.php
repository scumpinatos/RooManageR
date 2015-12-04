<?php

class Nazionalita {

    private $abbreviazione;
    private $valore;

    public function __construct() {

    }

    public function getAbbreviazione() {
        return $this->abbreviazione;
    }

    public function setAbbreviazione($abbreviazione) {
        $this->abbreviazione = $abbreviazione;
    }

    public function getValore() {
        return $this->valore;
    }

    public function setValore($valore) {
        $this->valore = $valore;
    }

    function toArray() {
        return array(
            "abbreviazione" => $this->abbreviazione,
            "valore" => $this->valore
        );
    }
}