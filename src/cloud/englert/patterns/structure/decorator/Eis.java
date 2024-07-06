package cloud.englert.patterns.structure.decorator;

public class Eis extends Decorator {
    public Eis(Kaffee kaffee) {
        super(kaffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " mit Eis";
    }
}
