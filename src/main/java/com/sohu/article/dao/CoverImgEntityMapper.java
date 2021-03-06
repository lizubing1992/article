package com.sohu.article.dao;

import com.sohu.article.model.CoverImgEntity;
import com.sohu.article.model.CoverImgEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoverImgEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_img
     *
     * @mbg.generated Tue Jan 29 16:44:03 CST 2019
     */
    long countByExample(CoverImgEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_img
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByExample(@Param("version") Integer version, @Param("example") CoverImgEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_img
     *
     * @mbg.generated Tue Jan 29 16:44:03 CST 2019
     */
    int deleteByExample(CoverImgEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_img
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByPrimaryKey(@Param("version") Integer version, @Param("key") Integer key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_img
     *
     * @mbg.generated Tue Jan 29 16:44:03 CST 2019
     */
    int deleteByPrimaryKey(Integer coverId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_img
     *
     * @mbg.generated Tue Jan 29 16:44:03 CST 2019
     */
    int insert(CoverImgEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_img
     *
     * @mbg.generated Tue Jan 29 16:44:03 CST 2019
     */
    int insertSelective(CoverImgEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_img
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    CoverImgEntity selectOneByExample(CoverImgEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_img
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    CoverImgEntity selectOneByExampleSelective(@Param("example") CoverImgEntityExample example, @Param("selective") CoverImgEntity.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_img
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<CoverImgEntity> selectByExampleSelective(@Param("example") CoverImgEntityExample example, @Param("selective") CoverImgEntity.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_img
     *
     * @mbg.generated Tue Jan 29 16:44:03 CST 2019
     */
    List<CoverImgEntity> selectByExample(CoverImgEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_img
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    CoverImgEntity selectByPrimaryKeySelective(@Param("coverId") Integer coverId, @Param("selective") CoverImgEntity.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_img
     *
     * @mbg.generated Tue Jan 29 16:44:03 CST 2019
     */
    CoverImgEntity selectByPrimaryKey(Integer coverId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_img
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExample(@Param("version") Integer version, @Param("record") CoverImgEntity record, @Param("example") CoverImgEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_img
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExampleSelective(@Param("version") Integer version, @Param("record") CoverImgEntity record, @Param("example") CoverImgEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_img
     *
     * @mbg.generated Tue Jan 29 16:44:03 CST 2019
     */
    int updateByExampleSelective(@Param("record") CoverImgEntity record, @Param("example") CoverImgEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_img
     *
     * @mbg.generated Tue Jan 29 16:44:03 CST 2019
     */
    int updateByExample(@Param("record") CoverImgEntity record, @Param("example") CoverImgEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_img
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByPrimaryKey(@Param("version") Integer version, @Param("record") CoverImgEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_img
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByPrimaryKeySelective(@Param("version") Integer version, @Param("record") CoverImgEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_img
     *
     * @mbg.generated Tue Jan 29 16:44:03 CST 2019
     */
    int updateByPrimaryKeySelective(CoverImgEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_img
     *
     * @mbg.generated Tue Jan 29 16:44:03 CST 2019
     */
    int updateByPrimaryKey(CoverImgEntity record);
}