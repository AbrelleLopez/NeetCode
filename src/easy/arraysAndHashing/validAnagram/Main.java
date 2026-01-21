package easy.arraysAndHashing.validAnagram;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "racecar";
        String t = "carrace";
        System.out.println(solution.isAnagram(s, t));
    }
}
