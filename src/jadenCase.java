/*
Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013). 
Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter, 
he is known for almost always capitalizing every word.

Your task is to convert strings to how they would be written by Jaden Smith. Note that the Java version expects 
a return value of null for an empty string or null.
*/ 

public class JadenCase {
	public static String toJadenCase(String str) {
		String result = "";
		String capitalized = "";
		if (str == null || str.isEmpty())
			return null;
		// First, split the words in the given string by space and store them in
		// an array.
		String[] words = str.split("\\s+");
		for (int i = 0; i < words.length; i++) {
			// Second, capitalize each word in the array.
			capitalized = words[i].substring(0, 1).toUpperCase();
			// Finally, concatenate the capitalized word with the result.
			if (i == words.length - 1) { // avoid adding extra whitespace if this is the last word
				result += capitalized + words[i].substring(1, words[i].length());
			} else {
				result += capitalized + words[i].substring(1, words[i].length()) + " ";
			}
		}
		return result;
	}
}
