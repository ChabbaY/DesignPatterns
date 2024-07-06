package cloud.englert.patterns.structure.adapter;

public class MathAdapter implements Math {
    @Override
    public int maximum(int... values) {
        var result = values[0];
        for (int i = 1; i < values.length; i++) {
            result = java.lang.Math.max(result, values[i]);
        }
        return result;
    }
}
