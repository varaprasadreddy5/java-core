package com.learning.core.day2session2;

public class CricketRatingTest {
    public static void main(String[] args){
        String playername = "john";
        float critic1 = 9.30f;
        float critic2 = 9.67f;
        float critic3 = 8.7f;

        CricketRating cr = new CricketRating(playername,critic1,critic2,critic3);
        try {
            cr.claculateAverageRating(critic1);
            cr.display();
            System.out.println(cr.claculateCoins());
        }
        catch (NotEligibleException n){
            System.out.println(n.getMessage());
        }

    }
}
