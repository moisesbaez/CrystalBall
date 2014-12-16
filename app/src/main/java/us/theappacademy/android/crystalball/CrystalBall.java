package us.theappacademy.android.crystalball;

public class CrystalBall {

    public static CrystalBall crystalBall;
    private String[] answers;

    private CrystalBall() {
        answers = new String[]{
                "It will happen",
                "It won't happen",
                "Seems hazy",
                "Better not tell you now or you'll regret it"
        };
    }

    public static CrystalBall get() {
        if(crystalBall == null) {
            crystalBall = new CrystalBall();
        }
        return crystalBall;
    }

    public String getAnswer() {
        return answers[3];
    }
}
