package AbstractClass;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I am not very good at taht, can I go for a swim instead?");
    }
}
