<?php

if (isset($_POST['opCode'])) {

    switch ($_POST['opCode']) {

        case "1":
            require_once '../server/manager/AnagraficaMansioneManager.php';

            $utente = new AnagraficaMansione();
            $utente->setCodicefiscaleanagrafica($_POST['cf']);
            $utente->setPassword($_POST['password']);
            $manager = new AnagraficaMansioneManager();
            $utente = $manager->login($utente);
            echo json_encode($utente->toArray());
            break;
        case "2":
            require_once '../server/manager/NazionalitaManager.php';
            
            $manager = new NazionalitaManager();
            $nazionalita = $manager->readAll();
            echo json_encode($nazionalita);
            break;
        case "4":
            require_once '../server/manager/AnagraficaManager.php';

            $utente = new Anagrafica();
            $utente->setCodiceFiscale($_POST['cf']);
            $manager = new AnagraficaManager();
            $utente = $manager->read($utente);
            echo json_encode($utente->toArray());
            break;
        case "5":
            require_once '../server/manager/StrutturaManager.php';

            $struttura = new Struttura();
            $struttura->setId($_POST['idStruttura']);
            $manager = new StrutturaManager();
            $stanze = $manager->getStanzeByStruttura($struttura);
            echo json_encode($stanze);
            break;
    }
}

