import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{

  private JLabel label1, label2;
  private JCheckBox cb1;
  private JButton boton1, boton2;
  private JScrollPane sp1;
  private JTextArea ta1;
  String nombre = "";

  public Licencia(){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Licencia de Uso");
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
   Bienvenida ventanaB = new Bienvenida();
   nombre = ventanaB.texto;

   label1 = new JLabel("TERMINOS Y CONDICIONES");
   label1.setBounds(215,5,200,30);
   label1.setFont(new Font("Andale Mono",1,14));
   label1.setForeground(new Color(0,0,0));
   add(label1);

   ta1 = new JTextArea();
   ta1.setEditable(false);
   ta1.setFont(new Font("Andale Mono",0,9));
   ta1.setText("\n\n          TERMINOS Y CONDICIONES" + 
	       "\n A. PROHIBIDA SU VENTA Y DISPOSICION SIN AUTORIZACION DE LA ZABDIEL." +
	       "\n B. PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISEÑO DE LAS INTERFACES GRAFICAS." +
	       "\n C. ZABDIEL NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE" +
	       "\n LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACION RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
	       "\n (ZABDIEL), NO SE RESPONSABILIZA DEL USO QUE USTED" +
	       "\n HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
	       "\n SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE");
   sp1 = new JScrollPane(ta1);
   sp1.setBounds(10,40,575,200);
   add(sp1);

   cb1 = new JCheckBox("Yo " + nombre + " Acepto");
   cb1.setBounds(10,250,300,30);
   cb1.addChangeListener(this);
   add(cb1);

   boton1 = new JButton("Continuar");
   boton1.setBounds(10,290,100,30);
   boton1.addActionListener(this);
   boton1.setEnabled(false);
   add(boton1);

   boton2 = new JButton("No Acepto");
   boton2.setBounds(120,290,100,30);
   boton2.addActionListener(this);
   boton2.setEnabled(true);
   add(boton2);

   ImageIcon imagen = new ImageIcon("images/coca-cola.png");
   label2 = new JLabel(imagen);
   label2.setBounds(315,135,300,300);
   add(label2);
 }

  public void stateChanged(ChangeEvent e){
   if(cb1.isSelected() == true){
    boton1.setEnabled(true);
    boton2.setEnabled(false);
  } else {
    boton1.setEnabled(false);
    boton2.setEnabled(true);
  }
 }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton1){
    Principal vprincipal = new Principal();
    vprincipal.setBounds(0,0,640,535);
    vprincipal.setVisible(true);
    vprincipal.setResizable(false);
    vprincipal.setLocationRelativeTo(null);
    this.setVisible(false);
  } else if(e.getSource() == boton2){
    Bienvenida interfaz1 = new Bienvenida();
    interfaz1.setBounds(0,0,350,450);
    interfaz1.setVisible(true);
    interfaz1.setResizable(false);
    interfaz1.setLocationRelativeTo(null);
    this.setVisible(false);
  }
 }

  public static void main(String args[]){
   Licencia interfaz2 = new Licencia();
   interfaz2.setBounds(0,0,600,360);
   interfaz2.setVisible(true);
   interfaz2.setResizable(false);
   interfaz2.setLocationRelativeTo(null);
 }
}


