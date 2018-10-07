mkdir target
javac -sourcepath src -d target src/by/itacademy/newCalculator/Main.java
java -cp target -Djava.util.logging.config.file=logging.properties by.itacademy.newCalculator.Main
pause