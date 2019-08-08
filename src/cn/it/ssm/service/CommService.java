package cn.it.ssm.service;


import cn.it.ssm.po.CommCustom;
import cn.it.ssm.po.ListQueryVo;

import java.util.List;

public interface CommService {

    //商品查询列表
    public List<CommCustom> findComm(ListQueryVo listQueryVo) throws Exception;

    //根据id查询
    public CommCustom findCommById(Integer comm_id) throws Exception;

    //修改商品信息
    public void updateCommList(Integer comm_id, CommCustom commCustom) throws Exception;

}
