package ie.atu.oop2week3;

public class CalculationResult {

    private String operation;
    private double total;

    public CalculationResult(String operation, double total) {
        this.operation = operation;
        this.total = total;
    }

    public String getOperation() {
        return operation;
    }

    public double getTotal() {
        return total;
    }
}
