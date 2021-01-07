package models;

public class Avion {
	private EtatAvion etat;
	
	public Avion() {
		this.etat = new GarageEtatAvion(this);
	}
	public void sortirDuGarage() {
		etat.sortirDuGarage();
	}
	public void entrerAuGarage() {
		etat.entrerAuGarage();
	}
	public void decoller() {
		etat.decoller();
	}
	public void atterrir() {
		etat.atterrir();
	}
	public void fait() {
		etat.fait();
	}
	public EtatAvion getEtat() {
		return etat;
	}
	public void setEtat(EtatAvion etat) {
		this.etat = etat;
	}
	
}
