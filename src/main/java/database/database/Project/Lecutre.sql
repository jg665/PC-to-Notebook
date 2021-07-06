-- 테이블 생성
CREATE TABLE lecture(
	name varchar2(50), --강의 이름
	reviewStar number(10), -- 별점
	price NUMBER, -- 가격 
	category varchar2(20), -- 강의 카테고리
	Lecfilter varchar(20) -- 강의 필터
);

INSERT INTO lecture values('자바스크립트',5,55000,'자바','추천순');
INSERT INTO lecture values('자바 입문자를 위한 강의',5,25000,'자바','인기순');
INSERT INTO lecture values('자바 스프링 프레임워크',5,35000,'프레임워크','인기순');
INSERT INTO lecture values('비전공자를 위한 개발 클래스',5,16500,'데이터분석','최신순');
INSERT INTO lecture values('웹 입문',5,55000,'웹개발','최신순');

SELECT name 강의_이름, reviewStar 별점, price 가격, category 강의카테고리, Lecfilter 강의필터
		FROM lecture;
	
		SELECT * FROM lecture;ㄴ
		
SELECT category 강의카테코리, Lecfilter 강의필터
FROM LECTURE 
WHERE category like'%자바'
ORDER BY 추천도 DESC;
					
-- 강의검색어에 자바가 들어가고 가격이 3만원 이상인 강의
SELECT name 강의이름 , price 가격
FROM lecture
WHERE name LIKE '자바%' AND price>=30000;
	
	
DROP TABLE lecture;
ㄴ
/*
	Image img; // 강의 이미지
	String name; // 강의 제목
	String mentor; // 강사 이름
	String reviewStar; // 별점
	int price; // 가격
*/