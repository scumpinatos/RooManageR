<?php

/**
 * Created by PhpStorm.
 * User: ScumpinatoS
 * Date: 13/10/2015
 * Time: 15:38
 */
class Nazionalita {

    private $abbreviazione;
    private $valore;

    /**
     * Nazionalita constructor.
     */
    public function __construct() {

    }

    /**
     * @return mixed
     */
    public function getAbbreviazione() {
        return $this->abbreviazione;
    }

    /**
     * @param mixed $abbreviazione
     */
    public function setAbbreviazione($abbreviazione) {
        $this->abbreviazione = $abbreviazione;
    }

    /**
     * @return mixed
     */
    public function getValore() {
        return $this->valore;
    }

    /**
     * @param mixed $valore
     */
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