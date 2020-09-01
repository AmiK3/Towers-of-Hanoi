package main;

import java.util.Scanner;

public class TowersOfHanoi {
    public static int count = 0;
    public static int source = 0;
    public static int aux = 0;
    public static int size = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Disks: ");
        int disk = scanner.nextInt();
        if (validateNumberOfDisks(disk)) {
            System.out.println("Enter Number of Towers: ");
            int end = scanner.nextInt();
            if (validateNumberOfTowers(end)) {
                if (disk < end)
                    stepsWhenNumberOfDiskIsLessThanNumberOfTower(disk, 1, end);
                else if (disk == end) {
                    stepsWhenNumberOfDiskIsEqualThanNumberOfTower(disk, 1, end);
                } else {
                    stepsWhenNumberOfDiskIsMoreThanNumberOfTower(disk, 1, end);
                }
                System.out.println("Total Count of Moves: " + count);
            } else
                System.out.println("Invalid number of Towers. Enter Towers between 5 to 10.");
        } else
            System.out.println("Invalid number of Disks. Enter Disks between 3 to 40.");
    }

    /**
     * The steps to follow are:
     * Move n-1 disks from source to auxiliary Peg.
     * Move nth remaining disk and destination Pegs.
     * Move n-1 disks from auxiliary Peg to destination Peg.
     *
     * @param numberOfDisk
     * @param start
     * @param end
     */
    public static void stepsWhenNumberOfDiskIsLessThanNumberOfTower(int numberOfDisk, int start, int end) {
        int index = 2;
        while (index <= numberOfDisk + 1) {
            if (index - 1 == numberOfDisk) {
                System.out.println("Move Disk" + (index - 1) + " from tower " + start + " to tower " + end);
            } else {
                System.out.println("Move Disk" + (index - 1) + " from tower " + start + " to tower " + index);
            }
            index++;
            count++;
        }
        index = index - 2;
        while (index > start) {
            if (index != end) {
                System.out.println("Move Disk" + (index - 1) + " from tower " + index + " to tower " + end);
                count++;
            }
            index--;
        }
    }

    /**
     * Tower of Hanoi recursive algorithm. The steps to follow are:
     * Move n-3 disks from source to auxiliary Peg.
     * Call towerOfHanoi with n remaining disk and 3 Pegs.
     * Move n-3 disks from auxiliary Peg to destination Peg.
     *
     * @param numberOfDisk
     * @param start
     * @param end
     */
    public static void stepsWhenNumberOfDiskIsEqualThanNumberOfTower(int numberOfDisk, int start, int end) {
        int index = 2;
        while (index <= end - 2) {
            System.out.println("Move Disk" + (index - 1) + " from tower " + start + " to tower " + index);
            index++;
            count++;
        }
        index--;
        source = numberOfDisk - 2;
        aux = numberOfDisk - 1;
        size = numberOfDisk;
        System.out.println("toh starts");
        towerOfHanoiForLessOrEqualDiskThanTower(3, start, end, end - 1);
        System.out.println("toh ends");

        while (index >= 2) {
            System.out.println("Move Disk" + (index - 1) + " from tower " + index + " to tower " + end);
            index--;
            count++;
        }
    }

    public static void stepsWhenNumberOfDiskIsMoreThanNumberOfTower(int numberOfDisk, int start, int end) {
        int index = 2;
        int cnt = 0;
        while (index <= end - 2) {
            System.out.println("Move Disk" + (index - 1) + " from tower " + start + " to tower " + index);
            cnt++;
            index++;
            count++;
        }
        index--;
        source = numberOfDisk - 2;
        towerOfHanoiForMoreDiskThanTowers(numberOfDisk - cnt, start, end, end - 1);
        while (index >= 2) {
            System.out.println("Move Disk" + (index - 1) + " from tower " + index + " to tower " + end);
            index--;
            count++;
        }
    }

    /**
     * Tower of Hanoi recursive algorithm. The steps to follow are:
     * Move n-1 disks from source to auxiliary Peg.
     * Move nth disk from source to destination Peg.
     * Move n-1 disks from auxiliary Peg to destination Peg.
     * @param numberOfDisk
     * @param start
     * @param end
     * @param intermediateTower
     */
    public static void towerOfHanoiForLessOrEqualDiskThanTower(int numberOfDisk, int start, int end, int intermediateTower) {
        if (numberOfDisk == 1) {
            System.out.println("Move Disk" + source + " from tower " + start + " to tower " + end);
            count++;
            return;
        }
        towerOfHanoiForLessOrEqualDiskThanTower(numberOfDisk - 1, start, intermediateTower, end);
        if (numberOfDisk == 2)
            System.out.println("Move Disk" + aux + " from tower " + start + " to tower " + end);
        else if (numberOfDisk == 3)
            System.out.println("Move Disk" + size + " from tower " + start + " to tower " + end);
        count++;
        towerOfHanoiForLessOrEqualDiskThanTower(numberOfDisk - 1, intermediateTower, end, start);
    }

    static void towerOfHanoiForMoreDiskThanTowers(int n, int start, int end, int intermediate) {
        if (n == 1) {
            System.out.println("Move Disk" + source + " from tower " + start + " to tower " + end);
            count++;
            return;
        }
        towerOfHanoiForMoreDiskThanTowers(n - 1, start, intermediate, end);
        System.out.println("Move Disk" + end + " from tower " + start + " to tower " + end);
        count++;
        towerOfHanoiForMoreDiskThanTowers(n - 1, intermediate, end, start);
    }

    public static boolean validateNumberOfDisks(int disk) {
        return disk <= 40 && disk >= 3;
    }

    public static boolean validateNumberOfTowers(int tower) {
        return tower <= 10 && tower >= 5;
    }

}