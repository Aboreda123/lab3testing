import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class digitalwatchTest {
    public static digitalwatch dw;
    public static alarm am;


    @Nested
    class TopDown{
        @BeforeAll
        public  void init(){
            dw = new digitalwatch();
            am = new alarm();
        }

        @Test
        public void testdw1(){
            assertTrue(dw.input('t'));
        }

        @Test
        public void testdw2(){
            assertTrue(dw.input('a'));
        }

        @Test
        public void testdw3(){
            assertTrue(dw.input('u'));
        }

        @Test
        public void testdw4(){
            assertTrue(dw.input('s'));
        }

        @Test
        public void testdw5(){
            assertTrue(dw.input('c'));
        }

        @Test
        public void testdw6(){
            assertTrue(dw.input('t'));
        }

        @Test
        public void testdw7(){
            assertTrue(dw.input('s'));
        }

        @Test
        public void testdw8(){
            assertTrue(dw.input('s'));
        }

        @Test
        public void testdw9(){
            assertTrue(dw.input('m'));
        }

        @Test
        public void testdw10(){
            assertTrue(dw.input('D'));
        }



        @Test
        public void testam(){
            assertFalse(am.checkA());
            assertFalse(am.unsetA());
            assertTrue(am.setA());
            assertTrue(am.checkA());
            assertTrue(am.setA());
            assertFalse(am.setA());
            assertTrue(am.unsetA());
        }

    }
    @Nested
    class BottomUp {
        @BeforeAll
        public void init() {
            dw = new digitalwatch();
            am = new alarm();
        }

        @Test
        public void testam() {
            assertFalse(am.checkA());
            assertFalse(am.unsetA());
            assertTrue(am.setA());
            assertTrue(am.checkA());
            assertTrue(am.setA());
            assertFalse(am.setA());
            assertTrue(am.unsetA());
        }


        @Test
        public void testdw1() {
            assertTrue(dw.input('t'));
        }

        @Test
        public void testdw2() {
            assertTrue(dw.input('a'));
        }

        @Test
        public void testdw3() {
            assertTrue(dw.input('s'));
        }

        @Test
        public void testdw4() {
            assertTrue(dw.input('c'));
        }

        @Test
        public void testdw5() {
            assertTrue(dw.input('s'));
        }

        @Test
        public void testdw6() {
            assertTrue(dw.input('u'));
        }

        @Test
        public void testdw7() {
            assertTrue(dw.input('t'));
        }

        @Test
        public void testdw8() {
            assertTrue(dw.input('s'));
        }

        @Test
        public void testdw9() {
            assertTrue(dw.input('s'));
        }

        @Test
        public void testdw10() {
            assertTrue(dw.input('m'));
        }

        @Test
        public void testdw11() {
            assertTrue(dw.input('D'));
        }

    }



}