import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int[] wood = new int[5];

        for(int i = 0; i < wood.length; i++)
            wood[i] = stdIn.nextInt();

        while (true){
            if(wood[0] == 1 && wood[1] == 2 && wood[2] == 3 && wood[3] == 4 && wood[4] == 5 ){
                break;
            }

            for(int i = 0; i < 4; i++)
            {
                if(wood[i] > wood[i+1]){
                    int t = wood[i];
                    wood[i] = wood[i+1];
                    wood[i+1] = t;
                    for(int j = 0; j < wood.length; j++)
                    {
                        System.out.print(wood[j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}