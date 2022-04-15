package gestion_note;

public class etudiant {
    private int Id;
    private String nom;
    private double note;
    public etudiant (int id, String nom) {
		this.id= id;
		this.nom= nom;
		this.note= 10;
	}
	public etudiant (int id, String nom, double note) {
		this.id= id;
		this.nom= nom;
		this.note= note;
	}
	

	public String toString() {
		return this.nom + ":" + this.note;
	}
	
	public boolean equals( Object obj) {
		if (! (obj instanceof etudiant) ){
			return false;
		}
		return	((etudiant)obj).id==this.id;
	}
	public int compareTo(etudiant o) {
		
		if(this.note==o.note) return 0;
		if(this.note>o.note) return 1;
		return -1;
	}

}
