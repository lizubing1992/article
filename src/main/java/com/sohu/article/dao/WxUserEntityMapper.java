package com.sohu.article.dao;

import com.sohu.article.model.WxUserEntity;
import com.sohu.article.model.WxUserEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxUserEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_user
     *
     * @mbg.generated Mon Dec 03 19:03:45 CST 2018
     */
    long countByExample(WxUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByExample(@Param("version") Integer version, @Param("example") WxUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_user
     *
     * @mbg.generated Mon Dec 03 19:03:45 CST 2018
     */
    int deleteByExample(WxUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByPrimaryKey(@Param("version") Integer version, @Param("key") Integer key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_user
     *
     * @mbg.generated Mon Dec 03 19:03:45 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_user
     *
     * @mbg.generated Mon Dec 03 19:03:45 CST 2018
     */
    int insert(WxUserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_user
     *
     * @mbg.generated Mon Dec 03 19:03:45 CST 2018
     */
    int insertSelective(WxUserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    WxUserEntity selectOneByExample(WxUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    WxUserEntity selectOneByExampleSelective(@Param("example") WxUserEntityExample example, @Param("selective") WxUserEntity.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<WxUserEntity> selectByExampleSelective(@Param("example") WxUserEntityExample example, @Param("selective") WxUserEntity.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_user
     *
     * @mbg.generated Mon Dec 03 19:03:45 CST 2018
     */
    List<WxUserEntity> selectByExample(WxUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    WxUserEntity selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") WxUserEntity.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_user
     *
     * @mbg.generated Mon Dec 03 19:03:45 CST 2018
     */
    WxUserEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExample(@Param("version") Integer version, @Param("record") WxUserEntity record, @Param("example") WxUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExampleSelective(@Param("version") Integer version, @Param("record") WxUserEntity record, @Param("example") WxUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_user
     *
     * @mbg.generated Mon Dec 03 19:03:45 CST 2018
     */
    int updateByExampleSelective(@Param("record") WxUserEntity record, @Param("example") WxUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_user
     *
     * @mbg.generated Mon Dec 03 19:03:45 CST 2018
     */
    int updateByExample(@Param("record") WxUserEntity record, @Param("example") WxUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByPrimaryKey(@Param("version") Integer version, @Param("record") WxUserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByPrimaryKeySelective(@Param("version") Integer version, @Param("record") WxUserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_user
     *
     * @mbg.generated Mon Dec 03 19:03:45 CST 2018
     */
    int updateByPrimaryKeySelective(WxUserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_user
     *
     * @mbg.generated Mon Dec 03 19:03:45 CST 2018
     */
    int updateByPrimaryKey(WxUserEntity record);
}