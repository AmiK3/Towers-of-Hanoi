package test;
import static org.junit.Assert.*;
import org.junit.Test;
import main.TowersOfHanoi;

public class TowersOfHanoiTest {
    @Test
    public void testStepsWhenNumberOfDiskIsLessThanNumberOfTower1(){
        int numberOfDisk = 3, start = 1, end = 5;
        TowersOfHanoi.count=0;
        TowersOfHanoi.stepsWhenNumberOfDiskIsLessThanNumberOfTower(numberOfDisk,start,end);
        assertEquals(TowersOfHanoi.count, 5);
        assertNotEquals(TowersOfHanoi.count, 6);
    }
    @Test
    public void testStepsWhenNumberOfDiskIsLessThanNumberOfTower2(){
        int numberOfDisk = 5, start = 1, end = 10;
        TowersOfHanoi.count = 0;
        TowersOfHanoi.stepsWhenNumberOfDiskIsLessThanNumberOfTower(numberOfDisk,start,end);
        assertEquals(TowersOfHanoi.count, 9);
        assertNotEquals(TowersOfHanoi.count, 10);
    }
    @Test
    public void testStepsWhenNumberOfDiskIsLessThanNumberOfTower3(){
        int numberOfDisk = 3, start = 1, end = 10;
        TowersOfHanoi.count=0;
        TowersOfHanoi.stepsWhenNumberOfDiskIsLessThanNumberOfTower(numberOfDisk,start,end);
        assertEquals(TowersOfHanoi.count, 5);
    }
    @Test
    public void testStepsWhenNumberOfDiskIsEqualToNumberOfTower1(){
        int numberOfDisk = 5, start = 1, end = 5;
        TowersOfHanoi.count=0;
        TowersOfHanoi.stepsWhenNumberOfDiskIsEqualThanNumberOfTower(numberOfDisk,start,end);
        assertEquals(TowersOfHanoi.count, 11);
    }
    @Test
    public void testStepsWhenNumberOfDiskIsEqualToNumberOfTower2(){
        int numberOfDisk = 10, start = 1, end = 10;
        TowersOfHanoi.count=0;
        TowersOfHanoi.stepsWhenNumberOfDiskIsEqualThanNumberOfTower(numberOfDisk,start,end);
        assertEquals(TowersOfHanoi.count, 21);
    }
    @Test
    public void testStepsWhenNumberOfDiskIsMoreThanNumberOfTower1(){
        int numberOfDisk = 6, start = 1, end = 5;
        TowersOfHanoi.count=0;
        TowersOfHanoi.stepsWhenNumberOfDiskIsMoreThanNumberOfTower(numberOfDisk,start,end);
        assertEquals(TowersOfHanoi.count, 19);
    }
    @Test
    public void testStepsWhenNumberOfDiskIsMoreThanNumberOfTower2(){
        int numberOfDisk = 20, start = 1, end = 5;
        TowersOfHanoi.count=0;
        TowersOfHanoi.stepsWhenNumberOfDiskIsMoreThanNumberOfTower(numberOfDisk,start,end);
        assertEquals(TowersOfHanoi.count, 262147);
    }
    @Test
    public void testStepsWhenNumberOfDiskIsMoreThanNumberOfTower3(){
        int numberOfDisk = 11, start = 1, end = 10;
        TowersOfHanoi.count=0;
        TowersOfHanoi.stepsWhenNumberOfDiskIsMoreThanNumberOfTower(numberOfDisk,start,end);
        assertEquals(TowersOfHanoi.count, 29);
    }
    @Test
    public void testStepsWhenNumberOfDiskIsMoreThanNumberOfTower4(){
        int numberOfDisk = 15, start = 1, end = 10;

        TowersOfHanoi.count=0;
        TowersOfHanoi.stepsWhenNumberOfDiskIsMoreThanNumberOfTower(numberOfDisk,start,end);
        assertEquals(TowersOfHanoi.count, 269);
    }
    @Test
    public void testStepsWhenNumberOfDiskIsMoreThanNumberOfTower5(){
        int numberOfDisk = 11, start = 1, end = 10;
        TowersOfHanoi.count=0;
        TowersOfHanoi.stepsWhenNumberOfDiskIsMoreThanNumberOfTower(numberOfDisk,start,end);
        assertEquals(TowersOfHanoi.count, 29);
    }
    @Test
    public void testStepsWhenNumberOfDiskIsMoreThanNumberOfTower6(){
        int numberOfDisk = 8, start = 1, end = 7;
        TowersOfHanoi.count=0;
        TowersOfHanoi.stepsWhenNumberOfDiskIsMoreThanNumberOfTower(numberOfDisk,start,end);
        assertEquals(TowersOfHanoi.count, 23);
    }
    @Test
    public void validateDisk(){
        assertTrue(TowersOfHanoi.validateNumberOfDisks(3));
        assertFalse(TowersOfHanoi.validateNumberOfDisks(2));
    }
    @Test
    public void validateTowers(){
        assertTrue(TowersOfHanoi.validateNumberOfTowers(5));
        assertFalse(TowersOfHanoi.validateNumberOfTowers(4));
    }
}
