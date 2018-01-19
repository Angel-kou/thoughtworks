package com.xidian.test;

import com.xidian.kmj.CompareNumber;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class CompareNumberTest {

    private static CompareNumber test;


    @BeforeClass
    public static void setup(){
        test = new CompareNumber();
    }


    @Test
    public void shouldOutput4A0BWhenInputAllEqualNumber(){
        assertThat(test.compareNumber("1234","1234"),is("4A0B"));
    }

    @Test
    public void shouldOutput1A0BWhenInputOneValueEqualDigitNotEqualNumber(){
        assertThat(test.compareNumber("1234","1678"),is("1A0B"));
    }

    @Test
    public void shouldOutput0A0BWhenInputAllNotEqualNumber(){
        assertThat(test.compareNumber("1234","5678"),is("0A0B"));
    }

    @Test
    public void shouldOutput0A4BWhenInputAllValueEqualDigitNotEqualNumber(){
        assertThat(test.compareNumber("1234","4321"),is("0A4B"));
    }


}
