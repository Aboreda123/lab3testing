import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class coffemachineTest {
    @Test
    void picktiming() {
        coffemachine cm =new  coffemachine();
        cm.setType("Black");
        assertTrue(cm.picktiming()==1000);
        cm.setType("latte");
        assertTrue(cm.picktiming()==500);
    }

    @Test
    void picktemp() {
        coffemachine cm =new  coffemachine();
        cm.setType("Black");
        assertTrue(cm.picktemp()==25);
        cm.setType("latte");
        assertTrue(cm.picktemp()==30);
    }

    @Test
    void startmaking() {}

}