package strategy;

interface BellVerhalten {
	public void bellen();
}

class LeiseBellen implements BellVerhalten {
	@Override
	public void bellen() {
		System.out.println("ganz leise bellen...");
	}
}

class LautBellen implements BellVerhalten {
	@Override
	public void bellen() {
		System.out.println("GANZ LAUT BELLEN!!");
	}
}

class ElektronischBellen implements BellVerhalten {
	@Override
	public void bellen() {
		System.out.println("Elekkkkktronisch Bellen!");
	}
}
