package by.etc.task2.text.logic;

import by.etc.task2.sentence.entity.Sentence;
import by.etc.task2.sentence.logic.SentenceLogic;
import by.etc.task2.text.entity.Text;
import by.etc.task2.word.entity.Word;

public class TextLogic {

    public static String takeText(Text text){
        Sentence[] sentences=text.getSentences();
        String  fullTest;
        fullTest=text.getHead();
        for (Sentence s : sentences) {
            fullTest += "\n" + SentenceLogic.takeSentence(s);
        }
        return fullTest;
    }
    public static void add(Word[] words , Text text){
        Sentence sentence =new Sentence(words);
        Sentence[] fullTExt=text.getSentences();
        Sentence[] allSentence= new Sentence[text.getSentences().length+1];

        for(int i=0 ;i<allSentence.length-1;i++){
            allSentence[i]=fullTExt[i];
        }
        allSentence[allSentence.length-1]=sentence;
        text.setSentences(allSentence);
    }
}
