package com.xidian.test;

import com.xidian.kmj.AnswerGenerator;
import com.xidian.kmj.CompareNumber;
import com.xidian.kmj.Guess;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class GuessTest{

    private static Guess guess;
    private static CompareNumber  cn = new CompareNumber();
    private static AnswerGenerator  ag = new AnswerGenerator();



    @BeforeClass
    public static void setUp(){

       guess = mock(Guess.class);

       when(guess.guess("1234")).thenReturn(cn.compareNumber(ag.generatorAnswer(),"1234"));

    }

    @Test
    public void testGuess(){
        String res = guess.guess("1234");
        assertEquals(guess.guess("1234"),cn.compareNumber(ag.generatorAnswer(),"1234"));
    }

}
