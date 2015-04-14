package converter;

public class LengthConverter {
    //Система СИ
    public static final int CENTIMETER = 0; //Сантиметр
    public static final int METER = 1; //Метр
    public static final int KILOMETERS = 2; //Километр
    
    //Американская система
    public static final int MILE = 3; //МИЛЯ
    public static final int FT = 4; //ФУТ
    public static final int YARD = 5; //ЯРД
    
    //Старорусская система
    public static final int VERSTA = 6; //ВЕРСТА
    public static final int FATHOM = 7; //САЖЕНЬ
    public static final int ARSHIN = 8; //АРШИН
    
    //Величины переведены в М
    public static final double[] values = {
        0.01,//сантиметр
        1,//метр
        1000,//киллометр
        1852,//миля
        0.3,//фут
        0.9144,//ярд
        1066.8,//верста
        2.133,//сажень
        0.711//аршин
    };
    
    public static double convertToMeter(double length, int system) {
        return length * values[system];
    }
    
    public static double convert(double length, int systemFrom, int systemTo) {
        return 0.0;
    }
}
