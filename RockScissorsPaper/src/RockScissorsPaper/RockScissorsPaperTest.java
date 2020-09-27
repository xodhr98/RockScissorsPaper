package RockScissorsPaper;

import java.util.Scanner;

public class RockScissorsPaperTest {

	public RockScissorsPaperTest() {
	}
	
	public static void main(String[] args) {
		// TOD O Auto-generated method stub
		int NumPlayers =2;
	
		Player[] PlayerList = new Player[NumPlayers];
			//player의 객체의 reference value만 두개 생성된다.
		int i;
		
		for(i=0;i<NumPlayers;i++) {
			PlayerList[i] = new Player();
		} // 배열안에 있는 reference value마다 새로운 생성자를 호출 해준다
 
		Coordinator Cordi = new Coordinator(); //coordinator객체를 만든다.
	 
		Cordi.SetPlayerList(PlayerList); //coordinator를 접근 할 수 있게 해준다.
	 
		System.out.println("How many times the games will be done?");
		//게임 몇번 할 것 인가
	 
		Scanner input = new Scanner(System.in);
	 
		int NumTimes = input.nextInt();		
	 
		while (i<NumTimes) {
			Cordi.DecideWinner();
			i++;
		}
	 
		for(i=0;i<PlayerList.length;i++) {
			System.out.println("Player " + i + "wins" + PlayerList[i].NumWin + ". The Winning Rate is " + PlayerList[i].PercentWin + ".");			} // 출력
			input.close();
		}
	}