import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class Book
{
String Book_Name;
String Author_Name;
int No_of_Pages;
Book(String Book_Name,String Author_Name,int No_of_Pages)
{
this.Book_Name=Book_Name;
this.Author_Name=Author_Name;
this.No_of_Pages=No_of_Pages;
}
}
public class BookGUI extends JFrame implements ActionListener
{
ArrayList <Book> list;
JLabel l1,l2,l3;
JTextField t1,t2,t3;
JButton b1,b2;
BookGUI()
{
setTitle("Library Management System");
setSize(300,300);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new FlowLayout());
l1=new JLabel("Book Name");
add(l1);
t1=new JTextField(20);
add(t1);
l2=new JLabel("Author Name");
add(l2);
t2=new JTextField(20);
add(t2);
l3=new JLabel("No of Pages");
add(l3);
t3=new JTextField(20);
add(t3);
b1 = new JButton("Add Book");
add(b1);
b2=new JButton("Display");
add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
setVisible(true);
list=new ArrayList<>();
}
void addBook(Book b)
{
list.add(b);
JOptionPane.showMessageDialog(this,"Book added Successfully");
}
String display()
{
if(list.isEmpty())
{
JOptionPane.showMessageDialog(this,"No Books to Display");
}
StringBuffer sb = new StringBuffer();
for(Book x:list)
{
sb.append("Book Name: ").append(x.Book_Name).append(" Author Name: ").append(x.Author_Name).append(" No of Pages: ").append(x.No_of_Pages).append("\n");
}
return sb.toString();
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{

Book bo = new Book(t1.getText(),t2.getText(),Integer.parseInt(t3.getText()));
addBook(bo);
t1.setText("");
t2.setText("");
t3.setText("");
}
else if(e.getSource()==b2)
{
String p=display();
System.out.println("Book Details: ");
System.out.println(p);
}
}
public static void main(String args[])
{
new BookGUI();
}
}