package com.macro.mall.mapper;

import com.macro.mall.model.OauthClientDetails;
import com.macro.mall.model.OauthClientDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OauthClientDetailsMapper {
    long countByExample(OauthClientDetailsExample example);

    int deleteByExample(OauthClientDetailsExample example);

    int deleteByPrimaryKey(String clientId);

    int insert(OauthClientDetails record);

    int insertSelective(OauthClientDetails record);

    List<OauthClientDetails> selectByExample(OauthClientDetailsExample example);

    OauthClientDetails selectByPrimaryKey(String clientId);

    int updateByExampleSelective(@Param("record") OauthClientDetails record, @Param("example") OauthClientDetailsExample example);

    int updateByExample(@Param("record") OauthClientDetails record, @Param("example") OauthClientDetailsExample example);

    int updateByPrimaryKeySelective(OauthClientDetails record);

    int updateByPrimaryKey(OauthClientDetails record);
}