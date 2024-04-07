package entities;

public class Individual extends TaxPayer{
    private Double healthExpends;

    public Individual(){
        super();
    }

    public Individual(String name, Double yearIncome, Double healthExpends) {
        super(name, yearIncome);
        this.healthExpends = healthExpends;
    }

    public Double getHealthExpends() {
        return healthExpends;
    }

    public void setHealthExpends(Double healthExpends) {
        this.healthExpends = healthExpends;
    }
    @Override
    public double tax(){
        if (getYearIncome() < 20000.00){
            return (getYearIncome() * 0.15) - (healthExpends * 0.5);
        }
        else {
            return (getYearIncome() * 0.25) - (healthExpends * 0.5);
        }
    }
}
