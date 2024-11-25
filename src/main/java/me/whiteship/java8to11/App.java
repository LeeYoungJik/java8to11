package me.whiteship.java8to11;



import java.io.PrintStream;
import java.time.Duration;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class App {

    public static void main(String[] args){


        String text1 = "Hello World";
        String text2 = "Hello World";


        System.out.println("aa hashCode = "+text1.hashCode());
        System.out.println("texxt2 hashCode = "+text2.hashCode());

        String text3 = new String("Hello World");
        String text4 = new String("Hello World");

        System.out.println("text3 hashCode = "+text3.hashCode());
        System.out.println("text4 hashCode = "+text4.hashCode());

        System.out.println("text1 == text2  = "+ (text1==text2));
        System.out.println("text3 == text4  = "+ (text3==text4));

        System.out.println("text1 equals text2  = "+ text1.equals(text2));
        System.out.println("text3 equals text4  = "+ text3.equals(text4));


        /*백기선 수업 듣던거
        Calendar keesunBirthDay = new GregorianCalendar(1982,Calendar.JULY,15 );

        System.out.println(keesunBirthDay.getTimeInMillis());
        */



        /*
        String onlineTest = "공지  12345";

        String HTMLFORMAT = "<div><span style=\"font-family:'맑은 고딕'; font-size:7pt; color:#000000;\">%s</span></div><div><span style=\"font-family:'맑은 고딕'; font-size:7pt; color:#000000;\"></span></div>";

        String content = "공 지\n      " +
                "\n" +
                "공지\n" +
                "\n" +
                "공지\n" +
                "\n" +
                "공지";


        String[] arraycontent = onlineTest.split("\n");

        String htmlcontent = "";
                for(String aa: arraycontent){
                    System.out.println("aa");
                    htmlcontent += String.format(HTMLFORMAT, aa);
                    System.out.println("htmlcontent ="+htmlcontent);
                }




        String NOTIFICATIONFORMAT = "‹div›‹span styles=\"font-family:'맑은고딕'; font-size:8pt; color: #000000;\">%s</span></div>";

        String NotiTest = "공지 \n\n\n\n\n공지";

        String oneFormat = "<DIV style='FONT-SIZE:x-small; FONT-FAMILY:굴림'><FONT style=\\\"BACKGROUND-COLOR: #ffffff\\\" color=#000000></FONT>%s; </DIV>";
        String twoFormat = "<DIV style='FONT-SIZE:x-small; FONT-FAMILY:굴림'>%s<FONT style=\\\"BACKGROUND-COLOR: #ffffff\\\" color=#000000></FONT><br/></DIV>";

        String splitTest = "TEST101";

        String[] split = splitTest.split(",");
        int aa= split.length;
        System.out.println("#### aa = "+aa );


        //규칙
        // 1. 텍스트가 한 줄과 한 줄 이상은 형식이 다르다.
        // 2. 띄어쓰기는 &nbsp;로 변환되어야 한다.
        // 3. 엔터는 <br/>로 변환 되어야 한다.

        String check = "띄어쓰기1 띄어쓰기2 띄어쓰기3";
        String check2 = "공 지\n      " +
                "\n" +
                "공지\n" +
                "\n" +
                "공지\n" +
                "\n" +
                "공지";

        boolean contains = check.contains(" ");
        System.out.println("####LYJ contains = "+contains);


        boolean contains1 = check2.contains("\n");
        System.out.println("check2 = "+check2);
        System.out.println("####LYJ contains1 = "+contains1);

        if(check2.contains("\n")){
            //true   --> 2줄로 판단
            String replace = check2.replace("\n", "<br/>").replace(" ","&nbsp;");
//            String replace2 = replace.replace(" ", "&nbsp;");
            System.out.println("replace = "+replace);
//            System.out.println("replcae2 = "+replace2);
            String format = String.format(twoFormat, replace);
            System.out.println("format = "+format);

        }


        */

        /*
        List<OnlineClass> springClasses = new ArrayList<>();

        springClasses.add(new OnlineClass(1,"spring boot",true));
        springClasses.add(new OnlineClass(2,"spring data jpa",true));
        springClasses.add(new OnlineClass(3,"spring mvc",true));
        springClasses.add(new OnlineClass(4,"spring core",true));
        springClasses.add(new OnlineClass(5,"rest api development",false));


        String collect = springClasses.stream().map(oc -> oc.getTitle() + ",").collect(Collectors.joining());
        System.out.println("######collect");
        System.out.println(collect);
*/




        /*List<OnlineClass> springClasses = new ArrayList<>();

        springClasses.add(new OnlineClass(1,"spring boot",true));
        springClasses.add(new OnlineClass(5,"rest api development",false));


        Optional<OnlineClass> optional = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();
*/


        //optional flatmap   vs stream flatmap의 차이점!
        // stema flatmap : input이 1개면, output이 여러개 일 수 있다.
        // optional flatmap : input이 1개, output이 1개
//        Optional<Progress> progress = optional.flatMap(OnlineClass::getProgress);





//        Optional<Optional<Progress>> progress = optional.map(OnlineClass::getProgress);
        //return이 optional인데 거기서 한 번더 꺼내면 optional안의 optional이 나온다. 이럴경우 한번 까고, 또 까고 2번까야지만 사용이 가능하다.
        //그래서 편하게 쓸 수 있는게 flatMap이다.


//        Optional<Integer> integer = optional.map(OnlineClass::getId);

/*
        Optional<OnlineClass> onlineClass = optional.filter(OnlineClass::isClosed);
        System.out.println(onlineClass.isEmpty());*/




/*
        OnlineClass onlineClass = optional.orElseGet(App::createNewClass);
        //이렇게 supplier를 해도 된다.
        System.out.println(onlineClass.getTitle());
*/

        //        OnlineClass onlineClass = optional.orElseGet( () -> createNewClass());  //람다로 넘겨도 되고


//        optional.ifPresent(oc -> System.out.println(oc.getTitle())); //이렇게도 사용 가능






//            OnlineClass onlineClass = spring.get();
//            System.out.println(onlineClass.getTitle());




/*


        List<OnlineClass> springClasses = new ArrayList<>();

        springClasses.add(new OnlineClass(1,"spring boot",true));
        springClasses.add(new OnlineClass(2,"spring data jpa",true));
        springClasses.add(new OnlineClass(3,"spring mvc",true));
        springClasses.add(new OnlineClass(4,"spring core",true));
        springClasses.add(new OnlineClass(5,"rest api development",false));


        OnlineClass spring_boot = new OnlineClass(1, "spring_boot", true);
        System.out.println("####");

        spring_boot.getProgress().get().setStudyDuration(Duration.ofDays(System.currentTimeMillis()));
        System.out.println("###LYJ ");
*/



      /*  List<OnlineClass> springClasses = new ArrayList<>();

        springClasses.add(new OnlineClass(1,"spring boot",true));
        springClasses.add(new OnlineClass(2,"spring data jpa",true));
        springClasses.add(new OnlineClass(3,"spring mvc",true));
        springClasses.add(new OnlineClass(4,"spring core",true));
        springClasses.add(new OnlineClass(5,"rest api development",false));

        List<OnlineClass> javaClasses = new ArrayList<>();


        javaClasses.add(new OnlineClass(6,"The Java Test",true));
        javaClasses.add(new OnlineClass(7,"The Java, Code manipulation",true));
        javaClasses.add(new OnlineClass(8,"The Java 8 to 11",false));

        List<List<OnlineClass>> keesunEvents = new ArrayList<>();

        keesunEvents.add(springClasses);
        keesunEvents.add(javaClasses);



        System.out.println("수업 이름만 모아서 스트림 만들기");

        Stream<String> stringStream = springClasses.stream().map(aa -> aa.getTitle());

        stringStream.forEach(aa -> System.out.println(aa));


        springClasses.stream()
                        .filter(Predicate.not(OnlineClass::isClosed))
                                .forEach(oc -> System.out.println(oc));



        System.out.println("spring으로 시작하는 수업");
*/
    /*    List<Object> startSpring = springClasses.stream().map((s) -> {
            if (s.getTitle().startsWith("spring")) {
                System.out.println("spring start Online Class = " + s.getTitle());
                return s;
            }
            return 0;
        }).collect(Collectors.toList());


        startSpring.forEach(System.out::println);*/

/*

        springClasses.stream()
                        .filter(oc -> oc.getTitle().startsWith("spring"))
                                .forEach(aa -> System.out.println(aa.getTitle()));



        System.out.println("close되지 않은 수업");

        springClasses.stream()
                .filter(aa -> aa.isClosed() == false)
                .forEach(aa -> System.out.println(aa.getTitle()));


        System.out.println("두 수업 목록에 들어있는 모든 수업 아이디 출력");
        keesunEvents.stream().flatMap(list -> list.stream()).forEach(oc -> System.out.println(oc.getTitle()));


        System.out.println("10부터 1씩 증가하는 무제한 스트림 중에서 앞에 10개 빼고 최대 10개까지만");
//        Function<Integer,Integer> OnePlus = oc -> oc+ "number";

        Stream.iterate(10,i->i+1)
                .skip(10)
                .limit(10)
                .forEach(System.out::println);


        System.out.println("자바 수업 중에 Test가 들어있는 수업이 있는지 확인");

//        javaClasses.stream().forEach(i -> Arrays.stream(i.getTitle().split(" ")));

//        boolean testCheck = javaClasses.stream().anyMatch(i -> i.getTitle().toUpperCase().startsWith("TEST"));
//        System.out.println("자바 수업중에 test 확인 결과 ="+testCheck);  startsWith로 하니까 false만 리턴된...

        boolean textCheck = javaClasses.stream().anyMatch(oc -> oc.getTitle().contains("Test"));
        System.out.println("자바 테스트 = "+textCheck);

        

        System.out.println("스프링 수업 중에 제목에 spring이 들어간 것만 모아서 list로 만들기");

        List<String> spring = springClasses.stream().
                filter(oc -> oc.getTitle().contains("spring"))
                .map(oc -> oc.getTitle())
                .collect(Collectors.toList());

        spring.forEach(System.out::println);


        System.out.println("###LYJ Test");
        List<String> springMap = springClasses.stream()
                .map(oc -> oc.getTitle())
                .filter(oc -> oc.contains("spring"))
                .sorted((o1, o2) -> {
                    return o1.compareTo(o2);
                })
                .collect(Collectors.toList());

        springMap.forEach(System.out::println);




*/



   /*     List<String> names = new ArrayList<>();
        names.add("keesun");
        names.add("whiteship");
        names.add("toby");
        names.add("foo");


        List<String> collect = names.parallelStream().map((s) -> {
            System.out.println(s + " " + Thread.currentThread().getName());
            return s.toUpperCase();
        }).collect(Collectors.toList());


        collect.forEach(System.out::println);
*/


 /*       List<String> collecter = names.stream().map((s) -> {    //이 로직은 출력이 되지 않는다.
            //기본적으로 중계형 오퍼레이터들은, 터미널 오퍼레이터가 오기 전까지는 실행을 안 한다.
            //이 로직은 정의를 한 것일 뿐이다.
            System.out.println(s);
            return s.toUpperCase();

        }).collect(Collectors.toList());//map이 중계 오퍼레이션이다. 중간에 들어있으니까? , 중계 오퍼레이션은 stream을 리턴


        collecter.forEach(System.out::println);  //대문자네... 그러면 반환받고 다 끝나야 지만 대문자로 리턴한게 나오는것 가탇.


        System.out.println("##### map out ");
 */       //이렇게 로직이 다 돌아도 소문자로 그냥 남아있다. 데이터를 바꾸지 않는다.
        //스트림으로 처리하는 데이터는 오직 한 번만 처리가 된다. 그냥 지나간다.
        //스틀미이 처리하는 데이터 소스를 변경하지 않는다.

        //무제한일 수도 있다.
        //중계 오퍼레시녀은 근본적으로 lazy하다.
        //손쉽게 병렬 처리를 할 수 있다.



//        names.forEach(System.out::println);

        /*names.forEach(s -> {
            System.out.println("forEach Test"+s);
        });
*/



        /*
        System.out.println("test start ####");
        Foo foo = new DefaultFoo("youngjick");
        foo.printName();
        foo.printNameUpperCase();
        System.out.println("test end ####");

        Foo.printAnything();  //이거는 static 메소드다. 이렇게도 사용이 가능하다.


         */

/*

        String [] nameList = {"keesun", "whiteShipt", "toby"};
        Arrays.sort(nameList, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(nameList));
*/

        //compareToIgnoreCase는 내가 1가진 문자열이랑 들어온 문자열을 비교해 주는 function이다.


//        Arrays.sort(nameList, ((o1, o2) -> 0));
        //어떤 문자열을 비교해서 int값을 넘겨주는 것을 만들 수가 있다.




        /*Supplier<Greeting> newGreeting = Greeting::new; //여기까지는 아직 인스턴스 객체를 만들지 않는다.

        Greeting greeting = newGreeting.get();//get을 해야 실질적으로 만들어진다.



        Function<String, Greeting> keesunGreeting = Greeting::new;
        //얘는 스트링을 받는 생성자 참조.

        Greeting getterTest = keesunGreeting.apply("YoungJik HI Hello Test");
        System.out.println(getterTest.getName());


        Supplier<Greeting> newGreeting2 = Greeting::new;
        //얘는 아무것도 없는 생성자 참조*/

/*

        UnaryOperator<String> hi = greeting::hello;
        System.out.println(hi.apply("yahoooo"));
        System.out.println(hi.apply("yahoooo222"));
        System.out.println(hi.apply("yahoooo222333333"));
*/



        /*Greeting greeting = new Greeting();
        UnaryOperator<String> hi = greeting::hello;*/
        //이런식으로 인스턴스 메소드를 참조할 수가 있다.



//        UnaryOperator<String> hi = Greeting::hi;
        //UnaryOperator<String> hi의 구현체로 Greeting::hi; 를 쓰겠다는 뜻이다.  이게 메소드 레퍼런스이다.
        //이거는 Greeting 클래스 안의 static method를 사용한다.


//        UnaryOperator<String> hi = (s) -> "hi" + s;   원본



/*
        Function<Integer, String> IntToString = (i) -> "number" + i;
        //이렇게도 사용이 가능하지만,
        //위의 기능을 똑같이 하는 메소드가 있다면, 그 메소드를 그대로 참조가 가능하다. */

    }

    private static OnlineClass createNewClass() {
        System.out.println("Create New Online Class ");
        return new OnlineClass(10,"New Class",true);
    }

}
