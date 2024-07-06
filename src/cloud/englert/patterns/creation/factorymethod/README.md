# Factory Method Pattern
als Schnittstelle zur Objekterzeugung, die Entscheidung welche konkrete Klasse genommen wird bleibt in der implementierenden Klasse

## Vorteile
- gekapselter (also austauschbarer) Konstruktionsprozess
- Default-Implementierungen möglich
- kann sicherstellen, dass immer ein Objekt zurückgegeben wird

## Nachteile
- enge Kopplung an das zu erstellende Produkt

## Beispiel
```mermaid
classDiagram
direction BT

class Shape {
    <<interface>>
    +draw() void
}
class Circle {
    +draw() void
}
class Square {
    +draw() void
}
class Rectangle {
    +draw() void
}
class ShapeFactory {
    <<abstract>>
    +getShape() Shape
}
class RectangleFactory {
    +getShape() Shape
}

Circle ..|> Shape
Square ..|> Shape
Rectangle ..|> Shape
ShapeFactory --> Shape : creates
RectangleFactory --|> ShapeFactory
RectangleFactory --> Rectangle : creates
```