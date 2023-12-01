public class GGT {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
//Setze m=a und n=b
        int m = a;
        int n = b;
//Prüfe, ob die beiden als Argumente übergebenen Zahlen echt positiv (also > 0) sind
        if (m <= 0 || n <= 0) {
            System.out.println("nur positive ganze Zahlen als Argumente erlaubt");
            System.exit(-1);
        }

        do {
// Ist m<n, so vertausche m und n
         if (m < n) {
            int temp = m;
            m = n;
            n = temp;}
//Berechne r=m−n
            int r = m - n;
//Setze m=n und n=r
            m = n;
            n = r;
//Ist r≠0, so fahre fort mit Schritt 2
        } while (r != 0);

//Ausgabe: ggT
        System.out.println("ggT(" + a + ", " + b + ") = " + m);
    }
}
