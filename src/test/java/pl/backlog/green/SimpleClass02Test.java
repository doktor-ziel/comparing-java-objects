package pl.backlog.green;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleClass02Test {

@Test
void simpleComparingTest() {
    // given
    SimpleClass01 o1 = new SimpleClass01();
    SimpleClass02 o2 = new SimpleClass02();

    // when
    boolean result = o1.equals(o2);

    // then
    assertTrue(result);
}

}