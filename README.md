# Calculator (Java 21 + JUnit 5)

Реализация базового калькулятора с четырьмя арифметическими операциями (`add`, `subtract`, `multiply`, `divide`), консольной демонстрацией сценариев в `Main` и набором из 13 модульных тестов на JUnit 5.

## Требования
- JDK 21
- Apache Maven 3.8+ (рекомендуется) или `junit-platform-console-standalone-1.10.2.jar` для ручного запуска

## Запуск через Maven

Запуск модульных тестов:
```bash
mvn clean test
```

Компиляция и запуск консольной программы `Main`:
```bash
mvn compile exec:java -Dexec.mainClass="Main"
```

## Ручной запуск без Maven (через терминал)

1. Компиляция и запуск `Main`:
```bash
javac -encoding UTF-8 -d out src/main/java/*.java
java -cp out Main
```

2. Компиляция и запуск тестов (при наличии `junit-platform-console-standalone-1.10.2.jar` в корне проекта):
```bash
javac -encoding UTF-8 -cp "out;junit-platform-console-standalone-1.10.2.jar" -d out src/test/java/CalculatorTest.java
java -jar junit-platform-console-standalone-1.10.2.jar execute --class-path out --scan-class-path
```
*(На Linux/macOS замените `;` на `:` в параметре `-cp`).*