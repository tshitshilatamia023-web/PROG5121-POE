import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    Login login = new Login();


    @Test
    public void testUsernameValid() {
        assertTrue(login.checkUserName("kyl_1"));
    }

    @Test
    public void testUsernameInvalid() {
        assertFalse(login.checkUserName("kyle!!!!"));
    }


    @Test
    public void testPasswordValid() {
        assertTrue(login.checkPasswordComplexity("Ch&&sec@ke99!"));
    }

    @Test
    public void testPasswordInvalid() {
        assertFalse(login.checkPasswordComplexity("password"));
    }

    @Test
    public void testPhoneValid() {
        assertTrue(login.checkCellPhoneNumber("+27889689666"));
    }

    @Test
    public void testPhoneInvalid() {
        assertFalse(login.checkCellPhoneNumber("08389689"));
    }
}