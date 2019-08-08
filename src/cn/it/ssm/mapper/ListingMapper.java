package cn.it.ssm.mapper;

import cn.it.ssm.po.Listing;
import cn.it.ssm.po.ListingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ListingMapper {
    int countByExample(ListingExample example);

    int deleteByExample(ListingExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(Listing record);

    int insertSelective(Listing record);

    List<Listing> selectByExample(ListingExample example);

    Listing selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") Listing record, @Param("example") ListingExample example);

    int updateByExample(@Param("record") Listing record, @Param("example") ListingExample example);

    int updateByPrimaryKeySelective(Listing record);

    int updateByPrimaryKey(Listing record);
}