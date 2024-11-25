package java8to11.src.main.java.me.whiteship.java8to11;

public interface Foo {

    void printName();

    default void printNameUpperCase(){
        System.out.println(getName().toUpperCase());

    };


    String getName();

    static void printAnything(){
        System.out.println("Foo");
    };

}
