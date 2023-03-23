public class Cat {
    // properties
    private String name;
    private int age;
    private String color;
    
    // constructor
    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    
    // methods
    public void meow() {
        System.out.println("Meow!");
    }
    
    public void sleep() {
        System.out.println("Zzzz...");
    }
    
    public void eat(String food) {
        System.out.println("Yum, I love " + food + "!");
    }
}