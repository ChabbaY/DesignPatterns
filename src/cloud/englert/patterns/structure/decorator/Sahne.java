package cloud.englert.patterns.structure.decorator;

public class Sahne extends Decorator {
    public Sahne(Kaffee kaffee) {
        super(kaffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " mit Sahne";
    }
}
