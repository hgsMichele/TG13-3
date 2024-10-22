# Binärbäume
Binärbäume sind ein großer Bestandteil der Datenstrukturen in der Informatik

Man ordnet in einem Baum Werte zu gewissen Knoten, die mit Verbindungen zueinander stehen. 

Man unterscheidet zwischen balancierten und unbalancierten Bäumen. Balancierte Bäume sind gleichmäßig ausgefüllt. 

Bäume funktionieren rekursiv (?)

## Hinzufügen und Entfernen von Knoten
Insert zum Einfügen der Knoten

```Java
tree.insert();
```
Delete zum Entfernen der Knoten

```Java
tree.delete();
```
## Besonderheit Transervierung
Es gibt 3 Arten des Transervierens. 
Transervierung = In welcher Abfolge die Knoten abgearbeitet werden. 
Hierbei unterscheidet man zwischen `Inorder`, `Preorder` und `Postorder`. 

Beispielsweise: 
```Java
tree.inorder();
```
