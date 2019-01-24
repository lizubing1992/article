CREATE TABLE wx_user(
	id INTEGER(11)  NOT NULL AUTO_INCREMENT COMMENT '自增id',
	username VARCHAR(63) NOT NULL COMMENT ' 用户名',
	user_pwd VARCHAR(25) NOT NULL COMMENT '用户密码',
	gender VARCHAR(10) NOT NULL COMMENT '用户性别',
	birthday DATE COMMENT '用户生日',
	last_login_time DATE COMMENT '用户最后登录的时间',
	last_login_ip VARCHAR(63) COMMENT '用户最后登录的ip',
	nickname VARCHAR(63) NOT NULL COMMENT '用户昵称',
	mobile VARCHAR(20) COMMENT '用户手机号码',
	avatar VARCHAR(255) NOT NULL COMMENT '用户头像',
	weixin_openid VARCHAR(263) NOT NULL COMMENT '微信的openId',
	add_time DATE COMMENT '用户首次登录时间',
	version INTEGER(11) COMMENT '乐观锁',
	PRIMARY KEY(id)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT '微信客户表';

CREATE TABLE article(
	title VARCHAR(50) NOT NULL COMMENT '标题',
	url VARCHAR(200) NOT NULL COMMENT '文章url路径',
	url_object_id VARCHAR(50) NOT NULL COMMENT '主键id',
	article_type VARCHAR(20) NOT NULL COMMENT '文章类型',
	author_name VARCHAR(20) COMMENT '作者',
	publish_time DATETIME COMMENT '发布时间',
	crawl_time DATETIME COMMENT '爬取时间',
	content LONGTEXT COMMENT '文章内容',
	front_image_url VARCHAR(200) COMMENT '文章封面路径'
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT '文章表';

CREATE TABLE cover_img(
	cover_id INTEGER(11) NOT NULL AUTO_INCREMENT COMMENT '封面id',
	img_url VARCHAR(255) NOT NULL COMMENT '封面url',
	zan_nums INTEGER(11) DEFAULT '0' NOT NULL COMMENT '点赞数',
	comment_nums INTEGER(11) DEFAULT '0' COMMENT '评论数',
	version INTEGER(11) COMMENT '乐观锁',
	PRIMARY KEY(cover_id)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT '贺卡表';


CREATE TABLE cover_comment(
	comment_id INTEGER(11) NOT NULL AUTO_INCREMENT COMMENT '评论id',
	comment_time DATE COMMENT '评论时间',
	comment_content LONGTEXT COMMENT '评论内容',
	user_id INTEGER(11) COMMENT '评论客户id',
	cover_id INTEGER(11) COMMENT '评论的贺卡id',
	version INTEGER(11) COMMENT '乐观锁',
	PRIMARY KEY(comment_id)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT '贺卡评论表';

CREATE TABLE cover_user(
	id INTEGER(11)  NOT NULL AUTO_INCREMENT NOT NULL COMMENT '自增id',
	username VARCHAR(63) NOT NULL COMMENT ' 用户名',
	user_pwd VARCHAR(25) NOT NULL COMMENT '用户密码',
	gender VARCHAR(10) NOT NULL COMMENT '用户性别',
	birthday DATE COMMENT '用户生日',
	last_login_time DATE COMMENT '用户最后登录的时间',
	last_login_ip VARCHAR(63) COMMENT '用户最后登录的ip',
	nickname VARCHAR(63) NOT NULL COMMENT '用户昵称',
	mobile VARCHAR(20) COMMENT '用户手机号码',
	avatar VARCHAR(255) NOT NULL COMMENT '用户头像',
	weixin_openid VARCHAR(263) NOT NULL COMMENT '微信的openId',
	add_time DATE COMMENT '用户首次登录时间',
	version INTEGER(11) COMMENT '乐观锁',
	PRIMARY KEY(id)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT '贺卡用户表';

CREATE TABLE cover_music(
	music_id INTEGER(11) NOT NULL AUTO_INCREMENT COMMENT '歌曲id',
	music_url VARCHAR(255) NOT NULL COMMENT '歌曲url',
	music_name VARCHAR(255) NOT NULL COMMENT '歌曲名',
	music_author VARCHAR(255) NOT NULL COMMENT '歌曲作者',
	version INTEGER(11) COMMENT '乐观锁',
	PRIMARY KEY(music_id)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT '歌曲表';

CREATE TABLE cover_share(
	share_id INTEGER(11) NOT NULL AUTO_INCREMENT COMMENT '分享id',
	music_id INTEGER(11) NOT NULL COMMENT '歌曲id',
	user_id INTEGER(11) NOT NULL COMMENT '用户id',
	img_id INTEGER(11) NOT NULL COMMENT '贺词背景图片id',
	wish_id INTEGER(11) COMMENT '贺词表主键id',
	wish_word LONGTEXT COMMENT '贺词',
	share_date DATE COMMENT '分享时间',
	version INTEGER(11) COMMENT '乐观锁',
	PRIMARY KEY(share_id)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT '贺卡分享表';


