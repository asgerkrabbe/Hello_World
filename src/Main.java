import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Main robotStand = new Main();

        for (int i = 0; i <= 5; i++){
            robotStand.stand();

            TimeUnit.SECONDS.sleep(1);

            for (int j = 0; j <= 3; j++){
                System.out.println();
            }

            robotStand.raisedArms();
            TimeUnit.SECONDS.sleep(1);

            for (int k = 0; k <= 3; k++){
                System.out.println();
            }
        }
    }
    public void stand() {
        System.out.println("    ______");
        System.out.println("   | -  - |");
        System.out.println("   | ____ |");
        System.out.println("   |______|");
        System.out.println("      ||");
        System.out.println("   ---------");
        System.out.println("   |  | |  |");
        System.out.println("   |  | |  |");
        System.out.println(" __|  | |  |__");
        System.out.println("      | |");
        System.out.println("      | |");
        System.out.println("   ___| |___");
    }

    public void raisedArms () {
        System.out.println("    ______");
        System.out.println("   | -  - |");
        System.out.println("__ | ____ | __");
        System.out.println("|  |______|  |");
        System.out.println("|     ||     |");
        System.out.println("|_____|-|____|");
        System.out.println("      | |   ");
        System.out.println("      | |   ");
        System.out.println("   ____ ____");
        System.out.println("   |       |");
        System.out.println("   |       |");
        System.out.println(" __|       |__");
    }

}
