package RockScissorsPaper;

import java.util.Random;

public class Player extends Human {//����Ʈ�� �̸��� �޴´�

	static int NumPlayer = 0; //Ŭ������, ������Ʈ�ʹ� ����� ����.
	private static int NumPlayed = 0;// ���� Ƚ��
	 
	int NumWin = 0; // ������Ʈ ���̴�.
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
	 
	Random rand = new Random(Double.doubleToLongBits(Math.random())); //���� �ޱ�
							//��ȣ �ȿ� �ִ� ���� SEED��
	int result = rand.nextInt()%3;
		 
	if (result == 0)
		RockScissorPaper="ROCK";
	else if (result == 1)
		RockScissorPaper="SCISSORS";
	else
		RockScissorPaper="PAPER";
	}
		 
	public void SetWinner() { //�ʰ� �̰�ٴ� �ڵ�
		NumWin++;
		this.PercentWin = ((float)this.NumWin)/((float)getNumPlayed());
							//����ȯ ����
	}
	 
	public static int getNumPlayed() {
		return NumPlayed;
	}
		 
	public static void setNumPlayed(int numPlayed) {
		NumPlayed = numPlayed;
	}	 
}