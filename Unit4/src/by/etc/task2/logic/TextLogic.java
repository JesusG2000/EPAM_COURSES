package by.etc.task2.logic;

import by.etc.task2.entity.Sentence;
import by.etc.task2.entity.Text;
import by.etc.task2.entity.Word;

public class TextLogic {

    public  String takeText(Text text){
        Sentence[] sentences=text.getSentences();
        SentenceLogic logic=new SentenceLogic();
        String  fullTest;
        fullTest=text.getHead();
        for (Sentence s : sentences) {
            fullTest += "\n" + logic.takeSentence(s);
        }
        return fullTest;
    }
    public  void add(Word[] words , Text text){
        Sentence sentence =new Sentence(words);
        Sentence[] fullText=text.getSentences();
        Sentence[] allSentence= new Sentence[text.getSentences().length+1];

        for(int i=0 ;i<allSentence.length-1;i++){
            allSentence[i]=fullText[i];
        }
        allSentence[allSentence.length-1]=sentence;
        text.setSentences(allSentence);
    }
}
