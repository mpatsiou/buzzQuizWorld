import java.util.Scanner;

public class BetRound extends Round {

    public BetRound(Question[] q, View ui, double currentscore) throws InterruptedException {
        super(q, ui, currentscore);
        ui.betDetails();
        runRound();
    }

    public void runRound() throws InterruptedException {
        for (Question q : roundQuestions) {
            int bet;

            ui.showBetValues (new int[]{250, 500, 100});

            bet = ui.readAnswer(new Integer[]{250, 500, 750, 1000});

            ui.showQuestion(q);

            int an = ui.readAnswer(new Integer[]{1, 2, 3, 4});
            if (q.checkRightAnswer(q.getAnswers()[an - 1])) {
                ui.correctAnswerMessage(bet);
                currentscore += bet;
            }
            else {
                ui.worgAnswerMessage(bet);
                currentscore -= bet;
            }
        }
    }
}
