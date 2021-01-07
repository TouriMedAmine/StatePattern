package models;

public abstract class EtatAvion {
	protected Avion avion;
	
	public EtatAvion(Avion avion) {
		this.avion = avion;
	}
	public abstract void sortirDuGarage();
	public abstract void entrerAuGarage();
	public abstract void decoller();
	public abstract void atterrir();
	public abstract void fait();
}
