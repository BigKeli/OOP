package Homework.AdventOfCode2022;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.lang.StringBuilder;
public class Rucksack1 {

    public static void main(String[] args) throws IOException {
        File file = new File("SRC/AdventOfCode2022/input.txt");
        Scanner scanner= new Scanner(file);
        char [] CharPrioritized= new char[300];
        String[] AlphabetUpper;
        String[] AlphabetLower;
        int Result= 0;
        AlphabetUpper= new String[]{"xXx","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        AlphabetLower= new String[]{"XxX", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (int i=0; i<300; i++) {
            String Word= new String();

            int j;
            StringBuilder ScanString = new StringBuilder(scanner.nextLine());
            j=ScanString.length()-1;
            int Comp= j/2;


            for(int k= 0; k<=Comp;k++){
                for (int m=Comp+1; m<=j;m++){
                    if (ScanString.charAt(k)==ScanString.charAt(m)){
                        CharPrioritized[i] = ScanString.charAt(k);
                        Word= String.valueOf(ScanString.charAt(k));
                    }}}


            if (Word.matches("[a-z]{1}")){
                for (int x=1; x<=26; x++){
                    if( Word.contentEquals(AlphabetLower[x])){
                        Result=Result+x;

                    }}}
            else if (Word.matches("[A-Z]{1}")){
                for (int x=1; x<=26; x++){
                    if( Word.equals(AlphabetUpper[x])){
                        Result=Result+x+26;

                    }}}

        }

        System.out.println(Result);

        for (char element: CharPrioritized) {
            System.out.println(element);
        }
    }



}