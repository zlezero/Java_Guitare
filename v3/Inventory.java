package v3;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Classe de l'inventaire contenant des instruments
@author Hauser Joshua
@author Freitas Michael
@author Vathonne Thomas
@author Nait Belkacem Driss
@author Hamel Hugo 
@version 1
**/

public class Inventory {
	private List<Instrument> instruments;

	/**
	 * Constructeur de la classe Inventory, sans paramètre
	 */
	public Inventory() {
		instruments = new LinkedList<Instrument>();
	}

	
	/**
	 * Permet d'ajouter un instrument à l'inventaire
	 * @param serialNumber : numéro de série de l'instrument à ajouter
	 * @param price : prix de l'instrument à ajouter
	 * @param specs : spécifications de l'instrument à ajouter
	 */
	public void addInstrument(String serialNumber, double price, InstrumentSpec specs) {
		instruments.add(new Instrument(serialNumber, price, specs));
	}

	/**
	 * Permet de récuéprer un instrument
	 * @param serialNumber : numéro de série de l'instrument à ajouter
	 * @return l'instrument dont le numéro de série concorde avec celui qui est recherché, null sinon
	 */
	public Instrument getInstrument(String serialNumber) {
		for (Iterator<Instrument> i = instruments.iterator(); i.hasNext();) {
			Instrument instrument = (Instrument) i.next();
			if (instrument.getSerialNumber().equals(serialNumber)) {
				return instrument;
			}
		}
		return null;
	}

	/**
	 * Créé une liste contenant les instruments dont les spécifications correspondent à celles qui sont recherchées
	 * @param searchSpec : spécifications recherchées
	 * @return la liste des instruments correspondant à la recherche
	 */
	public List<Instrument> search(InstrumentSpec searchSpec) {
		List<Instrument> matchingInstruments = new LinkedList<Instrument>();
		for (Iterator<Instrument> i = instruments.iterator(); i.hasNext(); ) {
			Instrument instrument = (Instrument)i.next();
			if (instrument.getSpecs().matches(searchSpec)) {
				matchingInstruments.add(instrument);
			}
		}
		return matchingInstruments;
	}
	
}
