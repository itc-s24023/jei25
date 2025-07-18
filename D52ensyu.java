import org.w3c.dom.ls.LSOutput;

public class D52ensyu {
    public static void main(String[] args) {
        Animal tama = new Cat();
        tama.bark();
    }
}
class Animal {
    public void bark(){
        System.out.println("なにかの動物の鳴き声");
    }
}
class Cat extends Animal {
    public void bark(){
        System.out.println("にゃー");
    }
}
