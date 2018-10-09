package v3;

/**
* Classe de création d'instruments
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
 * @param serialNumber : numéro de série de l'instrument
 * @param price : prix de l'instrument
 * @param specs : spécifications de l'instrument
 */

	public Instrument(String serialNumber, double price, InstrumentSpec specs) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = specs;
	}
/**
 * récupère le numéro de série de l'instrument
 * @return le numéro de serie de l'instrument
 */
	public String getSerialNumber() {
		return serialNumber;
	}

/**
 * récupère le prix de l'instrument
 * @return le prix de l'instrument
 */
	public double getPrice() {
		return price;
	}
	
/**
* récupère les spécifications de l'instrument
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
 * configure les spécifications de l'instrument
 * @param specs : spécifications que l'on souhaite attribuer à l'instrument
 */
	public void setSpecs(InstrumentSpec specs) {
		this.spec = specs;
	}
	
}
