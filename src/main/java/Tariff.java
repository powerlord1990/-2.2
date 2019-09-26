public class Tariff {
    long tariffId;
    String tariffName;
    boolean tariffCostPerDay;
    double tariffCost;
    double tariffMinutes;
    double tariffInternet;

    Tariff(double cost, double minutes, double internet, String aS) {
        cost = cost;
        minutes = minutes;
        internet = internet;
        additionalServices = aS;


    }
}
