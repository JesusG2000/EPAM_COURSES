package by.etc.task2.sentence.logic;

import by.etc.task2.sentence.entity.Sentence;
import by.etc.task2.word.entity.Word;

public class SentenceLogic {
    public static String takeSentence(Sentence s){
        Word[]words=s.getWords();
        String  sentence="";
        for (Word word : words) {
            sentence += word.getWord();
        }
      return sentence;
    }
}
