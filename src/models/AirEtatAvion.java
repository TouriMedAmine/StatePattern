package models;

public class AirEtatAvion extends EtatAvion {
	
	
	public AirEtatAvion(Avion avion) {
		super(avion);
	}

	@Override
	public void sortirDuGarage() {
		
		System.out.println("ERREUR! On n est pas au garage!");
	}

	@Override
	public void entrerAuGarage() {
		System.out.println("ERREUR! On n est pas dans la piste!");

	}

	@Override
	public void decoller() {
		System.out.println("ERREUR! On n est pas dans la piste!");

	}

	@Override
	public void atterrir() {
		avion.setEtat(new PisteEtatAvion(avion));
		System.out.println("Changement d'etat air a la piste");

	}

	@Override
	public void fait() {
		System.out.println("l'avion est en air.");

	}

}
