public class Library {
    public static double avgOfNumbersAboveAndEqualAvg(int [] nums) {
        double avg = 0;
        for (int i : nums) 
        avg += i;
        avg /= nums.length;

        double aboveAvg = 0;
        int count = 0;
        for (int i : nums) {
            if (i > avg) {
            aboveAvg += i;
            count++;
            }
        }
    return aboveAvg / count;
    
    }

    public static void moveZeros(int [] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                for (int j = i + 1; j < num.length; j++) {
                    if (num[j] != 0) {
                        int tmp = num[i];
                        num[i] = num[j];
                        num[j] = tmp;
                        break;
                    }
                }
            }
        }
    }

    public static int[] maxRowValues(int [][] matrix) {    
        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int max = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            result[i] = max;
        }
        return result; 
    }

    public static void printVerticalChart(int [] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        for (int i = max; i >= 1; i--) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
        //find max for number of rows
        //nested loop outer loop prints rows system.out.print 
        //inner loop prints each column within row. go thru # array
        //check to see if we need to print * or empty space
        //loop from max down to 1 check 2 see if array value >= current outside loop index
        //if it is, print star. if not, print space.
    

}

