package lab_8_9;

import java.util.Scanner;

public class Dna_Strand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();

        String dna;

        while(true){
        System.out.println("Please enter a DNA stands to find the complementary strands");
        dna = input.nextLine();

        if(dna.isEmpty()) {
            System.out.println("Program end!");
            break;
        }
            for (int i = 0; i < dna.length(); i++) {
                if (dna.charAt(i) == 'T') {
                    builder.append('A');
                }
                if (dna.charAt(i) == 'A') {
                    builder.append('T');
                }
                if (dna.charAt(i) == 'C') {
                    builder.append('G');
                }
                if (dna.charAt(i) == 'G') {
                    builder.append('C');
                }
            }
            System.out.println(builder.toString());
            System.out.println();
        }
    }
}
