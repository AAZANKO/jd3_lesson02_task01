package by.htp.zanko;

import org.junit.Assert;
import org.junit.Test;

public class CorrectStringTest {

    private CorrectString correctString = new CorrectString();

    @Test
    public void checkGetCorrectString() {

        boolean resultCorrectString = correctString.getCorrectString("hi123 (yg [uog (vrd) ]5)674 (gio h87y) hui {n hg768} ");
        Assert.assertNotNull(resultCorrectString);
    }

}