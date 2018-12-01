package com.sohu.article.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

@ApiModel(value="com.sohu.article.model.ArticleEntity")
public class ArticleEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.title
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    @ApiModelProperty(value="title标题")
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.url
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    @ApiModelProperty(value="url文章url路径")
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.url_object_id
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    @ApiModelProperty(value="urlObjectId主键id")
    private String urlObjectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.article_type
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    @ApiModelProperty(value="articleType文章类型")
    private String articleType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.author_name
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    @ApiModelProperty(value="authorName作者")
    private String authorName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.publish_time
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    @ApiModelProperty(value="publishTime发布时间")
    private Date publishTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.crawl_time
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    @ApiModelProperty(value="crawlTime爬取时间")
    private Date crawlTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.front_image_url
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    @ApiModelProperty(value="frontImageUrl文章封面路径")
    private String frontImageUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.content
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    @ApiModelProperty(value="content文章内容")
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table article
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.title
     *
     * @return the value of article.title
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.title
     *
     * @param title the value for article.title
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.url
     *
     * @return the value of article.url
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.url
     *
     * @param url the value for article.url
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.url_object_id
     *
     * @return the value of article.url_object_id
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    public String getUrlObjectId() {
        return urlObjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.url_object_id
     *
     * @param urlObjectId the value for article.url_object_id
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    public void setUrlObjectId(String urlObjectId) {
        this.urlObjectId = urlObjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.article_type
     *
     * @return the value of article.article_type
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    public String getArticleType() {
        return articleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.article_type
     *
     * @param articleType the value for article.article_type
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.author_name
     *
     * @return the value of article.author_name
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.author_name
     *
     * @param authorName the value for article.author_name
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.publish_time
     *
     * @return the value of article.publish_time
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    public Date getPublishTime() {
        return publishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.publish_time
     *
     * @param publishTime the value for article.publish_time
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.crawl_time
     *
     * @return the value of article.crawl_time
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    public Date getCrawlTime() {
        return crawlTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.crawl_time
     *
     * @param crawlTime the value for article.crawl_time
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    public void setCrawlTime(Date crawlTime) {
        this.crawlTime = crawlTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.front_image_url
     *
     * @return the value of article.front_image_url
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    public String getFrontImageUrl() {
        return frontImageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.front_image_url
     *
     * @param frontImageUrl the value for article.front_image_url
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    public void setFrontImageUrl(String frontImageUrl) {
        this.frontImageUrl = frontImageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.content
     *
     * @return the value of article.content
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.content
     *
     * @param content the value for article.content
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", title=").append(title);
        sb.append(", url=").append(url);
        sb.append(", urlObjectId=").append(urlObjectId);
        sb.append(", articleType=").append(articleType);
        sb.append(", authorName=").append(authorName);
        sb.append(", publishTime=").append(publishTime);
        sb.append(", crawlTime=").append(crawlTime);
        sb.append(", frontImageUrl=").append(frontImageUrl);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
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
        ArticleEntity other = (ArticleEntity) that;
        return (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getUrlObjectId() == null ? other.getUrlObjectId() == null : this.getUrlObjectId().equals(other.getUrlObjectId()))
            && (this.getArticleType() == null ? other.getArticleType() == null : this.getArticleType().equals(other.getArticleType()))
            && (this.getAuthorName() == null ? other.getAuthorName() == null : this.getAuthorName().equals(other.getAuthorName()))
            && (this.getPublishTime() == null ? other.getPublishTime() == null : this.getPublishTime().equals(other.getPublishTime()))
            && (this.getCrawlTime() == null ? other.getCrawlTime() == null : this.getCrawlTime().equals(other.getCrawlTime()))
            && (this.getFrontImageUrl() == null ? other.getFrontImageUrl() == null : this.getFrontImageUrl().equals(other.getFrontImageUrl()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated Sat Dec 01 17:58:08 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getUrlObjectId() == null) ? 0 : getUrlObjectId().hashCode());
        result = prime * result + ((getArticleType() == null) ? 0 : getArticleType().hashCode());
        result = prime * result + ((getAuthorName() == null) ? 0 : getAuthorName().hashCode());
        result = prime * result + ((getPublishTime() == null) ? 0 : getPublishTime().hashCode());
        result = prime * result + ((getCrawlTime() == null) ? 0 : getCrawlTime().hashCode());
        result = prime * result + ((getFrontImageUrl() == null) ? 0 : getFrontImageUrl().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }
}