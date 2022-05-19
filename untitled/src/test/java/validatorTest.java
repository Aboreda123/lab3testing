import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class validatorTest {

        @Test
        public void cardvalid() {
            validator at =new validator();
            assertEquals("valid",at.cardvalidator("1231434123412111"));
            assertEquals("invalid",at.cardvalidator("1231242144444421412"));
        }

        @Test
        void pinvalid() {
            validator at =new validator();
            assertEquals("valid",at.pinvalidator("1242"));
            assertEquals("invalid",at.pinvalidator("0124424131230"));
        }

        @Test
        void access() {
            validator at =new validator();
            assertEquals("undefined mode",at.access("1242","1231434123412111","sfsw",1000));
            assertEquals("No sufficent amount",at.access("1242","1231434123412111","withdrawal",323332));
            assertEquals("invalid card or pin",at.access("123","123124214441","deposit",1000));
            assertEquals("transaction success",at.access("1242","1231434123412111","deposit",1000));
            assertEquals("cannot complete transaction",at.access("1242","1231434123412111","deposit",-210));
        }

    }

