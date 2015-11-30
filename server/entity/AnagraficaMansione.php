<?php

class AnagraficaMansione {
    
    private $id;
    private $codiceFiscaleAnagrafica;
    private $password;
    private $idStruttura;
    private $tipoMansione;
    
    function getId() {
        return $this->id;
    }

    function getCodicefiscaleanagrafica() {
        return $this->codiceFiscaleAnagrafica;
    }

    function getPassword() {
        return $this->password;
    }

    function getIdstruttura() {
        return $this->idStruttura;
    }

    function getTipomansione() {
        return $this->tipoMansione;
    }

    function setId($id) {
        $this->id = $id;
    }

    function setCodicefiscaleanagrafica($codiceFiscaleAnagrafica) {
        $this->codiceFiscaleAnagrafica = $codiceFiscaleAnagrafica;
    }

    function setPassword($password) {
        $this->password = $password;
    }

    function setIdstruttura($idStruttura) {
        $this->idStruttura = $idStruttura;
    }

    function setTipomansione($tipoMansione) {
        $this->tipoMansione = $tipoMansione;
    }
    
    function toArray() {
        return array(
            "id" => $this->id,
            "codiceFiscaleAnagrafica" => $this->codiceFiscaleAnagrafica,
            "idStruttura" => $this->idStruttura,
            "tipoMansione" => $this->tipoMansione,
            "password" => $this->password
        );
    }

}