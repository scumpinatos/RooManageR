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

    function getCodiceFiscale() {
        return $this->codiceFiscale;
    }

    function getNome() {
        return $this->nome;
    }

    function getCognome() {
        return $this->cognome;
    }

    function getDataNascita() {
        return $this->dataNascita;
    }

    function getIndirizzo() {
        return $this->indirizzo;
    }

    function getNazionalita() {
        return $this->nazionalita;
    }

    function getNumeroDocumento() {
        return $this->numeroDocumento;
    }

    function getTipoDocumento() {
        return $this->tipoDocumento;
    }

    function getTelefono() {
        return $this->telefono;
    }

    function getCellulare() {
        return $this->cellulare;
    }

    function getEmail() {
        return $this->email;
    }

    function setCodiceFiscale($codiceFiscale) {
        $this->codiceFiscale = $codiceFiscale;
        return $this;
    }

    function setNome($nome) {
        $this->nome = $nome;
        return $this;
    }

    function setCognome($cognome) {
        $this->cognome = $cognome;
        return $this;
    }

    function setDataNascita($dataNascita) {
        $this->dataNascita = $dataNascita;
        return $this;
    }

    function setIndirizzo($indirizzo) {
        $this->indirizzo = $indirizzo;
        return $this;
    }

    function setNazionalita($nazionalita) {
        $this->nazionalita = $nazionalita;
        return $this;
    }

    function setNumeroDocumento($numeroDocumento) {
        $this->numeroDocumento = $numeroDocumento;
        return $this;
    }

    function setTipoDocumento($tipoDocumento) {
        $this->tipoDocumento = $tipoDocumento;
        return $this;
    }

    function setTelefono($telefono) {
        $this->telefono = $telefono;
        return $this;
    }

    function setCellulare($cellulare) {
        $this->cellulare = $cellulare;
        return $this;
    }

    function setEmail($email) {
        $this->email = $email;
        return $this;
    }

    function toArray() {
        return array(
            "cellulare" => $this->cellulare,
            "codiceFiscale" => $this->codiceFiscale,
            "cognome" => $this->cognome,
            "dataNascita" => $this->dataNascita,
            "email" => $this->email,
            "indirizzo" => $this->indirizzo,
            "nazionalita" => $this->nazionalita,
            "nome" => $this->nome,
            "numeroDocumento" => $this->numeroDocumento,
            "telefono" => $this->telefono,
            "tipoDocumento" => $this->tipoDocumento
        );
    }

}