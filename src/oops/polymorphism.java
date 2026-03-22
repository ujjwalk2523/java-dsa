package oops;
import java.util.Scanner;
public class polymorphism {
        public static class dog{
            void speak(){//ek naam multiple kaam
                System.out.println("bhau bhau");
            }
        }
        public static class cat{
            void speak(){//ek naam multiple kaam
                System.out.println("meow meow");
            }
        }
        public static class lion{
            void speak(){//ek naam multiple kaam
                System.out.println("roar");
            }
        }
        public static void main(String[] args) {
            dog luna = new dog();
            luna.speak();
            cat oggy = new cat();
            oggy.speak();
            lion jack = new lion();
            jack.speak();
        }

    }

