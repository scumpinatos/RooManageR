<?php

/**
 * User: ScumpinatoS - Malinconico Francesco <f.malinconico1@studenti.unisa.it>
 * Date: 13/10/2015
 * Time: 18:42
 */
class Anagrafica {

    private $codiceFiscale;
    private $nome;
    private $cognome;
    private $dataNascita;
    private $indirizzo;
    private $nazionalita;
    private $numeroDocumento;
    private $tipoDocumento;
    private $telefono;
    private $cellulare;
    private $email;

    /**
     * Anagrafica constructor.
     */
    public function __construct() {
    }

    /**
     * @return mixed
     */
    public function getCodiceFiscale() {
        return $this->codiceFiscale;
    }

    /**
     * @param mixed $codiceFiscale
     */
    public function setCodiceFiscale($codiceFiscale) {
        $this->codiceFiscale = $codiceFiscale;
    }

    /**
     * @return mixed
     */
    public function getNome() {
        return $this->nome;
    }

    /**
     * @param mixed $nome
     */
    public function setNome($nome) {
        $this->nome = $nome;
    }

    /**
     * @return mixed
     */
    public function getCognome() {
        return $this->cognome;
    }

    /**
     * @param mixed $cognome
     */
    public function setCognome($cognome) {
        $this->cognome = $cognome;
    }

    /**
     * @return mixed
     */
    public function getDataNascita() {
        return $this->dataNascita;
    }

    /**
     * @param mixed $dataNascita
     */
    public function setDataNascita($dataNascita) {
        $this->dataNascita = $dataNascita;
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
    public function getNazionalita() {
        return $this->nazionalita;
    }

    /**
     * @param mixed $nazionalita
     */
    public function setNazionalita($nazionalita) {
        $this->nazionalita = $nazionalita;
    }

    /**
     * @return mixed
     */
    public function getNumeroDocumento() {
        return $this->numeroDocumento;
    }

    /**
     * @param mixed $numeroDocumento
     */
    public function setNumeroDocumento($numeroDocumento) {
        $this->numeroDocumento = $numeroDocumento;
    }

    /**
     * @return mixed
     */
    public function getTipoDocumento() {
        return $this->tipoDocumento;
    }

    /**
     * @param mixed $tipoDocumento
     */
    public function setTipoDocumento($tipoDocumento) {
        $this->tipoDocumento = $tipoDocumento;
    }

    /**
     * @return mixed
     */
    public function getTelefono() {
        return $this->telefono;
    }

    /**
     * @param mixed $telefono
     */
    public function setTelefono($telefono) {
        $this->telefono = $telefono;
    }

    /**
     * @return mixed
     */
    public function getCellulare() {
        return $this->cellulare;
    }

    /**
     * @param mixed $cellulare
     */
    public function setCellulare($cellulare) {
        $this->cellulare = $cellulare;
    }

    /**
     * @return mixed
     */
    public function getEmail() {
        return $this->email;
    }

    /**
     * @param mixed $email
     */
    public function setEmail($email) {
        $this->email = $email;
    }


}