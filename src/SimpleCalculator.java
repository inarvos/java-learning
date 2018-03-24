import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator {
	public static void main(String... args) {
		JPanel window = new JPanel();
		
		FlowLayout layout = new FlowLayout();
		//GridLayout layout = new GridLayout(2, 2);
		
		window.setLayout(layout);
		
		JLabel label = new JLabel("Some text");
		
		
		JTextField textField = new JTextField(10);
		
		JButton button = new JButton("Push me");
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				label.setText(textField.getText());
				
			}
		});
		window.add(label);
		window.add(textField);
		window.add(button);
		
		JFrame frame = new JFrame("My first calculator");
		
		frame.setContentPane(window);
		
		frame.setSize(400, 100);
		frame.setVisible(true);
		
		
		
		
		
		
		
		
	}


}
