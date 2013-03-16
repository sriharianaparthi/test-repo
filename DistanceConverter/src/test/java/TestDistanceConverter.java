import org.junit.Assert;
import org.junit.Test;

public class TestDistanceConverter {
    @Test
    public void testConvertToKm()
    {
        DistanceConverter converter=new DistanceConverter();
        Assert.assertEquals(8.04672,converter.fromMilesToKm(5),0.001d);
    }
}
