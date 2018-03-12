import javax.swing.JFrame;

public class MainAccount extends JFrame
{
	public MainAccount()
	{
		add (new AccountPanel());
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) 
	{
		new MainAccount();
		{
			
		}
	} 
}
