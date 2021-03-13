package mesAñoCorrecto;

import javax.swing.JOptionPane;

public class DiaMesAñoCorrect2 {

	public static void main(String[] args) {
		
		int dia, mes, año, diasmes = 0;
		
		dia= Integer.parseInt(JOptionPane.showInputDialog("Digita el día"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digita el mes"));
		año = Integer.parseInt(JOptionPane.showInputDialog("Digita el año"));
		
		switch(mes) {
		case 1: diasmes=31; break;
		case 2: diasmes=28; break;
		case 3: diasmes=31; break;
		case 4: diasmes=30; break;
		case 5: diasmes=31; break;
		case 6: diasmes=30; break;
		case 7: diasmes=31; break;
		case 8: diasmes=31; break;
		case 9: diasmes=30; break;
		case 10: diasmes=31; break;
		case 11: diasmes=30; break;
		case 12: diasmes=31; break;
		
		
		}
		
		if(dia>=1 && dia<=diasmes) {
			if(mes>=1 && mes<=12) {
				if(año>0 && año<=2021) {
					JOptionPane.showConfirmDialog(null, "El día "+dia+" el mes "+mes+" y el año "+año+" son correctos");
				}else {
					JOptionPane.showConfirmDialog(null, "El año: "+año+" es incorrecto");
				}
			}else {
				JOptionPane.showConfirmDialog(null, "El mes "+mes+" es incorrecto");
			}
			
		}else {
			JOptionPane.showConfirmDialog(null, "El día "+dia+" es incorrecto");}
		
	}}
		
		
		
		
	

