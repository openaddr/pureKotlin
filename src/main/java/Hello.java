public class Hello {
    public static void main(String[] args) {
        HelloWo helloWo = new Hello().new HelloWo();
        String yourName = helloWo.yourName;
        System.out.println(yourName);



    }
    class HelloWo{
        String yourName = getIt();
        String name =" lisi";

        private String getIt(){
            return name;
        }

    }
}
