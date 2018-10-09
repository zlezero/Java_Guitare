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

public enum Wood {

	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;

	
	/**
	 * @return le type de bois utilisé pour un instrument
	 */
	public String toString() {
		switch (this) {
		case INDIAN_ROSEWOOD:
			return "Indian Rosewood";
		case BRAZILIAN_ROSEWOOD:
			return "Brazilian Rosewood";
		case MAHOGANY:
			return "Mahogany";
		case MAPLE:
			return "Maple";
		case COCOBOLO:
			return "Cocobolo";
		case CEDAR:
			return "Cedar";
		case ADIRONDACK:
			return "Adirondack";
		case ALDER:
			return "Alder";
		case SITKA:
			return "Sitka";
		default:
			return "unspecified";
		}
	}
}
