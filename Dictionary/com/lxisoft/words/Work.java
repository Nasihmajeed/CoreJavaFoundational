package com.lxisoft.words;

import com.lxisoft.dictionary.Words;
import com.lxisoft.types.Verb;

public class Work  extends Words implements Verb{

     public Work(String wordName, String meaning, String partOfSpeech, String sentences) {
          super(wordName, meaning, partOfSpeech, sentences);
     }
     
}