import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static void changeOne(ArrayList<String> one, int d) {
        if (d == 1) {
            String temp = one.get(7);
            one.remove(7);
            one.add(0, temp);
        } else {
            String temp = one.get(0);
            one.remove(0);
            one.add(temp);
        }
    }

    private static void changeTwo(ArrayList<String> two, int d) {
        if (d == 1) {
            String temp = two.get(7);
            two.remove(7);
            two.add(0, temp);
        } else {
            String temp = two.get(0);
            two.remove(0);
            two.add(temp);
        }
    }

    private static void changeThree(ArrayList<String> three, int d) {
        if (d == 1) {
            String temp = three.get(7);
            three.remove(7);
            three.add(0, temp);
        } else {
            String temp = three.get(0);
            three.remove(0);
            three.add(temp);
        }
    }

    private static void changeFour(ArrayList<String> four, int d) {
        if (d == 1) {
            String temp = four.get(7);
            four.remove(7);
            four.add(0, temp);
        } else {
            String temp = four.get(0);
            four.remove(0);
            four.add(temp);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String x = stdIn.next();
        String[] One = x.split("");
        ArrayList<String> one = new ArrayList<>(Arrays.asList(One));

        x = stdIn.next();
        String[] Two = x.split("");
        ArrayList<String> two = new ArrayList<>(Arrays.asList(Two));

        x = stdIn.next();
        String[] Three = x.split("");
        ArrayList<String> three = new ArrayList<>(Arrays.asList(Three));

        x = stdIn.next();
        String[] Four = x.split("");
        ArrayList<String> four = new ArrayList<>(Arrays.asList(Four));

        int k;
        do {
            k = stdIn.nextInt();
        } while (k > 100 || k < 1);

        for (int i = 0; i < k; i++)
        {
            int gearNum, d;
            do {
                gearNum = stdIn.nextInt();
            } while (gearNum > 4 || gearNum < 1);
            do {
                d = stdIn.nextInt();
            } while (d != 1 && d != -1);

            boolean oneG = false, twoG = false, threeG = false;

            if (one.get(2).equals(two.get(6)))
                oneG = true;
            if (two.get(2).equals(three.get(6)))
                twoG = true;
            if (three.get(2).equals(four.get(6)))
                threeG = true;

            switch (gearNum) {
                case 1:
                    if (oneG == false && twoG == false && threeG == false) {
                        changeTwo(two, -d);
                        changeThree(three, d);
                        changeFour(four, -d);
                    } else if (oneG == false && twoG == false && threeG == true) {
                        changeTwo(two, -d);
                        changeThree(three, d);
                    } else if (oneG == false && twoG == true) {
                        changeTwo(two, -d);
                    }

                    changeOne(one, d);
                    break;

                case 2:
                    if (oneG == false && twoG == false && threeG == false) {
                        changeOne(one, -d);
                        changeThree(three, -d);
                        changeFour(four, d);
                    } else if (oneG == false && twoG == false && threeG == true) {
                        changeOne(one, -d);
                        changeThree(three, -d);
                    } else if (oneG == false && twoG == true) {
                        changeOne(one, -d);
                    } else if (oneG == true && twoG == false && threeG == false) {
                        changeThree(three, -d);
                        changeFour(four, d);
                    } else if (oneG == true && twoG == false && threeG == true) {
                        changeThree(three, -d);
                    }

                    changeTwo(two, d);
                    break;

                case 3:
                    if (oneG == false && twoG == false && threeG == false) {
                        changeOne(one, d);
                        changeTwo(two, -d);
                        changeFour(four, -d);
                    } else if (oneG == true && twoG == false && threeG == false) {
                        changeTwo(two, -d);
                        changeFour(four, -d);
                    } else if (twoG == true && threeG == false) {
                        changeFour(four, -d);
                    } else if (threeG == true && oneG == false && twoG == false) {
                        changeOne(one, d);
                        changeTwo(two, -d);
                    } else if (threeG == true && twoG == false && oneG == true) {
                        changeTwo(two, -d);
                    }

                    changeThree(three, d);
                    break;

                case 4:
                    if (oneG == false && twoG == false && threeG == false) {
                        changeOne(one, -d);
                        changeTwo(two, d);
                        changeThree(three, -d);
                    } else if (oneG == true && twoG == false && threeG == false) {
                        changeTwo(two, d);
                        changeThree(three, -d);
                    } else if (twoG == true && threeG == false) {
                        changeThree(three, -d);
                    }

                    changeFour(four, d);
                    break;
            }
        }

        int sum = 0;
        if (one.get(0).equals("1"))
            sum += 1;
        if (two.get(0).equals("1"))
            sum += 2;
        if (three.get(0).equals("1"))
            sum += 4;
        if (four.get(0).equals("1"))
            sum += 8;

        System.out.print(sum);
    }
}