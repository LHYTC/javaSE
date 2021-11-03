package com.leno.set;

/**
 * @author LHYTC
 * @Title:
 * @Package
 * @Description:
 * @date 2021-10-29 17:06
 */
public class PersonBean implements Comparable{
    private String name;

    public PersonBean(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        if(o != null){
            PersonBean personBean = (PersonBean) o;
            return this.getName().length() - personBean.getName().length();
        }
        return -1;
    }

    @Override
    public String toString() {
        return "PersonBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
