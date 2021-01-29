public class FeminineNoun {

    public static void main(String[] args) {

        isFeminineNoun("Katze");

        isFeminineNoun("Hund");

        isFeminineNoun("Fenchel");

        isFeminineNoun(  "Rechnung");


    }


    public static void isFeminineNoun( String name) {
        if (name.endsWith("e") || name.endsWith("ung")){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        }
    }

