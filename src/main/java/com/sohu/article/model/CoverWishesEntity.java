package com.sohu.article.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

@ApiModel(value="com.sohu.article.model.CoverWishesEntity")
public class CoverWishesEntity implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cover_wishes.wish_id
     *
     * @mbg.generated Mon Jan 07 16:31:30 CST 2019
     */
    @ApiModelProperty(value="wishId贺词id")
    private Integer wishId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cover_wishes.wish_type
     *
     * @mbg.generated Mon Jan 07 16:31:30 CST 2019
     */
    @ApiModelProperty(value="wishType贺词类型 ")
    private String wishType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cover_wishes.wish_content
     *
     * @mbg.generated Mon Jan 07 16:31:30 CST 2019
     */
    @ApiModelProperty(value="wishContent贺词内容")
    private String wishContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cover_wishes
     *
     * @mbg.generated Mon Jan 07 16:31:30 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cover_wishes.wish_id
     *
     * @return the value of cover_wishes.wish_id
     *
     * @mbg.generated Mon Jan 07 16:31:30 CST 2019
     */
    public Integer getWishId() {
        return wishId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cover_wishes.wish_id
     *
     * @param wishId the value for cover_wishes.wish_id
     *
     * @mbg.generated Mon Jan 07 16:31:30 CST 2019
     */
    public void setWishId(Integer wishId) {
        this.wishId = wishId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cover_wishes.wish_type
     *
     * @return the value of cover_wishes.wish_type
     *
     * @mbg.generated Mon Jan 07 16:31:30 CST 2019
     */
    public String getWishType() {
        return wishType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cover_wishes.wish_type
     *
     * @param wishType the value for cover_wishes.wish_type
     *
     * @mbg.generated Mon Jan 07 16:31:30 CST 2019
     */
    public void setWishType(String wishType) {
        this.wishType = wishType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cover_wishes.wish_content
     *
     * @return the value of cover_wishes.wish_content
     *
     * @mbg.generated Mon Jan 07 16:31:30 CST 2019
     */
    public String getWishContent() {
        return wishContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cover_wishes.wish_content
     *
     * @param wishContent the value for cover_wishes.wish_content
     *
     * @mbg.generated Mon Jan 07 16:31:30 CST 2019
     */
    public void setWishContent(String wishContent) {
        this.wishContent = wishContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_wishes
     *
     * @mbg.generated Mon Jan 07 16:31:30 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wishId=").append(wishId);
        sb.append(", wishType=").append(wishType);
        sb.append(", wishContent=").append(wishContent);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_wishes
     *
     * @mbg.generated Mon Jan 07 16:31:30 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CoverWishesEntity other = (CoverWishesEntity) that;
        return (this.getWishId() == null ? other.getWishId() == null : this.getWishId().equals(other.getWishId()))
            && (this.getWishType() == null ? other.getWishType() == null : this.getWishType().equals(other.getWishType()))
            && (this.getWishContent() == null ? other.getWishContent() == null : this.getWishContent().equals(other.getWishContent()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cover_wishes
     *
     * @mbg.generated Mon Jan 07 16:31:30 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWishId() == null) ? 0 : getWishId().hashCode());
        result = prime * result + ((getWishType() == null) ? 0 : getWishType().hashCode());
        result = prime * result + ((getWishContent() == null) ? 0 : getWishContent().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table cover_wishes
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        wishId("wish_id", "wishId", "INTEGER", false),
        wishType("wish_type", "wishType", "VARCHAR", false),
        wishContent("wish_content", "wishContent", "LONGVARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table cover_wishes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "\"";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table cover_wishes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "\"";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table cover_wishes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table cover_wishes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table cover_wishes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table cover_wishes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table cover_wishes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table cover_wishes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table cover_wishes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table cover_wishes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table cover_wishes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table cover_wishes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table cover_wishes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table cover_wishes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table cover_wishes
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}