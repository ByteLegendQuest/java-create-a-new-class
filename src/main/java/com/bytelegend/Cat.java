public class Cat {
    private String name;
    private int age;
    // 构造函数
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 获取名字
    public String getName() {
        return name;
    }
    // 设置名字
    public void setName(String name) {
        this.name = name;
    }
    // 获取年龄
    public int getAge() {
        return age;
    }
    // 设置年龄
    public void setAge(int age) {
        this.age = age;
    }
    // 自我介绍方法
    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}
