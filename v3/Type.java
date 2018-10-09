package v3;

/**
 * Enumération de type d'instrument 
@author Hauser Joshua
@author Freitas Michael
@author Vathonne Thomas
@author Nait Belkacem Driss
@author Hamel Hugo 
@version 1
**/


public enum Type {

	ACOUSTIC, ELECTRIC;
/**
 *@return le type d'instrument
 */
	public String toString() {
		switch (this) {
		case ACOUSTIC:
			return "acoustic";
		case ELECTRIC:
			return "electric";
		default:
			return "unspecified";
		}
	}
}
