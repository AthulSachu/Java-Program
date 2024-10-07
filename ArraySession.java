public class ArraySession {
    public static void main(String[] args) {
        int studentAges[] = {18, 20, 22, 24, 26, 28, 30, 32, 34, 36};
        float temperatures[] = {98.6f, 99.1f, 97.5f, 96.8f, 100.2f, 101.5f, 99.0f, 98.2f, 97.9f, 96.5f};
        double bankBalances[] = {1000.50, 2050.75, 3000.90, 1500.25, 5000.80, 2500.40, 3200.10, 4200.55, 1800.45, 2950.35};
        char gradeLetters[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        boolean lightSwitches[] = {true, false, true, false, true, false, true, false, true, false};
        long distancesInMeters[] = {500L, 1000L, 1500L, 2000L, 2500L, 3000L, 3500L, 4000L, 4500L, 5000L};
        short racePositions[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        byte byteScores[] = {50, 60, 70, 80, 90, 100, 110, 115, 116, 120};

        //int
        System.out.println("Array elements from Left to right:");
        for (int i = 0; i < studentAges.length; i++) {
            System.out.println(studentAges[i]);
        }

        System.out.println("Right to left:");
        for (int i = studentAges.length - 1; i >= 0; i--) {
            System.out.println(studentAges[i]);
        }

        System.out.println("From middle to right:");
        for (int i = 5; i < studentAges.length; i++) {
            System.out.println(studentAges[i]);
        }

        System.out.println("Middle to left:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(studentAges[i]);
        }

        System.out.println("Skipping one index:");
        for (int i = 0; i < studentAges.length; i += 2) {
            System.out.println(studentAges[i]);
        }

        //float
        System.out.println("Array elements from Left to right:");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println(temperatures[i]);
        }

        System.out.println("Right to left:");
        for (int i = temperatures.length - 1; i >= 0; i--) {
            System.out.println(temperatures[i]);
        }

        System.out.println("From middle to right:");
        for (int i = 5; i < temperatures.length; i++) {
            System.out.println(temperatures[i]);
        }

        System.out.println("Middle to left:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(temperatures[i]);
        }

        System.out.println("Skipping one index:");
        for (int i = 0; i < temperatures.length; i += 2) {
            System.out.println(temperatures[i]);
        }

        //Double
        System.out.println("Array elements from Left to right:");
        for (int i = 0; i < bankBalances.length; i++) {
            System.out.println(bankBalances[i]);
        }

        System.out.println("Right to left:");
        for (int i = bankBalances.length - 1; i >= 0; i--) {
            System.out.println(bankBalances[i]);
        }

        System.out.println("From middle to right:");
        for (int i = 5; i < bankBalances.length; i++) {
            System.out.println(bankBalances[i]);
        }

        System.out.println("Middle to left:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(bankBalances[i]);
        }

        System.out.println("Skipping one index:");
        for (int i = 0; i < bankBalances.length; i += 2) {
            System.out.println(bankBalances[i]);
        }

        //char
        System.out.println("Array elements from Left to right:");
        for (int i = 0; i < gradeLetters.length; i++) {
            System.out.println(gradeLetters[i]);
        }

        System.out.println("Right to left:");
        for (int i = gradeLetters.length - 1; i >= 0; i--) {
            System.out.println(gradeLetters[i]);
        }

        System.out.println("From middle to right:");
        for (int i = 5; i < gradeLetters.length; i++) {
            System.out.println(gradeLetters[i]);
        }

        System.out.println("Middle to left:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(gradeLetters[i]);
        }

        System.out.println("Skipping one index:");
        for (int i = 0; i < gradeLetters.length; i += 2) {
            System.out.println(gradeLetters[i]);
        }

        //boolean
        System.out.println("Array elements from Left to right:");
        for (int i = 0; i < lightSwitches.length; i++) {
            System.out.println(lightSwitches[i]);
        }

        System.out.println("Right to left:");
        for (int i = lightSwitches.length - 1; i >= 0; i--) {
            System.out.println(lightSwitches[i]);
        }

        System.out.println("From middle to right:");
        for (int i = 5; i < lightSwitches.length; i++) {
            System.out.println(lightSwitches[i]);
        }

        System.out.println("Middle to left:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(lightSwitches[i]);
        }

        System.out.println("Skipping one index:");
        for (int i = 0; i < lightSwitches.length; i += 2) {
            System.out.println(lightSwitches[i]);
        }

        //long
        System.out.println("Array elements from Left to right:");
        for (int i = 0; i < distancesInMeters.length; i++) {
            System.out.println(distancesInMeters[i]);
        }

        System.out.println("Right to left:");
        for (int i = distancesInMeters.length - 1; i >= 0; i--) {
            System.out.println(distancesInMeters[i]);
        }

        System.out.println("From middle to right:");
        for (int i = 5; i < distancesInMeters.length; i++) {
            System.out.println(distancesInMeters[i]);
        }

        System.out.println("Middle to left:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(distancesInMeters[i]);
        }

        System.out.println("Skipping one index:");
        for (int i = 0; i < distancesInMeters.length; i += 2) {
            System.out.println(distancesInMeters[i]);
        }

        //short
        System.out.println("Array elements from Left to right:");
        for (int i = 0; i < racePositions.length; i++) {
            System.out.println(racePositions[i]);
        }

        System.out.println("Right to left:");
        for (int i = racePositions.length - 1; i >= 0; i--) {
            System.out.println(racePositions[i]);
        }

        System.out.println("From middle to right:");
        for (int i = 5; i < racePositions.length; i++) {
            System.out.println(racePositions[i]);
        }

        System.out.println("Middle to left:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(racePositions[i]);
        }

        System.out.println("Skipping one index:");
        for (int i = 0; i < racePositions.length; i += 2) {
            System.out.println(racePositions[i]);
        }

        //byte
        System.out.println("Array elements from Left to right:");
        for (int i = 0; i < byteScores.length; i++) {
            System.out.println(byteScores[i]);
        }

        System.out.println("Right to left:");
        for (int i = byteScores.length - 1; i >= 0; i--) {
            System.out.println(byteScores[i]);
        }

        System.out.println("From middle to right:");
        for (int i = 5; i < byteScores.length; i++) {
            System.out.println(byteScores[i]);
        }

        System.out.println("Middle to left:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(byteScores[i]);
        }

        System.out.println("Skipping one index:");
        for (int i = 0; i < byteScores.length; i += 2) {
            System.out.println(byteScores[i]);
        }
    }
}
