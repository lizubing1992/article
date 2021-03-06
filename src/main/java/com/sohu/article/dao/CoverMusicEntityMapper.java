package com.sohu.article.dao;

import com.sohu.article.model.CoverMusicEntity;
import com.sohu.article.model.CoverMusicEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoverMusicEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_music
     *
     * @mbg.generated Thu Jan 24 10:31:33 CST 2019
     */
    long countByExample(CoverMusicEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_music
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByExample(@Param("version") Integer version, @Param("example") CoverMusicEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_music
     *
     * @mbg.generated Thu Jan 24 10:31:33 CST 2019
     */
    int deleteByExample(CoverMusicEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_music
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByPrimaryKey(@Param("version") Integer version, @Param("key") Integer key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_music
     *
     * @mbg.generated Thu Jan 24 10:31:33 CST 2019
     */
    int deleteByPrimaryKey(Integer musicId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_music
     *
     * @mbg.generated Thu Jan 24 10:31:33 CST 2019
     */
    int insert(CoverMusicEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_music
     *
     * @mbg.generated Thu Jan 24 10:31:33 CST 2019
     */
    int insertSelective(CoverMusicEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_music
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    CoverMusicEntity selectOneByExample(CoverMusicEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_music
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    CoverMusicEntity selectOneByExampleSelective(@Param("example") CoverMusicEntityExample example, @Param("selective") CoverMusicEntity.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_music
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<CoverMusicEntity> selectByExampleSelective(@Param("example") CoverMusicEntityExample example, @Param("selective") CoverMusicEntity.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_music
     *
     * @mbg.generated Thu Jan 24 10:31:33 CST 2019
     */
    List<CoverMusicEntity> selectByExample(CoverMusicEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_music
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    CoverMusicEntity selectByPrimaryKeySelective(@Param("musicId") Integer musicId, @Param("selective") CoverMusicEntity.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_music
     *
     * @mbg.generated Thu Jan 24 10:31:33 CST 2019
     */
    CoverMusicEntity selectByPrimaryKey(Integer musicId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_music
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExample(@Param("version") Integer version, @Param("record") CoverMusicEntity record, @Param("example") CoverMusicEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_music
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExampleSelective(@Param("version") Integer version, @Param("record") CoverMusicEntity record, @Param("example") CoverMusicEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_music
     *
     * @mbg.generated Thu Jan 24 10:31:33 CST 2019
     */
    int updateByExampleSelective(@Param("record") CoverMusicEntity record, @Param("example") CoverMusicEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_music
     *
     * @mbg.generated Thu Jan 24 10:31:33 CST 2019
     */
    int updateByExample(@Param("record") CoverMusicEntity record, @Param("example") CoverMusicEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_music
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByPrimaryKey(@Param("version") Integer version, @Param("record") CoverMusicEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_music
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByPrimaryKeySelective(@Param("version") Integer version, @Param("record") CoverMusicEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_music
     *
     * @mbg.generated Thu Jan 24 10:31:33 CST 2019
     */
    int updateByPrimaryKeySelective(CoverMusicEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_music
     *
     * @mbg.generated Thu Jan 24 10:31:33 CST 2019
     */
    int updateByPrimaryKey(CoverMusicEntity record);
}