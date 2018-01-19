package com.xidian.kmj;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnswerGenerator {

    public String generatorAnswer(){
        StringBuffer sb = new StringBuffer();
        List<Integer> list =  new ArrayList<>();
        Random random = new Random();
        int first = random.nextInt(9)+1;
        list.add(first);
        while(list.size() < 4){
            int temp = random.nextInt(10);
            if(!list.contains(temp)) {
                list.add(temp);
            }
        }
        for(Integer i : list){
            sb.append(i);
        }
        return sb.toString();
    }


}
