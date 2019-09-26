public class Main {
    public static void main(String[] args) {
        Tariff MyOnline = new Tariff(2211,"Мой онлайн", false,290,400,15,
                0, true,true,true);
        Tariff MyOnlinePlus = new Tariff(2212,"Мой онлайн+", false,350,600,
                20,0,true,true,true);
        Tariff MyTele2 = new Tariff(2213,"Мой Tele2", true,7,0,
                6,0,true,false,false);

    }
}
