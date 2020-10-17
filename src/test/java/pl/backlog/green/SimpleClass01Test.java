package pl.backlog.green;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleClass01Test {
    @Test
    void comparingTheSameObjectUsingOperator() {
        // given
        SimpleClass01 o = new SimpleClass01();

        // when
        boolean result = o == o;

        // then
        assertTrue(result);
    }

    @Test
    void comparingTwoEqualsObjectsUsingOperator() {
        // given
        SimpleClass01 o1 = new SimpleClass01();
        SimpleClass01 o2 = new SimpleClass01();

        // when
        boolean result = o1 == o2;

        // then
        assertTrue(result);
    }

    @Test
    void comparingTwoEqualsObjectsUsingMethod() {
        // given
        SimpleClass01 o1 = new SimpleClass01();
        SimpleClass01 o2 = new SimpleClass01();

        // when
        boolean result = o1.equals(o2);

        // then
        assertTrue(result);
    }
}