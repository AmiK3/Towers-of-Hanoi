# Towers Of Hanoi
Implementation of the puzzle in Java.

## Problem description

The **Tower of Hanoi** is a mathematical puzzle or game,

The puzzle consists of **N-pegs and a number of disks of K-sizes**,
which can be introduced into any peg. Besides, the initial position of the
puzzle is a stack in ascending order of size on one peg, the smallest at the
top.

The aim of the puzzle is to move the stack to another rod, following the next 3
rules:

-   Only one disk can be moved at the same time.

-   Each move consists on taking the disk at the top of one peg and pushing into
    the top of another.

-   No disk can be placed above a smaller disk.

## Recursive Solution

Here, for K-disk(min 3 & max 40 disk) and N-Pegs(min 5 & max 10 Pegs) the problem is divided into two parts:

1 . When Number of Disk are less than the number of Pegs:
-  Move n-1 disks from source to auxiliary Peg.
-  Move nth remaining disk and destination Pegs.
-  Move n-1 disks from auxiliary Peg to destination Peg.

2 . When Number of Disk are equal or more than the number of Pegs:
-  Move n-3 disks from source to auxiliary Peg.
-  Call towerOfHanoi with n remaining disk and 3 Pegs.
-  Move n-3 disks from auxiliary Peg to destination Peg.

3 . When Number of Disk is less than 3 or greater than 40:
-  Prints Invalid Disk Number. 

4 . When Number of Pegs is less than 5 or greater than 10:
-  Prints Invalid Peg Number.

If we follow those steps in each call, we will divide the problem until we reach
the base case.

## Pseudocode
```
void towerOfHanoi(int numberOfDisks, int start, int intermediate, int end) {

        if (numberOfDisk == 1) {
              System.out.println("Move Disk" + source + " from peg " + start + " to tower " + end);
              count++;
              return;
        }
        towerOfHanoi(numberOfDisk - 1, start, intermediate, end);
        if (numberOfDisk == 2)
              System.out.println("Move Disk" + aux + " from peg " + start + " to tower " + end);
        else if (numberOfDisk == 3)
              System.out.println("Move Disk" + size + " from peg " + start + " to tower " + end);
        count++;
        towerOfHanoi(numberOfDisk - 1, intermediate, end, start);
      }

}
```
