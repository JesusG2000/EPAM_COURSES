package by.etc.task2.entity;

import by.etc.task2.entity.Sentence;

import java.util.Arrays;
import java.util.Objects;

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

    public Sentence getSentence(int index){return sentences[index];}

    public void setSentence(Sentence sentence ,int index){sentences[index]=sentence;}

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Arrays.equals(sentences, text.sentences) &&
                Objects.equals(head, text.head);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(head);
        result = 31 * result + Arrays.hashCode(sentences);
        return result;
    }
}
