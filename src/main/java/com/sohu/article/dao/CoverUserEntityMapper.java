package com.sohu.article.dao;

import com.sohu.article.model.CoverUserEntity;
import com.sohu.article.model.CoverUserEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoverUserEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_user
     *
     * @mbg.generated Wed Jan 02 18:29:51 CST 2019
     */
    long countByExample(CoverUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByExample(@Param("version") Integer version, @Param("example") CoverUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_user
     *
     * @mbg.generated Wed Jan 02 18:29:51 CST 2019
     */
    int deleteByExample(CoverUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByPrimaryKey(@Param("version") Integer version, @Param("key") Integer key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_user
     *
     * @mbg.generated Wed Jan 02 18:29:51 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_user
     *
     * @mbg.generated Wed Jan 02 18:29:51 CST 2019
     */
    int insert(CoverUserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_user
     *
     * @mbg.generated Wed Jan 02 18:29:51 CST 2019
     */
    int insertSelective(CoverUserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    CoverUserEntity selectOneByExample(CoverUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    CoverUserEntity selectOneByExampleSelective(@Param("example") CoverUserEntityExample example, @Param("selective") CoverUserEntity.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<CoverUserEntity> selectByExampleSelective(@Param("example") CoverUserEntityExample example, @Param("selective") CoverUserEntity.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_user
     *
     * @mbg.generated Wed Jan 02 18:29:51 CST 2019
     */
    List<CoverUserEntity> selectByExample(CoverUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    CoverUserEntity selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") CoverUserEntity.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_user
     *
     * @mbg.generated Wed Jan 02 18:29:51 CST 2019
     */
    CoverUserEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExample(@Param("version") Integer version, @Param("record") CoverUserEntity record, @Param("example") CoverUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExampleSelective(@Param("version") Integer version, @Param("record") CoverUserEntity record, @Param("example") CoverUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_user
     *
     * @mbg.generated Wed Jan 02 18:29:51 CST 2019
     */
    int updateByExampleSelective(@Param("record") CoverUserEntity record, @Param("example") CoverUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_user
     *
     * @mbg.generated Wed Jan 02 18:29:51 CST 2019
     */
    int updateByExample(@Param("record") CoverUserEntity record, @Param("example") CoverUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByPrimaryKey(@Param("version") Integer version, @Param("record") CoverUserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByPrimaryKeySelective(@Param("version") Integer version, @Param("record") CoverUserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_user
     *
     * @mbg.generated Wed Jan 02 18:29:51 CST 2019
     */
    int updateByPrimaryKeySelective(CoverUserEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_user
     *
     * @mbg.generated Wed Jan 02 18:29:51 CST 2019
     */
    int updateByPrimaryKey(CoverUserEntity record);
}