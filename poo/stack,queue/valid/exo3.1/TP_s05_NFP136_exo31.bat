REM --------------------------------
REM - TP_java_s05_exo3.bat
REM - version 1.0
REM - Batch de compilation du TP_s05_NFP136 _ exo3.1
REM - Auteur : Nicolas Renard
REM --------------------------------
:BEGIN
set path="C:\Program Files\Java\jdk-17.0.1\bin"
REM - Version du JDK
javac -version
REM - Compilation du projet
javac -cp . Exo31.java
REM - Lancement du programme
java -cp . Exo31
pause
echo "Faites 'entrer' pour clore le programme"
:END