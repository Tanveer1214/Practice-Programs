package com.hibernate.onetomany;

import jakarta.persistence.*;

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int AnsId;
    private String ans;
    @ManyToOne
    private Question question;

    public Answer() {
    }

    public Answer( String ans, Question question) {
        this.ans = ans;
        this.question = question;
    }

    public int getAnsId() {
        return AnsId;
    }

    public void setAnsId(int ansId) {
        AnsId = ansId;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "AnsId=" + AnsId +
                ", ans='" + ans + '\'' +
                ", question=" + question +
                '}';
    }
}
