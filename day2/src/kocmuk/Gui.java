package day2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Gui extends JFrame {

	private JPanel contentPane;
	private JTable table, table1, table2, table3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 414, 319);
		contentPane.add(tabbedPane);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("New tab", null, scrollPane, null);
		
		
		Object rowData[][]= new Object[][]{
				{" Œ—“ﬂ", " Œ—“ﬂ", " Œ—“ﬂ"},
				{" Œ—“ﬂ", " Œ—“ﬂ", " Œ—“ﬂ"},
				
		};
		Object [] headers=new Object[] {"head1","head2","head3"};
		table = new JTable(rowData,headers);
		table1 = new JTable(rowData,headers);
		table2 = new JTable(rowData,headers);
		table3 = new JTable(rowData,headers);
		scrollPane.setColumnHeaderView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		tabbedPane.addTab("New tab", null, scrollPane_1, null);
		scrollPane_1.setColumnHeaderView(table1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		tabbedPane.addTab("New tab", null, scrollPane_2, null);
		scrollPane_2.setColumnHeaderView(table2);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		tabbedPane.addTab("New tab", null, scrollPane_3, null);
		scrollPane_3.setColumnHeaderView(table3);
		
	}

}
