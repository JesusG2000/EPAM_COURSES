package by.etc.task2.logic;

import by.etc.task2.entity.Sentence;
import by.etc.task2.entity.Word;

public class SentenceLogic {
    public  String takeSentence(Sentence s){
        Word[]words=s.getWords();
        String  sentence="";
        for (Word word : words) {
            sentence += word.getWord();
        }
      return sentence;
    }
}
