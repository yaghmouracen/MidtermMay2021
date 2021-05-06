package math.problems;

public class FindLowestDifference {

    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        cal();


    }

    public static void cal() {
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        // int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        int tmp, tmp2;
        int finalResult = array1[0];

        for (int i = 0; i < array1.length - 1; i++) {
            tmp = array1[i];
            for (int j = 0; j < array1.length - 1; j++) {
                //tmp = array1[j];
                tmp2 = array1[j + 1];
                int temp2;
                if ((temp2 = (tmp - tmp2)) > 0) {
                    finalResult = temp2;
                }
            }
        }
        System.out.println("The lowest difference is " + finalResult);

    }

}