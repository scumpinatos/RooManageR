<?php

/**
 * Created by PhpStorm.
 * User: ScumpinatoS
 * Date: 13/10/2015
 * Time: 15:29
 */
abstract class CRUD {

    abstract function insert($obj);

    abstract function read($obj);

    // obj = OGGETTO

    abstract function update($obj);

    abstract function delete($obj);

    abstract function readAll();

    protected function open() {
        mysql_connect("localhost", "root") or die("ERROR: DATABASE NOT OPEN");
        mysql_select_db("roomanager");
    }

    protected function close() {
        mysql_close();
    }
}