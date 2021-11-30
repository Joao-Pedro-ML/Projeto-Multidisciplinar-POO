package Pacote;

import java.util.Date;
import java.util.Calendar;
import java.time.LocalDateTime;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.*;
import javax.sound.sampled.*;

public class Principal extends JFrame{
		public String horas;
        public String mins;
        public String secs;
        public String horario;
        
        public int hora; //hora digitada para alarme, preciso enmviar para o relogio
        public int min;
        public int seg;
	
	private JTextField campoHora;
	
	public Principal() {
		
		super("JTextField");
		setLayout(new FlowLayout());
		
		campoHora = new JTextField("Digite a hora", 10); //10 colunas
		campoHora.addActionListener(new ActionListener(){
			//private String string;
			public void actionPerformed(ActionEvent e){
				String stringHora = String.format(e.getActionCommand());
				JOptionPane.showMessageDialog(null,stringHora);
				
				hora = Integer.parseInt(stringHora);
			}

		});
		add(campoHora);
	}

	public static void main(String[] args) {
       int horaAgora;
       int minAgora;
       int segAgora;
        
        Principal s = new Principal();
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.setSize(300,300);
		s.setVisible(true);
        

        horaAgora = LocalDateTime.now().getHour();
        minAgora = LocalDateTime.now().getMinute();
        segAgora = LocalDateTime.now().getSecond();
     

        this.horas = Integer.toString(hora);
        this.mins = Integer.toString(min);
        this.secs = Integer.toString(seg);
        
        horario = horas + " : " + mins + " : " + secs;
        

        
        
        Relogio h1 = new Relogio();
        Relogio h2 = new Relogio(10);
        Relogio h3 = new Relogio(10, 55);
        Relogio h4 = new Relogio(10, 55, 12);
        Relogio h5 = new Relogio(10, 55, 23);
        Relogio h6 = new Relogio(h5);

        System.out.println("H1: " + h1);
        System.out.println("H2: " + h2);
        System.out.println("H3: " + h3);
        System.out.println("H4: " + h4);
        System.out.println("H5: " + h5);
        System.out.println("H6: " + h6);

        
        if(h1.equals(horario)) {
        	//alarme tocaaaaa!!!!!!!!!
        	URL u = new URL("https://www.pacdv.com/sounds/interface_sound_effects/sound113.wav");
            Clip c = AudioSystem.getClip();
            AudioInputStream S = AudioSystem.getAudioInputStream(u);
            c.open(S);
            c.loop(6);
            SwingUtilities.invokeLater(new Runnable(){
            	public void run() {
            		JOptionPane.showMessageDialog(null, "Parar alarme!");
            	}
            });
        }

        
    }
	
}
