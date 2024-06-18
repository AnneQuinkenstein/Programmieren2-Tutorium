package tennis;

public class TennisGameImpl implements TennisGame {
    int pointsPlayer1;
    int pointsPlayer2;
    String player1Name;
    String player2Name;

    public TennisGameImpl(String player1, String player2) {
        this.pointsPlayer1 = 0;
        this.pointsPlayer2 = 0;
        this.player1Name = player1;
        this.player2Name = player2;
    }

    @Override
    public void wonPoint(String playerName) {
        //Punkte der Spielerin playerName hochzählen um 1;
        if (playerName.equals(player1Name)){
            pointsPlayer1++;
        }
        if(playerName.equals(player2Name)){
            pointsPlayer2++;
        }
    }

    @Override
    public String getScore() {
        int pointsDistance = Math.abs(pointsPlayer1 - pointsPlayer2);
        if (pointsPlayer1 == pointsPlayer2) {
            if (pointsPlayer1 == 0){
                return "Love-All";
        }
        if (pointsPlayer1 == 1) {
            return "Fifteen-All";
        }
        if (pointsPlayer1 == 2) {
            return "Thirty-All";
        }
        return "Deuce";
    }

        if(pointsPlayer1 >= 4 || pointsPlayer2 >= 4){
            if(pointsDistance >= 2){
                boolean player1Won = pointsPlayer1 > pointsPlayer2;
                return "Win for " + (player1Won ? player1Name : player2Name);
            }
            else{
                boolean player1Won = pointsPlayer1 > pointsPlayer2;
                return "Advantage " + (player1Won ? player1Name : player2Name);
            }

        }
        String expressionPlayer1 = "";
       switch (pointsPlayer1) {
            case 0 -> expressionPlayer1 = "Love";
            case 1 -> expressionPlayer1 = "Fifteen";
            case 2 -> expressionPlayer1 = "Thirty";
            case 3 -> expressionPlayer1 = "Forty";

       }
        String expressionPlayer2 = "";
        switch (pointsPlayer2) {
            case 0 -> expressionPlayer2 = "Love";
            case 1 -> expressionPlayer2 = "Fifteen";
            case 2 -> expressionPlayer2 = "Thirty";
            case 3 -> expressionPlayer2 = "Forty";
        }

        return expressionPlayer1 + "-" + expressionPlayer2;



        //Wenn die Punkte > 3 sind und mind. 2 Punkte Abstand sind

        //Wenn die Punkte
        //Wenn die Punkte = 0 sind
}
}

