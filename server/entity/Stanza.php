<?php

/**
 * User: UnisaGiax - Giandomenico Izzo <g.izzo24@studenti.unisa.it>
 * Date: 13/10/2015
 * Time: 19:38
 */
class Stanza {

    private $idStruttura;
    private $numero;
    private $tipo;

    /**
     * Stanza constructor.
     */
    public function __construct() {
    }

    /**
     * @return mixed
     */
    public function getIdStruttura() {
        return $this->idStruttura;
    }

    /**
     * @param mixed $idStruttura
     */
    public function setIdStruttura($idStruttura) {
        $this->idStruttura = $idStruttura;
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


}