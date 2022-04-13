package com.lxisoft.dictionary;


import com.lxisoft.repo.FileRepo;
public class Dictionary {
     private String wordName;
     private String meaning;



  public Dictionary() {
    
     }

     public Dictionary(String wordName, String meaning) {
          this.wordName = wordName;
          this.meaning = meaning;
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


      public  void printMeaning(){
     
FileRepo repo = new FileRepo();

repo.createFile();

for(Words word : repo.readFile()){  
     //body of for-each loop  
     }  
     }

}
