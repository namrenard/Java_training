#!/bin/bash

##########################
##Script to execute TP02_v1_5.jar
##########################

echo ">>>Starting...."
javac -version
echo ">>>Lancement du programme Base de données Animal...."
java -jar TP02_v1_5.jar
echo ""
echo ">>> Script terminé appuyez sur "entrée" pour quitter."
read 
## read = to stop the script and wait "entrance" to stop
## ref : https://forum.ubuntu-fr.org/viewtopic.php?id=50441