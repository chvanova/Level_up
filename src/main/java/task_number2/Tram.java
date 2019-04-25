package task_number2;

public class Tram extends PublicTransport {
    private Float pathRadius;

    Tram(String typePower, int capacity, float expenditure, float count, String paymentMethod, boolean personsWithDisabilities, float tripPrice, float pathRadius, String number) {
        super(typePower, capacity, expenditure, count, paymentMethod, personsWithDisabilities, tripPrice, number);

        this.pathRadius = pathRadius;
    }


    public Float getPathRadius(){
        return this.pathRadius;
    }

    public Boolean getBattery(){
        return false;
    }

    public Boolean getRequestStop(){
        return false;
    }
}
