package good;

public class Greeter {
    private good.Personality personality;

    public Greeter(good.Personality personality) {
        this.personality = personality;
    }

    public String greet() {
        return this.personality.greet();
    }
}