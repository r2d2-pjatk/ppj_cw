package zadanie12;

import java.util.Arrays;

public class Main {
    static void main() {
        String[][] arr = {
            {"Germany",  "2", "Scotland", "1"},
            {"Poland",   "2", "Germany",  "0"},
            {"Germany",  "1", "Ireland",  "1"},
            {"Poland",   "2", "Scotland", "2"},
            {"Scotland", "1", "Ireland",  "0"},
            {"Ireland",  "1", "Poland",   "1"},
            {"Ireland",  "1", "Scotland", "1"},
            {"Germany",  "3", "Poland",   "1"},
            {"Scotland", "2", "Germany",  "3"},
            {"Ireland",  "1", "Germany",  "0"},
            {"Scotland", "2", "Poland",   "2"},
            {"Poland",   "2", "Ireland",  "1"}
        };
        
        String[] teams = {"Germany", "Ireland", "Poland", "Scotland"};
        int[] totalPointsPerTeam = new int[teams.length];
        
        for (int i = 0; i < teams.length; i++) {
            totalPointsPerTeam[i] = getPoints(arr, teams[i]);
        }
        
        System.out.println(Arrays.toString(totalPointsPerTeam));
    }
    
    public static int getPoints(String[][] results, String team) {
        int sumOfPoints = 0;
        
        for (int i = 0; i < results.length; i++) {
            String homeTeam = results[i][0];
            String awayTeam = results[i][2];
            boolean isHomeTeam = homeTeam.equals(team);
            boolean isAwayTeam = awayTeam.equals(team);
            
            if (!(isAwayTeam || isHomeTeam))
                continue;
            
            int homeTeamScore = Integer.parseInt(results[i][1]);
            int awayTeamScore = Integer.parseInt(results[i][3]);
            boolean homeTeamWon = homeTeamScore > awayTeamScore;
            boolean awayTeamWon = homeTeamScore < awayTeamScore;
            boolean draw = homeTeamScore == awayTeamScore;
            
            if ((isHomeTeam && homeTeamWon) || (isAwayTeam && awayTeamWon)) {
                sumOfPoints += 3;
            } else if (draw) {
                sumOfPoints += 1;
            }
        }
        
        return sumOfPoints;
    }
    
}
