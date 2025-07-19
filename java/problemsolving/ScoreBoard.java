package problemsolving;

public class ScoreBoard {
	private int []scores=new int[5];
	private Object setScore;
	public void setScore(int index,int value) {
		if(index>=0&&index<scores.length) {
			scores[index]=value;
		}else {
			System.out.println("Invalid index. Must be between 0 and " + (scores.length - 1));
		}}
		public int getScore(int index) {
			if(index>=0&&index<scores.length) {
				return scores[index];
			}else {
				System.out.println("invalid index");
				return -1;
			}
			
		}
		 public void displayScores() {
		        System.out.println("Scores on the scoreboard:");
		        for (int i = 0; i < scores.length; i++) {
		            System.out.println("Player " + (i + 1) + ": " + scores[i]);
		        }
		    }
		 public static void main(String[] args) {
		        ScoreBoard board = new ScoreBoard();

		        // Setting scores
		        board.setScore(0, 10);
		        board.setScore(1, 20);
		        board.setScore(2, 30);
		        board.setScore(3, 40);
		        board.setScore(4, 50);
		        board.setScore(5, 100);  // Invalid index

		        // Getting a specific score
		        System.out.println("Score at index 2: " + board.getScore(2)); // 30
		        System.out.println("Score at index 5: " + board.getScore(5)); // Invalid
		        board.displayScores();

	
    }}
	
