package com.leno.aggregate;

import java.util.Arrays;

/**
 * @author LHYTC
 * @Title: 星期的枚举
 * @Package
 * @Description: 测试枚举
 * @date 2021-08-12 09:49
 */
public enum WeekEnum {
    MON("星期一"),TUES("星期二"),WED("星期三"),THUR("星期四"),FRI("星期五"),SAT("星期六"),SUN("星期日");
    private String name;

    WeekEnum(String name){
        this.name = name;
    }

    /**
     * 获取枚举值
     */
    public void getValue(){
        System.out.println(this.name);
    }

    /**
     * 获取枚举名称
     */
    public void getNames(){
        WeekEnum[] vals = values();
        System.out.println(Arrays.toString(vals));
    }
}
