package cn.it.ssm.po;

import cn.it.ssm.controller.validation.ValidGroup1;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommList {
    private Integer comm_id;
    //校验名称
    //    @Size(min = 1,max = 20,message = "{commList.comm_name.length.error}")
    @Size(min = 1, max = 20, message = "请输入1到20个字符的商品名称",groups = {ValidGroup1.class})
    private String comm_name;

    private Double comm_price;

    @NotNull(message = "日期不能为空")
    private Date date;

    public Integer getComm_id() {
        return comm_id;
    }

    public void setComm_id(Integer comm_id) {
        this.comm_id = comm_id;
    }

    public String getComm_name() {
        return comm_name;
    }

    public void setComm_name(String comm_name) {
        this.comm_name = comm_name;
    }

    public Double getComm_price() {
        return comm_price;
    }

    public void setComm_price(Double comm_price) {
        this.comm_price = comm_price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CommList{" +
                "comm_id=" + comm_id +
                ", comm_name='" + comm_name + '\'' +
                ", comm_price=" + comm_price +
                ", date=" + date +
                '}';
    }
}