import kotlin.jvm.functions.Function1;
import kotlinFromCourse.HelloKt;
import kotlinFromCourse.HeroKt;

public class Hello {
    public static void main(String[] args) {
//        HelloWo helloWo = new Hello().new HelloWo();
//        String yourName = helloWo.yourName;
//        System.out.println(yourName);


        String s = HeroKt.sayHello();
        System.out.println(s);

        HelloKt helloKt = new HelloKt();
        String sayHello = helloKt.getSayHello();
        System.out.println(sayHello);
        System.out.println(helloKt.myList);


        System.out.println("11111111");
        System.out.println(HelloKt.alwaysSayHello);
        System.out.println(HelloKt.Companion.hey());
        System.out.println(HelloKt.hey());

//        HelloWo helloWo = new Hello().new HelloWo();
//        helloWo.h();
//        Hello hello = new Hello();
//        try {
//            hello.h();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        try {
            HeroKt.tryE();
        } catch (Throwable e) {
//            throw new RuntimeException(e);
            System.out.println("wwaoow");
        }

        Function1<String, String> funAnonymous = HeroKt.getFunAnonymous();
        String invoke = funAnonymous.invoke("1");
        System.out.println(invoke);
    }

    public void h() throws Exception{

        throw new RuntimeException();
    }
   public class HelloWo{
        String yourName = getIt();
        String name =" lisi";

        private String getIt(){
            return name;
        }

        public void h() throws RuntimeException{

            throw new RuntimeException();
        }
    }
}
