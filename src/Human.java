abstract class Human {
    abstract void eat();
    abstract void walk();
    void breathing() {
        System.out.println("Breathing!");
    }
}
class Man extends Human {
    @Override
    void eat() {
        System.out.println("Anything Eat!");
    }

    @Override
    void walk() {
        System.out.println("Any Kind Of Walk!");
    }

    @Override
    void breathing() {
        super.breathing();
        System.out.println("Lab...Dab...!");
    }
}
class LR extends Man {
    @Override
    void breathing() {
        super.breathing();
        System.out.println("LR Breathing!");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Eating Foods!");
    }

    @Override
    void walk() {
        super.walk();
        System.out.println("Running!");
    }
}
class Running {
    public static void main(String[] args) {
        Human h = new Man();
        Human h1 = new LR();
        Man m = new LR();
        h.eat();
        h.walk();
        h.breathing();
        h1.eat();
        h1.walk();
        h1.breathing();
        m.eat();
        m.walk();
        m.breathing();
    }
}