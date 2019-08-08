package cn.it.ssm.service.impl;


import cn.it.ssm.mapper.CommListMapper;
import cn.it.ssm.mapper.CommMapperCustom;
import cn.it.ssm.po.CommCustom;
import cn.it.ssm.po.CommList;
import cn.it.ssm.po.ListQueryVo;
import cn.it.ssm.service.CommService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommServiceImpl implements CommService {

    @Autowired
    private CommMapperCustom commMapperCustom;

    @Autowired
    private CommListMapper commListMapper;

    @Override
    public List<CommCustom> findComm(ListQueryVo listQueryVo) throws Exception {
//        通过commmappercustom查询数据库
        return commMapperCustom.findComm(listQueryVo);
    }

    @Override
    public CommCustom findCommById(Integer comm_id) throws Exception {
        CommList commList = commListMapper.selectByPrimaryKey(comm_id);
//        返回commcustom
        CommCustom commCustom = null;
//        将commlist中的值拷贝到commcustomv
        if (commList != null) {
            commCustom = new  CommCustom();
            BeanUtils.copyProperties(commList, commCustom);
        }
        return commCustom;
    }

    @Override
    public void updateCommList(Integer comm_id, CommCustom commCustom) throws Exception {
        System.out.println(commCustom.toString());
//      添加业务校验,通常在service接口对关键参数校验，id是否为空
//        更新商品信息
        commCustom.setComm_id(comm_id);
        commListMapper.updateByPrimaryKey(commCustom);
    }
}
