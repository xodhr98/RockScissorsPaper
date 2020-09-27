package RockScissorsPaper;

import java.util.Random;

public class Player extends Human {//디폴트로 이름을 받는다

	static int NumPlayer = 0; //클래스꺼, 오브젝트와는 상관이 없다.
	private static int NumPlayed = 0;// 게임 횟수
	 
	int NumWin = 0; // 오브젝트 것이다.
	float PercentWin;
		 
	String RockScissorPaper;
		 
	public Player() {
		NumPlayer++;
	}
	 
	public static int GetNumPlayer(){
		return NumPlayer;
	}
		 
	public String GetRSP() {
		return RockScissorPaper;
	}
	 
	public void SetRSP() {
	//LocalTime cTime = LocalTime.now(); 
	 
	Random rand = new Random(Double.doubleToLongBits(Math.random())); //설명 달기
							//괄호 안에 있는 값은 SEED값
	int result = rand.nextInt()%3;
		 
	if (result == 0)
		RockScissorPaper="ROCK";
	else if (result == 1)
		RockScissorPaper="SCISSORS";
	else
		RockScissorPaper="PAPER";
	}
		 
	public void SetWinner() { //너가 이겼다는 코드
		NumWin++;
		this.PercentWin = ((float)this.NumWin)/((float)getNumPlayed());
							//형변환 해줌
	}
	 
	public static int getNumPlayed() {
		return NumPlayed;
	}
		 
	public static void setNumPlayed(int numPlayed) {
		NumPlayed = numPlayed;
	}	 
}