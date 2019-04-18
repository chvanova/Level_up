package ru.levelup.firstname.lastname.qa.homework_number.task_number2;

abstract class PublicTransport implements Transport{

    PublicTransport(String typePower, int capacity, float expenditure, float count, String paymentMethod,
                    boolean personsWithDisabilities, float tripPrice, String nubmer) {
        this.capacity = capacity;
        this.expenditure = expenditure;
        this.cost = count;
        this.personsWithDisabilities = personsWithDisabilities;
        this.tripPrice = tripPrice;
        this.typePower = typePower;
        this.paymentMethod = paymentMethod;
        this.nubmer = nubmer;
    }


    protected String nubmer;
    protected String typePower;
    protected Integer capacity;
    protected Float expenditure;
    protected Float cost;
    protected String paymentMethod;
    protected Boolean personsWithDisabilities;
    protected Float tripPrice;

    @Override
    public String getNubmer() {
        return nubmer;
    }

    @Override
    public String getTypePower() {
        return typePower;
    }

    @Override
    public Integer getCapacity() {
        return capacity;
    }

    @Override
    public Float getExpenditure() {
        return expenditure;
    }

    @Override
    public Float getCost() {
        return cost;
    }

    @Override
    public String getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public Boolean getPersonsWithDisabilities() {
        return personsWithDisabilities;
    }

    @Override
    public Float getTripPrice() {
        return tripPrice;
    }

    @Override
    public boolean getConductor() {
        return false;
    }
}
