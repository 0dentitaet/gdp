public class Wuerfel {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]); //Würfelseiten
		int k = Integer.parseInt(args[1]); //gesuchte Gewinnfolge
		long s = Long.parseLong(args[2]); //Anzahl der Spiele
		int streak = 0; //Länge der Gewinnfolge 
		int wins = 0; //Anz. der Streaks
		//für jeden Wurf eine Zufallszahl rdm generieren. Mit n multiplizieren um für n Seiten testen zu können.
		for (long i=0; i<s; i++){
			double rdm = Math.random()*n;
			//um 1 erhöhen und mit TypeCasting in Integer rdi umwandeln
			rdm++;
			int rdi = (int)rdm;
			//Wenn rdi=n ist, die Streak um 1 erhöhen.			
			if (rdi == n) {
				streak++;
				//Wenn die Streak k erreicht hat, Gewinn um 1 erhöhen und Streak zurücksetzen. 
				if (streak == k) {
					wins++;
					streak = 0;
				}
			// Wenn rdi nicht n erreicht, Streak zurücksetzen.
			} else {
			streak=0;
			}
  		 }
		//Anz. Spiele geteilt durch Anz. Gewinnserien um die durchschnittlich benötigte Wurfzahl zu berechnen.
		double p = (1d*s/wins);
		System.out.println(p);
	}
}
/* für N=6 und K=2 nähert sich der Wert an 42 an. Selbst mit 9 Nullstellen (bei langer Rechendauer)
gibt es abweichende Werte mit 41.9 und 42.0*/
