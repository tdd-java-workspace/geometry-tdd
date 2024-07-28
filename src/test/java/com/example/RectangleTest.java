package com.example;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RectangleTest {

    @Test
    void toReturnTwentyAsAreaWhenLengthIsFiveAndBreadthIsFour() {

        int four = 4, five = 5, twenty = 20;
        Rectangle rectangle = new Rectangle();

        assertThat(rectangle.area(five, four), is(equalTo(twenty)));
    }
}
