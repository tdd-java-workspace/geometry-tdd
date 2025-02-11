package com.example;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RectangleTest {

    @Test
    void toReturnTwentyAsAreaWhenLengthIsFiveAndBreadthIsFour() {

        int four = 4, five = 5, twenty = 20;
        Rectangle rectangle = new Rectangle(five, four);

        assertThat(rectangle.area(), is(equalTo(twenty)));
    }

    @Test
    void toReturnEighteenAsPerimeterWhenLengthIsFiveAndBreadthIsFour() {

        int four = 4, five = 5, eighteen = 18;
        Rectangle rectangle = new Rectangle(five, four);

        assertThat(rectangle.perimeter(), is(equalTo(eighteen)));
    }
}
