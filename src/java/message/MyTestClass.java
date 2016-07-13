package message;

import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

/**
 * Created by chingwenje on 7/11/16.
 */
public class MyTestClass {

    Main main = new Main();

    @Test
    public void canFlipMatrix() {
        System.out.println("in canFlipMatrix()");

        int[][] matrixToTranspose = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] transposedMatrix = main.flipMatrix(matrixToTranspose);

        assertSame("It is the same matrix, ", matrixToTranspose, main.flipMatrix(transposedMatrix));
    }

    @Test
    public void canMergeMatrices() {
        System.out.println("in canMergeMatrices()");

        Integer[] array1 = {4, 7, 3, 9, 2, 32};
        Integer[] array2 = {3, 2, 12, 9, 40, 32, 4};

//        Integer[] array1 = {4, 6 , 7};
//        Integer[] array2 = {3, 4};

        Object[] mergedMatrix = main.mergeMatrices(array1, array2);

//        assertArrayEquals("Equals, ", new Object[]{3, 4, 6, 7}, mergedMatrix);
        assertArrayEquals("The arrays are equal, ", new Object[]{2, 3, 4, 7, 9, 12, 32, 40}, mergedMatrix);
    }

    @Test
    public void canReverseString() {
        System.out.println("in canReverseString()");

        String originalString = "test";

        String reversedString = MySingleton.reverseString(originalString);

        assertEquals("It is the same string, ", originalString, MySingleton.reverseString(reversedString));
    }
}
