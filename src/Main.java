/**
 * Illustrerer, hvordan tråde fungerer
 */


public class Main {

    private static final int GENTAGELSER = 1000;
    private static final int LINELENGTH = 40;

    public static void main(String[] args) {

            // visBogstav("a");
            // visBogstav("b");

            // TODO 3 Instantier objekter som skal køre hver for sig
            Opgave opgaveA = new Opgave("a");
            Opgave opgaveB = new Opgave("b");

            // TODO 4 Opret tråde med ovenstående objekter som argument
            Thread threadA = new Thread(opgaveA);
            Thread threadB = new Thread(opgaveB);

            // TODO 5 Start trådene
            threadA.start();
            threadB.start();

    }

    // public static void visBogstav(String bogstav) {
    // }

    // TODO 1 Opret en klasse, som implementerer Runnable
    public static class Opgave implements Runnable {

        String bogstav;

        public Opgave(String bogstav) {
            this.bogstav = bogstav;
        }

        // TODO 2 Override run() metoden, den skal indeholde den kode, som skal køre i en tråd for sig
        @Override
        public void run() {
            for (int i = 0; i < GENTAGELSER; i++) {
                if (i%LINELENGTH == 0 ) {
                    System.out.print("\n");
                }
                System.out.print(bogstav);
            }
        }
    }

}
