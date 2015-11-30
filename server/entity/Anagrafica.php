<?php

/**
 * User: ScumpinatoS - Malinconico Francesco <f.malinconico1@studenti.unisa.it>
 * Date: 13/10/2015
 * Time: 18:42
 */
class Anagrafica {

    private $codicefiscale;
    private $nome;
    private $cognome;
    private $datanascita;
    private $indirizzo;
    private $nazionalita;
    private $numerodocumento;
    private $tipodocumento;
    private $telefono;
    private $cellulare;
    private $email;

    /**
     * Anagrafica constructor.
     */
    public function __construct() {
    }

    function getCodiceFiscale() {
        return $this->codicefiscale;
    }

    function getNome() {
        return $this->nome;
    }

    function getCognome() {
        return $this->cognome;
    }

    function getDataNascita() {
        return $this->datanascita;
    }

    function getIndirizzo() {
        return $this->indirizzo;
    }

    function getNazionalita() {
        return $this->nazionalita;
    }

    function getNumeroDocumento() {
        return $this->numerodocumento;
    }

    function getTipoDocumento() {
        return $this->tipodocumento;
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
        $this->codicefiscale = $codiceFiscale;
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
        $this->datanascita = $dataNascita;
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
        $this->numerodocumento = $numeroDocumento;
        return $this;
    }

    function setTipoDocumento($tipoDocumento) {
        $this->tipodocumento = $tipoDocumento;
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
            "codiceFiscale" => $this->codicefiscale,
            "cognome" => $this->cognome,
            "dataNascita" => $this->datanascita,
            "email" => $this->email,
            "indirizzo" => $this->indirizzo,
            "nazionalita" => $this->nazionalita,
            "nome" => $this->nome,
            "numeroDocumento" => $this->numerodocumento,
            "telefono" => $this->telefono,
            "tipoDocumento" => $this->tipodocumento
        );
    }

}