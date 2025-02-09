package entities;

public abstract class TaxPayer {
    private String name;
    private Double yearIncome;

    public TaxPayer(){
        super();
    }

    public TaxPayer(String name, Double yearIncome) {
        this.name = name;
        this.yearIncome = yearIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getYearIncome() {
        return yearIncome;
    }

    public void setYearIncome(Double yearIncome) {
        this.yearIncome = yearIncome;
    }
    public abstract double tax();


}
