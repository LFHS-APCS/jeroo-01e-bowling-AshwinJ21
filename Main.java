/**
 *  See Readme.md for instructions.
 *  Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
        new JerooGUI();
        runJerooCode();

    }

    /**
     * IMPORTANT:  Do NOT change this code.
     */
    public static void runJerooCode() {
       Jeroo jeroo = new Jeroo(0, 0, EAST, 100);
       jeroo.setupBowling();
       Map.getInstance().printMap();
       System.out.println(jeroo.getOps());
    }

}
