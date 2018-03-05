@echo off
javac -J-Dfile.encoding=cp866 -encoding utf8  -sourcepath ./src src/by/it_academy/task3/Main.java
java -classpath ./src by.it_academy.task3.Main
Pause
