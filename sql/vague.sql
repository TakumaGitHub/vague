set names utf8;
set foreign_key_checks = 0;
drop database if exists vague;

create database if not exists vague DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;

use vague;


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
	logined tinyint default 0,
	m_flg tinyint default 0,
	regist_date datetime not null,
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
	category_id int not null REFERENCES m_category(category_id),
	product_stock int not null,
	price int ,
	image_file_path varchar (100),
	image_file_name varchar (50),
	release_date datetime not null,
	release_company varchar (50),
	status tinyint default 0 not null,
	regist_date datetime not null,
	update_date datetime
);

/*
*カート情報テーブル
*/

drop table if exists cart_info;

create table cart_info(
	id int not null primary key auto_increment,
	user_id varchar(16) REFERENCES user_info(user_id),
	temp_user_id varchar(128),
	product_id int not null REFERENCES product_info(product_id),
	product_count int not null,
	price int not null,
	regist_date datetime not null,
	update_date datetime
);

/*
*購入履歴情報テーブル
*/

drop table if exists purchase_history_info;

create table purchase_history_info(
	id int not null primary key auto_increment,
	user_id varchar (16) not null REFERENCES user_info(user_id),
	product_id int not null REFERENCES product_info(product_id),
	product_count int not null,
	price int not null,
	address_id int not null,
	regist_date datetime not null,
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
	postal_code varchar(7) not null,
	user_address varchar (50) not null,
	regist_date datetime not null,
	update_date datetime
);

/*
*カテゴリーマスターテーブル
*/

drop table if exists m_category;

create table m_category(
	id int primary key not null auto_increment,
	category_id int not null unique,
	category_name varchar (20) not null unique,
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
	regist_date datetime not null,
	update_date datetime
);

/*
 * カテゴリーマスターテーブルに情報挿入
 */

INSERT INTO m_category (category_id, category_name, category_description, insert_date)
			values     (1, "Chair", "チェア", now()),
					   (2, "Sofa", "ソファ", now()),
					   (3, "Lighting", "ライト", now()),
					   (4, "Table", "テーブル", now());



/*
 * ユーザーテーブルに情報挿入
 */

INSERT INTO user_info(user_id, password, family_name, first_name, family_name_kana,
	first_name_kana, sex, email, status, m_flg, regist_date)
	values("guest","guest","一般","太郎","いっぱん","たろう",0,"ippan@yahoo.co.jp",1,0,now()),
		  ("guest2","guest2","一般","太郎2","いっぱん","たろう",0,"ippan@yahoo.co.jp",1,0,now()),
		  ("guest3","guest3","一般","太郎3","いっぱん","たろう",0,"ippan@yahoo.co.jp",1,0,now()),
		  ("guest4","guest4","一般","太郎4","いっぱん","たろう",0,"ippan@yahoo.co.jp",1,0,now()),
		  ("guest5","guest5","一般","太郎5","いっぱん","たろう",0,"ippan@yahoo.co.jp",1,0,now()),
		  ("guest6","guest6","一般","太郎6","いっぱん","たろう",0,"ippan@yahoo.co.jp",1,0,now()),
		  ("guest7","guest7","一般","太郎7","いっぱん","たろう",0,"ippan@yahoo.co.jp",1,0,now()),
		  ("guest8","guest8","一般","太郎8","いっぱん","たろう",0,"ippan@yahoo.co.jp",1,0,now()),
		  ("guest9","guest9","一般","太郎9","いっぱん","たろう",0,"ippan@yahoo.co.jp",1,0,now()),
		  ("admin","admin","管理者","太郎","かんりしゃ","たろう",0,"kannrisya@yahoo.co.jp",1,1,now()),
		  ("miyazaki","miyazaki","宮崎","瞬","みやざき","しゅん",0,"miyazaki@yahoo.co.jp",1,0,now());


/*
 * 商品テーブルに情報挿入
 */

