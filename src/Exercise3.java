public class Exercise3 {

        public static void main(String[] args) {

            int number = 333777;
            int result = 0;
            mySum (number, result);
        }

        public static void mySum (int number, int result){
            while (number > 0) {
                result = result + number % 10;
                number = number / 10;
            }

            System.out.println( result);
        }

    }



