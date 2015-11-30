<?php

/**
 * User: UnisaGiax - Giandomenico Izzo <g.izzo24@studenti.unisa.it>
 * Date: 13/10/2015
 * Time: 19:50
 */
class AnagraficaStanza {

    private $codiceFiscaleAnagrafica;
    private $numerostanza;
    private $idstruttura;
    private $ingresso;
    private $uscita;
    private $costo;

    /**
     * AnagraficaStanza constructor.
     */
    public function __construct() {
    }

    /**
     * @return mixed
     */
    public function getCodicefiscaleanagrafica() {
        return $this->codiceFiscaleAnagrafica;
    }

    /**
     * @param mixed $codicefiscaleanagrafica
     */
    public function setCodicefiscaleanagrafica($codicefiscaleanagrafica) {
        $this->codiceFiscaleAnagrafica = $codicefiscaleanagrafica;
    }

    /**
     * @return mixed
     */
    public function getNumerostanza() {
        return $this->numerostanza;
    }

    /**
     * @param mixed $numerostanza
     */
    public function setNumerostanza($numerostanza) {
        $this->numerostanza = $numerostanza;
    }

    /**
     * @return mixed
     */
    public function getIdstruttura() {
        return $this->idstruttura;
    }

    /**
     * @param mixed $idstruttura
     */
    public function setIdstruttura($idstruttura) {
        $this->idstruttura = $idstruttura;
    }

    /**
     * @return mixed
     */
    public function getIngresso() {
        return $this->ingresso;
    }

    /**
     * @param mixed $ingresso
     */
    public function setIngresso($ingresso) {
        $this->ingresso = $ingresso;
    }

    /**
     * @return mixed
     */
    public function getUscita() {
        return $this->uscita;
    }

    /**
     * @param mixed $uscita
     */
    public function setUscita($uscita) {
        $this->uscita = $uscita;
    }

    /**
     * @return mixed
     */
    public function getCosto() {
        return $this->costo;
    }

    /**
     * @param mixed $costo
     */
    public function setCosto($costo) {
        $this->costo = $costo;
    }
    
    function toArray() {
        return array(
            "idstruttura" => $this->idstruttura,
            "codicefiscaleanagrafica" => $this->codiceFiscaleAnagrafica,
            "numerostanza" => $this->numerostanza,
            "ingresso" => $this->ingresso,
            "uscita" => $this->uscita,
            "costo" => $this->costo
        );
    }
}