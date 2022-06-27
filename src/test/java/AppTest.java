import client.CapitalClient;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class AppTest {

    @Test
    public void testCapitalize(){
        String actual = "Abcdefghi";
        String expected = CapitalClient.capitalLetter(actual);
        assertThat(expected, equalTo(actual.toUpperCase()));
    }

}
