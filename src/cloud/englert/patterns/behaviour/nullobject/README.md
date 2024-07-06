# Null Object Pattern
ein Objekt tut "nichts", was fachlich und gewollt ist

## Vorteile
- Verzicht auf Abfragen bzw. Exception-Behandlung
- Konzentration auf Fachlogik
- lesbarer Code

## Nachteile
- erheblicher Aufwand bei nachträglicher Umsetzung

## Beispiel
```mermaid
classDiagram
direction BT

class Schachfigur {
    <<interface>>
    +getName() String
}
class Turm {
    +getName() String
}
class Springer {
    +getName() String
}
class NullObject {
    +getName() String
}

Turm --|> Schachfigur
Springer --|> Schachfigur
NullObject --|> Schachfigur
```