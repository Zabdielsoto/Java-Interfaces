import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{

  private JMenuBar mb;
  private JMenu opciones, calcular, acercade, colorfondo;
  private JMenuItem calculo, rojo, negro, morado, creador, salir, nuevo;
  private JLabel logo, bienvenido, title, nombre, apaterno, amaterno, 
  		 departamento, antiguedad, resultado, footer;
  private JTextField trabajador, paternotrabajador, maternotrabajador;
  private JComboBox combodepartamento, comboantiguedad;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;
  String usuario = "";

  public Principal() {
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Pantalla Principal");
   getContentPane().setBackground(new Color(255,0,0));
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
   Bienvenida ventanaB = new Bienvenida();
   usuario = ventanaB.texto;

   mb = new JMenuBar();
   mb.setBackground(new Color(255,0,0));
   setJMenuBar(mb);

   opciones = new JMenu("Opciones");
   opciones.setBackground(new Color(255,0,0));
   opciones.setFont(new Font("Andale Mono",1,14));
   opciones.setForeground(new Color(255,255,255));
   mb.add(opciones);

   calcular = new JMenu("Calcular");
   calcular.setBackground(new Color(255,0,0));
   calcular.setFont(new Font("Andale Mono",1,14));
   calcular.setForeground(new Color(255,255,255));
   mb.add(calcular);

   acercade = new JMenu("Acerca de");
   acercade.setBackground(new Color(255,0,0));
   acercade.setFont(new Font("Andale Mono",1,14));
   acercade.setForeground(new Color(255,255,255));
   mb.add(acercade);

   colorfondo = new JMenu("Color de Fondo");
   colorfondo.setFont(new Font("Andale Mono",1,14));
   colorfondo.setForeground(new Color(255,0,0));
   opciones.add(colorfondo);

   calculo = new JMenuItem("Vacaciones");
   calculo.setFont(new Font("Andale Mono",1,14));
   calculo.setForeground(new Color(255,0,0));
   calcular.add(calculo);
   calculo.addActionListener(this);

   rojo = new JMenuItem("Rojo");
   rojo.setFont(new Font("Andale Mono",1,14));
   rojo.setForeground(new Color(255,0,0));
   colorfondo.add(rojo);
   rojo.addActionListener(this);

   negro = new JMenuItem("Negro");
   negro.setFont(new Font("Andale Mono",1,14));
   negro.setForeground(new Color(255,0,0));
   colorfondo.add(negro);
   negro.addActionListener(this);

   morado = new JMenuItem("Morado");
   morado.setFont(new Font("Andale Mono",1,14));
   morado.setForeground(new Color(255,0,0));
   colorfondo.add(morado);
   morado.addActionListener(this);

   nuevo = new JMenuItem("Nuevo");
   nuevo.setFont(new Font("Andale Mono",1,14));
   nuevo.setForeground(new Color(255,0,0));
   opciones.add(nuevo);
   nuevo.addActionListener(this);

   creador = new JMenuItem("El creador");
   creador.setFont(new Font("Andale Mono",1,14));
   creador.setForeground(new Color(255,0,0));
   acercade.add(creador);
   creador.addActionListener(this);

   salir = new JMenuItem("Salir");
   salir.setFont(new Font("Andale Mono",1,14));
   salir.setForeground(new Color(255,0,0));
   opciones.add(salir);
   salir.addActionListener(this);

   ImageIcon image = new ImageIcon("images/logo-coca.png");
   logo = new JLabel(image);
   logo.setBounds(5,5,250,100);
   add(logo);

   bienvenido = new JLabel("Bienvenido " + usuario);
   bienvenido.setBounds(280,30,300,50);
   bienvenido.setFont(new Font("Andale Mono",1,32));
   bienvenido.setForeground(new Color(255,255,255));
   add(bienvenido);

   title = new JLabel("Datos del trabajadr para el calculo de vacaciones");
   title.setBounds(45,140,900,25);
   title.setFont(new Font("Andale Mono",0,24));
   title.setForeground(new Color(255,255,255));
   add(title);

   nombre = new JLabel("Nombre completo");
   nombre.setBounds(25,188,180,25);
   nombre.setFont(new Font("Andale Mono",1,12));
   nombre.setForeground(new Color(255,255,255));
   add(nombre);

   trabajador = new JTextField();
   trabajador.setBounds(25,213,150,25);
   trabajador.setBackground(new java.awt.Color(224,224,224));
   trabajador.setFont(new java.awt.Font("Andale Mono",1,14));
   trabajador.setForeground(new java.awt.Color(255,0,0));
   add(trabajador);

   apaterno = new JLabel("Apellido Paterno");
   apaterno.setBounds(25,248,180,25);
   apaterno.setFont(new Font("Andale Mono",1,12));
   apaterno.setForeground(new Color(255,255,255));
   add(apaterno);

   paternotrabajador = new JTextField();
   paternotrabajador.setBounds(25,273,150,25);
   paternotrabajador.setBackground(new java.awt.Color(224,224,224));
   paternotrabajador.setFont(new java.awt.Font("Andale Mono",1,14));
   paternotrabajador.setForeground(new java.awt.Color(255,0,0));
   add(paternotrabajador);

   amaterno = new JLabel("Apellido Materno");
   amaterno.setBounds(25,308,180,25);
   amaterno.setFont(new Font("Andale Mono",1,12));
   amaterno.setForeground(new Color(255,255,255));
   add(amaterno);

   maternotrabajador = new JTextField();
   maternotrabajador.setBounds(25,334,150,25);
   maternotrabajador.setBackground(new java.awt.Color(224,224,224));
   maternotrabajador.setFont(new java.awt.Font("Andale Mono",1,14));
   maternotrabajador.setForeground(new java.awt.Color(255,0,0));
   add(maternotrabajador);

   departamento = new JLabel("Selecciona el departamento:");
   departamento.setBounds(220,188,180,25);
   departamento.setFont(new Font("Andale Mono",1,12));
   departamento.setForeground(new Color(255,255,255));
   add(departamento);

   combodepartamento = new JComboBox();
   combodepartamento.setBounds(220,213,220,25);
   combodepartamento.setBackground(new java.awt.Color(224,224,224));
   combodepartamento.setFont(new java.awt.Font("Andale Mono",1,14));
   combodepartamento.setForeground(new java.awt.Color(255,0,0));
   add(combodepartamento);
   combodepartamento.addItem("");
   combodepartamento.addItem("Atencion al Cliente");
   combodepartamento.addItem("Departamento de Logistica");
   combodepartamento.addItem("Departamento de Gerencia");

   antiguedad = new JLabel("Selecciona la Antiguedad");
   antiguedad.setBounds(220,248,180,25);
   antiguedad.setFont(new Font("Andale Mono",1,12));
   antiguedad.setForeground(new Color(255,255,255));
   add(antiguedad);

   comboantiguedad = new JComboBox();
   comboantiguedad.setBounds(220,273,220,25);
   comboantiguedad.setBackground(new java.awt.Color(224,224,224));
   comboantiguedad.setFont(new java.awt.Font("Andale Mono",1,14));
   comboantiguedad.setForeground(new java.awt.Color(255,0,0));
   add(comboantiguedad);
   comboantiguedad.addItem("");
   comboantiguedad.addItem("1 año de servicio");
   comboantiguedad.addItem("2 a 6 años de servicio");
   comboantiguedad.addItem("7 o mas años de servicio");

   resultado = new JLabel("Resultado del Calculo");
   resultado.setBounds(220,307,180,25);
   resultado.setFont(new Font("Andale Mono",1,12));
   resultado.setForeground(new Color(255,255,255));
   add(resultado);

   textarea1 = new JTextArea();
   textarea1.setEditable(false);
   textarea1.setBackground(new Color(224,224,224));
   textarea1.setFont(new Font("Andale Mono",1,11));
   textarea1.setForeground(new Color(255,0,0));
   textarea1.setText("\n Aqui aparece el resultado de las vacaciones.");
   scrollpane1 = new JScrollPane(textarea1);
   scrollpane1.setBounds(220,333,385,90);
   add(scrollpane1);

   footer = new JLabel("2017 The Coca-Cola Company | Todos los derechos reservados");
   footer.setBounds(135,445,500,30);
   footer.setFont(new java.awt.Font("Andale Mono",1,12));
   footer.setForeground(new java.awt.Color(255,255,255));
   add(footer);
 }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == calculo){
    String snombre = trabajador.getText();
    String spaterno = paternotrabajador.getText();
    String smaterno = maternotrabajador.getText();
    String sdepartamento = combodepartamento.getSelectedItem().toString();
    String santiguedad = comboantiguedad.getSelectedItem().toString();

    if(snombre.equals("") || spaterno.equals("") || smaterno.equals("") || 
       sdepartamento.equals("") || santiguedad.equals("")){
     JOptionPane.showMessageDialog(null,"Debes llenar todos los campos");
   } else {
     if(sdepartamento.equals("Atencion al Cliente")){
      if(santiguedad.equals("1 año de servicio")){
       textarea1.setText("\n El trabajador " + snombre + " " + spaterno + " " + smaterno +
			 "\n quien labora en " + sdepartamento + " con " + santiguedad + 
			 "\n recibe 6 dias de vacaciones");
     }
      if(santiguedad.equals("2 a 6 años de servicio")){
       textarea1.setText("\n El trabajador " + snombre + " " + spaterno + " " + smaterno +
			 "\n quien labora en " + sdepartamento + " con " + santiguedad + 
			 "\n recibe 14 dias de vacaciones");
     }
      if(santiguedad.equals("7 o mas años de servicio")){
       textarea1.setText("\n El trabajador " + snombre + " " + spaterno + " " + smaterno +
			 "\n quien labora en " + sdepartamento + " con " + santiguedad + 
			 "\n recibe 20 dias de vacaciones");
     }
    } else if(sdepartamento.equals("Departamento de Logistica")){
      if(santiguedad.equals("1 año de servicio")){
       textarea1.setText("\n El trabajador " + snombre + " " + spaterno + " " + smaterno +
			 "\n quien labora en " + sdepartamento + " con " + santiguedad + 
			 "\n recibe 7 dias de vacaciones");
     }
      if(santiguedad.equals("2 a 6 años de servicio")){
       textarea1.setText("\n El trabajador " + snombre + " " + spaterno + " " + smaterno +
			 "\n quien labora en " + sdepartamento + " con " + santiguedad + 
			 "\n recibe 15 dias de vacaciones");
     }
      if(santiguedad.equals("7 o mas años de servicio")){
       textarea1.setText("\n El trabajador " + snombre + " " + spaterno + " " + smaterno +
			 "\n quien labora en " + sdepartamento + " con " + santiguedad + 
			 "\n recibe 22 dias de vacaciones");
     }
    } else if(sdepartamento.equals("Departamento de Gerencia")){
      if(santiguedad.equals("1 año de servicio")){
       textarea1.setText("\n El trabajador " + snombre + " " + spaterno + " " + smaterno +
			 "\n quien labora en " + sdepartamento + " con " + santiguedad + 
			 "\n recibe 10 dias de vacaciones");
     }
      if(santiguedad.equals("2 a 6 años de servicio")){
       textarea1.setText("\n El trabajador " + snombre + " " + spaterno + " " + smaterno +
			 "\n quien labora en " + sdepartamento + " con " + santiguedad + 
			 "\n recibe 20 dias de vacaciones");
     }
      if(santiguedad.equals("7 o mas años de servicio")){
       textarea1.setText("\n El trabajador " + snombre + " " + spaterno + " " + smaterno +
			 "\n quien labora en " + sdepartamento + " con " + santiguedad + 
			 "\n recibe 30 dias de vacaciones");
     }
    }
   }
  }
   if(e.getSource() == rojo){
    getContentPane().setBackground(new Color (255,0,0));
  }
   if(e.getSource() == negro){
    getContentPane().setBackground(new Color (0,0,0));
  }
   if(e.getSource() == morado){
    getContentPane().setBackground(new Color (51,0,51));
  }
   if(e.getSource() == nuevo){
    trabajador.setText("");
    paternotrabajador.setText("");
    maternotrabajador.setText("");
    combodepartamento.setSelectedIndex(0);
    comboantiguedad.setSelectedIndex(0);
    textarea1.setText("\n Aqui aparece el resultado de las vacaciones.");
  }
   if(e.getSource() == salir){
    Bienvenida interfaz1 = new Bienvenida();
    interfaz1.setBounds(0,0,350,450);
    interfaz1.setVisible(true);
    interfaz1.setResizable(false);
    interfaz1.setLocationRelativeTo(null);
    this.setVisible(false);
  }
   if(e.getSource() == creador){
    JOptionPane.showMessageDialog(null,"Desarollado por Aathoz");
  }
 }

  public static void main(String args[]){
   Principal vprincipal = new Principal();
   vprincipal.setBounds(0,0,640,535);
   vprincipal.setVisible(true);
   vprincipal.setResizable(false);
   vprincipal.setLocationRelativeTo(null);
 }
}