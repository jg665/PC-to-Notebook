--고정 가상계좌 입금
-- 입금내역 : 복권 예치금
-- 금액 : 5000 ~ 
-- 계좌주명 : 동행복권_홍길동

CREATE TABLE Deposit(
title varchar2(30));

SELECT TABLE Deposit;

CREATE TABLE Depositinfo(
	depositH varchar2(20), --입금내역
	price NUMBER, -- 금액
	bankName varchar2(22) -- 계좌주명
);

INSERT INTO Deposit values('복권예치금'
	,20000,'동행복권_홍길동');

SELECT depositH 입금내역, price 금액, bankName 계좌주명 
		FROM Deposit;
	
		SELECT * FROM Deposit;
					
	
DROP TABLE Deposit;
DROP TABLE OUTINFO ;
CREATE TABLE Outinfo(
	outNum varchar2(20),
	bankName varchar2(20),
	bankId	varchar2(20),
	outMoney number, 
	state	varchar2(20)
	);
INSERT into Outinfo VALUES ('2021/06/21','우리은행','1002147834067',5000,'처리중');
INSERT into Outinfo VALUES ('2021/06/22','농협은행','8642162434067',10000,'처리중');
SELECT outNum 출금요청일, bankName 은행, bankId 출금계좌번호, outMoney 출금액, state 상태
FROM Outinfo ;

-- 우리은행과 출금액이 5000원 이상인 정보 출력
SELECT bankName 은행,bankId 출금계좌번호 , outMoney 출금액
FROM Outinfo
WHERE bankName LIKE '우리%' AND outMoney>=5000;

DROP table Chargeinfo;
CREATE TABLE Chargeinfo(
	orderNum varchar2(100), --주문번호
	insertM  varchar2(100), -- 결제 금액
	bankName varchar(100), -- 계좌주명(ID)
	virAccount varchar2(100), -- 고정 가상계좌
	payMethod varchar2(100), -- 결제방식
	issuDate timestamp -- 발급 일시
);

INSERT INTO Chargeinfo VALUES ('2021062009','5000원','동행복권_홍길동',
'[케이뱅크]701-0303-637-8522', '고정계좌 입금', '2021/06/20 09:05:02');
INSERT INTO Chargeinfo VALUES ('2021062112','15000원','동행복권_오길동',
'[케이뱅크]701-0303-637-8522', '고정계좌 입금', '2021/06/21 15:30:07');

-- 2분기에 발급된 가상계좌를 검색
SELECT bankName, issuDate, to_char(issuDate, 'YYYY/MM, Q') "발급년월 분기"
FROM Chargeinfo
WHERE to_char(issuDate, 'Q')='2'

SELECT * FROM Chargeinfo;

SELECT orderNum 주문번호, insertM 결제금액, bankName 계좌주명, 
virAccount 고정가상계좌, payMethod 결제방식, issuDate 발급일시
FROM Chargeinfo;

CREATE TABLE Mydeposit(
	userName varchar2(100),
	virAccount varchar(100),
	Alldeposit NUMBER
);
INSERT INTO Mydeposit VALUES ('홍길동','[케이뱅크] 701-0303-637-8522',5000);
INSERT INTO Mydeposit VALUES ('오길동','[케이뱅크] 301-0303-637-8522',0);

SELECT userName 회원이름, virAccount 가상계좌 , Alldeposit 예치금잔액
FROM Mydeposit;
SELECT * FROM Mydeposit;

-- 회원이름 성이 홍씨인 사람과 예치금 잔액이 5000원 이상인 사람 조회
SELECT userName 회원이름 , Alldeposit 예치금잔액
FROM Mydeposit
WHERE userName LIKE '홍%' AND Alldeposit>=5000;

CREATE TABLE Depositcharge(
	userName varchar2(100),
	virAccount varchar(100),
	Alldeposit NUMBER

--cntList.add(new DPR1Account("홍길동","[케이뱅크] 701-0303-637-8522",5000));
--cntList.add(new DPR1Account("오길동","[케이뱅크] 301-0303-637-8522",0));


