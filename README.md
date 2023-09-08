# ffm-java-23-1-Lombok

## Aufgabe: Lombok @Data

# Erstellt ein neues Java-Projekt in IntelliJ und nutzt Lombok, um eine einfache Shop-Entität zu erstellen.


    Schritt 1: Fügt die Lombok-Abhängigkeit zu eurem Projekt hinzu und konfiguriert IntelliJ, um Lombok zu unterstützen.

    Schritt 2: Erstellt eine einfache Klasse "Student" mit den folgenden Attributen: id, name, adress, grade.

    Schritt 2.5: Verwendet die passenden Lombok-Annotationen, um Getter, Setter, Equals, HashCode, ToString und Konstruktoren für die Entität zu generieren.

    Schritt 3: Erstelle einen Teacher Record mit den folgenden Attributen: id, name, subject.

    Schritt 4: Erstelle eine Klasse Course mit den folgenden Attributen: id, name, teacher, students.

    Schritt 4.5: Verwendet die passenden Lombok-Annotationen, um Getter, Setter, Equals, HashCode, ToString und Konstruktoren für die Entität zu generieren.

    Schritt 5: Schreibt eine "Main"-Klasse, in der ihr einige Beispiele für das Erstellen von Students, Teachers und Courses mit den Konstruktoren anwendet.

    Schritt 6: Prüft in der "Main"-Klasse ob die generierten Lombok Methoden korrekt funktionieren(getter, setter, toString,...).


## Aufgabe: Lombok @Builder & @With



    Schritt 1: Fügt zu allen Entitäten das Builder Pattern hinzu und erstellt in der main-Methode mit dem Builder weitere Objekte.



    Schritt 2: Nutzt die With-Annotation um das ändern von Eigenschaften zu erleichtern.


## Bonus-Aufgabe

### Super, ihr seid flott unterwegs! Bearbeitet gerne diese freiwillige Bonusaufgabe zusätzlich.


    Finde herraus was die Lombok Annotation @Value macht und nutze diese für die Klasse Course.

    Erstelle einen Record University mit den folgenden Attributen: id, name, courses.

    Erstelle eine Klasse UniversityService und implementiere dort folgende Methoden:

    Schreibe eine Funktion um die Durschnittsnote eines Courses zu berechnen(Übergebt den Course als Parameter).

    Schreibe eine Funktion um die Durschschnittsnote der ganzen Universität zu berechnen(Übergebe ein Universitäts-Objekt als Parameter).

    Schreibe eine Funktion die aus einer Universität alle Schüler mit mindestens der Note 2/"Gut" raussucht und als Liste zurück gibt(Übergebt ein Universitäts-Objekt als Parameter).



