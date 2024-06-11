<div style="font-family:Papyrus; font-size:2em;">

### 1.Das Observer -Entwurfsmuster(siehe
https://de.wikipedia.org/wiki/Beobachter_(Entwurfsmuster))gehört zu den am meisten verwendeten Designmustern/Designpattern/Pattern in der Programmierung. Es wird auch Beobachter-Muster oder Publisher-Pattern genannt. Man kann sich dieses Pattern so vorstellen, dass der Publisher eine Zeitung oder auch Slack ist und dass Listener diese Zeitung (oder Slack) "abonnieren". Immer, wenn eine Nachricht veröffentlicht wird, dann erfahren alle Abonnenten davon. Wir werden eine (einfache) Implementierung dieses Entwurfsmusters durchführen

### 2. Erstellen Sie ein Interface Publisher mit folgenden (abstrakten) Methoden:

```java
    public boolean register(Listener listener);
    public boolean unregister(Listener listener);
    public void notifyListeners();
    public String getUpdate(Listener listener);
```

### 3. Erstellen Sie ein weiteres Interface Listener mit folgenden(abstrakten) Methoden: 
```java
    public void update();
    public void setPublisher(Publisher publisher);
    public void removePublisher(Publisher publisher);
```

### 4. Denken Sie von Anfang an übers Testen nach. 
Arbeiten Sie gerne mit Tests frist (also TDD). Denken Sie an Mockito als Möglichkeit Klassen isoliert zu testen.

### 5. Erstellen Sie eine Klasse `Slack`, die das `Publisher`-Interface implementiert. 

```java
   //Objektvariablen der Klasse sind 
   private Set<Listener> listeners; 
    // (speichert alle "Abonnenten"; kann gerne auch eine Liste sein)
    
   private int nrOfMessages;
   // speichert die aktuelle Nummer einer veröffentlichten Nachricht - die Nachrichten, die veröffentlicht werden, sollen fortlaufend nummeriert werden) 
  
   // Im parameterlosen Konstruktor werden die Menge (oder Liste) erzeugt und die `nrOfMessages` auf `0` gesetzt.

   register(Listener listener)  
  // In der Methode `register(Listener listener)` wird der  `listener` in die Set `listeners` eingefügt. Geben Sie ein `true` zurück, wenn `listener` tatsächlich eingefügt wurde und `false` sonst (falls er schon in der Menge (oder Liste) war.
  
   unregister(Listener listener)
   // In der Methode `unregister(Listener listener)` wird der `listener` aus der Menge `listeners` entfernt. Geben Sie ein `true` zurück, wenn `listener` tatsächlich entfernt wurde und `false` sonst (falls er nicht in der Menge (oder Liste) war).
  
    notifyListeners()
    // In der Methode `notifyListeners()` wird für alle `listener` aus der Menge `listeners` die `update()`-Methode aufgerufen (siehe `Listener` und `Student`).
 
    getUpdate(Listener obj)
    // Die Methode `getUpdate(Listener obj)` liefert einfach folgenden String zurück: `"Breaking News " + this.nrOfMessages`.
   
    public void publishNews()
    // Erstellen Sie eine Methode `public void publishNews()`, in der die `nrOfMessages` um 1 erhöht und die Methode `notifyListeners()` aufgerufen wird
``` 

### 6. Erstellen Sie eine Klasse `Student`, die das `Listener`-Interface implementiert. 
```java 
// Objektvariablen der Klasse sind

private String name;
// speichert den Namen von `Student`

private Publisher publisher;
// speichert den `Publisher`, an den sich `Student` anmeldet

// Im parametrisierten Konstruktor `public Student(String name)` wird der Name initalisiert.

setPublisher(Publisher publisher);
// In der Methode `setPublisher(Publisher publisher)` wird die `register()`-Methode des `publisher` aufgerufen und der Wert der Objektvariable `publisher` gesetzt. Geben Sie bei erfolgreicher Anmeldung an den `publisher` auf die Konsole `this.name + " registered!"` aus.

removePublisher(Publisher publisher);
// In der Methode `removePublisher(Publisher publisher)` meldet sich `Student` wieder vom `publisher` ab (Aufruf von `unregister()` und Ausgabe auf die Konsole `this.name + " deregistered!"`.

update();
// In der Methode `update()` wird die `getUpdate()`-Methode des `publisher` aufgerufen und die zurückgegebene Nachricht `msg` wie folgt auf die Konsole ausgegben: `this.name + " received " + msg`.

//Implementieren Sie für `Student` auch die Methoden `equals()` und `hashCode()`
```

</div>