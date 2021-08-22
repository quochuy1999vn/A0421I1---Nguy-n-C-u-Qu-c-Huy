package cleanCode_refactoring.bai_tap.refactoring;

public class TennisGame {

    public static String getScore(String player1, String player2, int pointPlayer1, int pointPlayer2) {
        String score = "";
        int point = 0;
        if (pointPlayer1 == pointPlayer2) {
            switch (pointPlayer1) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else {
            boolean pointPlayer1GreaterThanOrEqualTo4 = pointPlayer1 >= 4;
            boolean pointPlayer2LessThanOrEqualTo4 = pointPlayer2 >= 4;
            if (pointPlayer1GreaterThanOrEqualTo4 || pointPlayer2LessThanOrEqualTo4) {
                score = checkPlayerWin(pointPlayer1, pointPlayer2);
            } else {
                score = getScorePlayer(pointPlayer1, pointPlayer2, score);
            }
        }
        return score;
    }

    private static String getScorePlayer(int pointPlayer1, int pointPlayer2, String score) {
        int point;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                point = pointPlayer1;
            }else {
                score += "-";
                point = pointPlayer2;
            }
            switch (point) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    private static String checkPlayerWin(int pointPlayer1, int pointPlayer2) {
        String score;
        int result = pointPlayer1 - pointPlayer2;
        if (result == 1) {
            score = "Advantage player1";
        } else if (result == -1) {
            score = "Advantage player2";
        } else if (result >= 2) {
            score = "Win for player1";
        } else {
            score = "Win for player2";
        }
        return score;
    }
}