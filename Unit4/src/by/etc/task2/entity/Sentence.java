package by.etc.task2.entity;

import java.util.Arrays;

public class Sentence {
    private Word[] words;

    public Sentence(Word[] words) {
        this.words = words;
    }

    public Word[] getWords() {
        return words;
    }

    public Word getWord(int index){return words[index];}

    public void setWord(Word word ,int index){words[index]=word;}

    public void setWords(Word[] words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "words=" + Arrays.toString(words) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Arrays.equals(words, sentence.words);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(words);
    }
}
