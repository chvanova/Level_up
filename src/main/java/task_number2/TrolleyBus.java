package task_number2;

public class TrolleyBus extends PublicTransport{

    private boolean battery;

    public TrolleyBus(String typePower, int capacity, float expenditure, float count, String paymentMethod, boolean personsWithDisabilities, float tripPrice, boolean battery, String number) {
        super(typePower, capacity, expenditure, count, paymentMethod, personsWithDisabilities, tripPrice, number);
        this.battery = battery;

    }

    public Boolean getBattery(){
        return this.battery;
    }

    public Boolean getRequestStop(){
        return false;
    }

    public Float getPathRadius(){
        return 0f;
    }

}