INSERT INTO product_info (product_id, product_name, product_name_kana, product_description,
						 category_id, product_stock,price, image_file_path, image_file_name, release_date, release_company,status,regist_date)
 						 values(1,"カウンターチェア","かうんたーちぇあ","シンプルかつエレガント！座りやすさまで考慮された椅子です",1,30,3000,"images/1Chair/counterChair.jpg","counterChair.jpg",19950809,"NITYORI",1,now()),
 	(2,"宇宙椅子","うちゅういす","まるで宇宙船にいるかのような気分に浸れます",1,40,6000,"images/1Chair/universChair.jpg","universChair.jpg",19950809,"NITYORI",1,now()),
	(3,"曲げ木オフィスチェア","まげきおふぃすちぇあ","曲げ木の美しさと優れたクッション性で作業の快適性を高めてくれます。",1,50,4800,"images/1Chair/magekiChair.jpg","magekiChair",20080721,"NITYORI",1,now()),
	(4,"ウィッシュボーンチェア","うぃっしゅぼーんちぇあ","造型の美しさ、木目の美しさを堪能くださいませ。",1,60,4500,"images/1Chair/wishBone.jpg","wishBone.jpg",20060301,"NITYORI",1,now()),
	(5,"ロッキングチェア","ろっきんぐちぇあ","ゆらゆら揺れるロッキングチェアは、まるでマッサージチェアのように心地良い。",1,20,23000,"images/1Chair/rockingChair.jpg","rockingChair.jpg",20100802,"NITYORI",1,now()),
	(6,"ベンチ","べんち","ダイニングでも、小物のディスプレイでも、お庭でも使える万能戦士。",1,15,12000,"images/1Chair/bench.jpg","bench.jpg",20050401,"NITYORI",1,now()),
 	(7,"ビンテージレザーソファ","びんてーじれざぁそふぁ","最高級品質の皮を使用。ひとたび座れば最高の時間をもたらしてくれます",2,50,100000,"images/2Sofa/biitejiLeatherSofa.jpg","biitejiLeatherSofa.jpg",19950809,"NITYORI",1,now()),
 	(8,"カジュアルソファ","かじゅあるそふぁ","ソファとしてだけでなく、ベッドとしても使える多機能ソファです",2,80,3000,"images/2Sofa/casualSofa.jpg","casualSofa.jpg",19950809,"NITYORI",1,now()),
	(9,"シングルソファ","しんぐるそふぁ","快適空間、独り占め。",2,30,8000,"images/2Sofa/singleSofa.jpg","singleSofa.jpg",20070601,"NITYORI",1,now()),
	(10,"オットマン付きソファーセット","おっとまんつきそふぁーせっと","オットマンがあれば、足を伸ばして快適に過ごせます。",2,20,35000,"images/2Sofa/ottomanSet.jpg","ottomanSet.jpg",20110728,"NITYORI",1,now()),
	(11,"システムソファ","しすてむそふぁ","L字にしたり、くっつけてみたり･･･組み合わせは自由自在！",2,20,50000,"images/2Sofa/systemSofa.jpg","systemSofa.jpg",20080801,"NITYORI",1,now()),
	(12,"フロアソファ","ふろあそふぁ","まるで床に座っているような気持ちよさ。もしコタツと組み合わせたら･･･？",2,30,55000,"images/2Sofa/floorSofa.jpg","floorSofa.jpg",20150101,"NITYORI",1,now()),
 	(13,"フロアランプ","ふろあらんぷ","間接照明として、リビングや寝室に灯りを補いたい時におすすめなライトです。",3,30,2000,"images/3Lighting/floorLighting.jpg","floorLighting.jpg",19950809,"NITYORI",1,now()),
 	(14,"テーブルランプ","てーぶるらんぷ","柔らかな光がユニークなシェードからこぼれて、美しく落ち着いた雰囲気を演出してくれるライト。",3,40,1500,"images/3Lighting/tableLighting.jpg","tableLighting.jpg",19950809,"NITYORI",1,now()),
	(15,"ペンダントライト","ぺんだんとらいと","ダイニングでも、書斎でも、あるだけで空間が引き締まります。",3,80,11000,"images/3Lighting/pendantLight.jpg","pendantLight.jpg",20040606,"NITYORI",1,now()),
	(16,"コンプトンランプ","こんぷとんらんぷ","工業系のデザインライトがお部屋にインパクトを与えてくれます",3,60,22000,"images/3Lighting/comptonLump.jpg","comptonLump.jpg",20090911,"NITYORI",1,now()),
	(17,"シーリングライト","しーりんぐらいと","おしゃれで、尚且つ取り替えも簡単なんですヨ",3,50,24000,"images/3Lighting/sheelingLight.jpg","sheelingLight.jpg",20100226,"NITYORI",1,now()),
	(18,"シャンデリア","しゃんでりあ","ラグジュアリー、それでいてレトロなライト。お部屋が一気に華やぎます。",3,40,80000,"images/3Lighting/chandelier.jpg","chandelier.jpg",20000320,"NITYORI",1,now()),
	(19,"センターテーブル","せんたーてーぶる","天然石が作り上げるこの世にふたつとない独特の模様と風合いを生かした素材感溢れるガラス・テーブルです。",4,60,8000,"images/4Table/centerTable.jpg","centerTable.jpg",19950809,"NITYORI",1,now()),
	(20,"サイドテーブル","さいどてーぶる","シックな水色と縦長のスマートなフォルムがおしゃれな一品です。",4,60,4000,"images/4Table/sideTable.jpg","sideTable.jpg",19950809,"NITYORI",1,now()),
	(21,"ウォールナットテーブル","うぉーるなっとてーぶる","無垢材を使用した逸品。本物の木の温もりを感じてください。",4,10,60000,"images/4Table/wallnutTable.jpg","wallnutTable.jpg",20130505,"NITYORI",1,now()),
	(22,"リビングテーブル","りびんぐてーぶる","読みかけの本やお気に入りの飲み物を置けば、そこがひとつのディスプレイに。",4,30,20000,"images/4Table/livingTable.jpg","livingTable.jpg",20160909,"NITYORI",1,now()),
	(23,"丸型テーブル","まるがたてーぶる","かわいらしいフォルムは、お部屋を確実に彩ってくれます。",4,20,35000,"images/4Table/maruTable.jpg","maruTable.jpg",20170303,"NITYORI",1,now()),
	(24,"ダイニングテーブルセット","だいにんぐてーぶるせっと","テーブルと椅子がセットになったお得な商品です！",4,30,70000,"images/4Table/tableSet.jpg","tableSet.jpg",20151231,"NITYORI",1,now());




