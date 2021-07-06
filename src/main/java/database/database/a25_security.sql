/*
# 데이터베이스 보안을 위한 권한 설정
1. 데이터 베이스 관리자(DBA)는 사용자가 데이터베이스
객체(테이블,view,sequence...)에 대한 특정 권한을
가질 수 있게 하여, 다수의 사용자가 데이터베이스에
저장된 정보를 공유하면서도 정보에 대한 보안이 이루어 
지도록 한다.
2. DB 서버에 접근시 필요한 사용자 계정/암호를 통해
로그인 인증을 받는다.
3. 권한의 역활과 종류
	1) create user : 사용자를 새롭게 생성하는 권한
	2) drop user : 사용자를 삭제하는 권한
	3) drop any table : 테이블을 삭제하는 권한
	4) query rewrite : 함수 기반 인덱스 생성 권한
	5) backup any table : 테이블 백업 권한
	
	6) create session : 데이터베이스에 접속할 수 
		있는 권한.
	7) create table/view/sequence/procedure
		데이터베이스의 객체들을 생성하는 권한.
		
	8) resource 여러 객체들을 생성/사용 가능한 권한
	9) dba : 관리자 권한으로 계정을 생성하고, 권한을 
		부여할 수 있는 권한.
*/
/*
# 추가 사용자 생성하기..
1. system 관리자 계정으로 접근하여 scott에 dba 권한을 부여하여
계정 생성과 권한 부여가 가능하게 하여야 한다.
2. 권한 부여
	cmd
	sqlplus
	system/1111
	grant dba to scott; //scott 계정에 권한부여

3. 사용자 생성
	create user 사용자명 indentified by 비밀번호;
4. 권한 부여
	grant 권한명 to 계정명;
	create session - 접속권한
*/
-- 사용자 생성 : sqlplus에서도 생성 가능, 이클립스에서도 생성 가능
CREATE USER orauser01 IDENTIFIED BY user01;
GRANT create SESSION TO orauser01;

-- 응용) himan/7777 계정을 만들고 접속권한을 부여한 후 접속 확인하기 (4조)
CREATE USER himan IDENTIFIED BY 7777;
GRANT CREATE SESSION TO himan;

/*
 # 접속방법 
 1. cmd 창에 sqlplus 입력
 			user-name : 사용자
 			password : 비밀번호
 			입력
 2. conn 사용자/비밀번호
 3. 현재 접속할 수 있는 계정
 	system/1111 관리자계정
 	scott/tiger
 	
# 사용자계정별로 자원에 대한 접근 권한 설정
1. 테이블 생성 권한 부여
	grant create table to 계정명;
	ex) grant create table to orauser01; -- orauser01 테이블에 권한 부여 	
2. 전체 oracle에서 사용되는 여러객체(테이블, index, sequence.. 등등)에 대한 권한 부여
	grant resource to 계정명;
3. 전체적인 계정에 대한 권한 부여 내용 확인하는 테이블
	dba_users
4. 테이블(물리적으로 저장이 필요한 객체) tablespace라는 저장공간을 할당.
	alter user 사용자명 default tablespace users; -사용자가 사용할 물리적 tablespace 설정.
	alter user 사용자명 quota unlimited on users; - 사용자가 사용할 테이블스페이스의 용량을 지정.
	
# 특정한 사용자가 테이블을 사용하기 위하여.

1. 계정 생성과 함께 접속, 자원 사용 권한 설정
GRANT 권한1, 권한2, 권한3.... TO 사용자 IDENTIFIED BY 계정명;
ex)
GRANT CONNECT,RESOURCE,UNLIMITED TABLESPACE 
	TO SCOTT IDENTIFIED BY tiger;
2.(생략가능)	
ALTER USER SCOTT DEFAULT TABLESPACE USERS;
ALTER USER SCOTT TEMPORARY TABLESPACE TEMP;
*/
GRANT CONNECT,resource,unlimited tablespace
	TO himan2 IDENTIFIED BY 9999; 

/*
# oracle 서버접속
1. 서버에서 계정의 생성..

2. 서버 vs 클라이언트 접속
	1) 서버에 식별되는 ip/port/sid 계정/비밀번호
		서버 ip 주소 : 211.63.89.68/1521/xe scott/tiger
		서버 ip 주소 : 192.168.0.84/1521/xe scott/tiger
	2) 서버에 있는 위 정보를 기준으로 DB 서버에 접속을 한다.
	3) 서버 pc의 방화벽 풀기..
		inbounce : 1521 port 열어줌.
		outbounce : 1521 port 열어줌.
 * */




/*
0. dba권한이 있는 권한자로 접속 후
1. 계정 생성 : create user 사용자명 identified by 비밀번호;
2. 접속할 수 있는 권한 부여 : grant create session to 사용자명;
3. 자원(테이블 등 여러 객체)를 사용할 수 있는 권한 :grant resourece to 사용자명;
4. 해당 사용자가 사용할 물리적 공간(tablespace) 설정 : alter user 사용자명 default tablespace 테이블스페이스명
5. 사용자가 물리적 공간을 사용할 용량 설정 : alter user 사용자명 quota 용량 on 테이블 스페이스명;
**/

-- 계정 생성 후 권한 부여 
CREATE USER goodman IDENTIFIED BY 8888;
GRANT CREATE SESSION TO goodman;
GRANT resource TO goodman;
-- 여기까지 진행하고 혹시모르니까 재연결하고 
-- cmd창에 goodman/8888 연결하면 연결됨! 

-- 테이블스페이스 생성 후 용량 설정
ALTER USER goodman DEFAULT tablespace users;
ALTER USER goodman quota unlimited ON users;


CREATE USER orauser01 IDENTIFIED BY user01; -- orauser01 유저 생성 id:orauser01/pw:user01
GRANT CREATE SESSION TO orauser01; -- orauser01 접속 권한 줌 
CREATE USER orauser02 IDENTIFIED BY user02; -- orauser02 유저 생성 id:orauser02/pw:user02
GRANT CREATE SESSION TO orauser02; -- orauser02 접속 권한 부여 


-- ex) himan/7777 계정을 만들고, 접속권한을 부여한 후 접속 확인해주세요 [4]
CREATE USER himan IDENTIFIED BY 7777;
GRANT CREATE SESSION TO himan;

