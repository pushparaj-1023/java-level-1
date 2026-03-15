import java.awt.*;

class CourseDemo
{
    public static void main(String args[])
    {
        Frame f = new Frame();

        f.setTitle("Application");
        f.setSize(500,500);
        f.setVisible(true);

        FlowLayout fl = new FlowLayout();
        f.setLayout(fl);

        Label l1 = new Label("Select your courses");
        f.add(l1);

        Checkbox cb1 = new Checkbox("BCA");
        f.add(cb1);

        Checkbox cb2 = new Checkbox("BSc ADS");
        f.add(cb2);

        Checkbox cb3 = new Checkbox("BSc AI/ML");
        f.add(cb3);
    }
}