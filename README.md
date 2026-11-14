# Calculator (Java 21 + JUnit 5)

Реализация базового калькулятора с четырьмя арифметическими операциями (`add`, `subtract`, `multiply`, `divide`), консольной демонстрацией сценариев в `Main` и набором из 13 модульных тестов на JUnit 5.

## Расположение файлов

- `Calculator.java` и `Main.java` — в корне проекта.
- `tests\CalculatorTest.java` — тесты.
- `bin/` — скомпилированные файлы.

Команды ниже предназначены для Windows (cmd или PowerShell) и выполняются из корня проекта. Сначала скомпилируйте программу, затем тесты.

## Требования
- JDK 21
- `junit-platform-console-standalone-1.10.2.jar` в корне проекта для запуска тестов

## Получение JUnit

Для запуска тестов требуется получить JAR одним из двух способов.
Оба способа сохраняют `junit-platform-console-standalone-1.10.2.jar` в корне проекта.

### Без Maven

Скачайте JAR из Maven Central:

```bat
curl.exe -fLO https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-console-standalone/1.10.2/junit-platform-console-standalone-1.10.2.jar
```

### Если Maven установлен

Выполните команду получения JAR:

```bat
mvn org.apache.maven.plugins:maven-dependency-plugin:3.6.1:copy "-Dartifact=org.junit.platform:junit-platform-console-standalone:1.10.2" "-DoutputDirectory=."
```

## Компиляция и запуск

1. Компиляция и запуск `Main`:
```bat
javac -encoding UTF-8 -d bin Calculator.java Main.java
java -cp bin Main
```

2. Компиляция и запуск тестов (при наличии `junit-platform-console-standalone-1.10.2.jar` в корне проекта):
```bat
javac -encoding UTF-8 -cp "bin;junit-platform-console-standalone-1.10.2.jar" -d bin tests\CalculatorTest.java
java -jar junit-platform-console-standalone-1.10.2.jar execute --class-path bin --scan-class-path
```
