package cloud.englert.patterns.structure.decorator;

public class Espresso implements Kaffee {
    @Override
    public String getDescription() {
        return "Espresso";
    }
}
