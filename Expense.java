public class Expense {
    String category;
    String note;
    double amount;

    public Expense(String category, String note, double amount) {
        this.category = category;
        this.note = note;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "[" + category + "] ₹" + amount + " - " + note;
    }
}