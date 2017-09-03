import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int num = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String q1 = JOptionPane.showInputDialog("Feed me and I live, yet give me a drink and I die");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (q1.contains("fire")) {
			JOptionPane.showMessageDialog(null, "good");
			num++;
		} else {
			JOptionPane.showInputDialog("wrong");

		}
	

	String q2 = JOptionPane.showInputDialog("I weaken all men for hours each day. I show you strange visions while you are away. I take you by night, by day take you back, None suffer to have me, but do from my lack. What am I?");
	// 4. If they got the answer right, pop up "correct!" and increase the score by
	// one
	if(q2.contains("sleep"))
	{
		JOptionPane.showMessageDialog(null, "good");
		num++;
	}else
	{
		JOptionPane.showInputDialog("wrong");
	}
		String q3 = JOptionPane.showInputDialog("Fashions change but what can a person wear that is never out of style?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (q3.contains("smile")) {
			JOptionPane.showMessageDialog(null, "good");
			num++;
		} else {
			JOptionPane.showInputDialog("wrong");
		}
		
	// 5. Otherwise, say "wrong" and tell them the answer

	// 6. Add some more riddles

	// 2. Make a pop up to show the score.
	JOptionPane.showMessageDialog(null, "score "+ num + "/3");

	}
}