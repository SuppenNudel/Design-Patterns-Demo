package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Verlag {

	private List<Abonnent> abonnentenList = new ArrayList<Abonnent>();

	public void aboHinzufuegen(Abonnent abonnent) {
		abonnentenList.add(abonnent);
	}

	public void aboEntfernen(Abonnent abonnent) {
		abonnentenList.remove(abonnent);
	}

	protected void verteileZeitung(Zeitung zeitung) {
		for (Abonnent abonnent : abonnentenList) {
			abonnent.erhalteZeitung(zeitung);
		}
	}
}

class FAZVerlag extends Verlag {

	private Zeitung aktuelleZeitung;

	public void setAktuelleZeitung(Zeitung aktuelleZeitung) {
		this.aktuelleZeitung = aktuelleZeitung;
		// Nach dem einen neue Zeitung gesetzt wurde, werden alle Abonnenten
		// benachrichtigt.
		verteileZeitung(aktuelleZeitung);
	}

	public Zeitung getAktuelleZeitung() {
		return aktuelleZeitung;
	}
}
