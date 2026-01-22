package medium.arraysAndHashing.averageWaitingTime;

class Solution {
    public double averageWaitingTime(int[][] customers) {
        long currentTime = 0;
        long totalWaitingTime = 0;

        for (int[] customer : customers) {
            int arrival = customer[0];
            int service = customer[1];

            if (currentTime < arrival) {
                currentTime = arrival;
            }

            currentTime += service;
            totalWaitingTime += currentTime - arrival;
        }
        return (double) totalWaitingTime / customers.length;
    }
}
