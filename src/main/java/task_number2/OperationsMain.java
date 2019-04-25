package task_number2;

public class OperationsMain extends Operations {

    public static void main(String[] args) {

        Operations.calculateTheCostPark(Creator.ikar, Creator.ikar1, Creator.ikar2, Creator.ikar3, Creator.elIkar, Creator.elIkar1, Creator.minBus, Creator.tram);
        Operations.sortTransportByExpenditure(Creator.ikar, Creator.ikar1, Creator.ikar2, Creator.ikar3, Creator.elIkar, Creator.elIkar1, Creator.minBus, Creator.tram);
        Operations.searchBusByParameters(Creator.ikar, Creator.ikar1, Creator.ikar2, Creator.ikar3);

    }
}
