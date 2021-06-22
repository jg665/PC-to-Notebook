CREATE TABLE lecture(
	name varchar2(50), --강의 이름
	mentor varchar2(22), -- 강사 이름
	reviewStar varchar2(20), -- 별점
	price number -- 가격 
);

INSERT INTO lecture values('자바스크립트로 쉽게 배우는 ReactiveX'
	,'얄팍한 코딩사전','★★★★★',29700);
INSERT INTO lecture values('자바 입문자를 위한 강의'
	,'JeongTaeHyun','★★★★★',5500);
INSERT INTO lecture values('자바 스프링 프레임워크'
	,'인프런','★★★★★',16500);

SELECT name 강의_이름, mentor 강사_이름, reviewStar 별점, price 가격 
		FROM lecture;
	
		SELECT * FROM lecture;
					
	
DROP TABLE LECTURE;

/*
	Image img; // 강의 이미지
	String name; // 강의 제목
	String mentor; // 강사 이름
	String reviewStar; // 별점
	int price; // 가격
*/