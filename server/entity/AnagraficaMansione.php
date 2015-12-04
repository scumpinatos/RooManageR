<?php

class AnagraficaMansione {
    
    private $codiceFiscaleAnagrafica;
    private $password;
    private $nomeStruttura;
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

        
    function toArray() {
        return array(
            "codiceFiscaleAnagrafica" => $this->codiceFiscaleAnagrafica,
            "nomeStruttura" => $this->nomeStruttura,
            "tipoMansione" => $this->tipoMansione,
            "password" => $this->password
        );
    }

}