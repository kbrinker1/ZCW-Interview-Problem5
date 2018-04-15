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
        String given = "notgnimliW edoC piZ evol I";
        Assert.assertEquals(actual, given);

    }
}
