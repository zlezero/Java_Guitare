package v3;

/**
* Classe de cr�ation d'instruments
@author Hauser Joshua
@author Freitas Michael
@author Vathonne Thomas
@author Nait Belkacem Driss
@author Hamel Hugo 
@version 1
**/

public class Instrument {
	
	protected String serialNumber;
	protected double price;
	protected InstrumentSpec spec;

/**
 * constructeur de la classe Instrument	
 * @param serialNumber : num�ro de s�rie de l'instrument
 * @param price : prix de l'instrument
 * @param specs : sp�cifications de l'instrument
 */

	public Instrument(String serialNumber, double price, InstrumentSpec specs) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = specs;
	}
/**
 * r�cup�re le num�ro de s�rie de l'instrument
 * @return le num�ro de serie de l'instrument
 */
	public String getSerialNumber() {
		return serialNumber;
	}

/**
 * r�cup�re le prix de l'instrument
 * @return le prix de l'instrument
 */
	public double getPrice() {
		return price;
	}
	
/**
* r�cup�re les sp�cifications de l'instrument
* @return les specifications de l'instrument
*/
	public InstrumentSpec getSpecs() {
		return spec;
	}
	

/**
 * fixe le prix de l'instrument
 * @param newPrice nouveau prix
 */
	public void setPrice(float newPrice) {
		this.price = newPrice;
	}
/**
 * configure les sp�cifications de l'instrument
 * @param specs : sp�cifications que l'on souhaite attribuer � l'instrument
 */
	public void setSpecs(InstrumentSpec specs) {
		this.spec = specs;
	}
	
}
