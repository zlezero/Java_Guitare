package TestInventory_v3;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import v3.Builder;
import v3.Instrument;
import v3.InstrumentSpec;
import v3.InstrumentType;
import v3.Inventory;
import v3.Style;
import v3.Type;
import v3.Wood;

public class TestInventory {
	
	Inventory inventory;
	
	public TestInventory() {
		
		inventory = new Inventory();
		v3.ClientInstrument.initializeInventory(inventory);
		
	}
	
	@Test
	public void testInventory() {
		assertTrue(inventory!=null);
	}
	
	
	@Test
	public void testAddInstrument() {
		
		HashMap<String, Object> Guitare11277 = new HashMap<String, Object>();
		
		Guitare11277.put("Builder", Builder.COLLINGS);
		Guitare11277.put("Modèle", "CJ");
		Guitare11277.put("Type", Type.ACOUSTIC);
		Guitare11277.put("Backwood", Wood.BRAZILIAN_ROSEWOOD);
		Guitare11277.put("Topwood", Wood.COCOBOLO);
		Guitare11277.put("nbrStrings", 12);
		Guitare11277.put("TypeInstrument", InstrumentType.GUITAR);
		
		inventory.addInstrument("11278", 3999.95, new InstrumentSpec(Guitare11277));
		
		assertEquals("11278", inventory.getInstrument("11278").getSerialNumber());
		assertEquals(new Double(3999.95), (Double)inventory.getInstrument("11278").getPrice());
		
		for (Iterator<String> i = inventory.getInstrument("11278").getSpecs().getProperties().keySet().iterator();i.hasNext();) {
			String cle = (String) i.next(); 
			assertEquals(Guitare11277.get(cle), inventory.getInstrument("11278").getSpecs().getProperties().get(cle));
		}
				
	}

	@Test
	public void testGetInstrument() {

		HashMap<String, Object> Guitare11277 = new HashMap<String, Object>();
		Guitare11277.put("Builder", Builder.COLLINGS);
		Guitare11277.put("Modèle", "CJ");
		Guitare11277.put("Type", Type.ACOUSTIC);
		Guitare11277.put("Backwood", Wood.INDIAN_ROSEWOOD);
		Guitare11277.put("Topwood", Wood.SITKA);
		Guitare11277.put("nbrStrings", 6);
		Guitare11277.put("TypeInstrument", InstrumentType.GUITAR);
		
		assertEquals("11277", inventory.getInstrument("11277").getSerialNumber());
		assertEquals(new Double(3999.95), (Double)inventory.getInstrument("11277").getPrice());

		for (Iterator<String> i = inventory.getInstrument("11277").getSpecs().getProperties().keySet().iterator();i.hasNext();) {
			String cle = (String) i.next(); 
			assertEquals(Guitare11277.get(cle), inventory.getInstrument("11277").getSpecs().getProperties().get(cle));
		}
		
	}

	@Test
	public void testSearch() {
		
		HashMap<String, Object> Mandolin9019920 = new HashMap<String, Object>();
		
		Mandolin9019920.put("Builder", Builder.PRS);
		Mandolin9019920.put("Modèle", "DRSM-008 E");
		Mandolin9019920.put("Type", Type.ELECTRIC);
		Mandolin9019920.put("Backwood", Wood.MAPLE);
		Mandolin9019920.put("Topwood", Wood.MAPLE);
		Mandolin9019920.put("Style", Style.F);
		Mandolin9019920.put("TypeInstrument", InstrumentType.MANDOLIN);
		
		InstrumentSpec instrumentRecherche = new InstrumentSpec(Mandolin9019920);

		List<Instrument> matchingInstruments = inventory.search(instrumentRecherche);
		
		assertFalse(matchingInstruments.isEmpty());
		assertEquals(matchingInstruments.size(), 1);

		for (Iterator<Instrument> i = matchingInstruments.iterator(); i.hasNext();) {
		
			Instrument instrument = (Instrument) i.next();
			
			assertEquals("9019920", instrument.getSerialNumber());
			assertEquals(new Double(5495.99), (Double)instrument.getPrice());
			
			for (Iterator<String> k = instrument.getSpecs().getProperties().keySet().iterator();i.hasNext();) {
				String cle = (String) k.next(); 
				assertEquals(Mandolin9019920.get(cle), instrument.getSpecs().getProperties().get(cle));
			}
			
		}

		
	}

}
