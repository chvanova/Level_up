package task_number2;

public interface Creator {

    Bus ikar = new Bus("fuel", 58, 5.1f, 234935, "travelCard", true, 43.5f, true, "1111");
    Bus ikar1 = new Bus("fuel", 55, 4.1f, 234335, "travelCard", false, 50.5f, false, "2222");
    Bus ikar2 = new Bus("fuel", 58, 6.1f, 234735, "card", true, 43.5f, true, "22220");
    Bus ikar3 = new Bus("fuel", 55, 3.1f, 235235, "cash", false, 63.5f, false, "22221");
    TrolleyBus elIkar = new TrolleyBus("electricity", 55, 5.1f, 234235, "travelCard", true, 40.5f, true, "33333");
    TrolleyBus elIkar1 = new TrolleyBus("gibrid", 8, 5.63f, 234235, "travelCard", true, 39.9f, true, "44444");
    MiniBus minBus = new MiniBus("fuel", 11, 3.0f, 134323, "casch", false, 60.0f, true, "123456");
    Tram tram = new Tram("electricity", 100, 32.4f, 13213322, "travalCard", true, 32f, 4f, "09876");
}
