import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cli ui = new Cli();
        Game g = new Game(ui);

    }
}
