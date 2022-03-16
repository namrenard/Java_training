REM --------------------------------
REM - TP_java_s04_poo.bat
REM - version 1.0
REM - Batch de compilation du TP_s04_NFP136
REM - Auteur : Nicolas Renard
REM --------------------------------
:BEGIN
set path="C:\Program Files\Java\jdk-17.0.1\bin"
REM - Version du JDK
javac -version
REM - Compilation du projet
javac -cp . TP04.java
REM - Lancement du programme
java -cp . TP04.java
pause
echo "Faites 'entrer' pour clore le programme"
:END
