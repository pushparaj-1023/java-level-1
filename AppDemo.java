import java.awt.*;

class AppDemo
{
    public static void main(String args[])
    {
        Frame f = new Frame();

        f.setTitle("Application");
        f.setSize(500,500);
        f.setVisible(true);

        FlowLayout fl = new FlowLayout();
        f.setLayout(fl);

        Label l1 = new Label("Date of Birth");
        f.add(l1);

        // Month Choice
        Choice c1 = new Choice();
        c1.add("January");
        c1.add("February");
        c1.add("March");
        c1.add("April");
        c1.add("May");
        c1.add("June");
        c1.add("July");
        c1.add("August");
        c1.add("September");
        c1.add("October");
        c1.add("November");
        c1.add("December");

        f.add(c1);

        // Date Choice
        Choice c2 = new Choice();
        for(int i=1;i<=31;i++)
        {
            c2.add("" + i);
        }

        f.add(c2);

        // Year Choice
        Choice c3 = new Choice();
        for(int i=2000;i<=2010;i++)
        {
            c3.add("" + i);
        }

        f.add(c3);
    }
}