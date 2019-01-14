package decorator;

class Pommes extends Beilage {
	public Pommes(Gericht gericht) {
		super(gericht);
	}

	@Override
	public void druckeBeschreibung() {
		gericht.druckeBeschreibung();
		System.out.print(", Pommes");
	}

	@Override
	public double getPreis() {
		return gericht.getPreis() + 2.50;
	}
}

class Salat extends Beilage {
	public Salat(Gericht gericht) {
		super(gericht);
	}

	@Override
	public void druckeBeschreibung() {
		gericht.druckeBeschreibung();
		System.out.print(", Salat");
	}

	@Override
	public double getPreis() {
		return gericht.getPreis() + 2.25;
	}
}

class Nudeln extends Beilage {
	public Nudeln(Gericht gericht) {
		super(gericht);
	}

	@Override
	public void druckeBeschreibung() {
		gericht.druckeBeschreibung();
		System.out.print(", Nudeln");
	}

	@Override
	public double getPreis() {
		return gericht.getPreis() + 4.50;
	}
}

class Suppe extends Beilage {
	public Suppe(Gericht gericht) {
		super(gericht);
	}

	@Override
	public void druckeBeschreibung() {
		gericht.druckeBeschreibung();
		System.out.print(", Suppe");
	}

	@Override
	public double getPreis() {
		return gericht.getPreis() + 1.50;
	}
}

class Bratkartoffeln extends Beilage {
	public Bratkartoffeln(Gericht gericht) {
		super(gericht);
	}

	@Override
	public void druckeBeschreibung() {
		gericht.druckeBeschreibung();
		System.out.print(", Bratkartoffeln");
	}

	@Override
	public double getPreis() {
		return gericht.getPreis() + 1.50;
	}
}
