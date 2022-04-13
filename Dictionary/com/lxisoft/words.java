package com.lxisoft.dictionary;

public class words {
    

    
     private String wordName;
     private String meaning;
     private String partOfSpeech;
     private String sentences;
     
        
     public words() {
     
     }

         public words(String wordName, String meaning, String partOfSpeech, String sentences) {
          this.wordName = wordName;
          this.meaning = meaning;
          this.partOfSpeech = partOfSpeech;
          this.sentences = sentences;
     }


     public String getWordName() {
             return wordName;
         }
     
         
         public void setWordName(String wordName) {
             this.wordName = wordName;
         }
     
      
         public String getMeaning() {
             return meaning;
         }
     
         
         public void setMeaning(String meaning) {
             this.meaning = meaning;
         }
     
        
         public String getPartOfSpeech() {
             return partOfSpeech;
         }
     
         
         public void setPartOfSpeech(String partOfSpeech) {
             this.partOfSpeech = partOfSpeech;
         }
     
         
         public String getSentences() {
             return sentences;
         }
     
         
         public void setSentences(String sentences) {
             this.sentences = sentences;
         }
     




}