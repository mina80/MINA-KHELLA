package gestion_note;

import java.util.ArrayList;
import java.util.List;

public class ListEtudiant extends ArrayList<etudiant>{
	public boolean add( etudiant e) {
		if(this.contains(e)) return false;
		return super.add(e);
	}
	public List<etudiant> filtrer(Condition c){
		for (int i = 0; i < this.size(); i++) {
			if(c.estVrai(get(i)))
				return super.add(e);
		}
	}
}
