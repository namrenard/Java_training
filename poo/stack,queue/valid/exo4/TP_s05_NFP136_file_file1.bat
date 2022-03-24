REM --------------------------------
REM - TP_java_s05_exo4.bat
REM - version 1.0
REM - Batch de compilation du TP_s05_NFP136 _ file et File1.java
REM - Auteur : Nicolas Renard
REM --------------------------------
:BEGIN
set path="C:\Program Files\Java\jdk-17.0.1\bin"
REM - Version du JDK
javac -version
REM - Compilation du projet
javac -cp . File.java
javac -cp . File1.java
REM - Lancement du programme
java -cp . File1
pause
echo "Faites 'entrer' pour clore le programme"
:END