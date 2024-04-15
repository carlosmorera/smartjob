package smartjob.challenge.utilities;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

@SpringBootTest
class UtilityTest {

    @Test
    void shouldValidateEmail() {
        assertTrue(Utility.validateEmailStructure("test@gmail.com"));
        assertFalse(Utility.validateEmailStructure("tes"));
    }

    @Test
    void shouldValidatePassword() {
        String regex= "^(?=.*\\\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
        assertFalse(Utility.validatePasswordStructure("tes", regex));
    }

}