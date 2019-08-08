package cn.it.ssm.po;

import java.util.List;

public class ListQueryVo {

    //商品信息
    private CommList commList;

    //    为了系统可扩展性，对原始dao进行扩展
    private CommCustom commCustom;

//    批量商品信息
    private List<CommCustom> commCustomList;
//    private UserCustom userCustom;
//
//    public UserCustom getUserCustom() {
//        return userCustom;
//    }
//
//    public void setUserCustom(UserCustom userCustom) {
//        this.userCustom = userCustom;
//    }

    public CommList getCommList() {
        return commList;
    }

    public void setCommList(CommList commList) {
        this.commList = commList;
    }

    public CommCustom getCommCustom() {
        return commCustom;
    }

    public void setCommCustom(CommCustom commCustom) {
        this.commCustom = commCustom;
    }

    public List<CommCustom> getCommCustomList() {
        return commCustomList;
    }

    public void setCommCustomList(List<CommCustom> commCustomList) {
        this.commCustomList = commCustomList;
    }
}
