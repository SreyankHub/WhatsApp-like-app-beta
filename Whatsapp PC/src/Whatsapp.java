import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class Whatsapp extends JFrame implements ActionListener{
	
	JRadioButton Announcements = new JRadioButton("Announcements");
	JRadioButton Settings = new JRadioButton("Settings");
	JRadioButton Games = new JRadioButton("Games");
	ButtonGroup bg = new ButtonGroup();
	JLabel label;
	
	
	
	Whatsapp() {
		
	Announcements.addActionListener(this);	
	Games.addActionListener(this);	
	Settings.addActionListener(this);	

	bg.add(Announcements);
	bg.add(Games);
	bg.add(Settings);
	
	label = new JLabel("          WhatsApp PC          ");
	label.setFont(new Font("MyFont",Font.BOLD,70));
	this.setTitle("WhatsApp PC");	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(new FlowLayout());
	this.setSize(500,500);
	this.setLocationRelativeTo(null);
	
	this.add(Announcements);
	this.add(Settings);
	this.add(Games);
	this.add(label);
	this.setVisible(true);
	
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JFrame settingsbar = new JFrame();
		JFrame announcementbar = new JFrame();
		JFrame gamesbar = new JFrame();
		
		if(e.getSource()==Games) {
			gamesbar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			gamesbar.setLayout(new FlowLayout());
			gamesbar.setSize(500,500);
			gamesbar.setLocationRelativeTo(null);
			gamesbar.setVisible(true);
			
		}
		else if(e.getSource()==Announcements) {
			announcementbar = new JFrame("Announcements");
			announcementbar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			announcementbar.setLayout(new FlowLayout());
			announcementbar.setSize(500,500);
			announcementbar.setLocationRelativeTo(null);
			announcementbar.setVisible(true);
			
		}
		else {
			settingsbar = new JFrame("Settings");
			settingsbar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			settingsbar.setLayout(new GridLayout());
			settingsbar.setSize(500,500);
			settingsbar.setLocationRelativeTo(null);
			settingsbar.setVisible(true);
			
			}
		
		JButton[] buttons = new JButton[49];
		JLabel text = new JLabel("GAMES TO PLAY");
		
		for(int i=0;i<49;i++) {
			buttons[i] = new JButton();
			buttons[i].setText("Hi");
			buttons[i].setFont(new Font("MyFont",Font.BOLD,30));
			gamesbar.add(buttons[i]);
		}
		
		JLabel announcetext1 = new JLabel("WhatsApp Beta 1.0");
		announcetext1.setFont(new Font("MyFont",Font.BOLD,30));
		JLabel announcetext2 = new JLabel("Made By Sreyank Bose");
		announcetext2.setFont(new Font("MyFont",Font.BOLD,30));
		JLabel announcetext3 = new JLabel("WhatsApp For Pc");
		announcetext3.setFont(new Font("MyFont",Font.BOLD,30));
		JLabel announcetext4 = new JLabel("Thank You");
		announcetext4.setFont(new Font("MyFont",Font.BOLD,30));
		
		
		
		gamesbar.add(text);
		announcementbar.add(announcetext1);
		announcementbar.add(announcetext3);	
		announcementbar.add(announcetext2);
		announcementbar.add(announcetext4);
		
		JButton[] buttons2  = new JButton[10];
		
		for(int c=0;c<10;c++) {
			buttons2[c] = new JButton();	
			buttons2[c].setFont(new Font("MyFont",Font.BOLD,25));
			buttons2[1].setText("Frame Size");
			buttons2[2].setText("Share");
			buttons2[3].setText("Save");
			buttons2[4].setText("File");
			buttons2[5].setText("");
			buttons2[6].setText("");
			buttons2[7].setText("");
			buttons2[8].setText("");
			buttons2[9].setText("");
			buttons2[10].setText("");
			
			settingsbar.add(buttons2[c]);
			
			
		
		}
		
	
	
	}	
	
	
		
		
	}


