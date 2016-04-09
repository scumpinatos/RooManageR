<?php

if (isset($_POST['opCode'])) {

    switch ($_POST['opCode']) {

        case "1": // LOGIN
            require_once '../server/manager/AnagraficaMansioneManager.php';

            $utente = new AnagraficaMansione();
            $utente->setCodicefiscaleanagrafica($_POST['cf']);
            $manager = new AnagraficaMansioneManager();
            $utente = $manager->login($utente);
            if ($utente == false) {
                echo "NOT DONE";
            } else {
                echo json_encode($utente->toArray());
            }
            break;

        case "2": // READ ALL NAZIONALITA
            require_once '../server/manager/NazionalitaManager.php';

            $manager = new NazionalitaManager();
            $arrayNazionalita = $manager->readAll();

            if ($arrayNazionalita == false) {
                echo "NOT DONE";
            } else {
                echo json_encode($arrayNazionalita);
            }
            break;

        case "3": // INSERT NAZIONALITA
            require_once '../server/manager/NazionalitaManager.php';

            $manager = new NazionalitaManager();
            $res = json_decode($_POST['json'], true);

            $newNazionalita = new Nazionalita();
            $newNazionalita->setValore($res['valore']);
            $newNazionalita->setAbbreviazione($res['abbreviazione']);

            if ($manager->insert($newNazionalita)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }

            break;

        case "4": // UPDATE NAZIONALITA
            require_once '../server/manager/NazionalitaManager.php';

            $manager = new NazionalitaManager();
            $res = json_decode($_POST['json'], true);

            $newNazionalita = new Nazionalita();
            $newNazionalita->setValore($res['valore']);
            $newNazionalita->setAbbreviazione($res['abbreviazione']);

            if ($manager->update($newNazionalita)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }

            break;


        case "5": // READ ANAGRAFICA
            require_once '../server/manager/AnagraficaManager.php';

            $toReturn = new Anagrafica();
            $toReturn->setCodiceFiscale($_POST['cf']);
            $manager = new AnagraficaManager();
            $toReturn = $manager->read($toReturn);
            if ($toReturn != false) {
                echo json_encode($toReturn->toArray());
            } else {
                echo 'NOT DONE';
            }

            break;

        case "6": // READ ALL ANAGRAFICHE STRUTTURA
            require_once '../server/manager/AnagraficaManager.php';

            $struttura = new Struttura();
            $struttura->setCodiceFiscaleAnagrafica($_POST['cfProprietario']);
            $struttura->setNome($_POST['nomeStruttura']);

            $manager = new AnagraficaManager();
            $clienti = $manager->readAllAnagraficaStruttura($struttura);
            if ($clienti != false) {
                echo json_encode($clienti);
            } else {
                echo 'NOT DONE';
            }
            break;

        case "7": // INSERT ANAGRAFICA
            require_once '../server/manager/AnagraficaManager.php';

            $manager = new AnagraficaManager();
            $res = json_decode($_POST['json'], true);

            $newAnagrafica = new Anagrafica();
            $newAnagrafica->setCodiceFiscale($res['codiceFiscale']);
            $newAnagrafica->setNome($res['nome']);
            $newAnagrafica->setCognome($res['cognome']);
            $newAnagrafica->setDataNascita($res['dataNascita']);
            $newAnagrafica->setIndirizzo($res['indirizzo']);
            $newAnagrafica->setNazionalita($res['nazionalita']);
            $newAnagrafica->setTipoDocumento($res['tipoDocumento']);
            $newAnagrafica->setNumeroDocumento($res['numeroDocumento']);
            $newAnagrafica->setTelefono($res['telefono']);
            $newAnagrafica->setCellulare($res['cellulare']);
            $newAnagrafica->setEmail($res['email']);

            if ($manager->insert($newAnagrafica)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }
            break;

        case "8": // UPDATE ANAGRAFICA
            require_once '../server/manager/AnagraficaManager.php';

            $manager = new AnagraficaManager();
            $res = json_decode($_POST['json'], true);

            $newAnagrafica = new Anagrafica();
            $newAnagrafica->setCodiceFiscale($res['codiceFiscale']);
            $newAnagrafica->setNome($res['nome']);
            $newAnagrafica->setCognome($res['cognome']);
            $newAnagrafica->setDataNascita($res['dataNascita']);
            $newAnagrafica->setIndirizzo($res['indirizzo']);
            $newAnagrafica->setNazionalita($res['nazionalita']);
            $newAnagrafica->setTipoDocumento($res['tipoDocumento']);
            $newAnagrafica->setNumeroDocumento($res['numeroDocumento']);
            $newAnagrafica->setTelefono($res['telefono']);
            $newAnagrafica->setCellulare($res['cellulare']);
            $newAnagrafica->setEmail($res['email']);

            if ($manager->update($newAnagrafica)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }
            break;


        case "9": // READ ANAGRAFICASTANZA
            require_once '../server/manager/AnagraficaStanzaManager.php';

            $toReturn = new AnagraficaStanza();
            $toReturn->setNomeStruttura($_POST['nomeStruttura']);
            $toReturn->setNumeroStanza($_POST['numeroStanza']);
            $toReturn->setCodiceFiscaleProprietario($_POST['cfProprietario']);

            $manager = new AnagraficaStanzaManager();
            $toReturn = $manager->read($toReturn);

            if ($toReturn != false) {
                echo json_encode($toReturn->toArray());
            } else {
                echo 'NOT DONE';
            }
            break;

        case "10": // READ ALL ANAGRAFICASTANZA STRUTTURA
            require_once '../server/manager/AnagraficaStanzaManager.php';

            $struttura = new Struttura();
            $struttura->setNome($_POST['nomeStruttura']);
            $struttura->setCodiceFiscaleAnagrafica($_POST['cfProprietario']);

            $manager = new AnagraficaStanzaManager();
            $permanenze = $manager->readAll($struttura);
            echo json_encode($permanenze);
            break;

        case "11": // INSERT ANAGRAFICASTANZA
            require_once '../server/manager/AnagraficaStanzaManager.php';

            $manager = new AnagraficaStanzaManager();
            $res = json_decode($_POST['json'], true);

            $newAnagraficaStanza = new AnagraficaStanza();
            $newAnagraficaStanza->setCodiceFiscaleAnagrafica($res['codiceFiscaleAnagrafica']);
            $newAnagraficaStanza->setCodiceFiscaleProprietario($res['codiceFiscaleProprietario']);
            $newAnagraficaStanza->setNomeStruttura($res['nomeStruttura']);
            $newAnagraficaStanza->setNumeroStanza($res['numeroStanza']);
            $newAnagraficaStanza->setIngresso($res['ingresso']);
            $newAnagraficaStanza->setTipo($res['tipo']);
            $newAnagraficaStanza->setUscita($res['uscita']);
            $newAnagraficaStanza->setCosto($res['costo']);

            if ($manager->insert($newAnagraficaStanza)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }
            break;

        case "12": // UPDATE ANAGRAFICA STANZA
            require_once '../server/manager/AnagraficaStanzaManager.php';

            $manager = new AnagraficaStanzaManager();
            $res = json_decode($_POST['json'], true);

            $newAnagraficaStanza = new AnagraficaStanza();
            $newAnagraficaStanza->setCodiceFiscaleAnagrafica($res['codiceFiscaleAnagrafica']);
            $newAnagraficaStanza->setCodiceFiscaleProprietario($res['codiceFiscaleProprietario']);
            $newAnagraficaStanza->setNomeStruttura($res['nomeStruttura']);
            $newAnagraficaStanza->setNumeroStanza($res['numeroStanza']);
            $newAnagraficaStanza->setIngresso($res['ingresso']);
            $newAnagraficaStanza->setTipo($res['tipo']);
            $newAnagraficaStanza->setUscita($res['uscita']);
            $newAnagraficaStanza->setCosto($res['costo']);

            if ($manager->update($newAnagraficaStanza)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }
            break;


        case "13": // INSERT STRUTTURA
            require_once '../server/manager/StrutturaManager.php';

            $manager = new StrutturaManager();
            $res = json_decode($_POST['json'], true);

            $newStruttura = new Struttura();
            $newStruttura->setNome($res['nome']);
            $newStruttura->setAgibile($res['agibile']);
            $newStruttura->setIndirizzo($res['indirizzo']);
            $newStruttura->setNstanze($res['nStanze']);
            $newStruttura->setCodiceFiscaleAnagrafica($res['codiceFiscaleAnagrafica']);
            $newStruttura->setDescrizione($res['descrizione']);

            if ($manager->insert($newStruttura)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }
            break;

        case "14": // UPDATE STRUTTURA
            require_once '../server/manager/StrutturaManager.php';

            $manager = new StrutturaManager();
            $res = json_decode($_POST['json'], true);

            $newStruttura = new Struttura();
            $newStruttura->setNome($res['nome']);
            $newStruttura->setAgibile($res['agibile']);
            $newStruttura->setIndirizzo($res['indirizzo']);
            $newStruttura->setNstanze($res['nStanze']);
            $newStruttura->setCodiceFiscaleAnagrafica($res['codiceFiscaleAnagrafica']);
            $newStruttura->setDescrizione($res['descrizione']);

            if ($manager->update($newStruttura)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }
            break;

        case "15": // READ STRUTTURA
            require_once '../server/manager/StrutturaManager.php';

            $struttura = new Struttura();
            $struttura->setNome($_POST['nome']);
            $struttura->setCodiceFiscaleAnagrafica($_POST['cfProprietario']);

            $manager = new StrutturaManager();
            $struttura = $manager->read($struttura);
            echo json_encode($struttura->toArray());

            break;

        case "16": // READ ALL STRUTTURA BY PROPRIETARIO
            require_once '../server/manager/StrutturaManager.php';

            $proprietario = new Anagrafica();
            $proprietario->setCodiceFiscale($_POST['cfProprietario']);

            $manager = new StrutturaManager();
            $strutture = $manager->readAll($proprietario);
            echo json_encode($strutture);
            break;

        case "17": // DELETE STRUTTURA
            require_once '../server/manager/StrutturaManager.php';

            $struttura = new Struttura();
            $struttura->setNome($_POST['nomeStruttura']);
            $struttura->setCodiceFiscaleAnagrafica($_POST['cfProprietario']);

            $manager = new StrutturaManager();
            if ($manager->delete($struttura)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }
            break;


        case "18": // INSERT STANZA
            require_once '../server/manager/StanzaManager.php';

            $manager = new StanzaManager();
            $res = json_decode($_POST['json'], true);

            $newStanza = new Stanza();
            $newStanza->setNomeStruttura($res['nomeStruttura']);
            $newStanza->setCodiceFiscaleProprietario($res['codiceFiscaleProprietario']);
            $newStanza->setNumero($res['numero']);
            $newStanza->setTipo($res['tipo']);
            $newStanza->setDescrizione($res['descrizione']);
            $newStanza->setMq($res['mq']);
            $newStanza->setAgibile($res['agibile']);
            $newStanza->setPermanenza($res['permanenza']);
            $newStanza->setVisita($res['visita']);

            if ($manager->insert($newStanza)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }
            break;

        case "19": // UPDATE STANZA
            require_once '../server/manager/StanzaManager.php';

            $manager = new StanzaManager();
            $res = json_decode($_POST['json'], true);

            $newStanza = new Stanza();
            $newStanza->setNomeStruttura($res['nomeStruttura']);
            $newStanza->setCodiceFiscaleProprietario($res['codiceFiscaleProprietario']);
            $newStanza->setNumero($res['numero']);
            $newStanza->setTipo($res['tipo']);
            $newStanza->setDescrizione($res['descrizione']);
            $newStanza->setMq($res['mq']);
            $newStanza->setAgibile($res['agibile']);
            $newStanza->setPermanenza($res['permanenza']);
            $newStanza->setVisita($res['visita']);

            if ($manager->update($newStanza)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }

            break;

        case "20": // READ STANZA
            require_once '../server/manager/StanzaManager.php';

            $manager = new StanzaManager();

            $toReturn = new Stanza();
            $toReturn->setNomeStruttura($_POST['nomeStruttura']);
            $toReturn->setCodiceFiscaleProprietario($_POST['cfProprietario']);
            $toReturn->setNumero($res['numeroStanza']);

            $toReturn = $manager->read($toReturn);
            echo json_encode($toReturn->toArray());
            break;

        case "21": // READ ALL STANZE STRUTTURA
            require_once '../server/manager/StanzaManager.php';

            $struttura = new Struttura();
            $struttura->setCodiceFiscaleAnagrafica($_POST['cfProprietario']);
            $struttura->setNome($_POST['nomeStruttura']);

            $manager = new StanzaManager();
            $stanze = $manager->readAll($struttura);
            echo json_encode($stanze);
            break;

        case "22": // DELETE STANZA
            require_once '../server/manager/StanzaManager.php';

            $manager = new StanzaManager();
            $res = json_decode($_POST['json'], true);

            $newStanza = new Stanza();
            $newStanza->setNomeStruttura($res['nomeStruttura']);
            $newStanza->setCodiceFiscaleProprietario($res['codiceFiscaleProprietario']);
            $newStanza->setNumero($res['numero']);
            $newStanza->setTipo($res['tipo']);
            $newStanza->setDescrizione($res['descrizione']);
            $newStanza->setMq($res['mq']);
            $newStanza->setAgibile($res['agibile']);
            $newStanza->setPermanenza($res['permanenza']);
            $newStanza->setVisita($res['visita']);

            if ($manager->delete($newStanza)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }
            break;


        case "23": // INSERT ANAGRAFICA MANSIONE
            require_once '../server/manager/AnagraficaMansioneManager.php';

            $manager = new AnagraficaMansioneManager();
            $res = json_decode($_POST['json'], true);

            $newAnagMan = new AnagraficaMansione();
            $newAnagMan->setNomeStruttura($res['nomeStruttura']);
            $newAnagMan->setCodiceFiscaleProprietario($res['codiceFiscaleProprietario']);
            $newAnagMan->setCodiceFiscaleAnagrafica($res['codiceFiscaleAnagrafica']);
            $newAnagMan->setPassword($res['password']);
            $newAnagMan->setTipoMansione($res['tipoMansione']);

            if ($manager->insert($newAnagMan)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }
            break;

        case "24": // UPDATE ANAGRAFICA MANSIONE
            require_once '../server/manager/AnagraficaMansioneManager.php';

            $manager = new AnagraficaMansioneManager();
            $res = json_decode($_POST['json'], true);

            $newAnagMan = new AnagraficaMansione();
            $newAnagMan->setNomeStruttura($res['nomeStruttura']);
            $newAnagMan->setCodiceFiscaleProprietario($res['codiceFiscaleProprietario']);
            $newAnagMan->setCodiceFiscaleAnagrafica($res['codiceFiscaleAnagrafica']);
            $newAnagMan->setPassword($res['password']);
            $newAnagMan->setTipoMansione($res['tipoMansione']);

            if ($manager->update($newAnagMan)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }
            break;

        case "25": // READ ANAGRAFICA MANSIONE
            require_once '../server/manager/AnagraficaMansioneManager.php';

            $manager = new AnagraficaMansioneManager();

            $toReturn = new AnagraficaMansione();
            $toReturn->setNomeStruttura($_POST['nomeStruttura']);
            $toReturn->setCodiceFiscaleProprietario($_POST['cfProprietario']);
            $toReturn->setCodiceFiscaleAnagrafica($res['cf']);

            $toReturn = $manager->read($toReturn);
            if ($toReturn != false) {
                echo json_encode($toReturn->toArray());
            } else {
                echo 'NOT DONE';
            }
            break;

        case "26": // READ ALL ANAGRAFICA MANSIONE STRUTTURA
            require_once '../server/manager/AnagraficaMansioneManager.php';

            $manager = new AnagraficaMansioneManager();

            $struttura = new Struttura();
            $struttura->setNome($_POST['nomeStruttura']);
            $struttura->setCodiceFiscaleAnagrafica($_POST['cfProprietario']);

            $anagman = $manager->readAll($struttura);
            echo json_encode($anagman);
            break;

        case "27": // DELETE ANAGRAFICA MANSIONE
            require_once '../server/manager/AnagraficaMansioneManager.php';

            $manager = new AnagraficaMansioneManager();

            $toDelete = new AnagraficaMansione();
            $toDelete->setNomeStruttura($_POST['nomeStruttura']);
            $toDelete->setCodiceFiscaleProprietario($_POST['cfProprietario']);
            $toDelete->setCodiceFiscaleAnagrafica($_POST['cf']);

            if ($manager->delete($toDelete)) {
                echo "DONE";
            } else {
                echo 'NOT DONE';
            }

            break;

        case "28": // CHECK VISITA
            require_once '../server/manager/AnagraficaStanzaManager.php';

            $toCheck = new AnagraficaStanza();
            $toCheck->setNomeStruttura($_POST['nomeStruttura']);
            $toCheck->setNumeroStanza($_POST['numeroStanza']);
            $toCheck->setCodiceFiscaleProprietario($_POST['cfProprietario']);

            $manager = new AnagraficaStanzaManager();
            $toCheck = $manager->checkVisita($toCheck);

            if ($toCheck != null) {
                echo json_encode($toCheck->toArray());
            } else {
                echo 'NOT DONE';
            }
            break;

        case "29": // READ ALL ANAGSTANZA IN CORSO
            require_once '../server/manager/AnagraficaStanzaManager.php';

            $struttura = new Struttura();
            $struttura->setNome($_POST['nomeStruttura']);
            $struttura->setCodiceFiscaleAnagrafica($_POST['cfProprietario']);

            $manager = new AnagraficaStanzaManager();
            $permanenze = $manager->readAllInCorso($struttura);
            echo json_encode($permanenze);
            break;

        case "30": // OCCUPA STANZA
            require_once '../server/manager/StanzaManager.php';

            $manager = new StanzaManager();
            $res = json_decode($_POST['json'], true);

            $newStanza = new Stanza();
            $newStanza->setNomeStruttura($res['nomeStruttura']);
            $newStanza->setCodiceFiscaleProprietario($res['codiceFiscaleProprietario']);
            $newStanza->setNumero($res['numero']);
            $newStanza->setPermanenza($res['permanenza']);
            $newStanza->setVisita($res['visita']);

            if ($manager->occupaStanza($newStanza)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }

            break;
    }
}

