package cloud.englert.patterns.behaviour.templatemethod;

public abstract class Template {
    public void templateMethod() {
        System.out.print("Wer ");
        operation1();
        System.out.print(" sagt, muss auch ");
        operation2();
        System.out.println(" sagen.");
    }

    public abstract void operation1();
    public abstract void operation2();
}
