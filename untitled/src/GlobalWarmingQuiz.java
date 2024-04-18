import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctAnswers = 0;

        System.out.println("Welcome to the Global Warming Quiz!\n");

        System.out.println("Question 1: What is the primary greenhouse gas?");
        System.out.println("1. Oxygen");
        System.out.println("2. Carbon Dioxide");
        System.out.println("3. Nitrogen");
        System.out.println("4. Hydrogen");
        System.out.print("Your answer: ");
        int answer1 = scanner.nextInt();
        if (answer1 == 2) {
            correctAnswers++;
        }

        System.out.println("\nQuestion 2: What is the main cause of global warming?");
        System.out.println("1. Deforestation");
        System.out.println("2. Volcanic eruptions");
        System.out.println("3. Solar activity");
        System.out.println("4. Greenhouse gas emissions");
        System.out.print("Your answer: ");
        int answer2 = scanner.nextInt();
        if (answer2 == 4) {
            correctAnswers++;
        }

        System.out.println("\nQuestion 3: Which activity contributes the most to greenhouse gas emissions?");
        System.out.println("1. Driving cars");
        System.out.println("2. Eating meat");
        System.out.println("3. Air travel");
        System.out.println("4. Burning fossil fuels");
        System.out.print("Your answer: ");
        int answer3 = scanner.nextInt();
        if (answer3 == 4) {
            correctAnswers++;
        }

        System.out.println("\nQuestion 4: What effect does global warming have on ecosystems?");
        System.out.println("1. Increases biodiversity");
        System.out.println("2. Decreases sea levels");
        System.out.println("3. Decreases ice melting");
        System.out.println("4. Disrupts habitats and threatens species");
        System.out.print("Your answer: ");
        int answer4 = scanner.nextInt();
        if (answer4 == 4) {
            correctAnswers++;
        }

        System.out.println("\nQuestion 5: What is one way to reduce global warming?");
        System.out.println("1. Planting more trees");
        System.out.println("2. Increasing coal usage");
        System.out.println("3. Using plastic bags");
        System.out.println("4. Increasing industrial emissions");
        System.out.print("Your answer: ");
        int answer5 = scanner.nextInt();
        if (answer5 == 1) {
            correctAnswers++;
        }

        System.out.println("\nYou answered " + correctAnswers + " out of 5 questions correctly.");

        if (correctAnswers == 5) {
            System.out.println("Excellent!");
        } else if (correctAnswers == 4) {
            System.out.println("Very good!");
        } else {
            System.out.println("Time to brush up on your knowledge.");
        }
    }
}
