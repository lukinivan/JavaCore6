package HomeWork.module4;

public class Main {
    public static void main(String[] args) {
        Bank usBank1 = new USBank(5554443,"USA",Currency.USD,48,
                7852,145,100000);
        Bank usBank2 = new USBank(555331,"USA",Currency.EUR,7,
                5002,98,50000);

        Bank euBank1 = new EUBank(4442314,"France",Currency.USD,8946,
                2000,45,45236);
        Bank euBank2 = new EUBank(4448880,"Poland",Currency.EUR,7889,
                3100,123,7800);

        Bank chinaBank1 = new ChinaBank(1114856,"France",Currency.USD,651,
                7000,75,125789);
        Bank chinaBank2 = new ChinaBank(1117431,"Poland",Currency.EUR,711,
                50000,112,500000);

        User user1 = new User(123456789,"Ivan",1000000,10,"LukinCorp",
                5278,usBank1);
        User user2 = new User(134679134,"Nikolay",896423,78,"LukinCorp",
                1000,usBank2);

        User user3 = new User(852369741,"Fedia",700000,20,"LukinCorp",
                8922,euBank1);
        User user4 = new User(147896325,"Semen",450000,21,"LukinCorp",
                786,euBank2);

        User user5 = new User(587412369,"Vika",1230000,4,"LukinCorp",
                7122,chinaBank1);
        User user6 = new User(985632147,"Leonid",753000,34,"LukinCorp",
                3467,chinaBank2);
    }
}
