public class Looping {
//function that returns the number A in reverse               
    static long Rev(long A){ 
        long B = 0;
        while (A != 0) {
            long lastDigit = A % 10; // get last digit of A
            B = B * 10 + lastDigit; // Add the last digit to B and digit shift the previous value of B
            A = A / 10; // remove the last digit from A
        }
        return B;
    }
    public static void main(String[] args) {
        long N = 1066;//Long.parseLong(args[0]);
        long A = N;
        
//working-conditions
        if (args.length <= 0 ) { 
            System.out.println("Bitte geben Sie die Obergrenze als Parameter an.");
            System.exit(-1);
        }
        else if (N > 100000) {
            System.out.println("Bitte geben sie maximal 100000 als Obergrenze an.");
            System.exit(-1);
        }

        long max = Long.MAX_VALUE;
        for (long N = Long.parseLong(args[0]); N > 0; N--){
            for (...)
	        long S = N + Rev(N);
            System.out.println(N);
	        if(S != Rev(S) && N > max - Rev(N)){
		        System.out.println(N);
            }
        } 
    }
}

 /*    
            // System.out.println(Rev(N));
            // System.out.println(max);

zunächst davon ausgehen, dass eine Zahl, die nach 100 Iterationen noch kein Palindrom erzeugt hat, 
vermutlich die geforderte Eigenschaft besitzt

/*exit-condition
if (N > max-Rev) {
    System.out.println();}*/
           
                // iterate
            // }
            // N = N1 + R
            
            // + " Originalzahl: " + N1 + " N: " + N);
            //N = N + R;
            //iterations2++;
            
            //System.out.println("Umgekehrte Zahl: " + R + " Originalzahl: " + N1 + " N: " + N); 
            //while (R != N1 && iterations2 < 3);

            // System.out.println("Umgekehrte Zahl: " + R);
            // + " Originalzahl: " + N1 + " N: " + N);
        // }
        
    




    


