package com.macro.mall.mapper;

import com.macro.mall.model.OauthCode;
import com.macro.mall.model.OauthCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OauthCodeMapper {
    long countByExample(OauthCodeExample example);

    int deleteByExample(OauthCodeExample example);

    int insert(OauthCode record);

    int insertSelective(OauthCode record);

    List<OauthCode> selectByExampleWithBLOBs(OauthCodeExample example);

    List<OauthCode> selectByExample(OauthCodeExample example);

    int updateByExampleSelective(@Param("record") OauthCode record, @Param("example") OauthCodeExample example);

    int updateByExampleWithBLOBs(@Param("record") OauthCode record, @Param("example") OauthCodeExample example);

    int updateByExample(@Param("record") OauthCode record, @Param("example") OauthCodeExample example);
}