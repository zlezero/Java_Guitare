package v3;

import java.util.Iterator;
import java.util.Map;

/**
 * Classe de spécifications d'instruments
@author Hauser Joshua
@author Freitas Michael
@author Vathonne Thomas
@author Nait Belkacem Driss
@author Hamel Hugo 
@version 1
**/

public class InstrumentSpec {

	private Map<String, Object> properties; 
	
	/**
	 * Constructeur de la classe InstrumentSpec
	 * @param proprietes : propriétés de l'instrument
	 */
	public InstrumentSpec(Map<String, Object> proprietes) {
		properties = proprietes;
	}

	/**
	 * Méthode vérifiant la correspondance entre les spécifications de deux instruments
	 * @param otherSpec : spécifications d'un instrument
	 * @return TRUE si les deux instruments comparés ont les mêmes propriétés, FALSE sinon
	 */
	protected boolean matches(InstrumentSpec otherSpec) {
		
		for (Iterator<String> i = otherSpec.getProperties().keySet().iterator();i.hasNext();) {
			String cle = (String) i.next();
			if (this.properties.get(cle) != otherSpec.getProperties().get(cle)) {
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * Récupère les propriétés de l'instrument
	 * @return les propriétés de l'instrument
	 */
	public Map<String, Object> getProperties() {
		return properties;
	}
	
}
