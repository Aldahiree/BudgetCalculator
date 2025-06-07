public class BudgetCalculator {
    private static final double salary = 3000.0;
    private static final double saving_percent = 0.20;
    private static final double rent_percent = 0.30;
    private static final double groceries_percent = 0.15;
    private static final double entertainment_percent = 0.10;
    public static void main(String[]args) {
        double monthly salary = salary;
        double saved amount;
        double rengt amount;
        double groceries amount;
        double entertainment amount;
        double total expenses;
        double remaining balance;
        savedAmount = monthlySalary *
        saving_percent;
        rentAmount = monthlySalary *
        rent_percent;
        groceriesAmount = monthlySalary *
        groceries_percent;
        entertainmentAmount = monthlySalary *
        entertainment_percent;
        totalExpenses = rentAmount + groceriesAmount + entertainmentAmount;
        remainingBalance = monthlySalary - totalExpenses;
            system.out.println("Monthly salary: " + monthlySalary);
            system.out.println("Amount saved: " + savedAmount);
            system.out.println("Amount spent on rent: " + rentAmount);
            system.out.println( "Amount spent on groceries: " + groceriesAmount);
            system.out.println(" Amount spent on entertainment: " + entertainmentAmount);
            system.out.println("Total expenses: " + totalExpenses);
            system.out.println("Remaining balance: " + remainingBalance);
    }
}