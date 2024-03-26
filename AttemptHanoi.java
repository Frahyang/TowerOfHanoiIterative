import java.util.Scanner;
import java.util.Stack;

public class AttemptHanoi {
    public static void main(String[] args) {
        Stack<Integer> rodA = new Stack<>(); // Set stacks for hanoi towers
        Stack<Integer> rodB = new Stack<>();
        Stack<Integer> rodC = new Stack<>();

        Scanner userInput = new Scanner(System.in); // Receive user input
        System.out.print("Enter amount of disks for hanoi: ");
        int diskAmount = userInput.nextInt();

        for (int i = diskAmount; i > 0; i--) { // Place disks on first hanoi tower
            rodA.push(i);
        }
        System.out.println("Rod A: " + rodA);
        System.out.println("Rod B: " + rodB);
        System.out.println("Rod C: " + rodC);
        System.out.println("");

        for (int j = 0; j < (diskAmount * 2) - 1; j++) { // Hanoi activity
            slowDown();
            if (rodA.empty() == false) {
                if (rodA.peek().equals(diskAmount)) {
                    rodC.push(rodA.pop());
                } else if (!rodA.peek().equals(diskAmount)) {
                    rodB.push(rodA.pop());
                }
            } else if (rodB.empty() == false) {
                if (!rodB.peek().equals(diskAmount)) {
                    rodC.push(rodB.pop());
                }
            }
        System.out.println("Rod A: " + rodA);
        System.out.println("Rod B: " + rodB);
        System.out.println("Rod C: " + rodC);
        System.out.println("");
        }
        userInput.close();
    }
    public static void slowDown() { // Slow code execution for better visualisation
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
