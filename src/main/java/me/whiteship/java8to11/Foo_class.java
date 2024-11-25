package src.main.java.me.whiteship.java8to11;

import java.util.function.*;

public class Foo_class {

    public static void main(String[] args){
        //람다 표현식 시작


        Foo_class foo = new Foo_class();
        foo.run();


    }

    private void run() {
        int baseNumber = 10;  //

        IntConsumer printInt = (i) -> System.out.println(i+baseNumber);
        //이때이 변수 참조하고 있는 로컬 variabel(baseNumber)이 캡쳐가 된다.
        //변수 캡처라는 기능은 사실 익명 클래스나 내부 클래스에서도 쓰이던 개념이다.

        //baseNumber는 앞의 final이 생략이 된 상황이다.
        // 아래 익명클래스나, 로컬 클래스, 람다에서 변수를 참조하기 위해서는 언제나 final로 선언이 되어 있어야 한다.


        printInt.accept(100);


        class LocalClass{  // 이런 식으로 만드는게 로컬 클래스
            void printBaseNumber(){
                int baseNumber = 11;
                System.out.println(baseNumber);  //11 로 나온다.
                //같은 이름이지만 여기 있는 스코어 위 이 뒤에 있던 스콕들을 다 가린다.
            }

        }


        Consumer<Integer> integerConsumer = new Consumer<Integer>() { // 이런식으로 만드는게 익명클래스
            @Override
            public void accept(Integer baseNumber) {
                System.out.println(baseNumber);  //익명클래스에서 local variable참조하는거다.
            }
        };



    }




    /*{


        Function<Integer,Integer> plus11 = (i) -> i+10;

        Function<Integer, Integer> multiply2 = (i) -> i*2;
        //해석하자면 i를 인자로 받아서 2배로 리턴하겠다.

        Function<Integer, Integer> multiply2AndPlus10 = plus11.compose(multiply2);

        System.out.println(multiply2AndPlus10.apply(2));
        //plus11.compose(multiply2)
        //매개변수로 들어간 2가 multiply2를 돌고 나오고. 그 나온값으로 plus11에 들어가게 된다.

        //Higher-Order-Function의 성격으로 함수를 매개변수로 넘겼다.
        //+10의 compose (x2) 를 한다는 의미이다.
        //compose가 입력값을 가지고 뒤에 오는 함수를 적용한다. 그 결과값을 plus11의 입력값으로 사용한다.
        //함수가 두 개가

        System.out.println(plus11.andThen(multiply2).apply(2));
        //plus11 function에 들어가서 나온 값을 가지고 multiipl2로 넘긴다.



        System.out.println(plus11.apply(1));

        System.out.println(multiply2.apply(2));


        Consumer<Integer> printT = (i) -> System.out.println(i);  //리턴값이 없다.
        printT.accept(10);



        Supplier<Integer> get10 = () ->  10; //내가 입력해주는 값이 없다. 그렇기 때문에 인자를 줄 필요가 없다.
        System.out.println(get10);  //무조건 10만 찍힌다.


        Predicate<String> startWithKeesun = (s) -> s.startsWith("keesun");   //어떤 인자값을 받아서 "keesun"이라고 시작을 하는지 검사하고, true/false를 반환한다.

        Predicate<Integer> isOdd = (i) -> i%2 ==0;  // 인자로 들어오는 i가 2로 나누어지는지 true/false를 반환한다. (짝수검사)

        BinaryOperator<Integer> sum = (a,b) -> a + b ;
        Integer apply = sum.apply(1, 2);
        System.out.println("##### apply  ="+apply);





*//*
        Function<Integer,Integer> plus11 = (i) -> i+10;

        Function<Integer, Integer> multiply2 = (i) -> i*2;
*//*      //위처럼 입력값과 출력값의 형태가 같다면 UnaryOperator를 써서 더 간단하게 할 수 있다.  // 그리고 입력값이 하나 인 경우에만

        UnaryOperator<Integer> plus12 = (i) -> i+10;

        Function<Integer, Integer> multiply3 = (i) -> i*2;





        *//*Plus10 plus10 = new Plus10();  //이렇게도 가능하지만. 람다로도 구현이 가능하다.
        System.out.println(plus10.apply(1));
        *//*



        final int baseNumber = 10;

        RunSomething runSomething = number -> number + baseNumber;



        //람다에서 람다를 감싸고 있는 로컬 variable이 있다고 가정해보자.





*//*
        RunSomething runSomething = (number) -> {
            return number + 10;
        };
*//*



*//*        //익명 내부 클래스 anonymous inner class
        RunSomething runSomething = () -> {
            System.out.println("Hello World!");
            System.out.println("Lamda");
        };

        runSomething.doIt();*//*



*//*        //익명 내부 클래스 anonymous inner class
        RunSomething runSomething = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("Hello World!");
                System.out.println("Lamda");
            }
        };*//*

    }*/

}
