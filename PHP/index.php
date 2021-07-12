<?php

require_once('car.php');
require_once('uberPool.php');
require_once('uberVan.php');
require_once('uberX.php');
require_once('account.php');

$uberX = new UberX("VB-73FG", new Account("Roxana Couoh","COCR95"), "Chevrolet", "Spark");
$uberX->setPassenger(6);
$uberX->printDataCar();

$uberPool = new UberPool("KJLS-62F", new Account("Fernando Benavente","BEFF94"), "Dodge", "Attitude");
$uberPool->printDataCar();

$uberVan = new UberVan("K4NM-70", new Account("Marco Pavia ","PACM84"), "Nissan", "March");
$uberVan->setPassenger(6);
$uberVan->printDataCar();

?>
