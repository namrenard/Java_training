#!/bin/bash

##########################
##Script to execute TP_s04.java
##########################

echo ">>>Starting...."
javac -version
echo ">>>Compilation du programme...."
javac -cp . TP04.java
echo ">>> Lancement du programme...."
java -cp . TP04
echo ">>> Script terminé appuyez sur "entrée" pour quitter."
read 
## read = to stop the script and wait "entrance" to stop
## ref : https://forum.ubuntu-fr.org/viewtopic.php?id=50441