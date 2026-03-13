import java.awt.*;

class LoginDemo
{
    public static void main(String args[])
    {
        Frame f = new Frame();

        f.setTitle("Login Page");
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(new FlowLayout());

        Label l1 = new Label("Username");
        f.add(l1);

        TextField t1 = new TextField(20);
        f.add(t1);

        Label l2 = new Label("Password");
        f.add(l2);

        TextField t2 = new TextField(20);
        t2.setEchoChar('*');
        f.add(t2);

        Button b1 = new Button("Login");
        f.add(b1);

        Button b2 = new Button("Logout");
        f.add(b2);
    }
}