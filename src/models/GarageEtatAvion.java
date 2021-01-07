package models;

public class GarageEtatAvion extends EtatAvion {
	
	public GarageEtatAvion(Avion avion) {
		super(avion);
	}

	@Override
	public void sortirDuGarage() {
		avion.setEtat(new PisteEtatAvion(avion));
		System.out.println("Changement d'etat du garage a la piste");
	}

	@Override
	public void entrerAuGarage() {
		System.out.println("ERREUR! On est deja au garage!");

	}

	@Override
	public void decoller() {
		System.out.println("ERREUR! On n est pas dans la piste!");

	}

	@Override
	public void atterrir() {
		System.out.println("ERREUR! On n est pas dans l'air!");

	}

	@Override
	public void fait() {
		System.out.println("l'avion est au garage.");

	}

}
