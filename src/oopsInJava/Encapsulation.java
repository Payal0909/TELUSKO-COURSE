package oopsInJava;

class Human{
    String name;
    int age;

    public String getName() {
        return name;
    }
// this keyword is used to differentiate between a local and instance variable
// and refer to current object
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {

//        Encapsulation is the method of binding the data inside methods to ensure privacy
//        i.e. making instance variable private
          Human human =new Human();
          human.setAge(11);
          human.setName("Payal");
        System.out.println(human.getAge());
        System.out.println(human.getName());
    }
}
