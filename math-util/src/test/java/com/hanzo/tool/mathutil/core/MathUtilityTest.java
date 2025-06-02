package com.hanzo.tool.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test  //@test mang ý nghĩa biến hàm ở sát dưới thành hàm main() thì mới chạy lệnh test khi run app!!
    //Test case 1: Verify Getfactorial
    void testFactorialGivenRightArgument0RunsWell(){
long expected = 1; //hy vọng n = 0, tức là 0! sẽ có giá trị là 1
int n = 0;
long actual = MathUtility.getFactorial(n);
assertEquals(expected, actual);//so sánh giúp xem thức tế có như kì vọng ko. Nếu ko thì màu đỏ


    }

    //Test case 2: Verify Getfactorial with n=1
    @Test
    void testFactorialGivenRightArgument1RunsWell(){
        long expected = 1; //hy vọng n = 0, tức là 0! sẽ có giá trị là 1
        int n = 1;
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual);//so sánh giúp xem thức tế có như kì vọng ko. Nếu ko thì màu đỏ


    }

    //Test case 3: Verify Getfactorial with n=1
    @Test
    void testFactorialGivenRightArgument2RunsWell(){

        assertEquals(2, MathUtility.getFactorial(2));//so sánh giúp xem thức tế có như kì vọng ko. Nếu ko thì màu đỏ
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));

    }




    void getFactorial() {




    }
}