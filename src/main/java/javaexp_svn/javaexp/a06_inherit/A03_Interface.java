package javaexp.a06_inherit;

public class A03_Interface {
	/*
# 인터페이스 상속
1. 인터페이스는 상위에 기능메서드와 추상메서드를 통해서 하위의 여러가지 기능을
   효과적으로 처리할 때 사용된다.

2. 기본 형식
	interface 인터페이스명 {
	
		void call(); //인터페이스는 기본적으로 public abstract가 포함되어있어 생략 가능!
	}
	하위클래스 implements 인터페이스명1, 인터페이스2 {
		// 상위에 선언된 추상메서드 반드시 하위에 선언해야 한다.
		void call(){
			// 재정의 선언
		}
	}
	
	- 일반 상속(extends)은 단일 상위클래스만 상속 가능하지만,
	- 인터페이스는 여러개의 상위인터페이스를 상속 가능하다!!
	
3. 기타 인터페이스의 필드와 속성
	1) 인터페이스의 필드는 static 상수만 사용한다.
	2) default 메서드가 있다.
	3) static 메서드를 선언할 수 있다.
		
	*/	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyway f1 = new ContryFlying();
		f1.flying();
		Flyway f2 = new WorldFlying();
		f2.flying();
		
		SoundWay s1 = new DuckSound();
		s1.sound();
		SoundWay s2 = new BabySound();
		s2.sound();
		SoundWay s3 = new RobotSound();
		s3.sound();
		
		Mz m1 = new Mz();
		m1.flying();
		// 인터페이스로 매개변수가 있으면, 상속받은 여러가지의 하위클래스들은
		// 다형성에 의해서 할당할 수 있다!
		// public void setFly(Flyway fly)
		m1.setFly(new ContryFlying());
		m1.flying();
		// Flyway fly = new ContryFlying();
		m1.setFly(new WorldFlying());
		m1.flying();
		
		// 인터페이스 사용하면?
		// 업그레이드를 로봇에 손대지 않고 추가적이거나 변경된 기능만 따로 설정이 가능하다!
		// 기존의 코드를 변경하지 않고, 최소한의 코드로 기능할 수 있게 도와주는 것 = 인터페이스
		// = 응집력이 높다
		
		// # 정리 #
		// 추가적이거나 변경된 기능을 메인 객체인 Mz에
		// 코드하지 않더라도 처리가 가능하여 보다 효과적인 프로그래밍을 할 수 있다.
		
		
		
// ex1) SpaceFlying : 우주를 날다!!
// ex2) SoundBox 클래스에 위에 정의한 SoundWay를 필드로 선언하여
//		setSound()와 showsound() 메서드를 통해서 다양한 소리가 나오게 하세요.
		
		m1.setFly(new SpaceFlying());
		m1.flying();
		
		Sound b1 = new Sound();
		b1.setSound(new DuckSound());
		b1.sound();
		b1.setSound(new BabySound());
		b1.sound();
		b1.setSound(new RobotSound());
		b1.sound();
		
		m1.setAttackWay(new LaserBeam());
		m1.attack();
		m1.setAttackWay(new RocketMissile());
		m1.attack();
		
	}
}
//ex) interface로 SoundWay로 선언하고, sound() 추상메서드 선언
//하위에 실제클래스 DuckSound, BaySound, RobotSound를 상속받아
//main()에서 호출하여 처리하세요.

interface SoundWay {
	void sound();
}

class DuckSound implements SoundWay{
	public void sound() {
		System.out.println("꽉꽉!");
	}
}
class BabySound implements SoundWay{
	public void sound() {
		System.out.println("으르렁!");
	}
}
class RobotSound implements SoundWay{
	public void sound() {
		System.out.println("삐빅-");
	}
}

class Sound {
	private SoundWay soundway;
	
	// SoundWay를 상속받은 하위 객체가 매개변수로 들어올 수 있게 처리.
	public void setSound(SoundWay soundway) {
		this.soundway = soundway;
	}
	public void sound() {
		System.out.println("# 사운드 박스에 있는 소리 #");
		if(soundway!=null) {
			soundway.sound();
		}else {
			System.out.println("소리가 나오지 않습니다!");
		}
	}
}

interface Flyway {
	void flying();
}
class ContryFlying implements Flyway {
	@Override
	public void flying() {
		System.out.println("우리 동네를 날아다니다!");
	}
}
class WorldFlying implements Flyway {
	@Override
	public void flying() {
		System.out.println("전세계를 날아다니다!");
	}
}
class SpaceFlying implements Flyway{
	public void flying() {
		System.out.println("우주를 날다!");
	}
}

// AttackWay 인터페이스 선언, attack(); 추상메서드 선언
// 상속받을 실제클래스 LaserBeam, RocketMissile
// Mz의 하위에 AttackWay 할당하는 부분과 attack();를 통해서 여러가지 공격방법에
// 따라 공격하도록 처리

interface AttackWay {
	void attack();
}

class LaserBeam implements AttackWay{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("레이저 빔!!");
	}
	
}
class RocketMissile implements AttackWay{
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("로켓 미사일 발사!!");
	}
}

class Mz {
	private Flyway fly;
	private AttackWay attackway;
	
	public void setFly(Flyway fly) {
		this.fly = fly;
	}
	public void flying() {
		System.out.println("로봇이!!");
		if(fly!=null) {
			fly.flying();
		}else {
			System.out.println("날개가 장착되지 못했습니다!");
		}

	}
	
	
	
	public void setAttackWay(AttackWay attackway) {
		this.attackway = attackway;
	}
	public void attack() {
		System.out.println("간다!");
		if(attackway!=null) {
			attackway.attack();
		}else {
			System.out.println("공격이 할당되지 않았습니다.");
		}
	}
}












