package com.example.bmi_calculator;

/**
 * Created by ON-ONE on 10/23/2016.
 */
public class Human {
    public Integer Cal(String height,String weight){
        int a = (Integer.parseInt(height))*100;
        int b= Integer.parseInt(weight);
        int outPut = b/(a*a);

        return outPut;
    }
    public String level(int a){
        String out="";
        if (a<18.5){
            out ="น้ำหนักน้อยกว่าปกติ(ผอม)";
        }else if(18.8<=a&&a<25){
            out ="น้ำหนักปกติ";
        }else if(25<=a&&a<30){
            out ="น้ำหนักมากกว่าปกต(ท้วม)";
        }else if(a>=30){
            out ="น้ำหนักมากกว่าปกติมาก(อ้วน)";
        }
        return out;
    }

}
