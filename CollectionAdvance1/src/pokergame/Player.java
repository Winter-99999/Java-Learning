package pokergame;

public class Player {
    public Player() {
    }

    public Player(String name, String stage) {
        this.name = name;
        this.stage = stage;
    }

    private  String name;
    private  String stage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }
}
