package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {

	List<WordEnhanced> dizionario = new LinkedList<WordEnhanced>();
	
	public void addWord(String alienWord, String translation){
		boolean flag = false;
		for (WordEnhanced w : dizionario){
			if(w.compare(alienWord)!=null){
				w.addWord(translation);
				flag = true;
			}
		}
		if (flag == false){
		WordEnhanced temp = new WordEnhanced(alienWord);
		temp.addWord(translation);
		dizionario.add(temp);
		}
	}
	
	public String translateWord(String alienWord){
		for (WordEnhanced w : dizionario){
			if(w.getAlienWord().compareTo(alienWord)==0){
				return w.getTranslation();
			}
		}

		return "Traduzione non trovata";}
		
	}

