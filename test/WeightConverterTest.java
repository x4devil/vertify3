
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author x4
 */
public class WeightConverterTest {
    
    public static double EPS = 0.0001;
    int[] systemSi = {
            WeightConverter.GRAM,
            WeightConverter.KILLOGRAM,
            WeightConverter.TON,
        };
        
    int[] systemRus = {
        WeightConverter.LOT,
        WeightConverter.ZOLOTNIK,
        WeightConverter.PART
    };

    int[] systemUsa = {
        WeightConverter.KVITAL,
        WeightConverter.KVARTER,
        WeightConverter.STOUN
    };

    double[] values = {
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

    public WeightConverterTest() {

    }

    @Test
    public void testConvertToKillogram() {
        System.out.println("testConvertTokillogram");
        int[] systems = {
            WeightConverter.GRAM,
            WeightConverter.KILLOGRAM,
            WeightConverter.TON,
            WeightConverter.KVITAL,
            WeightConverter.KVARTER,
            WeightConverter.STOUN,
            WeightConverter.LOT,
            WeightConverter.ZOLOTNIK,
            WeightConverter.PART
        };
        double[] expResults = {
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

        double weight = 5.0;
        int length = systems.length;
        for (int i = 0; i < length; i++) {
            double result = WeightConverter.convertToKillogram(weight, systems[i]);
            assertEquals(expResults[i] * weight, result, EPS);
        }
    }
    
    @Test
    public void testConvertSi() {
        double weight = 10;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                double kg = WeightConverter.convertToKillogram(weight, systemSi[i]);
                double resultSi = kg / values[systemSi[j]];
                double resultRus = kg / values[systemRus[j]];
                double resultUsa = kg / values[systemUsa[j]];
                
                assertEquals(resultRus, WeightConverter.convert(weight, systemSi[i], systemRus[j]), EPS);
                assertEquals(resultUsa, WeightConverter.convert(weight, systemSi[i], systemUsa[j]), EPS);
            }
        }
    }
    
    
    
}
