import java.util.ArrayList;

public class ExpenseManager {
    private ArrayList<Expense> expenses = new ArrayList<>();
    private double monthlyBudget = 0;

    public void setBudget(double budget) {
        this.monthlyBudget = budget;
    }

    public void addExpense(String category, String note, double amount) {
        Expense e = new Expense(category, note, amount);
        expenses.add(e);
        System.out.println("✅ Expense added.");
        if (getTotalExpenses() > monthlyBudget && monthlyBudget > 0) {
            System.out.println("⚠️ Alert: Budget limit exceeded!");
        }
    }

    public double getTotalExpenses() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.amount;
        }
        return total;
    }

    public void showAllExpenses() {
        System.out.println("\n📋 All Expenses:");
        for (Expense e : expenses) {
            System.out.println(" - " + e);
        }
        System.out.println("Total: ₹" + getTotalExpenses());
    }
}