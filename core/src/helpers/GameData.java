package helpers;

public class GameData {
    private int highScore;
    private int coinHighscore;
    private boolean easyDifficulty;
    private boolean mediumDifficulty;
    private boolean hardDifficulty;
    private boolean musicOn;

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public int getCoinHighscore() {
        return coinHighscore;
    }

    public void setCoinHighscore(int coinHighscore) {
        this.coinHighscore = coinHighscore;
    }

    public boolean isEasyDifficulty() {
        return easyDifficulty;
    }

    public void setEasyDifficulty(boolean easyDifficulty) {
        this.easyDifficulty = easyDifficulty;
    }

    public boolean isMediumDifficulty() {
        return mediumDifficulty;
    }

    public void setMediumDifficulty(boolean mediumDifficulty) {
        this.mediumDifficulty = mediumDifficulty;
    }

    public boolean isHardDifficulty() {
        return hardDifficulty;
    }

    public void setHardDifficulty(boolean hardDifficulty) {
        this.hardDifficulty = hardDifficulty;
    }

    public boolean isMusicOn() {
        return musicOn;
    }

    public void setMusicOn(boolean musicOn) {
        this.musicOn = musicOn;
    }
}
