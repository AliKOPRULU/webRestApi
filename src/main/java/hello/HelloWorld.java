package hello;

import java.time.LocalTime;

/**
 * Created by Ali on 15.11.2016.
 */
public class HelloWorld {
    public static void main(String[] args) {
//        LocalTime currentTime =new LocalTime(1,1,1,1);
        String currentTime = "Ali test";
        System.out.println("The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
