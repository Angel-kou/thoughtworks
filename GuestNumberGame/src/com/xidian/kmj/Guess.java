package com.xidian.kmj;

public class Guess {
    private AnswerGenerator  ag = new AnswerGenerator();
    private CompareNumber  cn = new CompareNumber();

    public String guess(String input){
        String res = cn.compareNumber(ag.generatorAnswer(),input);
        return res;
    }




}
