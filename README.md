# Calculator (Java 21 + JUnit 5)

Реализация базового калькулятора с четырьмя арифметическими операциями (`add`, `subtract`, `multiply`, `divide`), консольной демонстрацией сценариев в `Main` и набором из 13 модульных тестов на JUnit 5.

## Расположение файлов

- `Calculator.java` и `Main.java` — в корне проекта.
- `tests/CalculatorTest.java` — тесты.
- `bin/` — скомпилированные файлы.

Команды ниже выполняются из корня проекта.

## Требования
- JDK 21
- `junit-platform-console-standalone-1.10.2.jar` в корне проекта для запуска тестов

## Компиляция и запуск

1. Компиляция и запуск `Main`:
```bash
javac -encoding UTF-8 -d bin Calculator.java Main.java
java -cp bin Main
```

2. Компиляция и запуск тестов (при наличии `junit-platform-console-standalone-1.10.2.jar` в корне проекта):
```bash
javac -encoding UTF-8 -cp "bin:junit-platform-console-standalone-1.10.2.jar" -d bin tests/CalculatorTest.java
java -jar junit-platform-console-standalone-1.10.2.jar execute --class-path bin --scan-class-path
```
*(В Windows cmd замените `:` на `;` в параметре `-cp`).*