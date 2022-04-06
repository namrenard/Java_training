REM --------------------------------
REM - TP_java_s06.bat
REM - version 1.0
REM - Batch de compilation du TP_s06_NFP136
REM - Auteur : Nicolas Renard
REM --------------------------------
:BEGIN
set path="C:\Program Files\Java\jdk-17.0.1\bin"
REM - Version du JDK
javac -version
REM - Lancement du projet
java -jar TP06_v1_0.jar

pause
echo "Faites 'entrer' pour clore le programme"
:END
