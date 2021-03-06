package hospita_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

class launcher extends JFrame{
	
	JFrame jf1 = new JFrame();
	JPanel buts = new JPanel();
	JButton doctors = new JButton("Doctors");
	JButton resources = new JButton("resources");
	JButton patients = new JButton("patients");
	JButton reports = new JButton("reports");
	launcher() {
		jf1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jf1.setSize(500,500);
		jf1.setVisible(true);
		
		doctors.setBounds(10,20,100,30);	
		reports.setBounds(10,55,100,30);
		patients.setBounds(10,90,100,30);
		resources.setBounds(10,125,100,30);
		
		jf1.setLayout(new BorderLayout());
		jf1.setContentPane(new JLabel(new ImageIcon("c:\\xampp\\htdocs\\Swasthya\\images\\doc1.jpg")));
        jf1.setLayout(new FlowLayout());
        
		//buts.add(reports);
        buts.add(doctors);
        buts.add(patients);
        buts.add(resources);
        
        jf1.add(buts);
        jf1.setSize(500,500);
        
        doctors.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //your actions
            	new Doctors();
            	jf1.dispose();
            }
        });
        patients.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //your actions
            	new Patients();
            	jf1.dispose();
            }
        });
        resources.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //your actions
            	new Resources();
            	jf1.dispose();
            }
        });
	}
	public static void main(String[] args) {
		new launcher();
	}
}

