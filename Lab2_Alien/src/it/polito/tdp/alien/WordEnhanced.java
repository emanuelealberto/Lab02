package it.polito.tdp.alien;

import java.util.*;

public class WordEnhanced {
	private String alienWord;
	private List<String> traduzioni = new LinkedList<String>();
	
	public WordEnhanced(String alienWord) {
		super();
		this.alienWord = alienWord;
		
	}

	public String compare(String alienWord){
		if (this.alienWord.compareTo(alienWord)==0)
			return alienWord;
		return null;
		
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public void addWord(String translation) {
		this.traduzioni.add(translation);
	}

	public String getAlienWord() {
		return alienWord;
	}

	public String getTranslation() {
		String risultato="";
		for (String s : traduzioni){
			risultato+=s+" ";
		}
		return risultato;
	}
	
}
