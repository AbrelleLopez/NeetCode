package easy.arraysAndHashing.numberOfSeniorCitizens;

class Solution {
    public int countSeniors(String[] details) {
        // 15 length per string
        // 10 char - number
        // next - gender
        // next 2 - age
        // last 2 - seat alloted

        // show all people who are more than 60 years old

        // String[] details = ["7868190130M7522","5303914400F9211","9273338290F4010"]

        // 12th and 13th char --> age

        int count = 0;

        for (int i = 0; i < details.length; i++) {
            int age = Integer.parseInt(details[i].substring(11, 13));
            if (age > 60) {
                count++;
            }
        }

        return count;
    }
}