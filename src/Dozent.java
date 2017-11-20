/** Modelliert eine Person Dozent. 
 *  Bietet einen Konstruktor, der eine neue Person instanziiert und 
 *  zusätzlich als Dozent die Datenfelder Büro und Tel.
 * 
 */

/**
 * @author daniellerch
 *
 */
public class Dozent extends Person{
	private String bueroNr = "";
	private String telNr = "";

	/**
	 * 
	 */
	public Dozent(String name, String id, String bueroNr, String telNr) {
		super(name, id);
		this.bueroNr = bueroNr;
		this.telNr = telNr;
	}
	
	public String gibBuero(){
		return bueroNr;
	}
	
	public String gibTelefonnummer(){
		return telNr;
	}
}
