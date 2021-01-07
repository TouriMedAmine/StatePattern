package models;

public class PisteEtatAvion extends EtatAvion {
	
	public PisteEtatAvion(Avion avion) {
		super(avion);
	}

	@Override
	public void sortirDuGarage() {
		
		System.out.println("ERREUR! On n est pas dans le garage!");
	}

	@Override
	public void entrerAuGarage() {
		avion.setEtat(new GarageEtatAvion(avion));
		System.out.println("Changement d'etat de la piste au garage");

	}

	@Override
	public void decoller() {
		avion.setEtat(new AirEtatAvion(avion));
		System.out.println("Changement d'etat de la piste à l'air");

	}

	@Override
	public void atterrir() {
		System.out.println("ERREUR! On n est pas dans l'air!");

	}

	@Override
	public void fait() {
		System.out.println("l'avion est en piste.");

	}

}
