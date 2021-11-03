package com.leno.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author LHYTC
 * @Title:
 * @Package
 * @Description:
 * @date 2021-10-29 17:13
 */
public class SetMainTest {
    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add(new PersonBean("weeis"));
        set.add(new PersonBean("weeis"));
        set.add(new PersonBean("we1s"));
        set.add(new PersonBean("weeisdfs"));
        set.add(new PersonBean("we"));
        set.add(new PersonBean("we"));
        set.add(new PersonBean("sssweeis"));
        System.out.println(set);
    }
}
