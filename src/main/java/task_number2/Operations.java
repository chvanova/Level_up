package task_number2;

import java.util.*;

public class Operations {

    static void calculateTheCostPark(PublicTransport... args) {
        float result = 0;
        for (PublicTransport arg : args) {
            result = arg.getCost() + result;
        }
        System.out.println("Стоимость автопарка " + result);
    }


    static void sortTransportByExpenditure(PublicTransport... args) {
        Map<String, Float> map = new HashMap<String, Float>();

        for (PublicTransport v : args) {
            map.put(v.nubmer, v.expenditure);
        }
        map.entrySet().stream().sorted(Map.Entry.<String, Float>comparingByValue()).forEach(System.out::println);
    }

    static void sortTransportCapacity(PublicTransport... args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (PublicTransport v : args) {
            map.put(v.nubmer, v.capacity);
        }
        map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()).forEach(System.out::println);
    }


    static void searchBusByParameters(Bus... transports) {
        HashMap mapTransport = new HashMap();
        for (Bus transport : transports){
            mapTransport.put(transport.getNubmer(), transport);
        }
        System.out.println("Введите количество параметров: ");
        Integer countParams = GetCommand.getCountParams();
        for (int i = 1; i <= countParams; i++) {
            System.out.println("Введите параметр поиска: ");
            String nameParameter = GetCommand.getParamName();
            System.out.println("Введите значение: ");
            if (nameParameter.equals("expenditure")) { //5.1
                Float value = GetCommand.getValueNumber();
                for (Bus transport : transports) {
                    if (!transport.getExpenditure().equals(value)) {
                        mapTransport.remove(transport.getNubmer(), transport);
                    }
                }
            }
            if (nameParameter.equals("capacity")) {//58
                Float value = GetCommand.getValueNumber();
                for (Bus transport : transports) {
                    if (!Float.valueOf(transport.getCapacity()).equals(value)) {
                        mapTransport.remove(transport.getNubmer(), transport);
                    }
                }
            }
            if (nameParameter.equals("tripPrice")) {
                Float value = GetCommand.getValueNumber();
                for (Bus transport : transports) {
                    if (!transport.getTripPrice().equals(value)) {
                        mapTransport.remove(transport.getNubmer(), transport);
                    }
                }
            }
            if (nameParameter.equals("paymentMethod")) {
                String value = GetCommand.getValueString();
                for (Bus transport : transports) {
                    if (!transport.getPaymentMethod().equals(value)) {
                        mapTransport.remove(transport.getNubmer(), transport);
                    }
                }
            }
            if (nameParameter.equals("personsWithDisabilities")) {
                Boolean value = GetCommand.getValueBool();
                for (Bus transport : transports) {
                    if (!transport.getPersonsWithDisabilities().equals(value)) {
                        mapTransport.remove(transport.getNubmer(), transport);
                    }
                }
            }
            if (nameParameter.equals("conductor")) {
                Boolean value = GetCommand.getValueBool();
                for (Bus transport : transports) {
                    Boolean conductor = transport.getConductor();
                    if (!conductor.equals(value)) {
                        mapTransport.remove(transport.getNubmer(), transport);
                    }
                }
            }
        }
        System.out.println(mapTransport.keySet());
    }

}