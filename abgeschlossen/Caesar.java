public class Caesar {
	public static void main(String[] args) {
		try {
			int k = Integer.parseInt(args[0]); //try to convert the first part of the input string to an integer and assign it to the variable k
			
			//start a loop that goes through each element of args and skips k (it goes through each 'message')
			for(int i = 1; i < args.length; i++){

				char[] characters = args[i].toCharArray(); //after each loop the 'characters' array will reset to only contain the characters of the current 'message'
				//start a loop to go through each character of a given message
				for(int j = 0; j < characters.length; j++){
					
					//go into the following descision tree to descide how to manipulate the character
					if(characters[j] >= 'a' && characters[j] <= 'z'){	//if the character is between or equal to 'a' and 'z' go into the Lowercase branch
						characters[j] += k; //apply the ceasar cypher by shifting the character by k integers
							if(characters[j] > 'z'){ //if the character is shifted out of bounds by the cypher to the positive direction
								characters[j] -= 26; //subtract 26 to go back to the beginning of the alphabet
								System.out.print(characters[j]); // and then print the character
							} else if(characters[j] < 'a') { //do exactly the same if the character is shifted out of bounds to the negative direction
								characters[j] += 26;		 //but ofcourse add 26 to get back to the end of the alphabet
								System.out.print(characters[j]);
							} else {
								System.out.print(characters[j]); //if the character is not shifted out of bounds at all, print the character as is
							}

					} else if (characters[j] >= 'A' && characters[j] <= 'Z'){ //if the character is between or equal to 'A' and 'Z' go into the Uppercase branch 
																			  //all steps in this tree are identical to the lowercase branch thus full notes are not needed
						characters[j] += k; //ceasar chyper
						if(characters[j] > 'Z'){ //check out of bounds
								characters[j] -= 26; //shift to correct bounds
								System.out.print(characters[j]); //print corrected character
							} else if(characters[j] < 'A') { //repeat for lower bounds
								characters[j] += 26;
								System.out.print(characters[j]);
							} else {
								System.out.print(characters[j]); //leave character as is when not out of bounds
							}
					} else {System.out.print(characters[j]); } //if the character is not an uppc. or lowc. letter of the alphabet, print as is

				}
				System.out.println(); //skip a line to print all messages/input strings on a seperate line
			}
			
			
			
			
			
			
			} catch (Exception e) { //If it is not possible to convert the first part of the input string to an integer, ask the user to change the input 
				System.out.println("please input an integer as the first part of your input");
		}
	}
}
