<?php
$host  = $_SERVER['HTTP_HOST'];
$uri   = rtrim(dirname($_SERVER['PHP_SELF']), '/\\');
$extra = 'instantmessenger.install';
header("Location: http://$host$uri/$extra");
?>