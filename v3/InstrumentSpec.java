package v3;

import java.util.Iterator;
import java.util.Map;

/**
 * Classe de sp�cifications d'instruments
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
	 * @param proprietes : propri�t�s de l'instrument
	 */
	public InstrumentSpec(Map<String, Object> proprietes) {
		properties = proprietes;
	}

	/**
	 * M�thode v�rifiant la correspondance entre les sp�cifications de deux instruments
	 * @param otherSpec : sp�cifications d'un instrument
	 * @return TRUE si les deux instruments compar�s ont les m�mes propri�t�s, FALSE sinon
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
	 * R�cup�re les propri�t�s de l'instrument
	 * @return les propri�t�s de l'instrument
	 */
	public Map<String, Object> getProperties() {
		return properties;
	}
	
}
