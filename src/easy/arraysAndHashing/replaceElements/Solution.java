package easy.arraysAndHashing.replaceElements;

class Solution {
    public int[] replaceElements(int[] arr) {
        // with a given number, find greatest element from its right side
        // replace last element with -1

        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1) {
                arr[i] = -1;
                break;
            }

            int greatestNum = arr[i+1];
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > greatestNum) {
                    greatestNum = arr[j];
                }
            }
            arr[i] = greatestNum;
        }

        return arr;
    }
}