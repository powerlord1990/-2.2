public class Tariff {
    long tariffId;
    String tariffName;
    boolean tariffCostPerDay;
    double tariffCost;
    double tariffMinutes;
    double tariffInternet;
    double tariffSms;
    boolean tariffUnlimitedCall;
    boolean tariffFreeSocial;
    boolean tariffFreeMessengers;

    Tariff(long id, String name, boolean costPerDay, double cost, double minutes, double internet, double sms,
           boolean unlimitedCall, boolean freeSocial, boolean freeMessengers) {
        tariffId = id;
        tariffName = name;
        tariffCostPerDay = costPerDay;
        tariffCost = cost;
        tariffMinutes = minutes;
        tariffInternet = internet;
        tariffSms = sms;
        tariffUnlimitedCall = unlimitedCall;
        tariffFreeSocial = freeSocial;
        tariffFreeMessengers = freeMessengers;
    }
}
