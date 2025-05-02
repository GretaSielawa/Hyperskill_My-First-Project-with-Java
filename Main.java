package calculator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products("Bubblegum", 2, 202));
        productsList.add(new Products("Toffee", 0.2, 118));
        productsList.add(new Products("Ice cream", 5, 2250));
        productsList.add(new Products("Milk chocolate", 4, 1680));
        productsList.add(new Products("Doughnut", 2.5, 1075));
        productsList.add(new Products("Pancake", 3.2, 80));

        //System.out.println("Prices: ");

        int total = 0;
        System.out.println("Earned amount: ");
        for (Products p : productsList) {
            System.out.println(p);
            total+= p.earnings;
        }

        System.out.println("\nIncome: $" + (double)total);

        System.out.println("Staff expenses: ");
        String expenses = scanner.next();
        System.out.println("Other expenses: ");
        String otherExpenses = scanner.next();
        int totalExpenses = Integer.parseInt(expenses) + Integer.parseInt(otherExpenses);
        int netIncome = total - totalExpenses;
        System.out.printf("Net income: $%d", netIncome);







    }
}