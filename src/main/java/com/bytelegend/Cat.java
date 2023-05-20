class Cat {
    private final String name;
    private int age;
    public Cat(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}
