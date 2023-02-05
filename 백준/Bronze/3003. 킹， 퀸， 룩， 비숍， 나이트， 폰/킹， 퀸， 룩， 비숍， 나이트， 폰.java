import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int king, queen, rook, bishop, knight, pawn;

        int x;
        do {
            x = stdIn.nextInt();
        }while (x > 10 || x < 0);
        king = x;

        do {
            x = stdIn.nextInt();
        }while (x > 10 || x < 0);
        queen = x;

        do {
            x = stdIn.nextInt();
        }while (x > 10 || x < 0);
        rook = x;

        do {
            x = stdIn.nextInt();
        }while (x > 10 || x < 0);
        bishop = x;

        do {
            x = stdIn.nextInt();
        }while (x > 10 || x < 0);
        knight = x;

        do {
            x = stdIn.nextInt();
        }while (x > 10 || x < 0);
        pawn = x;

        if (king != 1)
            king = 1 - king;
        else king = 0;

        if (queen != 1)
            queen = 1 - queen;
        else queen = 0;

        if (rook != 2)
            rook = 2 - rook;
        else rook = 0;

        if (bishop != 2)
            bishop = 2 - bishop;
        else bishop = 0;

        if (knight != 2)
            knight = 2 - knight;
        else knight = 0;

        if (pawn != 8)
            pawn = 8 - pawn;
        else pawn = 0;

        System.out.print(king + " ");
        System.out.print(queen + " ");
        System.out.print(rook + " ");
        System.out.print(bishop + " ");
        System.out.print(knight + " ");
        System.out.print(pawn);
    }
}