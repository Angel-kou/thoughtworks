package com.xidian.test;

import com.xidian.kmj.AnswerGenerator;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


public class AnswerGeneratorTest {

    private AnswerGenerator test = new AnswerGenerator();
    private String answer;

    @Before
    public void setup(){
        answer = test.generatorAnswer();
    }

    @Test
    public void  shouldOutputFourNumber(){
       assertThat(answer.length(),is(4));
    }

    @Test
    public void shouldOutputNotRepeatNumber(){
       assertThat(distinctCharacterLength(answer),is(4L));
    }

    @Test
    public void shouldOutputLegalNumber(){
        assertTrue("Is not a legal number",isLegalNumber(answer));
    }

    private boolean isLegalNumber(String s){
        return s.chars().allMatch(character -> character >= '0' && character <= '9');
    }


    private long distinctCharacterLength(String s){
        return s.chars().distinct().count(); }





}
