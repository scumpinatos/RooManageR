<?php

if (isset($_POST['opCode'])) {

    switch ($_POST['opCode']) {

        case "1": // LOGIN
            require_once '../server/manager/AnagraficaMansioneManager.php';

            $utente = new AnagraficaMansione();
            $utente->setCodicefiscaleanagrafica($_POST['cf']);
            $manager = new AnagraficaMansioneManager();
            $utente = $manager->read($utente);
            if($utente == false) {
                echo "NOT FOUND";
            } else {
                echo json_encode($utente->toArray());
            }
            break;
            
            
            
        case "2": // READ ALL NAZIONALITA
            require_once '../server/manager/NazionalitaManager.php';
            
            $manager = new NazionalitaManager();
            $nazionalita = $manager->readAll();
            echo json_encode($nazionalita);
            break;
        case "3": // ADD NAZIONALITA
            require_once '../server/manager/NazionalitaManager.php';
            
            $manager = new NazionalitaManager();
            
            break;
        case "4": // UPDATE NAZIONALITA
            require_once '../server/manager/NazionalitaManager.php';
            
            $manager = new NazionalitaManager();
            
            break;
        
        
        
        case "5": // READ ANAGRAFICA
            require_once '../server/manager/AnagraficaManager.php';

            $utente = new Anagrafica();
            $utente->setCodiceFiscale($_POST['cf']);
            $manager = new AnagraficaManager();
            $utente = $manager->read($utente);
            echo json_encode($utente->toArray());
            break;
        case "6": // READ ALL ANAGRAFICA DELLA STRUTTURA
            
            break;
        case "7": // ADD ANAGRAFICA
            
            break;
        case "8": // UPDATE ANAGRAFICA
            
            break;
        
        
        
        case "9": // READ VISITA
            
            break;
        case "10": // READ ALL VISITA STRUTTURA
            
            break;
        case "11": // ADD VISITA
            
            break;
        case "12": // UPDATE VISITA
            
            break;
        
        
        
        case "13": // READ PERMANENZA
            
            break;
        case "14": // READ ALL PERMANENZA STRUTTURA
            
            break;
        case "15": // ADD PERMANENZA
            
            break;
        case "16": // UPDATE PERMANENZA
            
            break;
        
        
        
        case "17": // STANZE STRUTTURA
            require_once '../server/manager/StrutturaManager.php';

            $struttura = new Struttura();
            $struttura->setId($_POST['idStruttura']);
            $manager = new StrutturaManager();
            $stanze = $manager->getStanzeByStruttura($struttura);
            echo json_encode($stanze);
            break;
        case "18": // ADD STRUTTURA
            
            break;
        case "19": // UPDATE STRUTTURA
            
            break;
        case "20": // READ STRUTTURA
            require_once '../server/manager/StrutturaManager.php';

            $struttura = new Struttura();
            $struttura->setId($_POST['idStruttura']);
            $manager = new StrutturaManager();
            $struttura = $manager->read($struttura);
            echo json_encode($struttura->toArray());
            break;
        case "21": // READ ALL STRUTTURA BY PROPRIETARIO
            
            break;
        case "22": // REMOVE STRUTTURA
            
            break;
        
        
        case "23": // ADD STANZA
            
            break;
        case "24": // UPDATE STANZA
            
            break;
        case "25": // READ STANZA
            
            break;
        case "26": // REMOVE STANZA
            
            break;
    }
}

