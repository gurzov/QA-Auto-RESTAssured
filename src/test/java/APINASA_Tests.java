import org.junit.Assert;
import org.junit.Test;
import utils.Request_To_NASA_API;

public class APINASA_Tests {

    @Test
    public void checkReceivedPhotosCount() {
        Assert.assertEquals(2, Request_To_NASA_API.getJsonArrayLength());
    }

    @Test
    public void checkSolarDayNumberWhenPhotosTaken() {
        Assert.assertEquals(1000, Request_To_NASA_API.getSolarDayNumber());
    }

    @Test
    public void checkPhotosTakenAtTheSameEarthDate() {
        System.out.println("not implemented yet");
    }
}
