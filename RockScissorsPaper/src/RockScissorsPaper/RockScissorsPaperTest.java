package RockScissorsPaper;

import java.util.Scanner;

public class RockScissorsPaperTest {

	public RockScissorsPaperTest() {
	}
	
	public static void main(String[] args) {
		// TOD O Auto-generated method stub
		int NumPlayers =2;
	
		Player[] PlayerList = new Player[NumPlayers];
			//player�� ��ü�� reference value�� �ΰ� �����ȴ�.
		int i;
		
		for(i=0;i<NumPlayers;i++) {
			PlayerList[i] = new Player();
		} // �迭�ȿ� �ִ� reference value���� ���ο� �����ڸ� ȣ�� ���ش�
 
		Coordinator Cordi = new Coordinator(); //coordinator��ü�� �����.
	 
		Cordi.SetPlayerList(PlayerList); //coordinator�� ���� �� �� �ְ� ���ش�.
	 
		System.out.println("How many times the games will be done?");
		//���� ��� �� �� �ΰ�
	 
		Scanner input = new Scanner(System.in);
	 
		int NumTimes = input.nextInt();		
	 
		while (i<NumTimes) {
			Cordi.DecideWinner();
			i++;
		}
	 
		for(i=0;i<PlayerList.length;i++) {
			System.out.println("Player " + i + "wins" + PlayerList[i].NumWin + ". The Winning Rate is " + PlayerList[i].PercentWin + ".");			} // ���
			input.close();
		}
	}