<?php

require_once "manager/NazionalitaManager.php";
require_once "manager/AnagraficaManager.php";
require_once "entity/Anagrafica.php";
require_once "entity/Nazionalita.php";

/**
 * Created by PhpStorm.
 * User: ScumpinatoS
 * Date: 13/10/2015
 * Time: 16:03
 */

$nazManager = new NazionalitaManager();

$anag = new Anagrafica();
$anag->setCodiceFiscale("MLNFNC93T06F912F");
$anag->setNome("Francesco");
$anag->setCognome("Malinconico");
$anag->setIndirizzo("Via Gerardo D'orsi, Calvanico");


echo $nazManager->readAll()[0]->getAbbreviazione();

$anag->setNazionalita($nazManager->readAll()[0]->getAbbreviazione());
$anag->setNumeroDocumento("AEGiiandoogaayy");
$anag > setTipoDocumento(2);
$anag->setTelefono("08999999999");

$anagManager = new AnagraficaManager();
$anagManager->insert($anag);

$anag->setEmail("giando@gay.com");
$anagManager->update($anag);

if (!$nazManager->delete($nazManager->readAll()[0])) {
    echo 'Delete error';
}