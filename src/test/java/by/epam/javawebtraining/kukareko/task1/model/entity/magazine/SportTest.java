package by.epam.javawebtraining.kukareko.task1.model.entity.magazine;

import by.epam.javawebtraining.kukareko.task1.model.entity.Publication;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Yulya Kukareko
 * @version 1.0 02 Mar 2019
 */
public class SportTest {

    Sport sport;

    @Before
    public void init(){
        sport = new Sport(5L, 50, "Billiards sport", 6, "MFBS",
                100, 6, 30, "Billiards");
    }

    @Test
    public void testCreateObj() {
        Sport publication = new Sport(5L, 50, "Billiards sport", 2, "MFBS", 100, 6,
                30, "Billiards");
        String expected = "Billiards";

        Assert.assertEquals(expected, publication.getKindSport());
    }

    @Test
    public void testCreateObjKindSportNull() {
        Sport publication = new Sport(5L, 50, "Billiards sport", 2, "MFBS", 100, 6,
                30, null);
        String expected = "";

        Assert.assertEquals(expected, publication.getKindSport());
    }

    @Test
    public void testEquals() {
        Publication compared = new Sport(5L, 50, "Billiards sport", 6, "MFBS",
                100, 6, 30, "Billiards");

        Assert.assertTrue(sport.equals(compared) && compared.equals(sport));
    }

    @Test
    public void testEqualsNull() {
        Publication compared = null;

        Assert.assertFalse(sport.equals(compared) && compared.equals(sport));
    }

    @Test
    public void testEqualsOtherType() {
        Publication compared = new Science();

        Assert.assertFalse(sport.equals(compared) && compared.equals(sport));
    }

    @Test
    public void testToString() {
        String expected = "Sport: kindSport: Billiards, countArticles = 30, long: 5 page count = 50, name = Billiards sport"
                + ", font = 6, publishing = MFBS, circulation = 100 rating = 6";

        Assert.assertEquals(expected, sport.toString());
    }
}
