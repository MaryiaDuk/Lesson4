@echo off
javac -J-Dfile.encoding=cp866 -encoding utf8  -sourcepath ./src src/by/it_academy/task1/Main.java
java -classpath ./src by.it_academy.task1.Main
Pause