package loesungAutomat.uebung1;
/**
 * stellt einen deterministischen endlichen Automaten dar
 * @author Doro
 *
 */
public interface EndlicherAutomat {
	/**
	 * startet den Automaten, setzt ihn also in den Startzustand
	 * @return
	 */
	void starten();
	
	/**
	 * führt einen Zustandsübergang vom aktuellen Zustand zum nächsten
	 * aus gemäß dem übergebenen Zeichen 
	 * @param zeichen das aktuell gelesene Zeichen des Eingabewortes
	 */
	void zustandswechsel(char zeichen);
	
	/**
	 * prüft, ob der Automat sich aktuell in einem akzeptierenden
	 * Zustand befindet
	 * @return true, wenn der aktuelle Zustand akzeptierend ist
	 */
	boolean akzeptiert();
	
	/**
	 * lkjlkj
	 */
	
	public default boolean testen(String string) {
		this.starten(); 
		
		for(int i = 0; i < string.length(); i++) {
		this.zustandswechsel(string.charAt(i));
		}
		
		return this.akzeptiert(); 
	}

}
