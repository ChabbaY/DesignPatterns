# Decorator Pattern
dynamische Ergänzung um Funktionalität, ohne die Komponente zu ändern

## Vorteile
- Komposition statt Vererbung → flexiblere Klassen, Modifikation zur Laufzeit
- Komponenten kennen Decorator nicht

## Nachteile
- Eventuell wenig übersichtlich bei vielen ähnlich aussehenden Klassen

## Beispiel
```mermaid
classDiagram
direction BT

class Kaffee {
    <<interface>>
    + String getDescription()
}
class Espresso {
    + String getDescription()
}
class Mocca {
    + String getDescription()
}
class Decorator {
    - Kaffee kaffee
    + String getDescription()
}
class Sahne {
    + String getDescription()
}
class Eis {
    + String getDescription()
}

Espresso ..|> Kaffee
Mocca ..|> Kaffee
Decorator ..|> Kaffee
Decorator o-- Kaffee
Sahne --|> Decorator
Eis --|> Decorator
```