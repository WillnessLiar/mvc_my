package cn.it.ssm.po;

import java.io.Serializable;

public class TestPojo implements Serializable {
    private String one;
    private String two;

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    @Override
    public String toString() {
        return "TestPojo{" +
                "one='" + one + '\'' +
                ", two='" + two + '\'' +
                '}';
    }
}
