package person;

import transport.AirTransport;
import transport.LandTransport;
import transport.MaritimeMeansOfTransport;

/**
 * @description:
 * @author: dell
 * @date: Created in 2020/5/15 0:40
 * @version: 3.0
 * @modified By:
 */
public class Person {
    private int p_Age = 18;
    private String p_Sex = "男";
    private String id = "201902202";
    private String p_Name;

    public Person(String p_Name) {
        this.p_Name = p_Name;
    }

    public Person() {
    }

    public void driveTransport(AirTransport transport) {
        transport.drivingMethod(transport);
    }
    public void driveTransport(LandTransport transport) {
        transport.drivingMethod(transport);
    }
    public void driveTransport(MaritimeMeansOfTransport transport) {
        transport.drivingMethod(transport);
    }
}
