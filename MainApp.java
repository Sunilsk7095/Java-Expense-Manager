import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        System.out.print("Enter your monthly budget: ₹");
        double budget = sc.nextDouble();
        manager.setBudget(budget);

        while (true) {
            System.out.println("\n📌 Menu:");
            System.out.println("1. Add Expense");
            System.out.println("2. Show All Expenses");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    System.out.print("Category: ");
                    String category = sc.nextLine();
                    System.out.print("Note: ");
                    String note = sc.nextLine();
                    System.out.print("Amount: ₹");
                    double amount = sc.nextDouble();
                    manager.addExpense(category, note, amount);
                    break;

                case 2:
                    manager.showAllExpenses();
                    break;

                case 3:
                    System.out.println("👋 Exiting... Goodbye!");
                    return;

                default:
                    System.out.println("❌ Invalid choice!");
            }
        }
    }
}