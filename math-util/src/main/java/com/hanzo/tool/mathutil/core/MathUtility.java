package com.hanzo.tool.mathutil.core;

public class MathUtility {
    // CLASS NÀY CHỨA CÁC HÀM STATIC LÀ NHỮNG HÀM TIỆN ÍCH DÙNG CHUNG CO MỌI NƠI

    // ĐÂY LÀ HÀM MÔ PHỎNG THƯ VIỆN TOÁN HỌC MATH, CỦA JDK
    // HÀM NÀY TÍNH N!
    // N! = 1.2.3...N
    // KO CÓ GIAI THỪA SỐ ÂM
    // 0! = 1
    // 20! VỪA ĐỦ KIỂU LONG, TỨC 21! VƯỢT KIỂU LONG
    public static long getFactorial(int n) {
//đem code chính ra sửa gọi là refactor/refactoring
if (n < 0 || n > 20) {
    throw new IllegalArgumentException(" n must be between 0 and 20");
}

        // bạn đưa invalid data, tớ ném ra ngoại lệ, hàm ko chạy thành công, ko có value


        //sống sót đến đây n = 1...1?
        //for mã tính
        long result = 1;
        for(int i = 1;i <= n;i++)
            result *= i; //nhân dồn vào từng


        return result;

    }

}