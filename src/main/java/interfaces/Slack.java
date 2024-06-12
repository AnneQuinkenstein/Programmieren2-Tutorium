package interfaces;

import java.util.HashSet;

public class Slack implements Publisher {

    //Objektvariablen der Klasse sind
    private HashSet<Listener> listeners;
    // (speichert alle "Abonnenten"; kann gerne auch eine Liste sein)

    private int nrOfMessages;
    // speichert die aktuelle Nummer einer veröffentlichten Nachricht -
    // die Nachrichten, die veröffentlicht werden, sollen fortlaufend nummeriert werden)

    // Im parameterlosen Konstruktor werden die Menge (oder Liste) erzeugt und die `nrOfMessages` auf `0` gesetzt.
    public Slack() {
        this.listeners = new HashSet<Listener>();
        this.nrOfMessages = 0;
    }

    @Override
    public boolean register(Listener listener) {
        // add beinhaltet schon eine boolean Abfrage, deshalb kein if nötig
       /* if (!listeners.contains(listener)) {
            listeners.add(listener);
            return true;
        }
        return false;*/
        boolean containment = listeners.add(listener);
        return containment;
    }

    @Override
    public boolean unregister(Listener listener) {
        return listeners.remove(listener);
    }

    @Override
    public void notifyListeners() {
        for (Listener listener : listeners) {
            listener.update();
        }
    }
@Override
    public String getUpdate(Listener obj){
        return "Breaking News " + this.nrOfMessages;
    }

    public void publishNews(){
        this.nrOfMessages = nrOfMessages++;
        this.notifyListeners();
    }




}
