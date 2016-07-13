package message;
import java.util.TreeSet;

/**
 * Created by chingwenje on 7/10/16.
 */
public class Main {

    public static Object[] mergeMatrices(Integer[] array1, Integer[] array2) {

        TreeSet<Integer> integerTreeSet = new TreeSet<Integer>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                integerTreeSet.add(array1[i]);
                integerTreeSet.add(array2[j]);
            }
        }

        Object[] array = integerTreeSet.toArray();

//        for(int i = 0; i < array.length; i++){
//            System.out.println("array=" + array[i]);
//        }
        return array;
    }

    public static int[][] flipMatrix(int[][] matrixToTranspose) {
        int[][] transposedMatrix = new int[matrixToTranspose[0].length][matrixToTranspose.length];
        for (int a = 0; a < matrixToTranspose.length; a++) {
            for (int b = 0; b < matrixToTranspose[0].length; b++) {
                transposedMatrix[b][a] = matrixToTranspose[a][b];
            }
        }

//        for (int a = 0; a < transposedMatrix[0].length; a++) {
//            for (int b = 0; b < matrixToTranspose.length; b++) {
//                System.out.print(transposedMatrix[a][b] + " ");
//            }
//            System.out.println();
//        }
        return transposedMatrix;
    }
}
