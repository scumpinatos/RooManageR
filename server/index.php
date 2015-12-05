<?php

if (isset($_POST['opCode'])) {

    switch ($_POST['opCode']) {

        case "1": // LOGIN (Testato e funzionante)
            require_once '../server/manager/AnagraficaMansioneManager.php';

            $utente = new AnagraficaMansione();
            $utente->setCodicefiscaleanagrafica($_POST['cf']);
            $manager = new AnagraficaMansioneManager();
            $utente = $manager->read($utente);
            if ($utente == false) {
                echo "NOT FOUND";
            } else {
                echo json_encode($utente->toArray());
            }
            break;



        case "2": // READ ALL NAZIONALITA (Testato e funzionante)
            require_once '../server/manager/NazionalitaManager.php';

            $manager = new NazionalitaManager();
            $arrayNazionalita = $manager->readAll();
            echo json_encode($arrayNazionalita);
            break;
        case "3": // INSERT NAZIONALITA (Testato e funzionante)
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



        case "5": // READ ANAGRAFICA (Testato e funzionante)
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
        case "6": // REGISTRO CLIENTI

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



        case "9": // READ VISITA
            require_once '../server/manager/VisitaManager.php';

            $toReturn = new Visita();
            $toReturn->setNomeStruttura($_POST['nomeStruttura']);
            $toReturn->setNumeroStanza($_POST['numeroStanza']);
            $toReturn->setCodiceFiscaleProprietario($_POST['cfProprietario']);

            $manager = new VisitaManager();
            $toReturn = $manager->read($toReturn);

            echo json_encode($toReturn->toArray());
            break;
        case "10": // READ ALL VISITA STRUTTURA
            require_once '../server/manager/VisitaManager.php';

            $struttura = new Struttura();
            $struttura->setNome($_POST['nomeStruttura']);
            $struttura->setCodiceFiscaleAnagrafica($_POST['cfProprietario']);

            $manager = new VisitaManager();
            $visite = $manager->readAll($struttura);
            echo json_encode($visite);
            break;
        case "11": // INSERT VISITA
            require_once '../server/manager/VisitaManager.php';

            $manager = new VisitaManager();
            $res = json_decode($_POST['json'], true);

            $newVisita = new Visita();
            $newVisita->setCodiceFiscaleAnagrafica($res['codiceFiscaleAnagrafica']);
            $newVisita->setCodiceFiscaleProprietario($res['codiceFiscaleProprietario']);
            $newVisita->setNomeStruttura($res['nomeStruttura']);
            $newVisita->setNumeroStanza($res['numeroStanza']);
            $newVisita->setIngresso($res['ingresso']);
            $newVisita->setUscita($res['uscita']);

            if ($manager->insert($newVisita)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }
            break;
        case "12": // UPDATE VISITA
            require_once '../server/manager/VisitaManager.php';

            $manager = new VisitaManager();
            $res = json_decode($_POST['json'], true);

            $newVisita = new Visita();
            $newVisita->setCodiceFiscaleAnagrafica($res['codiceFiscaleAnagrafica']);
            $newVisita->setCodiceFiscaleProprietario($res['codiceFiscaleProprietario']);
            $newVisita->setNomeStruttura($res['nomeStruttura']);
            $newVisita->setNumeroStanza($res['numeroStanza']);
            $newVisita->setIngresso($res['ingresso']);
            $newVisita->setUscita($res['uscita']);

            if ($manager->update($newVisita)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }
            break;



        case "13": // READ ANAGRAFICASTANZA (Testato e funzionante)
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
        case "14": // READ ALL ANAGRAFICASTANZA STRUTTURA

            break;
        case "15": // INSERT ANAGRAFICASTANZA
            require_once '../server/manager/AnagraficaStanzaManager.php';

            $manager = new AnagraficaStanzaManager();
            $res = json_decode($_POST['json'], true);

            $newAnagraficaStanza = new AnagraficaStanza();
            $newAnagraficaStanza->setCodiceFiscaleAnagrafica($res['codiceFiscaleAnagrafica']);
            $newAnagraficaStanza->setCodiceFiscaleProprietario($res['codiceFiscaleProprietario']);
            $newAnagraficaStanza->setNomeStruttura($res['nomeStruttura']);
            $newAnagraficaStanza->setNumeroStanza($res['numeroStanza']);
            $newAnagraficaStanza->setIngresso($res['ingresso']);
            $newAnagrafica->setUscita($res['uscita']);
            $newAnagraficaStanza->setCosto($res['costo']);

            if ($manager->insert($newAnagraficaStanza)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }
            break;
        case "16": // UPDATE ANAGRAFICASTANZA
            require_once '../server/manager/AnagraficaStanzaManager.php';

            $manager = new AnagraficaStanzaManager();
            $res = json_decode($_POST['json'], true);

            $newAnagraficaStanza = new AnagraficaStanza();
            $newAnagraficaStanza->setCodiceFiscaleAnagrafica($res['codiceFiscaleAnagrafica']);
            $newAnagraficaStanza->setCodiceFiscaleProprietario($res['codiceFiscaleProprietario']);
            $newAnagraficaStanza->setNomeStruttura($res['nomeStruttura']);
            $newAnagraficaStanza->setNumeroStanza($res['numeroStanza']);
            $newAnagraficaStanza->setIngresso($res['ingresso']);
            $newAnagrafica->setUscita($res['uscita']);
            $newAnagraficaStanza->setCosto($res['costo']);

            if ($manager->update($newAnagraficaStanza)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }
            break;



        case "17": // INSERT STRUTTURA
            require_once '../server/manager/StrutturaManager.php';

            $manager = new StrutturaManager();
            $res = json_decode($_POST['json'], true);

            $newStruttura = new Struttura();
            $newStruttura->setNome($res['nome']);
            $newStruttura->setCodiceFiscaleAnagrafica($res['codiceFiscaleAnagrafica']);
            $newStruttura->setIndirizzo($res['indirizzo']);
            $newStruttura->setDescrizione($res['descrizione']);
            $newStruttura->setAgibile($res['agibile']);

            if ($manager->insert($newStruttura)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }
            break;
        case "18": // UPDATE STRUTTURA
            require_once '../server/manager/StrutturaManager.php';

            $manager = new StrutturaManager();
            $res = json_decode($_POST['json'], true);

            $newStruttura = new Struttura();
            $newStruttura->setNome($res['nome']);
            $newStruttura->setCodiceFiscaleAnagrafica($res['codiceFiscaleAnagrafica']);
            $newStruttura->setIndirizzo($res['indirizzo']);
            $newStruttura->setDescrizione($res['descrizione']);
            $newStruttura->setAgibile($res['agibile']);

            if ($manager->update($newStruttura)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }
            break;
        case "19": // READ STRUTTURA
            require_once '../server/manager/StrutturaManager.php';

            $struttura = new Struttura();
            $struttura->setNome($_POST['nome']);
            $struttura->setCodiceFiscaleAnagrafica($_POST['cfProprietario']);

            $manager = new StrutturaManager();
            $struttura = $manager->read($struttura);
            echo json_encode($struttura->toArray());
            break;
        case "20": // READ ALL STRUTTURA BY PROPRIETARIO

            break;
        case "21": // DELETE STRUTTURA
            require_once '../server/manager/StrutturaManager.php';

            $struttura = new Struttura();
            $struttura->setNome($_POST['nome']);
            $struttura->setCodiceFiscaleAnagrafica($_POST['cfProprietario']);

            $manager = new StrutturaManager();
            if ($manager->delete($struttura)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }
            break;


        case "22": // INSERT STANZA
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
            $newStanza->setLibera($res['libera']);

            if ($manager->insert($newStanza)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }
            break;
        case "23": // UPDATE STANZA
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
            $newStanza->setLibera($res['libera']);

            if ($manager->insert($newStanza)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }
            break;
        case "24": // READ STANZA
            require_once '../server/manager/StanzaManager.php';

            $manager = new StanzaManager();

            $toReturn = new Stanza();
            $toReturn->setNomeStruttura($_POST['nomeStruttura']);
            $toReturn->setCodiceFiscaleProprietario($_POST['cfProprietario']);
            $toReturn->setNumero($res['numeroStanza']);

            $toReturn = $manager->read($toReturn);
            echo json_encode($toReturn->toArray());
            break;
        case "25": // READ ALL STANZE STRUTTURA (Testato e funzionante)
            require_once '../server/manager/StanzaManager.php';

            $struttura = new Struttura();
            $struttura->setCodiceFiscaleAnagrafica($_POST['cfProprietario']);
            $struttura->setNome($_POST['nomeStruttura']);

            $manager = new StanzaManager();
            $stanze = $manager->readAll($struttura);
            echo json_encode($stanze);
            break;
        case "26": // DELETE STANZA
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
            $newStanza->setLibera($res['libera']);

            if ($manager->delete($newStanza)) {
                echo 'DONE';
            } else {
                echo 'NOT DONE';
            }
            break;
    }
}

