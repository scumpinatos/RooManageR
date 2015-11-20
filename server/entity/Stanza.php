<?php

/**
 * User: UnisaGiax - Giandomenico Izzo <g.izzo24@studenti.unisa.it>
 * Date: 13/10/2015
 * Time: 19:38
 */
class Stanza {

    private $idstruttura;
    private $numero;
    private $tipo;
    private $agibile;
    private $libera;
    private $descrizione;
    private $mq;

    /**
     * Stanza constructor.
     */
    public function __construct() {
    }

    /**
     * @return mixed
     */
    public function getIdStruttura() {
        return $this->idstruttura;
    }

    /**
     * @param mixed $idStruttura
     */
    public function setIdStruttura($idStruttura) {
        $this->idstruttura = $idStruttura;
    }

    /**
     * @return mixed
     */
    public function getNumero() {
        return $this->numero;
    }

    /**
     * @param mixed $numero
     */
    public function setNumero($numero) {
        $this->numero = $numero;
    }

    /**
     * @return mixed
     */
    public function getTipo() {
        return $this->tipo;
    }

    /**
     * @param mixed $tipo
     */
    public function setTipo($tipo) {
        $this->tipo = $tipo;
    }

    function getAgibile() {
        return $this->agibile;
    }

    function getLibera() {
        return $this->libera;
    }

    function setAgibile($agibile) {
        $this->agibile = $agibile;
        return $this;
    }

    function setLibera($libera) {
        $this->libera = $libera;
        return $this;
    }
    
    function getDescrizione() {
        return $this->descrizione;
    }

    function getMq() {
        return $this->mq;
    }

    function setDescrizione($descrizione) {
        $this->descrizione = $descrizione;
    }

    function setMq($mq) {
        $this->mq = $mq;
    }

        
    function toArray() {
        return array(
            "idStruttura" => $this->idstruttura,
            "numero" => $this->numero,
            "tipo" => $this->tipo,
            "agibile" => $this->agibile,
            "libera" => $this->libera,
            "descrizione" => $this->descrizione,
            "mq" => $this->mq
        );
    }
}