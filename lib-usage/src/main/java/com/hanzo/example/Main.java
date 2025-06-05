package com.hanzo.example;

import com.hanzo.tool.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Tui cần tính 6 giai thừa mà tôi hi vọng mà màn hình phải in ra 720
        //có app nào làm dc ko
        // thư viện 83.86
        System.out.println("6! =" + MathUtility.getFactorial(6));
    }
}