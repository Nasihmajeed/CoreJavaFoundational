package com.lxisoft.dictionary;

public class Words extends Dictionary{
    

     private String partOfSpeech;
     private String sentences;

        public Words(String partOfSpeech, String sentences) {
        this.partOfSpeech = partOfSpeech;
        this.sentences = sentences;
    }

        public Words(String wordName, String meaning, String partOfSpeech, String sentences) {
        super(wordName, meaning);
        this.partOfSpeech = partOfSpeech;
        this.sentences = sentences;
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