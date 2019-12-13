package com.alpha.testsqlite3;

import java.util.Date;

public class ScoreData {
    //creation des propriete
    private int idScore;
    private String name;
    private int score;
    private Date when_;
    //creation du constructeur ScoreData

    public ScoreData(int idScore, String name, int score, Date when_) {
        this.setIdScore(idScore);
        this.setName(name );
        this.setScore(score);
        this.setWhen_(when_);
    }


    //getter and setter

    public int getIdScore() {
        return idScore;
    }

    public void setIdScore(int idScore) {
        this.idScore = idScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getWhen_() {
        return when_;
    }

    public void setWhen_(Date when_) {
        this.when_ = when_;
    }
    //methode toString

    @Override
    public String toString() {
        return "ScoreData{" +
                "idScore=" + idScore +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", when_=" + when_ +
                '}';
    }
}
