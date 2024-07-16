package loesungUebung1ComparableKlassen;

public class Bruch implements Comparable<Bruch> {
	private int zaehler, nenner;
	
	public int getZaehler() {
		return zaehler;
	}

	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}

	public int getNenner() {
		return nenner;
	}

	public void setNenner(int nenner) throws ArithmeticException {
		if(nenner==0) throw new ArithmeticException("Nenner darf nicht 0 sein");
	     this.nenner = nenner;
	}

	Bruch() {
		this.zaehler = 1;
		this.nenner = 1;
	}

	Bruch(int zaehler) {
		this.zaehler = zaehler;
		this.nenner = 1;
	}

	/**
	 * Setzt zaehler und nenner auf die angegebenen Werte,
	 *
	 * @param zaehler
	 * @param nenner
	 * @throws ArithmeticException wenn der Nenner null it
	 */

	Bruch(int zaehler, int nenner) throws ArithmeticException {
		if (nenner == 0)
			throw new ArithmeticException("Der Nenner darf nicht null sein!");

		this.zaehler = zaehler;
		this.nenner = nenner;
	}

	/**
	 * Gibt einen Bruch als Zeichenkettendarstellung in der Form zaehler / nenner
	 * zurück.
	 */
	@Override
	public String toString() {

		return this.zaehler + "/" + this.nenner;
	}

	/**
	 * Methode erechnet den gekürzten Bruch aus der Multiplikation eines Bruchs mit
	 * b zurück.
	 * 
	 * @param Bruch b
	 * @return Bruch
	 * 
	 */

	public Bruch multiplizieren(Bruch b) {
		int resNenner;
		int resZaehler;

		resNenner = this.nenner * b.nenner;
		resZaehler = this.zaehler * b.zaehler;

		Bruch c = new Bruch(resZaehler, resNenner);
		c = c.kuerzen();

		return c;
	}

	/**
	 * Rechnet den Bruch in einen Dezimalwert um.
	 * 
	 * @return double Dezimalwert
	 * @throws ArithmeticException wenn nenner == 0;
	 */

	public double ausrechnen() throws ArithmeticException {
		return (double) this.zaehler / this.nenner;
	}

	/**
	 * Methode gibt den gekürzten Bruch zurück (Sie brauchen dazu den ggT)
	 * 
	 * @return Bruch
	 */
	public Bruch kuerzen() {
		int ggT = this.ggT(this.zaehler, this.nenner);
		int newZaehler = this.zaehler / ggT;
		int newNenner = this.nenner / ggT;

		if (newZaehler == 0) {
			newNenner = 1;
		}

		return new Bruch(newZaehler, newNenner);
	}

	/**
	 * Die Methode gibt den größten gemeinsamen Teiler (ggT) der beiden Zahlen zahl1
	 * und zahl2 als int zurück. Sie benutzt den Euklidischer Algorithmus.
	 * 
	 * @param int zahl1, int zahl2 (Zähler und Nenner)
	 * @return int größter gemeinsamer Teiler
	 *
	 */
	private int ggT(int zahl1, int zahl2) {

		if (zahl2 > zahl1 && zahl1 != 0) {
			int zahl3 = zahl2;
			zahl2 = zahl1;
			zahl1 = zahl3;
		}

		int zaehlerTemp = zahl1;
		int nennerTemp = zahl2;
		int rest = zaehlerTemp % nennerTemp;

		while (rest > 0) {
			rest = zaehlerTemp % nennerTemp;
			zaehlerTemp = nennerTemp;
			nennerTemp = rest;
		}

		if (zaehlerTemp == 0) {
			zaehlerTemp = 1;
		}

		return zaehlerTemp;
	}

	/**
	 * Kehrwert Bruch umdrehen. Sonderfall: Kehrwert von 0 (Zähler) bleibt 0;
	 * 
	 * @return Bruch Kehrwert
	 */

	public Bruch kehrwert() {
		if (zaehler == 0) {
			return new Bruch(0);
		}

		return new Bruch(this.nenner, this.zaehler);
	}

	/**
	 * Methode gibt den gekürzten Bruch aus der Division eines Bruchs mit b zurück
	 * 
	 * @param Bruch b
	 * @return Bruch
	 */

	public Bruch dividieren(Bruch b) {
		int resNenner;
		int resZaehler;

		resZaehler = b.nenner * this.zaehler;
		resNenner = b.zaehler * this.nenner;

		Bruch c = new Bruch(resZaehler, resNenner);
		c = c.kuerzen();

		return c;

	}

	/**
	 * Methode vergleicht this Bruch mit Parameter Bruch, inderm er beide auf denselben Nenner bringt,
	 * indem er die Zähler mit dem jeweiligen Nenner des anderen Bruches multipliziert und den Paramter von this.Bruch abzieht. 
	 * 
	 * @param Bruch b
	 * @return Bruch
	 */

	@Override
	public int compareTo(Bruch b) {	
			return (this.zaehler * b.nenner) - (b.zaehler * this.nenner); 
	}
	
	

}
