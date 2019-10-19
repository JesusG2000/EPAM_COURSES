package by.etc.task2;

import by.etc.task2.entity.Sentence;
import by.etc.task2.entity.Text;
import by.etc.task2.logic.TextLogic;
import by.etc.task2.entity.Word;

public class TextTest {
    public static void main(String[] args) {
        Word[] words;
        Sentence[] sentences;
        Text text;

        sentences = new Sentence[3];

        for (int i = 0; i < sentences.length; i++) {
            words = new Word[4];
            for (int y = 0; y < words.length; y++) {
                words[y] = new Word(i + y + "");
            }
            sentences[i] = new Sentence(words);
        }

        text = new Text(sentences, "My text");
        TextLogic textLogic =new TextLogic();


        textLogic.add(new Word[]{new Word("hi"),new Word("Mark")},text);
        System.out.println(textLogic.takeText(text));
        System.out.println(text.getHead());
    }
}
