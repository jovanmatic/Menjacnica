package interfejsi;

import java.util.GregorianCalendar;

import kursevi.Kurs;
import valute.Valuta;

public interface InterfejsMenjacnice {
	public void dodajKurs(Valuta valuta, Kurs kurs);
	public void obrisiKurs(Valuta valuta, Kurs kurs);
	public Kurs vratiKurs(GregorianCalendar datum, Valuta valuta);
}
