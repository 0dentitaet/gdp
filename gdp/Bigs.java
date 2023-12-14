class Bigs {
	
	// addiert die Ziffernfelder a und b
	public static int[ ] add (int[ ] a, int[ ] b) { /* TODO */ 
	return a;
	}
			
	// gibt das Ziffernfeld n in lesbarer dezimaler Form aus
	static void print (int[ ] n)             { /* TODO */ 
	return;
	}
	
	// konstruiert ein einstelliges Ziffernfeld aus d
	static int[ ] digit(int d)	             { 
		int[] digit= {d}; 
		return digit;
		}
 
	// konstruiert das Ziffernfeld, welches den Wert Null repraesentiert
	static int[ ] Null()                     { 
		return digit(0) ;
		}
	
	// konstruiert das Ziffernfeld, welches den Wert Eins repraesentiert
	static int[ ] One()                     { 
		return digit(1);
	}

	// Rest des Ziffernfeldes n bei Division durch 10 (eine int-Zahl!)
	static int mod10(int[ ] n)               { /* TODO */ 
	return 0;}

	// ganzzahliger Quotient bei Division durch 10
	static int[ ] div10(int[ ] n)            { /* TODO */ 
	return n[ %10];
	}

	// Umwandlung einer int-Zahl in ein Ziffernfeld	
	static int[ ] fromInt(int n)             { /* TODO */ 
	return new int[0];
	}

	// kopiert den Wert von a
	static int[ ] copy(int[ ] n)             { /* TODO */ 
	return n;
	}

	// multipliziert das Ziffernfeld a mit einer int-Zahl
	static int[ ] times(int[ ] n, int d)     { /* TODO */ 
	return n;
	}

        // multipliziert das Ziffernfeld n mit 10
	static int[ ] times10(int[ ] n)          { /* TODO */ 
	return n;
	}
	
	// multipliziert zwei Ziffernfelder	
	static int[ ] times(int[ ]a, int[ ] b)   { /* TODO */ 
	return a;
	}
	
        // Quadratzahl eines Ziffernfeldes
	static int[ ] square(int[ ]a)            { /* TODO */ 
	return a;
	}

    // Kubikzahl eines Ziffernfeldes
	static int[ ] cubic(int[ ]a)             { /* TODO */ 
	return a;
	}
    
    // ist dieses Ziffernfeld ein Palindrom? Bemühen Sie sich um eine Implementation,
    // die ohne ein weiteres Zahlenfeld auskommt !
    static boolean palindrom(int[] a)       { /* TODO */ 
	return true;
	}
	
	// Test auf kleiner-Relation zweier Ziffernfelder: a < b ?
	static boolean less (int[ ] a, int[ ] b) { /* TODO */ 
	return true;
	}

	// Test auf Gleichheit zweier Ziffernfelder
	static boolean equal (int[ ] a, int[ ] b){ /* TODO */ 
	return true;
	}

	// Test auf Korrektheit eines Ziffernfeldes: Feld existiert und enthaelt
    // mindenstens eine Ziffer, alle Positionen liegen zwischen 0 und 9
    // keine fuehrenden Nullen (ausser bei Null selbst) 
	static boolean ok (int[ ] n)             { /* TODO */ 
	return true;
	}

    // gibt die (kleinste) Ziffer mit der groessten Haeufigkeit in n aus
	static void maxDigit(int[] n)            { /* TODO */ 
	return;
	}

	public static void main (String[ ] s) {
  		/*int[] a = One();

		for (int i=0; i<33222; ++i) {
			a = times(a, 2);
		}

		System.out.println("2^33222 hat " + a.length + " Stellen");
		print(a); 
		System.out.println(); 

		int[] b = fromInt(13);
		int[] c = copy(b);
		
		for (int i=1; i<8978; ++i) {
			c=times(c, b);
		}
		
		System.out.println("13^8978 hat " + c.length + " Stellen");
		print(c); 
		System.out.println(); 

		System.out.println(less(a, c)); // beantwortet die Frage aus der Aufgabenueberschrift
                maxDigit(a);
                maxDigit(c);*/
		int[] result= One();
		System.out.println(result[0]);
	}
}

