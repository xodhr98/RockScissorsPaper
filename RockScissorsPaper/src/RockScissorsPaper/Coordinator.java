package RockScissorsPaper;

public class Coordinator extends Player {//coordinator는 중재자 역할을 해준다.
			 
	int WinnerID;
	Player [] PlayerList;
	 
 
	public Coordinator() {
	}
	 
	public int GetWinnerID(){
		return WinnerID;
		}
		 
	public void SetPlayerList(Player [] lst) {
		PlayerList = lst;
	}
		 
	public void InitiateRSP() { // 가위바위보 중에 어떤 것을 낼지 비교하는 것
		int i;
	 
		for(i=0;i<PlayerList.length;i++) {
			PlayerList[i].SetRSP();
		}
		
	}
			 
	public void DecideWinner() { // 누가 이겼는 지를 봐준다.
		 		 
		Player.setNumPlayed(Player.getNumPlayed() + 1);
		this.InitiateRSP();
		if (PlayerList[0].GetRSP().equals(PlayerList[1].GetRSP())) {//3명이 진행할 경우, 어떻게 해야할까요?
			//무승부 Logic -- 둘다 승자로 인정
			int i;
			for(i=0;i<PlayerList.length;i++) {
				PlayerList[i].SetWinner();
			}
		}
		// Rock smashes scissors... / 0번 플레이어가 이긴 경우
		else if (PlayerList[0].GetRSP().equals("ROCK") && PlayerList[1].GetRSP().equals("SCISSORS")) {
			PlayerList[0].SetWinner();
		}// Paper covers rock...
		
		else if (PlayerList[0].GetRSP().equals("PAPER") && PlayerList[1].GetRSP().equals("ROCK")) {
			PlayerList[0].SetWinner();
		}// Scissors cut paper...
		
		else if (PlayerList[0].GetRSP().equals("SCISSORS") && PlayerList[1].GetRSP().equals("PAPER")) {
			PlayerList[0].SetWinner();
		}// Not a tie and the computer did not win so the user must have won!
		
		else {
			PlayerList[1].SetWinner(); // 일번 플레이어가 이긴 경우
		}
	}
}