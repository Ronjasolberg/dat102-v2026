package dat102.f05.app.baklengs;

public class BaklengsMain {
	
	public static void main(String[] args) {
		
		String[] tabell = {"Anne", "Per", "Lise", "Knut"};
		
		// Skrive ut elementene i tabellen baklengs

        // Oppretter en stabel
        StabelADT<String> stabel = new TabellStabel<>();

        // Legger inn alle navnene fra tabell inn i stabelen
        for (String navn : tabell) {
            stabel.push(navn);
        }
        
        while (!stabel.isEmpty()) {
            System.out.println(stabel.pop());
        }



		
	}
	
}