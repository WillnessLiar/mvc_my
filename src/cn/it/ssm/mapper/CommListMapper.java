package cn.it.ssm.mapper;

import cn.it.ssm.po.CommCustom;
import cn.it.ssm.po.CommList;
import cn.it.ssm.po.CommListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommListMapper {
    int countByExample(CommListExample example);

    int deleteByExample(CommListExample example);

    int deleteByPrimaryKey(Integer comm_id);

    int insert(CommList record);

    int insertSelective(CommList record);

    List<CommList> selectByExample(CommListExample example);

    CommList selectByPrimaryKey(Integer comm_id);

    int updateByExampleSelective(@Param("record") CommList record, @Param("example") CommListExample example);

    int updateByExample(@Param("record") CommList record, @Param("example") CommListExample example);

    int updateByPrimaryKeySelective(CommList record);

    int updateByPrimaryKey(CommList record);


}