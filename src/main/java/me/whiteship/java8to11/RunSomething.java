package src.main.java.me.whiteship.java8to11;

@FunctionalInterface  // 자바 스탠다드 라이브러리에 들어있다. 함수형 메소드 선언.
public interface RunSomething {
            //추상 메소드가 하나만 있으면 그게 함수형 인터페이스다.
//     void  doIt();  //abstract는 생략이 가능하다.
                    //추상 메소드가 한 개라면

    int  doIt(int number);  //abstract는 생략이 가능하다.
    //추상 메소드가 한 개라면

/*
    public static void printName(){
        System.out.println("Keesun");
    }

    default void pringAge(){
        System.out.println("40");
    }
*/
//    void doAgain();     얘가 생기면 에러가 나온다.

}
