/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author x4
 */
public class LengthConverterTest {
    public static double EPS = 0.0001;
    //Величины переведены в метры
    double[] values = {
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
    
    public LengthConverterTest() {
    }
    
    @Test
    public void testConvertToMeter() {
        System.out.println("testConvertToMeter");
        int[] systems = {
            LengthConverter.CENTIMETER,
            LengthConverter.METER,
            LengthConverter.KILOMETERS,
            LengthConverter.MILE,
            LengthConverter.FT,
            LengthConverter.YARD,
            LengthConverter.VERSTA,
            LengthConverter.FATHOM,
            LengthConverter.ARSHIN
        };

        double value = 5.0;
        int length = systems.length;
        for (int i = 0; i < length; i++) {
            double result = LengthConverter.convertToMeter(value, systems[i]);
            assertEquals(values[i] * value, result, EPS);
        }
    }
    
}
