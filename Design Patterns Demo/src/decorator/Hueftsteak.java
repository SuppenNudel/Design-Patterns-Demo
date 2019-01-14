package decorator;

class Hueftsteak implements Gericht {
	@Override
	public void druckeBeschreibung() {
		System.out.print("Hüftsteak");
	}

	@Override
	public double getPreis() {
		return 13.0;
	}
}

class Tofu implements Gericht {
	@Override
	public void druckeBeschreibung() {
		System.out.print("Tofu");
	}

	@Override
	public double getPreis() {
		return 8.50;
	}
}

class Garnelen implements Gericht {
	@Override
	public void druckeBeschreibung() {
		System.out.print("Garnelen");
	}

	@Override
	public double getPreis() {
		return 13.50;
	}

}

class WienerSchnitzel implements Gericht {
	@Override
	public void druckeBeschreibung() {
		System.out.print("WienerSchnitzel");
	}

	@Override
	public double getPreis() {
		return 10.50;
	}
}
