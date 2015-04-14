public class WeightConverter {
    //Система СИ
    public static final int GRAM = 0; //Грамм
    public static final int KILLOGRAM = 1; //Киллограм
    public static final int TON = 2; //Тонна
    
    //Американская система
    public static final int KVITAL = 3; //Квитал
    public static final int KVARTER = 4; //Квартер
    public static final int STOUN = 5; //Стоун
    
    //Старорусская система
    public static final int LOT = 6; //Лот
    public static final int ZOLOTNIK = 7; //Золотник
    public static final int PART = 8; //Доля
    
    //Величины переведены в кг
    public static final double[] values = {
        0.001, //Грамм
        1, //Киллограм
        1000, //Тонна
        43.36, //Квитал
        11.34, //Квартер
        6.35, //Стоун
        0.01638, //Лот
        0.00426, //Золотник
        0.00004 //Доля
    };
    
    public static double convertToKillogram(double weight, int system) {
        return weight * values[system];
    }
    
    public static double convert(double weight, int systemFrom, int systemTo) {
        return 0.0;
    }
}
