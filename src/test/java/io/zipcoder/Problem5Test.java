package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem5Test {


    @Test
    public void testReverseString(){
        //given
        String input = "I love Zip Code Wilmington";

        //when
        String actual = Problem5.reverseString(input);

        //then
        String expected = "notgnimliW edoC piZ evol I";
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testReverseStringTwo(){
        //given
        String input = "My name is Keith";

        //when
        String actual = Problem5.reverseString(input);

        //then
        String expected = "htieK si eman yM";
        Assert.assertEquals(actual, expected);

    }
}
