import java.util.Scanner;

public class Cli implements View {
    public Cli() {
        System.out.println("Hello, let's play Buzz!");
        //getNumOfPlayers();
    }

    /*public int getNumOfPlayers() {
        Scanner scan = new Scanner(System.in);
        int num;
        do {
            System.out.println("Solo or Multiplayer?");
            num = scan.nextInt();
        } while(num != 1 && num != 2);
        scan.close();

        return num;
    } */

    @Override
    public int readAnswer() {
        Scanner sc = new Scanner(System.in);
        int an;
        do {
            an = sc.nextInt();
        } while (an != 1 && an != 2 && an != 3 && an != 4);

        return an;
    }

    @Override
    public void showQuestion(Question q) {
        System.out.println(q.getQuestion());
        int i = 1;
        for (String an : q.getAnswers()) {
            System.out.println(i + " " + an);
            i++;
        }
    }
}
