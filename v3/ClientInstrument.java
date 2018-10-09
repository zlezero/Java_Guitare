package v3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Classe de recherche d'instruments
@author Hauser Joshua
@author Freitas Michael
@author Vathonne Thomas
@author Nait Belkacem Driss
@author Hamel Hugo 
@version 1
**/


public class ClientInstrument { 

	public static void main(String[] args) {
		
		// Set up Rick's guitar inventory
		
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		HashMap<String, Object> Mandolin9019920 = new HashMap<String, Object>();
		//Mandolin9019920.put("Builder", Builder.PRS);
		//Mandolin9019920.put("Modèle", "DRSM-008 E");
		//Mandolin9019920.put("Type", Type.ELECTRIC);
		//Mandolin9019920.put("Backwood", Wood.MAPLE);
		//Mandolin9019920.put("Topwood", Wood.MAPLE);
		//Mandolin9019920.put("Style", Style.F);
		//Mandolin9019920.put("TypeInstrument", InstrumentType.MANDOLIN);
						
		InstrumentSpec whatErinLikes = new InstrumentSpec(Mandolin9019920);
		
		List<Instrument> matchingInstruments = inventory.search(whatErinLikes);
		
		if (!matchingInstruments.isEmpty()) {
			
			System.out.println("Erin, you might like these instruments :");
			
			for (Iterator<Instrument> i = matchingInstruments.iterator(); i.hasNext();) {
				
				Instrument instrument = (Instrument) i.next();
				
				System.out.println("  We have a "
						+ instrument.getSpecs().getProperties().get("Builder") + " "
						+ instrument.getSpecs().getProperties().get("Modèle") + " "
						+ instrument.getSpecs().getProperties().get("Type") + " guitar:\n     "
						+ instrument.getSpecs().getProperties().get("Backwood")
						+ " back and sides,\n     "
						+ instrument.getSpecs().getProperties().get("Topwood")
						+ " top.\n  You can have it for only $"
						+ instrument.getPrice() + "!\n  ----");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}

/**
 * initialise un inventaire qui contiendra des instruments
 * @param inventory : inventaire qu'on souhaite initialiser
 */
	public static void initializeInventory(Inventory inventory) {
		
		
		HashMap<String, Object> Guitare11277 = new HashMap<String, Object>();
		Guitare11277.put("Builder", Builder.COLLINGS);
		Guitare11277.put("Modèle", "CJ");
		Guitare11277.put("Type", Type.ACOUSTIC);
		Guitare11277.put("Backwood", Wood.INDIAN_ROSEWOOD);
		Guitare11277.put("Topwood", Wood.SITKA);
		Guitare11277.put("nbrStrings", 6);
		Guitare11277.put("TypeInstrument", InstrumentType.GUITAR);
		
		inventory.addInstrument("11277", 3999.95, new InstrumentSpec(Guitare11277));
		
		HashMap<String, Object> GuitareV9512 = new HashMap<String, Object>();
		GuitareV9512.put("Builder", Builder.FENDER);
		GuitareV9512.put("Modèle", "Stratocastor");
		GuitareV9512.put("Type", Type.ELECTRIC);
		GuitareV9512.put("Backwood", Wood.ALDER);
		GuitareV9512.put("Topwood", Wood.ALDER);
		GuitareV9512.put("nbrStrings", 6);
		GuitareV9512.put("TypeInstrument", InstrumentType.GUITAR);
		
		inventory.addInstrument("V9512", 1549.95, new InstrumentSpec(GuitareV9512));

		HashMap<String, Object> Guitare82765501 = new HashMap<String, Object>();
		Guitare82765501.put("Builder", Builder.PRS);
		Guitare82765501.put("Modèle", "Dave Navarro Signature");
		Guitare82765501.put("Type", Type.ELECTRIC);
		Guitare82765501.put("Backwood", Wood.MAHOGANY);
		Guitare82765501.put("Topwood", Wood.MAPLE);
		Guitare82765501.put("nbrStrings", 12);
		Guitare82765501.put("TypeInstrument", InstrumentType.GUITAR);

		inventory.addInstrument("82765501", 2100.95, new InstrumentSpec(Guitare82765501));
		
		HashMap<String, Object> Mandolin7819920 = new HashMap<String, Object>();
		Mandolin7819920.put("Builder", Builder.GIBSON);
		Mandolin7819920.put("Modèle", "F-5G");
		Mandolin7819920.put("Type", Type.ELECTRIC);
		Mandolin7819920.put("Backwood", Wood.MAPLE);
		Mandolin7819920.put("Topwood", Wood.MAPLE);
		Mandolin7819920.put("Style", Style.A);
		Mandolin7819920.put("TypeInstrument", InstrumentType.MANDOLIN);
		
		inventory.addInstrument("7819920", 5400.99, new InstrumentSpec(Mandolin7819920));

		HashMap<String, Object> Mandolin9019920 = new HashMap<String, Object>();
		Mandolin9019920.put("Builder", Builder.PRS);
		Mandolin9019920.put("Modèle", "DRSM-008 E");
		Mandolin9019920.put("Type", Type.ELECTRIC);
		Mandolin9019920.put("Backwood", Wood.MAPLE);
		Mandolin9019920.put("Topwood", Wood.MAPLE);
		Mandolin9019920.put("Style", Style.F);
		Mandolin9019920.put("TypeInstrument", InstrumentType.MANDOLIN);
		
		inventory.addInstrument("9019920", 5495.99, new InstrumentSpec(Mandolin9019920));


		/*	
		 inventory.addInstrument("11277", 3999.95, new GuitarSpec(Builder.COLLINGS, "CJ",
				Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.SITKA, 6));
		inventory.addInstrument("V95693", 1499.95, new GuitarSpec(Builder.FENDER, "Stratocastor",
				Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12));
		inventory.addInstrument("V9512", 1549.95, new GuitarSpec(Builder.FENDER, "Stratocastor",
				Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6));
		inventory.addInstrument("122784", 5495.95, new GuitarSpec(Builder.MARTIN, "D-18",
				Type.ACOUSTIC, Wood.MAHOGANY, Wood.ADIRONDACK, 12));
		inventory.addInstrument("76531", 6295.95, new GuitarSpec(Builder.MARTIN, "OM-28",
				Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK, 6));
		inventory.addInstrument("70108276", 2295.95, new GuitarSpec(Builder.GIBSON, "Les Paul",
				Type.ELECTRIC, Wood.MAHOGANY, Wood.MAHOGANY, 12));
		inventory.addInstrument("82765501", 1890.95, new GuitarSpec(Builder.GIBSON,
				"SG '61 Reissue", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAHOGANY,
				6));
		inventory.addInstrument("77023", 6275.95, new GuitarSpec(Builder.MARTIN, "D-28",
				Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK, 12));
		inventory.addInstrument("1092", 12995.95, new GuitarSpec(Builder.OLSON, "SJ",
				Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.CEDAR, 6));
		inventory.addInstrument("566-62", 8999.95, new GuitarSpec(Builder.RYAN, "Cathedral",
				Type.ACOUSTIC, Wood.COCOBOLO, Wood.CEDAR, 12));
		inventory.addInstrument("6 29584", 2100.95, new GuitarSpec(Builder.PRS,
				"Dave Navarro Signature", Type.ELECTRIC, Wood.MAHOGANY,
				Wood.MAPLE, 6));
		inventory.addInstrument("9019920", 5495.99, new MandolinSpec(Builder.PRS, "DRSM-008 E", Type.ELECTRIC, Wood.MAPLE, Wood.MAPLE, Style.F));
		inventory.addInstrument("7819920", 5400.99, new MandolinSpec(Builder.GIBSON, "F-5G", Type.ELECTRIC, Wood.MAPLE, Wood.MAPLE, Style.A)); */
	}
}
