package com.learning.core.day2session2;

public class CricketRating {
    String playername;
    float critic1;
    float critic2;
    float critic3;
    float avgRating;
    String coins;

    public CricketRating() {
    }

    public CricketRating(String playername, float critic1, float critic2, float critic3) {
        this.playername = playername;
        this.critic1 = critic1;
        this.critic2 = critic2;
        this.critic3 = critic3;

    }

    void claculateAverageRating(float c1) throws NotEligibleException{
        float average = (c1)/1;
        avgRating = average;
        if (average >= 7){
            coins = "gold";
        } else if (average >= 5) {
            coins = "silver";
        } else if (average >= 2) {
            coins = "copper";
        } else if ((average < 2)) {
            throw new NotEligibleException("Not Eligible");
        }
    }

    void claculateAverageRating(float c1, float c2) throws NotEligibleException{
        float average = (c1 + c2)/2;
        avgRating = average;
        if (average >= 7){
            coins = "gold";
        } else if (average >= 5) {
            coins = "silver";
        } else if (average >= 2) {
            coins = "copper";
        } else if ((average < 2)) {
            throw new NotEligibleException("Not Eligible");
        }
    }

    void claculateAverageRating(float c1, float c2, float c3) throws NotEligibleException{
        float average = (c1 + c2 + c3)/3;
        avgRating = average;
        if (average >= 7){
            coins = "gold";
        } else if (average >= 5) {
            coins = "silver";
        } else if (average >= 2) {
            coins = "copper";
        } else if ((average < 2)) {
            throw new NotEligibleException("Not Eligible");
        }
    }

    String claculateCoins(){
        return coins;
    }

    void display(){
        System.out.println(playername);
        System.out.println(coins);
        System.out.println(avgRating);
    }
}
