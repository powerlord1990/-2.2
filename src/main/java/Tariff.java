public class Tariff {
    long id;
    String name;
    boolean costPerDay;
    double cost;
    double minutes;
    double internet;
    double sms;
    boolean unlimitedCall;
    boolean freeSocial;
    boolean freeMessengers;

    Tariff(long id, String name, boolean costPerDay, double cost, double minutes, double internet, double sms,
           boolean unlimitedCall, boolean freeSocial, boolean freeMessengers) {
        this.id = id;
        this.name = name;
        this.costPerDay = costPerDay;
        this.cost = cost;
        this.minutes = minutes;
        this.internet = internet;
        this.sms = sms;
        this.unlimitedCall = unlimitedCall;
        this.freeSocial = freeSocial;
        this.freeMessengers = freeMessengers;
    }
}
