package implementacija;

import java.util.GregorianCalendar;

import interfejsi.InterfejsMenjacnice;
import kursevi.Kurs;
import valute.Valuta;

public class Menjacnica implements InterfejsMenjacnice {
	@Override
	public void dodajKurs(Valuta valuta, Kurs kurs) {
		
	}
	@Override
	public void obrisiKurs(Valuta valuta, Kurs kurs) {

	}
	@Override
	public Kurs vratiKurs(GregorianCalendar datum, Valuta valuta) {

		return null;
	}
}
