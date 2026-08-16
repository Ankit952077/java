import java.util.Scanner;

public class ElectronicShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] prices = new double[5];

        // Allow the user to input the prices of 5 electronic items
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the price of item " + (i + 1) + ": ");
            prices[i] = scanner.nextDouble();
        }

        // Display all the prices entered
        System.out.println("Prices of electronic items:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Item " + (i + 1) + ": $" + prices[i]);
        }

        // Calculate and display the total cost of all items
        double totalCost = 0;
        for (double price : prices) {
            totalCost += price;
        }
        System.out.println("\nTotal cost: $" + totalCost);

        // Calculate and display the average price of the items
        double averagePrice = totalCost / 5;
        System.out.println("Average price: $" + averagePrice);

        // Identify the most expensive and the cheapest item
        double mostExpensive = prices[0];
        double cheapest = prices[0];
        for (int i = 1; i < 5; i++) {
            if (prices[i] > mostExpensive) {
                mostExpensive = prices[i];
            }
            if (prices[i] < cheapest) {
                cheapest = prices[i];
            }
        }
        System.out.println("\nMost expensive item: $" + mostExpensive);
        System.out.println("Cheapest item: $" + cheapest);
    }
}