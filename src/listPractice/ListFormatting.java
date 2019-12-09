package listPractice;

import java.util.Scanner;

class listFormatting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int upper = number/10*3;
        int middle = number/10*2;
        int bottom = number/10*1;
        System.out.println(upper + " " +middle + " " +bottom);


    }


}
