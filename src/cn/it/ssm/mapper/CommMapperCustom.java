package cn.it.ssm.mapper;

import cn.it.ssm.po.CommCustom;
import cn.it.ssm.po.ListQueryVo;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import java.util.List;
@Repository
public interface CommMapperCustom {

    //    商品查询列表
    public List<CommCustom> findComm(ListQueryVo listQueryVo)throws Exception;

}