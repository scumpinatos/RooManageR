<?php

class AnagraficaMansione {
    
    private $codiceFiscaleAnagrafica;
    private $password;
    private $nomeStruttura;
    private $codiceFiscaleProprietario;
    private $tipoMansione;
    
    function getCodiceFiscaleAnagrafica() {
        return $this->codiceFiscaleAnagrafica;
    }

    function getPassword() {
        return $this->password;
    }

    function getNomeStruttura() {
        return $this->nomeStruttura;
    }

    function getTipoMansione() {
        return $this->tipoMansione;
    }

    function setCodiceFiscaleAnagrafica($codiceFiscaleAnagrafica) {
        $this->codiceFiscaleAnagrafica = $codiceFiscaleAnagrafica;
        return $this;
    }

    function setPassword($password) {
        $this->password = $password;
        return $this;
    }

    function setNomeStruttura($nomeStruttura) {
        $this->nomeStruttura = $nomeStruttura;
        return $this;
    }

    function setTipoMansione($tipoMansione) {
        $this->tipoMansione = $tipoMansione;
        return $this;
    }

    function getCodiceFiscaleProprietario() {
        return $this->codiceFiscaleProprietario;
    }

    function setCodiceFiscaleProprietario($codiceFiscaleProprietario) {
        $this->codiceFiscaleProprietario = $codiceFiscaleProprietario;
        return $this;
    }

            
    function toArray() {
        return array(
            "codiceFiscaleAnagrafica" => $this->codiceFiscaleAnagrafica,
            "nomeStruttura" => $this->nomeStruttura,
            "codiceFiscaleProprietario" => $this->codiceFiscaleProprietario,
            "tipoMansione" => $this->tipoMansione,
            "password" => $this->password
        );
    }

}