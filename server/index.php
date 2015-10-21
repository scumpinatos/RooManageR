<?php

require './utils/Costants.php';
require_once './entity/Anagrafica.php';
require_once './manager/AnagraficaManager.php';
/**
 * Created by PhpStorm.
 * User: ScumpinatoS
 * Date: 13/10/2015
 * Time: 16:03
 */
if (empty($_POST[OPERATION_CODE])) {
    header(BAD_REQUEST);
    die();
}

$operation = $_POST[OPERATION_CODE];
switch ($operation) {
    case LOGIN:
        if (empty($_POST[EMAIL] || empty($_POST[PASSWORD]))) {
            header(BAD_REQUEST);
        } else {
            $email = $_POST[EMAIL];
            $password = $_POST[PASSWORD];
            $anagrafica = new Anagrafica();
            $anagrafica->setEmail($email)->setPassword($password);
            $anManager = new AnagraficaManager();
            if ($anagrafica = $anManager->read($anagrafica)) {
                echo json_encode($anagrafica->toArray());
            } else {
                header(NOT_FOUND);
                die();
            }
        }
        break;
    default:
        break;
}