package v3;

/**
* Enumeration de fabricant de guitares
@author Hauser Joshua
@author Freitas Michael
@author Vathonne Thomas
@author Nait Belkacem Driss
@author Hamel Hugo 
@version 1
**/

public enum Builder {

	FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

	/**
	 * @return  le nom du fabricant d'un instrument
	 */
	public String toString() {
		switch (this) {
		case FENDER:
			return "Fender";
		case MARTIN:
			return "Martin";
		case GIBSON:
			return "Gibson";
		case COLLINGS:
			return "Collings";
		case OLSON:
			return "Olson";
		case RYAN:
			return "Ryan";
		case PRS:
			return "PRS";
		default:
			return "Unspecified";
		}
	}
}
