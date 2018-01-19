package com.xidian.kmj;
import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        int times = 6;
        Scanner sc = new Scanner(System.in);
        String input = "",answer = "",res="";
        AnswerGenerator ag = new AnswerGenerator();
        answer = ag.generatorAnswer();
//        System.out.println("answer:"+answer);
        System.out.println("Welcome!");
        System.out.println();
        while(times != 0){
            System.out.print("please input your number("+times+"):");
            times--;
            input = sc.next();
            boolean isRepeat = hasRepeatNumber(input);
            if(isRepeat){
                System.out.println("Cannot input duplicate numbers!");
                continue;
            }else{

                CompareNumber cn = new CompareNumber();
                res = cn.compareNumber(answer,input);
                if(res.equals("4A0B")){
                    System.out.println("Congratulations!");
                    break;
                }else{
                    System.out.println(res);
                }
                System.out.println();
            }
        }
        if(times == 0){
            System.out.println("Game Over!");
        }
    }

    public static boolean hasRepeatNumber(String s){
        if(s.chars().distinct().count() == 4){
            return false;
        }else{
            return true;
        }
    }

}
