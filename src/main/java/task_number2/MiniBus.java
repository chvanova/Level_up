package task_number2;

public class MiniBus extends PublicTransport {
    private boolean requestStop;

    public MiniBus(String typePower, int capacity, float expenditure, float count, String paymentMethod, boolean personsWithDisabilities, float tripPrice, boolean requestStop, String number) {
        super(typePower, capacity, expenditure, count, paymentMethod, personsWithDisabilities, tripPrice, number);
        this.requestStop = requestStop;

    }
    public Boolean getRequestStop(){
        return this.requestStop;
    }


    public Boolean getBattery(){
        return false;
    }

    public Float getPathRadius(){
        return 0f;
    }
}
