package by.etc.task2;

import by.etc.task2.sentence.entity.Sentence;
import by.etc.task2.text.entity.Text;
import by.etc.task2.text.logic.TextLogic;
import by.etc.task2.word.entity.Word;

public class TextTest {
    public static void main(String[] args) {
        Word[] words;
        Sentence[] sentences = new Sentence[3];
        Text text;

        for (int i = 0; i < sentences.length; i++) {
            words = new Word[4];
            for (int y = 0; y < words.length; y++) {
                words[y] = new Word(i + y + "");
            }
            sentences[i] = new Sentence(words);
        }
        text = new Text(sentences, "My text");
        TextLogic.add(new Word[]{new Word("hi"),new Word("Mark")},text);
        System.out.println(TextLogic.takeText(text));
        System.out.println(text.getHead());
    }
}
