public class VolCommercial extends Vol{
	/***
	 * Constructeur de la classe VolCommercial.
	 * @param unNumVol
	 * @param uneDate
	 * @param unNumA
	 * @param uneDest
	 */
	public VolCommercial(int unNumVol, Date uneDate, int unNumA, int uneDest) {
		super(unNumVol, uneDate, unNumA, uneDest);
		
	}
	
	public String toXML(){
		String chaine = "<VOLCOMMERCIAL>\n"+super.toXML()+"\n<VOLCOMMERCIAL>";
		return chaine;
	}
}