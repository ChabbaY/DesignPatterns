package decorator;

public class Decorator implements Kaffee {
    private final Kaffee kaffee;

    public Decorator(Kaffee kaffee) {
        this.kaffee = kaffee;
    }

    @Override
    public String getDescription() {
        return kaffee.getDescription();
    }
}
