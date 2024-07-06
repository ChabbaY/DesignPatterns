package cloud.englert.patterns.creation.builder;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("World!");
        System.out.println(sb.build());
    }
}