/*
 * レビューテーブルに情報挿入
 */


INSERT INTO review (user_id, product_id, review_title, review_body, review_score, regist_date)
			values ("miyazaki",1,"素晴らしい！","使いごこち最高です",5,now()),
					("miyazaki",2,"素晴らしい！","使いごこち最高です",5,now()),
					("miyazaki",3,"素晴らしい！","使いごこち最高です",5,now()),
					("guest",1,"素晴らしい！","使いごこち最高です",5,now()),
					("guest",2,"素晴らしい！","使いごこち最高です",5,now()),
					("guest",3,"素晴らしい！","使いごこち最高です",5,now()),
					("admin",1,"素晴らしい！","使いごこち最高です",5,now()),
					("admin",2,"素晴らしい！","使いごこち最高です",5,now()),
					("admin",3,"素晴らしい！","使いごこち最高です",5,now());



/*
 * 宛先情報テーブルに情報挿入
 */


INSERT INTO destination_info (user_id, family_name, first_name, family_name_kana, first_name_kana, email, tel_number, postal_code, user_address, regist_date)
			values           ("miyazaki", "宮崎", "瞬", "みやざき", "しゅん", "miyazaki@yahoo.co.jp", "1001100","1000013", "東京都千代田区霞が関1-1-1", now()),
							 ("miyazaki", "宮崎", "瞬", "みやざき", "しゅん", "miyazaki@yahoo.co.jp", "1001100","1000013", "東京都千代田区霞が関2-2-2", now());

