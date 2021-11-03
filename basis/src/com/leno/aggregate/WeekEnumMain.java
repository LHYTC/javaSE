package com.leno.aggregate;

/**
 * @author LHYTC
 * @Title: 测试枚举类
 * @Package
 * @Description:
 * @date 2021-08-12 09:50
 */
public class WeekEnumMain {
    public static void main(String[] args) {
        WeekEnum ee = WeekEnum.WED;
        System.out.print(ee.name()+ ":");
        ee.getValue();
        ee.getNames();
    }
}
