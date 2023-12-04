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

        long max = Long.MAX_VALUE;
        long N;
        long R;
        long S;
        
        //working-conditions
        if (args.length <= 0 ) { 
            System.out.println("Bitte geben Sie die Obergrenze als Parameter an.");
            System.exit(-1);
        } 
        
        long A = Long.parseLong(args[0]); //we can only parse the args array after we have made sure that it has length greater than zero

        if (A > 100000) {
            System.out.println("Bitte geben Sie maximal 100000 als Obergrenze an.");
            System.exit(-1);
        }

        for (int i = 1; i <= A; i++){
            //i will be substituted for N in this loop
            N = i; //set the starting value of n equal to i
            R = Rev(N); //R is the reverse of N
            S = N + R; // S is the sum of N and R
            

            while(N < max - R){ //while the sum R + N yields a number smaller than the max value of a long cycle through the algorithm

                if(S == Rev(S)){//if S is a palindrome, break the algorithm and continue to the next i
                    break;

                } else { // if S is not a palindrome,  go through the algorithm again but update N to be equal to the previous S
                    N = S;
                    R = Rev(N);
                    S = N + R;
                }
            }

        //the above while loop can be broken for two reasons, either S > long.max or S is a palindrome. We want to print out i when the loop is broken for the former reason.
        if(S != Rev(S)){ //to exclude the latter we use this conditional
            System.out.println(i); //when S is not a palindrome and the while loop is broken, there must not exist a calculable palindrome.
        }
            
        }
    } 
}