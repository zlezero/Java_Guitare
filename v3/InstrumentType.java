package v3;

/**
 * Enumération de catégorie d'instruments
@author Hauser Joshua
@author Freitas Michael
@author Vathonne Thomas
@author Nait Belkacem Driss
@author Hamel Hugo 
@version 1
**/

public enum InstrumentType {
	
	GUITAR, BANJO, DOBRO, FIDDLE, BASS, MANDOLIN;
	
/**
* @return  le catégorie d'instrument
*/
	public String toString() {
		
		switch(this) {
			
		case GUITAR: return "Guitar";
		case BANJO: return "Banjo";
		case DOBRO: return "Dobro";
		case FIDDLE: return "Fiddle";
		case BASS: return "Bass";
		case MANDOLIN: return "Mandolin";
		default: return "Unspecified";
		
		}
		
	}
	
}
