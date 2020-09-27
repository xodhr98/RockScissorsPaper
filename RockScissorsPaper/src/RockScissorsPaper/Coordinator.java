package RockScissorsPaper;

public class Coordinator extends Player {//coordinator�� ������ ������ ���ش�.
			 
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
		 
	public void InitiateRSP() { // ���������� �߿� � ���� ���� ���ϴ� ��
		int i;
	 
		for(i=0;i<PlayerList.length;i++) {
			PlayerList[i].SetRSP();
		}
		
	}
			 
	public void DecideWinner() { // ���� �̰�� ���� ���ش�.
		 		 
		Player.setNumPlayed(Player.getNumPlayed() + 1);
		this.InitiateRSP();
		if (PlayerList[0].GetRSP().equals(PlayerList[1].GetRSP())) {//3���� ������ ���, ��� �ؾ��ұ��?
			//���º� Logic -- �Ѵ� ���ڷ� ����
			int i;
			for(i=0;i<PlayerList.length;i++) {
				PlayerList[i].SetWinner();
			}
		}
		// Rock smashes scissors... / 0�� �÷��̾ �̱� ���
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
			PlayerList[1].SetWinner(); // �Ϲ� �÷��̾ �̱� ���
		}
	}
}