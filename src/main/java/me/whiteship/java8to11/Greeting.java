package java8to11.src.main.java.me.whiteship.java8to11;

public class Greeting {

    private String name;

    public Greeting(){

    }
   //생성자를 호출 할 때, 리턴값은 객체의 타입이다.

    public Greeting(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String hello(String name){
        return "hello"+ name;
    }

    public static String hi(String name){
        return "hi" + name;
    }

}
