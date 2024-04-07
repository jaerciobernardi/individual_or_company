package entities;

public class Company extends TaxPayer{
    private int numberOfEmployees;

    public Company(){
        super();
    }

    public Company(String name, Double yearIncome, int numberOfEmployees) {
        super(name, yearIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    @Override
    public double tax(){
        if (numberOfEmployees > 10){
            double calc = getYearIncome() * 0.14;
            return calc;
        }
        else {
            double calc = getYearIncome() * 0.16;
            return calc;
        }
    }
}
