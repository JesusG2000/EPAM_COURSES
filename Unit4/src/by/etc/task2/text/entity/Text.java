package by.etc.task2.text.entity;

import by.etc.task2.sentence.entity.Sentence;

import java.util.Arrays;

public class Text {
    private Sentence[] sentences;
    private String head;

    public Text(Sentence[] sentences, String head) {
        this.sentences = sentences;
        this.head = head;
    }

    public Sentence[] getSentences() {
        return sentences;
    }

    public void setSentences(Sentence[] sentences) {
        this.sentences = sentences;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "Text{" +
                "sentences=" + Arrays.toString(sentences) +
                ", head='" + head + '\'' +
                '}';
    }
}
