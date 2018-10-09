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
	 * Constructeur de la classe Inventory, sans param�tre
	 */
	public Inventory() {
		instruments = new LinkedList<Instrument>();
	}

	
	/**
	 * Permet d'ajouter un instrument � l'inventaire
	 * @param serialNumber : num�ro de s�rie de l'instrument � ajouter
	 * @param price : prix de l'instrument � ajouter
	 * @param specs : sp�cifications de l'instrument � ajouter
	 */
	public void addInstrument(String serialNumber, double price, InstrumentSpec specs) {
		instruments.add(new Instrument(serialNumber, price, specs));
	}

	/**
	 * Permet de r�cu�prer un instrument
	 * @param serialNumber : num�ro de s�rie de l'instrument � ajouter
	 * @return l'instrument dont le num�ro de s�rie concorde avec celui qui est recherch�, null sinon
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
	 * Cr�� une liste contenant les instruments dont les sp�cifications correspondent � celles qui sont recherch�es
	 * @param searchSpec : sp�cifications recherch�es
	 * @return la liste des instruments correspondant � la recherche
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
