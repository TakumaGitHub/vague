set names utf8;
set foreign_key_checks = 0;
drop database if exists Vague;

create database if not exists Vague;

use Vague;


/*
 * 会員情報テーブル
 */

drop table if exists user_info;

create table user_info(
	id int not null primary key auto_increment,
	user_id varchar (16) not null unique,
	password varchar (16) not null,
	family_name varchar (32) not null,
	first_name varchar (32) not null,
	family_name_kana varchar (32) not null,
	first_name_kana varchar (32) not null,
	sex tinyint default 0,
	email varchar (50) not null,
	status tinyint default 0,
	login_flg tinyint default 0,
	m_flg tinyint default 0,
	question int(255) not null,/* 例：１嫌いな食べ物は？２：好きな映画は？ */
    answer varchar(255) not null,
	insert_date datetime not null,
	update_date datetime
);

/*
 * 商品情報テーブル
 */

drop table if exists product_info;

create table product_info(
	id int not null primary key auto_increment,
	product_id int not null unique,
	product_name varchar (100) not null unique,
	product_name_kana varchar (100) not null unique,
	product_description varchar (255) not null,
	category_id int not null,
	product_stock int not null,
	price int not null,
	image_file_path varchar (100),
	image_file_name varchar (50),
	release_date date not null,
	release_company varchar (50),
	status tinyint default 0 not null,
	insert_date datetime not null,
	update_date datetime
);

/*
*カート情報テーブル
*/

drop table if exists cart_info;

create table cart_info(
	id int not null primary key auto_increment,
	user_id varchar(16),
	temp_user_id varchar(128) not null,
	product_id int not null,
	product_count int not null,
	price int not null,
	insert_date datetime not null,
	update_date datetime
);

/*
*購入履歴情報テーブル
*/

drop table if exists purchase_history_info;

create table purchase_history_info(
	id int not null primary key auto_increment,
	user_id varchar (16) not null,
	product_id int not null,
	product_count int not null,
	price int not null,
	insert_date datetime not null,
	update_date datetime
);

/*
*宛先情報テーブル
*/

drop table if exists destination_info;

create table destination_info(
	id int not null primary key auto_increment,
	user_id varchar (16) not null,
	family_name varchar (32) not null,
	first_name varchar (32) not null,
	family_name_kana varchar (32) not null,
	first_name_kana varchar (32) not null,
	email varchar (32) not null,
	tel_number varchar (13) not null,
	user_address varchar (50) not null,
	insert_date datetime not null,
	update_date datetime
);

/*
*カテゴリーマスターテーブル
*/

drop table if exists m_category;

create table m_category(
	id int primary key not null auto_increment,
	category_id int not null unique,
	categry_name varchar (20) not null unique,
	category_description varchar (100),
	insert_date datetime not null,
	update_date datetime
);

/*
*レビューテーブル
*/

drop table if exists review;

create table review (
	id int not null primary key auto_increment,
	user_id varchar (16) not null,
	product_id int not null,
	review_title varchar (100),
	review_body varchar (255),
	review_score int not null,
	insert_date datetime not null,
	update_date datetime
);


/*
 * ユーザーテーブルに情報挿入
 */

insert into user_info(user_id, password, family_name, first_name, family_name_kana,
	first_name_kana, sex, email, question, answer, m_flg, insert_date)
	values("guest","guest","一般","太郎","いっぱん","たろう",0,"ippan@yahoo.co.jp",1,"ピーマン",0,now()),
		  ("admin","admin","管理者","太郎","かんりしゃ","たろう",0,"kannrisya@yahoo.co.jp",1,"ピーマン",1,now());






