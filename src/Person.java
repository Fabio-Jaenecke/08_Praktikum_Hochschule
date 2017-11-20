/** Modelliert eine Person
 *  Bietet einen Konstruktor an, der die Datenfelder name und id instanziiert.  
 * 
 */

/**
 * @author daniellerch
 *
 */
public class Person {
	private String name;
	private String id;
	
	public Person() {}

	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}
		
	public String gibInfo() {
		return (name + ", " + id);
	}
	
}
