# Aufgabe: Buchbibliothek-Management-System
## Aufgabenstellung:
In dieser Übungsaufgabe erstellst du ein einfaches
Buchbibliothek-Management-System, das eine Map zur Verwaltung der Bücher
verwendet. Jedes Buch wird durch einen eindeutigen ISBN-Nummer identifiziert, und
du speicherst Informationen über den Buchtitel und die Anzahl der verfügbaren
Kopien.
## Anforderungen:
1. Buch hinzufügen: Erstelle eine Methode `addBook(String isbn, String title, int copies)`, die ein neues Buch in das System einfügt. Wenn das Buch bereits existiert, sollte die Methode die Anzahl der Kopien aktualisieren.
2. Buchinformationen aktualisieren: Implementiere eine Methode `updateBook(String isbn, int newCopies)`, die die Anzahl der Kopien eines vorhandenen Buches aktualisiert.
3. Buch ausleihen: Entwickle eine Methode `borrowBook(String isbn)`, die die Anzahl der verfügbaren Kopien eines Buches um eins verringert, wenn mindestens eine Kopie vorhanden ist. Andernfalls sollte eine Warnmeldung ausgegeben werden.
4. Buch zurückgeben: Schreibe eine Methode `returnBook(String isbn)`, die eine ausgeliehene Kopie eines Buches ins System zurückgibt, indem sie die Anzahl der verfügbaren Kopien um eins erhöht.
5. Buch suchen und Informationen anzeigen: Füge eine Methode `printBookDetails(String isbn)` hinzu, die Titel und Anzahl der verfügbaren Kopien für ein Buch ausgibt.
6. Alle Bücher anzeigen: Implementiere eine Methode `printAllBooks()`, die Details aller Bücher in der Bibliothek anzeigt.
7. Wenn ein Buch mit der isbn nicht gefunden wird, soll eine selbstgeschriebene `BookNotFoundException` fliegen. Dabei handelt es sich um eine RunTimeException.

## Hinweise zur Implementierung:
Verwende eine HashMap, in der jeder ISBN als Schlüssel und ein Objekt einer eigenen Buchklasse als Wert gespeichert wird. Die Buchklasse sollte Felder  für Titel und Anzahl der Kopien enthalten.
Beachte, dass du für das Management der Bücher Methoden für das  Hinzufügen, Aktualisieren, Ausleihen und Zurückgeben implementieren musst. Diese Operationen sollten die Daten in der Map entsprechend modifizieren.