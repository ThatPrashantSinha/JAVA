public class challenge3 {

    public static void displayHighScorePosition(String playerName, int playerPostion) {
        System.out.print(playerName + "managed to get postion "+ playerPostion +" on the high score list."+ "\n");    
    }
    public static int calcutateHighScorePositon(int playerScore) {
        int finalScore=4;
        if (playerScore>= 1000){
            finalScore=1;
        }else if (playerScore>= 500){
            finalScore=2;
        }else if(playerScore>=100){
            finalScore=3;
        }
        return finalScore;
    }
    public static void main(String[] args) {
        displayHighScorePosition("prash", calcutateHighScorePositon(1500));
        displayHighScorePosition("eshont", calcutateHighScorePositon(1000));
        displayHighScorePosition("abhi9", calcutateHighScorePositon(500));
        displayHighScorePosition("kritik", calcutateHighScorePositon(100));
        displayHighScorePosition("arush", calcutateHighScorePositon(25));
    }
}
