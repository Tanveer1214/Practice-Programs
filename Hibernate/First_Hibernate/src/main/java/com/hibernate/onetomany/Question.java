package com.hibernate.onetomany;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Qid;
    private String question;
    @OneToMany(mappedBy = "question")
    private List<Answer> answer;

    public Question() {
    }

    public Question(String question, List<Answer> answer) {
        this.question = question;
        this.answer = answer;
    }

    public int getQid() {
        return Qid;
    }

    public void setQid(int qid) {
        Qid = qid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "Qid=" + Qid +
                ", question='" + question + '\'' +
                ", answer=" + answer +
                '}';
    }
}
