drop table if exists user;
CREATE TABLE user
(
	id BIGINT(20) NOT NULL COMMENT '主键ID',
	user_name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
	age INT(11) NULL DEFAULT NULL COMMENT '年龄',
	email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
	delete_flag varchar(10) null default 'using' COMMENT '逻辑删除位',
	create_time timestamp null COMMENT '创建时间',
	create_uid varchar(10) null COMMENT '创建人',
	update_time timestamp null COMMENT '创建时间',
	update_uid varchar(10) null COMMENT '更新人',
	PRIMARY KEY (id)
);

drop table if exists user;
CREATE TABLE user
(
	id BIGINT(20) NOT NULL COMMENT '主键ID',
	user_name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
	age INT(11) NULL DEFAULT NULL COMMENT '年龄',
	email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱'
	PRIMARY KEY (id)
);