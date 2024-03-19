package dev.stephen;

public class Grader {
    public char determineGrade(int score){
        if (score < 0 || score > 100){
            throw new IllegalArgumentException("Number not valid to grade");
        } else if (score < 60) {
            return 'F';
        } else if (score < 70) {
            return 'D';
        } else if (score < 80) {
            return 'C';
        } else if (score < 90) {
            return 'B';
        }
        else {
            return 'A';
        }
    }
}
