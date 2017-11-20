/** Modelliert Person Student
 * Bietet einen Konstruktor, der eine neue Person instanziiert und 
 * zusätzlich als Student das Datenfeld Credits.
 * 
 */

/**
 * @author daniellerch
 *
 */
public class Student extends Person {
	public int credits = 0;

	/**
	 * 
	 */
	public Student(String name, String id) {
		super(name, id);
	}
	
	public void erhoeheCredits(int anzahlCredits) {
		this.credits = credits + anzahlCredits;
	}
	
	public int gibCredits() {
		return credits;
	}

}
