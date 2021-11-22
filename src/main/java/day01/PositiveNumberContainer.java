package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PositiveNumberContainer {
    List<Integer> list = new ArrayList<>();

    public void addNumber(int number){
        list.add(number);
    }

    public void readIn(){
        Scanner scanner = new Scanner(System.in);
        int number= scanner.nextInt();
        while (number>0){
            addNumber(number);
            number=scanner.nextInt();
        }
        for (Integer i:list
             ) {
            System.out.print(i + ", ");
        }
    }

    public static void main(String[] args) {
        PositiveNumberContainer pnc= new PositiveNumberContainer();
        pnc.readIn();
    }
}
