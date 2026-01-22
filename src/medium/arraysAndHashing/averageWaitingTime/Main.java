package medium.arraysAndHashing.averageWaitingTime;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] customers = {{1,2},{2,5},{4,3}};

        System.out.println(solution.averageWaitingTime(customers));
    }
}
