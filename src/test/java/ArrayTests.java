import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayTests {
    @Test
    void simpleTest(){
        int[] months = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int actual = months.length;
        int expected = 12;

        Assert.assertEquals(actual, expected);
    }
    @Test
    void averageTest(){
        int[] months = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int actual = months.length;
        int expected = 12;

        int sum = 0;
        for (int i = 0; i < months.length; i++){
            sum = sum + months[i];
        }
        double average;
        average = (double) sum/actual;
        System.out.println(average);
    }

    @Test
    void maxTest() {
        int[] randomNumbers = new int[]{6, 32, 60, 2, 45, 19, 30, 4};
        int size = randomNumbers.length;
        printArray(randomNumbers);

        for (int i = 0; i < size - 1; i++) {
            if (randomNumbers[i] > randomNumbers[i + 1]) {
                int temp = randomNumbers[i];
                randomNumbers[i] = randomNumbers[i + 1];
                randomNumbers[i + 1] = temp;
            }
        }
        printArray(randomNumbers);
    }

    private void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    @Test
    void minTest() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(6);
        arrayList.add(3);
        arrayList.add(-2);
        arrayList.add(0);

        System.out.println(arrayList);

        arrayList.remove(1);

        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size() - 1 ; i++) {
            if (arrayList.get(i) < arrayList.get(i + 1)) {
                int temp = arrayList.get(i);
                arrayList.set(i, arrayList.get(i + 1));
                arrayList.set(i + 1, temp);
            }

            System.out.println(arrayList);
        }
        System.out.println(arrayList.get(arrayList.size() - 1));
    }

}


