package seatworks;

import java.util.Scanner;

public class Sentence {
	
	static int count;
	
    public static int wordCount(String sentence) {
    	count = 0;
    	sentence.trim();
    	String[] splittedSentence = sentence.split("\\s+");
    	count = splittedSentence.length;
    	return count;
    }
    
    public static int vowelCount(String sentence) {
    	count = 0;
    	sentence = sentence.toLowerCase();
    	String vowels = "aeiou";
    	for(int i = 0; i < sentence.length(); i++) {
    		char currentChar = sentence.charAt(i);
    		if(vowels.indexOf(currentChar) >= 0 ) {
    			count++;
    		}
    	}
    	return count;
    	
    }
    
    public static int consonantCount(String sentence) {
    	count = 0;
    	sentence = sentence.toLowerCase();
    	String consonants = "bcdfghjklmnpqrstvwxyz";
    	for(int i = 0; i < sentence.length(); i++) {
    		char currentChar = sentence.charAt(i);
    		if(consonants.indexOf(currentChar) >= 0 ) {
    			count++;
    		} 
    	}
    	return count;
    }
    
    public static int findLetter(String sentence, String letter) {
    	count = 0;
    	sentence = sentence.toLowerCase();
    	for(int i = 0; i < sentence.length(); i++) {
    		char currentChar = sentence.charAt(i);
    		if(letter.indexOf(currentChar) >= 0) {
    			count++;
    		}
    	}
    	return count;
    }
    
    public static int numberCount(String sentence) {
    	count = 0;
    	String numbers = "0123456789";
    	for(int i = 0; i < sentence.length(); i++) {
    		char currentChar = sentence.charAt(i);
    		if(numbers.indexOf(currentChar) >= 0) {
    			count++;
    		}
    	}
    	return count;
    }
    
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a sentence: ");
		String sentence = sc.nextLine();
		System.out.print("Please enter a vowel: ");
		String letter = sc.nextLine();
		System.out.println("Length of sentence: " + sentence.length());
		System.out.println("Words: " + Sentence.wordCount(sentence));
		System.out.println("Vowels: " + Sentence.vowelCount(sentence));
		System.out.println("Consonants: " + Sentence.consonantCount(sentence));
		System.out.println("Number of times " + letter + " was found: " + Sentence.findLetter(sentence, letter));
		System.out.println("Numbers: " + Sentence.numberCount(sentence));
		
		
		
	}
}
