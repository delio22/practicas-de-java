# Exercism · Java · Ruta de "Learning Exercises"

Soluciones a los 15 ejercicios de aprendizaje (*Learning Exercises*) de la pista de Java en
[Exercism](https://exercism.org/tracks/java/exercises), en el orden de la ruta de conceptos.

## Ejercicios

| # | Concepto | Ejercicio | Carpeta |
|---|----------|-----------|---------|
| 01 | Basics (sintaxis y métodos) | Lasagna (*Cook Your Lasagna*) | [`01-lasagna`](01-lasagna) |
| 02 | Booleans | Annalyn's Infiltration | [`02-annalyns-infiltration`](02-annalyns-infiltration) |
| 03 | Strings / Characters | Log Levels | [`03-log-levels`](03-log-levels) |
| 04 | Ternary Operators / Conditionals | Blackjack | [`04-blackjack`](04-blackjack) |
| 05 | Numbers / Arithmetic | Cars, Assemble! | [`05-cars-assemble`](05-cars-assemble) |
| 06 | For Loops / Arrays | Bird Watcher | [`06-bird-watcher`](06-bird-watcher) |
| 07 | Strings (avanzado) | Squeaky Clean | [`07-squeaky-clean`](07-squeaky-clean) |
| 08 | Classes / Constructors | Need for Speed (antes *Elon's Toys*) | [`08-need-for-speed`](08-need-for-speed) |
| 09 | Inheritance / Overriding | Wizards and Warriors | [`09-wizards-and-warriors`](09-wizards-and-warriors) |
| 10 | Interfaces / Polymorphism | Remote Control Competition (antes *Remote Control Car Conundrum*) | [`10-remote-control-competition`](10-remote-control-competition) |
| 11 | Lists | Karl's Languages | [`11-karls-languages`](11-karls-languages) |
| 12 | Bit Manipulation | Secrets | [`12-secrets`](12-secrets) |
| 13 | Enums / Switch | Logs, Logs, Logs! | [`13-logs-logs-logs`](13-logs-logs-logs) |
| 14 | Exceptions | Calculator Conundrum | [`14-calculator-conundrum`](14-calculator-conundrum) |
| 15 | Sets | Gotta Snatch 'Em All (antes *Playground Sets*) | [`15-gotta-snatch-em-all`](15-gotta-snatch-em-all) |

## Estructura

Cada ejercicio es un subproyecto de Gradle:

```
NN-nombre-del-ejercicio/
├── src/main/java/   <- solución
└── src/test/java/   <- tests oficiales de Exercism
```

## Cómo ejecutar los tests

Requiere **JDK 17 o superior**.

```bash
# Todos los ejercicios
./gradlew test

# Un solo ejercicio
./gradlew :01-lasagna:test
```

En Windows usa `gradlew.bat` en lugar de `./gradlew`.

## Créditos

Los enunciados y los tests pertenecen al proyecto [Exercism](https://github.com/exercism/java)
(licencia MIT). Las soluciones de `src/main/java` son propias.
