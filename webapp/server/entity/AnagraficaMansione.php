<?php

class AnagraficaMansione {
    
    private $id;
    private $codicefiscaleanagrafica;
    private $password;
    private $idstruttura;
    private $tipomansione;
    
    function getId() {
        return $this->id;
    }

    function getCodicefiscaleanagrafica() {
        return $this->codicefiscaleanagrafica;
    }

    function getPassword() {
        return $this->password;
    }

    function getIdstruttura() {
        return $this->idstruttura;
    }

    function getTipomansione() {
        return $this->tipomansione;
    }

    function setId($id) {
        $this->id = $id;
    }

    function setCodicefiscaleanagrafica($codicefiscaleanagrafica) {
        $this->codicefiscaleanagrafica = $codicefiscaleanagrafica;
    }

    function setPassword($password) {
        $this->password = $password;
    }

    function setIdstruttura($idstruttura) {
        $this->idstruttura = $idstruttura;
    }

    function setTipomansione($tipomansione) {
        $this->tipomansione = $tipomansione;
    }
    
    function toArray() {
        return array(
            "id" => $this->id,
            "codicefiscaleanagrafica" => $this->codicefiscaleanagrafica,
            "idstruttura" => $this->idstruttura,
            "tipomansione" => $this->tipomansione,
            "password" => $this->password
        );
    }

}