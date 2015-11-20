<?php

require_once '../manager/AnagraficaManager.php';
require_once '../manager/AnagraficaMansioneManager.php';
require_once '../manager/AnagraficaStanzaManager.php';
require_once '../manager/NazionalitaManager.php';
require_once '../manager/StanzaManager.php';
require_once '../manager/StrutturaManager.php';
require_once '../manager/VisitaManager.php';

$anagrafica = new AnagraficaManager();
$anagraficaMansione = new AnagraficaMansioneManager();
$anagraficaStanza = new AnagraficaStanzaManager();
$nazionalita = new NazionalitaManager();
$stanza = new StanzaManager();
$struttura = new StrutturaManager();
$visita = new VisitaManager();

$anagrafiche = $anagrafica->readAll();
echo json_encode($anagrafiche[0]->toArray());
echo '<br>';
$mansioni = $anagraficaMansione->readAll();
echo json_encode($mansioni[0]->toArray());
echo '<br>';
$permanenze = $anagraficaStanza->readAll();
echo json_encode($permanenze[0]->toArray());
echo '<br>';
$nazio = $nazionalita->readAll();
echo json_encode($nazio[0]->toArray());
echo '<br>';
$stanze = $stanza->readAll();
echo json_encode($stanze[0]->toArray());
echo '<br>';
$strutture = $struttura->readAll();
echo json_encode($strutture[0]->toArray());
echo '<br>';
$visite = $visita->readAll();
echo json_encode($visite[0]->toArray());