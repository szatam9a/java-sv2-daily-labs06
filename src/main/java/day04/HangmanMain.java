package day04;
import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class HangmanMain {

    private String theWord;
    private int chances;
    private String status;

    public HangmanMain(String theWord, int chances) {
        this.theWord = theWord;
        this.chances = chances;
        this.status = statusInit();
    }

    private String statusInit(){
        return  "_".repeat(theWord.length());

    }
    private void readIn(){
        String guess;
        Scanner scanner = new Scanner(System.in);
        System.out.println("guess a character");
        guess = scanner.nextLine();
        status = updateWordFound(theWord,status,guess);
        writeOut();

    }

    private void writeOut(){
        System.out.println(status + "  megmaradt esélyek: " + chances);
    }
    private void run() {
        while (!(theWord.equals(status))){
            readIn();
            if (chances==0) {break;}
        }
        if (chances>0){
            System.out.println("nyetél");
        } else {
            System.out.println("vesztettél");
        }
    }

    private String updateWordFound(String wordToFind, String status, String guess) {
        char[] chars = status.toCharArray();
        boolean needToDecreaseChances = true;
        for (int i = 0; i < chars.length; i++) {
            if (wordToFind.charAt(i) == guess.charAt(0)) {
                chars[i] = guess.charAt(0);
                needToDecreaseChances= false;
            }

        }
        if (needToDecreaseChances){chances--;}
        return new String(chars);
    }
    public static void main(String[] args) {
        new HangmanMain("totoka", 12).run();
    }
}