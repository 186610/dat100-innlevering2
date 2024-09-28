package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.print("[");
		
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i]);
			
			if (i < tabell.length - 1) {
				System.out.print(",");
			}
		}
		
		System.out.print("]");
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String streng = "[";
		
		for (int i = 0; i < tabell.length; i++) {
			streng += tabell[i];
			
			if (i < tabell.length - 1) {
				streng += ",";
			}
		}
		
		streng += "]";
		return streng;
	
	}

	
	// c)
	public static int summer(int[] tabell) {
		int summer = 0;
		
		for(int tall : tabell) {
			summer += tall;
		}

		return summer;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for(int verdi : tabell) {
			if (verdi == tall) {
				return true;
			}
		} 
		
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for(int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				return i;
			}
		}
		
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sortert = true;
		int i = 1;
		while (sortert && i < tabell.length) {
			if (tabell[i-1] <= tabell[i]) {
				i++;
			} else {
				sortert = false;
			}
			
		}
	return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
