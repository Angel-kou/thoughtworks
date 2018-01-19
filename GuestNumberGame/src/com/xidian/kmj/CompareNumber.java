package com.xidian.kmj;

import java.util.HashMap;

public class CompareNumber {

    public String compareNumber(String answer , String input){
        String res = "";
        char[] aArray = answer.toCharArray();
        char[] iArray = input.toCharArray();
        int ANumber = 0 , BNumber = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < aArray.length;i++){
            map.put(aArray[i],i);
        }

        for(int i = 0; i < iArray.length;i++){
            char ch = iArray[i];
            if(map.keySet().contains(ch)){
                if( i == map.get(ch)){
                    ANumber++ ;
                }else {
                    BNumber++;
                }
            }
        }
        res = ANumber+"A"+BNumber+"B";
        return res;
    }

}
