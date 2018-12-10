CREATE TABLE wx_user(
	id INTEGER(11)  DEFAULT '0' PRIMARY KEY NOT NULL COMMENT '自增id',
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
	version INTEGER(11) COMMENT '乐观锁'
)