package Arrays;

public class arrays {

    public int[] reverseArray(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex < endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
        return arr;
    }

    public void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public int minimumValueInArray(int[] arr) {
        int minimum = arr[0];
        int i = 1;
        while(i<arr.length){
            if(minimum >arr[i]){
                minimum = arr[i];
            }
            i++;
        }
        return minimum;
    }

    public static int secondMinimumValueInArray(int[] arr){
        int minimum = arr[0];
        int secondMinimum = arr[1];
        int i = 0;
        while(i<arr.length){
            if(minimum > arr[i]){
                int temp = minimum;
                minimum = arr[i];
                secondMinimum = temp;
            }
            i++;
        }
        return  secondMinimum;
    }

    public static int secondMaxValue(int[] arr){
        int maximum = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int i = 0;
        while(i < arr.length){
            if(arr[i] > maximum){
                secMax = maximum;
                maximum= arr[i];
            }else if(arr[i] > secMax && arr[i]!=maximum){
                secMax = arr[i];
            }

            i++;
        }
        return secMax;
    }

    public static void main(String[] args) {
        arrays ar = new arrays();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] resultingArray = ar.reverseArray(arr);
//        ar.printArray(resultingArray);
        int resultValue =  ar.minimumValueInArray(resultingArray);
//        System.out.printf("minimumValueInArray(arr)  " +  resultValue + "\n");
        int secondMinimum = secondMinimumValueInArray(resultingArray);
        int secmax = secondMaxValue(resultingArray);
        System.out.printf("secondMinimumValueInArray(arr)  " +  secmax + "\n");

    }

}
