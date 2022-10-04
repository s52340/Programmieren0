public class PingPong {
    public static void main(String[] args) {

        for (int number = 1; number <= 100; number++) {

            if (number % 6 == 0) {
                System.out.println(number + " Ping pong");
            }
            else if ( number % 2 == 0 ){
                System.out.println(number + " Ping");
            }
            else if ( number % 3 == 0 ) {
                System.out.println(number + " Pong");
            }
            else System.out.println(number + " -");

        }
    }
}
