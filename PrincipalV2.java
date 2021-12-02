package Pacote;

import java.util.Date;
import java.util.Calendar;
import java.time.LocalDateTime;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.*;
import javax.sound.sampled.*;

@SuppressWarnings("serial")
public class Principal extends JFrame{
	
	public static String horas;
    public static String mins;
    public static String secs;
    public static String horario;
        
    public static int hora; //hora digitada para alarme, preciso enmviar para o relogio
    public static int min;
    public static int sec;
        
	
	private JTextField campoHora;
	private JTextField campoMin;
	
	public Principal() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
		
		/*
		 * super("JTextField"); setLayout(new FlowLayout());
		 * 
		 * campoHora = new JTextField("Digite a hora", 10); //10 colunas
		 * campoHora.addActionListener(new ActionListener(){ //private String string;
		 * public void actionPerformed(ActionEvent e1){ String stringHora =
		 * String.format(e1.getActionCommand());
		 * JOptionPane.showMessageDialog(null,stringHora); horas = stringHora; hora =
		 * Integer.parseInt(stringHora); }
		 * 
		 * }); add(campoHora);
		 * 
		 * 
		 * campoMin = new JTextField("Digite os minutos", 10); //10 colunas
		 * campoMin.addActionListener(new ActionListener(){ //private String string;
		 * public void actionPerformed(ActionEvent e2){ String stringMin =
		 * String.format(e2.getActionCommand());
		 * JOptionPane.showMessageDialog(null,stringMin); mins = stringMin; min =
		 * Integer.parseInt(stringMin); }
		 * 
		 * }); add(campoMin);
		 */
	
		int horaAgora;
	    int minAgora;
	    int secAgora;	       
	    
		
		horas = JOptionPane.showInputDialog("Digite as horas: ");
		int hora = Integer.parseInt(horas);
		
		String mins = JOptionPane.showInputDialog("Digite os minuitos: ");
		int min = Integer.parseInt(mins);
		horario = horas + " : " + mins;
		JOptionPane.showMessageDialog(null, horario, "Definir alarme", JOptionPane.INFORMATION_MESSAGE);
		
		
		horaAgora=LocalDateTime.now().getHour();
		minAgora = LocalDateTime.now().getMinute();
	    secAgora = LocalDateTime.now().getSecond();
	    
		Relogio alarme = new Relogio(hora, min, secAgora);
		System.out.println("Alarme definido para: " + alarme);
		
		Relogio h = new Relogio(horaAgora, minAgora, secAgora);
		System.out.println("Primeira Hora: "+ h);
	    while((horaAgora != hora) && (minAgora != min)){
			horaAgora=LocalDateTime.now().getHour();
			minAgora = LocalDateTime.now().getMinute();
			h.setHora(horaAgora, minAgora, secAgora);
			System.out.println("Hora agora: "+ h);
		}
	         
	    Relogio dif = new Relogio();
	       
	    if(alarme == h) {
	       //alarme tocaaaaa!!!!!!!!!
	       URL u = new URL("https://www.pacdv.com/sounds/interface_sound_effects/sound113.wav");
	       Clip c = AudioSystem.getClip();
	       AudioInputStream S = AudioSystem.getAudioInputStream(u);
	       c.open(S);
	       c.loop(6);
	       SwingUtilities.invokeLater(new Runnable(){
	    	   public void run() {
	           JOptionPane.showMessageDialog(null, "Parar alarme!"); } }); }
			 
		
		
	}

	public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException {
       //int horaAgora;
       //int minAgora;
       //int segAgora;
        
        Principal s = new Principal();
		//s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//s.setSize(300,300);
		//s.setVisible(true);
        

        /*horaAgora = LocalDateTime.now().getHour();
        minAgora = LocalDateTime.now().getMinute();
        segAgora = LocalDateTime.now().getSecond();
     
        Relogio alarme = new Relogio(horaAgora, minAgora, segAgora);
        
        */
        
        //Relogio h1 = new Relogio();
        //Relogio h2 = new Relogio(10);
        //Relogio h3 = new Relogio(10, 55);
     
        //Relogio h5 = new Relogio(10, 55, 23);
        //Relogio h6 = new Relogio(h5);

        //System.out.println("H1: " + h1);
        //System.out.println("H2: " + h2);
        //System.out.println("H3: " + h3);
        
        //System.out.println("H5: " + h5);
        //System.out.println("H6: " + h6);

        
       /*if(h.equals(alarme)) {
        	//alarme tocaaaaa!!!!!!!!!
        	URL u = new URL("https://www.pacdv.com/sounds/interface_sound_effects/sound113.wav");
            Clip c = AudioSystem.getClip();
            AudioInputStream S = AudioSystem.getAudioInputStream(u);
            c.open(S);
            c.loop(6);
            SwingUtilities.invokeLater(new Runnable(){
            	public void run() {
            		JOptionPane.showMessageDialog(null, "Parar alarme!"); } }); }
		 

        
    */}
	
}
