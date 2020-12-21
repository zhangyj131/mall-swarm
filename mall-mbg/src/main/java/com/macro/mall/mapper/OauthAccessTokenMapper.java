package com.macro.mall.mapper;

import com.macro.mall.model.OauthAccessToken;
import com.macro.mall.model.OauthAccessTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OauthAccessTokenMapper {
    long countByExample(OauthAccessTokenExample example);

    int deleteByExample(OauthAccessTokenExample example);

    int deleteByPrimaryKey(String authenticationId);

    int insert(OauthAccessToken record);

    int insertSelective(OauthAccessToken record);

    List<OauthAccessToken> selectByExampleWithBLOBs(OauthAccessTokenExample example);

    List<OauthAccessToken> selectByExample(OauthAccessTokenExample example);

    OauthAccessToken selectByPrimaryKey(String authenticationId);

    int updateByExampleSelective(@Param("record") OauthAccessToken record, @Param("example") OauthAccessTokenExample example);

    int updateByExampleWithBLOBs(@Param("record") OauthAccessToken record, @Param("example") OauthAccessTokenExample example);

    int updateByExample(@Param("record") OauthAccessToken record, @Param("example") OauthAccessTokenExample example);

    int updateByPrimaryKeySelective(OauthAccessToken record);

    int updateByPrimaryKeyWithBLOBs(OauthAccessToken record);

    int updateByPrimaryKey(OauthAccessToken record);
}