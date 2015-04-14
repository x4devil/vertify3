
import converter.WeightConverter;
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
    
}
