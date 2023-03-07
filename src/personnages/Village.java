package personnages;
public class Village {
	private String nom;
	private Chef chef;
	private int nbVillagois=0;
	private int nbVillageoisMaximum;
	private Gaulois village [] ;

	public Village(String nom , int nbVillageoisMaximum) {
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		this.nom = nom;
		this.village  = new Gaulois [nbVillageoisMaximum];
	}
	
	public void ajouterHabitant(Gaulois gaulois){
		village[nbVillagois]= gaulois;	
		nbVillagois++;
		}
	
	public Gaulois trouverHabitant(int nbr ){
		return village[nbr];	
	}
	 
	

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	
	public void afficher() {
		System.out.println("Dans village du " + chef + "vivent les légendaires gaulois");
		for (int i=0 ; i<nbVillagois ; i++) {
			System.out.println(village[i].getNom());
		}
	}
	
	public static void main(String[] args) {
		Village a = new Village("Village des Irréductibles",30);
		Gaulois b = new Gaulois("Axterix",8,0);
		Gaulois c = new Gaulois("Obelix",8,0);
		Chef d = new Chef("Abraracourcix",6,a);
		a.setChef(d);
		a.ajouterHabitant(b);
		a.ajouterHabitant(c);
		a.afficher();
		
	}
}
