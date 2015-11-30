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
            require_once '../server/manager/AnagraficaManager.php';

            $utente = new Anagrafica();
            $utente->setCodiceFiscale($_POST['cf']);
            $manager = new AnagraficaManager();
            $utente = $manager->read($utente);
            echo json_encode($utente->toArray());
            break;
        case "3":
            require_once '../server/manager/StrutturaManager.php';

            $struttura = new Struttura();
            $struttura->setId($_POST['idStruttura']);
            $manager = new StrutturaManager();
            $stanze = $manager->getStanzeByStruttura($struttura);
            for ($i = 0; $i < count($stanze); $i++) {
                echo json_encode($stanze[$i]->toArray());
            }
            break;
    }
}

