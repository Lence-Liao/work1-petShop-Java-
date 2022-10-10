/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Controller;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

import Dao.impldog;
import Model.adopDog;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author User
 */
public class adoption extends javax.swing.JFrame {

    /**
     * Creates new form adoption
     */
    public adoption() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setForeground(new Color(51, 51, 51));
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setForeground(new Color(51, 51, 51));
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(255, 102, 51));

        jLabel2.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 35)); // NOI18N
        jLabel2.setText("寵物領養系統");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        			.addContainerGap(211, Short.MAX_VALUE)
        			.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
        			.addGap(178))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(18)
        			.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel1.setLayout(jPanel1Layout);

        jPanel2.setBackground(new Color(255, 204, 153));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 20)); // NOI18N
        jLabel1.setText("品種");
        
        JLabel lblNewLabel = new JLabel("年齡");
        lblNewLabel.setForeground(new Color(51, 51, 51));
        lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 20));
        
        JLabel lblNewLabel_1 = new JLabel("性別");
        lblNewLabel_1.setForeground(new Color(51, 51, 51));
        lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 20));
        
        JLabel lblNewLabel_2 = new JLabel("個性");
        lblNewLabel_2.setForeground(new Color(51, 51, 51));
        lblNewLabel_2.setFont(new Font("新細明體", Font.PLAIN, 20));
        
        JLabel lblNewLabel_3 = new JLabel("疫苗");
        lblNewLabel_3.setForeground(new Color(51, 51, 51));
        lblNewLabel_3.setFont(new Font("新細明體", Font.PLAIN, 20));
        
        JLabel pp = new JLabel("晶片");
        pp.setForeground(new Color(51, 51, 51));
        pp.setFont(new Font("新細明體", Font.PLAIN, 20));
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);
        
        lblNewLabel_5 = new JLabel("新增寵物至領養中心");
        lblNewLabel_5.setForeground(new Color(51, 51, 51));
        lblNewLabel_5.setFont(new Font("新細明體", Font.BOLD, 25));
        
        JLabel jLabel1_1 = new JLabel();
        jLabel1_1.setText("品種");
        jLabel1_1.setForeground(new Color(51, 51, 51));
        jLabel1_1.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 20));
        
        JLabel lblNewLabel_7 = new JLabel("年齡");
        lblNewLabel_7.setForeground(new Color(51, 51, 51));
        lblNewLabel_7.setFont(new Font("新細明體", Font.PLAIN, 20));
        
        JLabel lblNewLabel_1_1 = new JLabel("性別");
        lblNewLabel_1_1.setForeground(new Color(51, 51, 51));
        lblNewLabel_1_1.setFont(new Font("新細明體", Font.PLAIN, 20));
        
        JLabel lblNewLabel_2_1 = new JLabel("個性");
        lblNewLabel_2_1.setForeground(new Color(51, 51, 51));
        lblNewLabel_2_1.setFont(new Font("新細明體", Font.PLAIN, 20));
        
        JLabel lblNewLabel_3_1 = new JLabel("疫苗");
        lblNewLabel_3_1.setForeground(new Color(51, 51, 51));
        lblNewLabel_3_1.setFont(new Font("新細明體", Font.PLAIN, 20));
        
        JLabel lblNewLabel_4_1 = new JLabel("晶片");
        lblNewLabel_4_1.setForeground(new Color(51, 51, 51));
        lblNewLabel_4_1.setFont(new Font("新細明體", Font.PLAIN, 20));
        
        btnupdate = new JButton("更新");
        btnupdate.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		int Id2=Integer.parseInt(id2.getText());
        		
        		String Kind=kind1.getSelectedItem().toString();		
        		int Year=Integer.parseInt(year1.getText());        		
        		String Sex=sex1.getSelectedItem().toString();		
        		String Per =per1.getSelectedItem().toString();		
        		String Vac=vac1.getSelectedItem().toString();		
        		String Wat=waf1.getSelectedItem().toString();		       		
        		adopDog ad=new adopDog(Kind,Year,Sex,Per,Vac,Wat,Id2);        		
        		new impldog().update(ad);
        	}
        });
        btnupdate.setFont(new Font("新細明體", Font.PLAIN, 20));
        
        lblNewLabel_8 = new JLabel(" ID :");
        lblNewLabel_8.setFont(new Font("新細明體", Font.PLAIN, 20));
        
        id2 = new JTextField();
        id2.setColumns(10);
        
        JComboBox kind = new JComboBox();
        kind.setForeground(new Color(0, 0, 0));
        kind.setFont(new Font("新細明體", Font.PLAIN, 15));
        kind.setModel(new DefaultComboBoxModel(new String[] {"請選擇", "二哈", "金毛", "柴犬", "貴賓"}));
        
        JButton btnadd = new JButton("新增");
        btnadd.setFont(new Font("新細明體", Font.PLAIN, 25));
        btnadd.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		String Kind= kind.getSelectedItem().toString();				
                int Year=Integer.parseInt(year.getText());               
                String Sex=sex.getSelectedItem().toString();		
                String Per=per.getSelectedItem().toString();		
                String Vac=vac.getSelectedItem().toString();
                String Waf=waf.getSelectedItem().toString();
                new  impldog().add(Kind, Year, Sex, Per, Vac, Waf);
        	}
        });
        
        year = new JTextField();
        year.setColumns(10);
        
        per = new JComboBox();
        per.setFont(new Font("新細明體", Font.PLAIN, 15));
        per.setModel(new DefaultComboBoxModel(new String[] {"請選擇", "活潑", "黏人", "拆家"}));
        
        vac = new JComboBox();
        vac.setFont(new Font("新細明體", Font.PLAIN, 15));
        vac.setModel(new DefaultComboBoxModel(new String[] {"請選擇", "無", "有"}));
        
        waf = new JComboBox();
        waf.setFont(new Font("新細明體", Font.PLAIN, 15));
        waf.setModel(new DefaultComboBoxModel(new String[] {"請選擇", "無", "有"}));
        
        sex = new JComboBox();
        sex.setFont(new Font("新細明體", Font.PLAIN, 15));
        sex.setModel(new DefaultComboBoxModel(new String[] {"請選擇", "男生", "女生"}));
        
        kind1 = new JComboBox();
        kind1.setModel(new DefaultComboBoxModel(new String[] {"請選擇", "二哈", "金毛", "柴犬", "貴賓"}));
        kind1.setForeground(Color.BLACK);
        kind1.setFont(new Font("新細明體", Font.PLAIN, 15));
        
        year1 = new JTextField();
        year1.setFont(new Font("新細明體", Font.PLAIN, 15));
        year1.setColumns(10);
        
        sex1 = new JComboBox();
        sex1.setFont(new Font("新細明體", Font.PLAIN, 15));
        sex1.setModel(new DefaultComboBoxModel(new String[] {"請選擇", "男生", "女生"}));
        
        per1 = new JComboBox();
        per1.setFont(new Font("新細明體", Font.PLAIN, 15));
        per1.setModel(new DefaultComboBoxModel(new String[] {"請選擇", "活潑", "黏人", "拆家"}));
        
        vac1 = new JComboBox();
        vac1.setFont(new Font("新細明體", Font.PLAIN, 15));
        vac1.setModel(new DefaultComboBoxModel(new String[] {"請選擇", "無", "有"}));
        
        waf1 = new JComboBox();
        waf1.setFont(new Font("新細明體", Font.PLAIN, 15));
        waf1.setModel(new DefaultComboBoxModel(new String[] {"請選擇", "無", "有"}));
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addContainerGap()
        							.addComponent(kind, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGap(32)
        							.addComponent(jLabel1)))
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(jPanel2Layout.createSequentialGroup()
        									.addGap(10)
        									.addComponent(year, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
        								.addGroup(jPanel2Layout.createSequentialGroup()
        									.addGap(29)
        									.addComponent(lblNewLabel)))
        							.addGap(20)
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(jPanel2Layout.createSequentialGroup()
        									.addComponent(lblNewLabel_1)
        									.addGap(43))
        								.addGroup(jPanel2Layout.createSequentialGroup()
        									.addComponent(sex, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
        									.addGap(18)))
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(jPanel2Layout.createSequentialGroup()
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(per, 0, 110, Short.MAX_VALUE)
        									.addGap(18)
        									.addComponent(vac, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
        									.addGap(18)
        									.addComponent(waf, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED))
        								.addGroup(jPanel2Layout.createSequentialGroup()
        									.addGap(32)
        									.addComponent(lblNewLabel_2)
        									.addGap(84)
        									.addComponent(lblNewLabel_3)
        									.addGap(58)
        									.addComponent(pp)
        									.addGap(21)))
        							.addGap(186))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGap(159)
        							.addComponent(btnadd, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE))))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGap(21)
        							.addComponent(jLabel1_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addContainerGap()
        							.addComponent(kind1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)))
        					.addGap(19)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGap(20)
        							.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
        							.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        							.addGap(37)
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
        									.addGap(12)
        									.addComponent(per1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
        									.addGap(29)
        									.addComponent(vac1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
        									.addGap(27)
        									.addComponent(waf1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
        								.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
        									.addGap(39)
        									.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        									.addGap(69)
        									.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
        									.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        									.addGap(15)))
        							.addGap(172))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        								.addGroup(jPanel2Layout.createSequentialGroup()
        									.addComponent(year1, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
        									.addGap(39)
        									.addComponent(sex1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(id2, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(257)
        					.addComponent(btnupdate, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(21)
        					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 641, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(215)
        					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewLabel_1)
        				.addComponent(lblNewLabel_2)
        				.addComponent(lblNewLabel)
        				.addComponent(jLabel1)
        				.addComponent(lblNewLabel_3)
        				.addComponent(pp))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(year, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        					.addComponent(sex, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
        					.addComponent(vac, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
        					.addComponent(waf, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
        					.addComponent(per, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(kind, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(btnadd, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)))
        			.addGap(8)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(41)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(jLabel1_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
        							.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
        						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(year1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        							.addComponent(sex1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        							.addComponent(per1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        							.addComponent(vac1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        							.addComponent(waf1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
        						.addComponent(kind1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(10)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblNewLabel_8, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        						.addComponent(id2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(19)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))))
        			.addGap(16)
        			.addComponent(btnupdate, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        
        JButton select = new JButton("收尋所有寵物");
        
        select.setForeground(new Color(51, 51, 51));
        select.setFont(new Font("新細明體", Font.PLAIN, 20));
        
        idselect = new JButton("ID收尋");
        idselect.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		int Id1=Integer.parseInt(id1.getText());
        		adopDog ad =new impldog().quelyId(Id1);
        		ta1.setText(ad.ak(ad));
        	}
        });
        
        id1 = new JTextField();
        id1.setColumns(10);
        
        lblNewLabel_6 = new JLabel("ID :");
        lblNewLabel_6.setFont(new Font("新細明體", Font.PLAIN, 30));
        
        btndetele = new JButton("ID刪除");
        btndetele.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		int delete =Integer.parseInt(id1.getText());
        		new impldog().delete(delete);
        		
        	}
        });
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
        	gl_panel.createParallelGroup(Alignment.TRAILING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(select, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
        			.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(id1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
        			.addGap(70)
        			.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
        				.addComponent(btndetele, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
        				.addComponent(idselect, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
        			.addGap(22))
        );
        gl_panel.setVerticalGroup(
        	gl_panel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addContainerGap(14, Short.MAX_VALUE)
        			.addComponent(idselect, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
        			.addGap(27)
        			.addComponent(btndetele, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
        			.addGap(18))
        		.addGroup(gl_panel.createSequentialGroup()
        			.addGap(29)
        			.addComponent(select, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(29, Short.MAX_VALUE))
        		.addGroup(gl_panel.createSequentialGroup()
        			.addGap(51)
        			.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
        				.addComponent(id1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(53, Short.MAX_VALUE))
        );
        panel.setLayout(gl_panel);
        select.addMouseListener(new MouseAdapter() {
        	
        	public void mouseClicked(MouseEvent e) {
        		ta1.setText(new impldog().quely1());
        		
        		
        	}
        });
        jPanel2.setLayout(jPanel2Layout);

        jPanel3.setBackground(new Color(255, 204, 102));
        ta1 = new javax.swing.JTextArea();
        
                ta1.setColumns(20);
                ta1.setRows(5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(ta1, GroupLayout.PREFERRED_SIZE, 604, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(ta1, GroupLayout.PREFERRED_SIZE, 601, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        jPanel3.setLayout(jPanel3Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(10)
        					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 672, Short.MAX_VALUE)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 615, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jPanel3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    	
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adoption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adoption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adoption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adoption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adoption().setVisible(true);
            }
        });
    }
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta1;
    private JLabel lblNewLabel_5;
    private JButton idselect;
    private JTextField id1;
    private JLabel lblNewLabel_6;
    private JButton btnupdate;
    private JLabel lblNewLabel_8;
    private JTextField id2;
    private JButton btndetele;
    private JTextField year;
    private JComboBox per;
    private JComboBox vac;
    private JComboBox waf;
    private JComboBox sex;
    private JComboBox kind1;
    private JTextField year1;
    private JComboBox sex1;
    private JComboBox per1;
    private JComboBox vac1;
    private JComboBox waf1;
}