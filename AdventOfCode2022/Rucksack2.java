package Homework.AdventOfCode2022;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.lang.StringBuilder;
public class Rucksack2 {

    public static void main(String[] args) throws IOException {
        File file = new File("SRC/AdventOfCode2022/input.txt");
        Scanner scanner= new Scanner(file);

        String[] AlphabetUpper;
        String[] AlphabetLower;
        int Result= 0;
        AlphabetUpper= new String[]{"xXx","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        AlphabetLower= new String[]{"XxX", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (int i=0; i<100; i++) {
            String Word= new String();

            int Length1;
            int Length2;
            int Length3;

            StringBuilder ScanString1 = new StringBuilder(scanner.nextLine());
            StringBuilder ScanString2= new StringBuilder(scanner.nextLine());
            StringBuilder ScanString3 = new StringBuilder(scanner.nextLine());
            Length1=ScanString1.length()-1;
            Length2=ScanString2.length()-1;
            Length3=ScanString3.length()-1;



            for(int k=0; k<=Length1;k++){
                for (int m=0; m<=Length2;m++){
                    for (int p=0; p<=Length3;p++){
                        if (ScanString1.charAt(k)==ScanString2.charAt(m) && ScanString1.charAt(k)==ScanString3.charAt(p) && ScanString2.charAt(m)==ScanString3.charAt(p)){

                                Word= String.valueOf(ScanString1.charAt(k));


                        }}}}


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

        System.out.print(Result);

    }
}