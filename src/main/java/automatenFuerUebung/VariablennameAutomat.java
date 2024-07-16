package automatenFuerUebung;

import automatenFuerUebung.EndlicherAutomat;

/**
 * akzeptiert g�ltige Variablennamen in C
 * @author Doro
 *
 */
public class VariablennameAutomat implements EndlicherAutomat {
	
	private int aktuell = 0;
	
	@Override
	public void starten()
	{
		this.aktuell = 0;
	}
	
	@Override
	public void zustandswechsel(char zeichen) {
		if(aktuell == 0)
		{
			if('a' <= zeichen && zeichen <= 'z'
			|| 'A' <= zeichen && zeichen <= 'Z'
			|| zeichen == '_')
				aktuell = 1;
			else
				aktuell = -1;
		}
		if(aktuell == 1)
		{
			if('a' <= zeichen && zeichen <= 'z'
			|| 'A' <= zeichen && zeichen <= 'Z'
			|| zeichen == '_'
			|| '0' <= zeichen && zeichen <= '9')
				aktuell = 1;
			else
				aktuell = -1;
		}
	}

	@Override
	public boolean akzeptiert() {
		return aktuell == 1;
	}

}
