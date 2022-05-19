import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class moneyTest {




        @Test
        void deposit() {
            money money =new money(500);
           money.deposit(1000);
            assertTrue(money.getAmountofmoney()==1500);
        }

        @Test
        void withdrawal() {
            money cs = new money(500);
            assertEquals(0, cs.withdrawal(50));
            assertEquals(-1, cs.withdrawal(500));
        }
    }

