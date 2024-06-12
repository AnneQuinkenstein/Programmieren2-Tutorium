package interfaces;

public class InferfaceMain {

    public static void main(String[] args) {
        /*
        final int NR_OF_STUDENTS = 5;
        Slack slack = new Slack();

        Student[] students = new Student[NR_OF_STUDENTS];
        Character c = 'A';
        for(int index=0; index < students.length; index++)
        {
            students[index] = new Student(c.toString());
            c++;
            students[index].setPublisher(slack);
        }
        slack.publishNews();

        System.out.println();
        students[1].removePublisher(slack);
        students[3].removePublisher(slack);
        System.out.println();
        slack.publishNews();

        System.out.println();
        students[1].setPublisher(slack);
        students[2].removePublisher(slack);
        students[4].removePublisher(slack);
        System.out.println();
        slack.publishNews();

        System.out.println();
        students[0].removePublisher(slack);
        students[1].removePublisher(slack);
        students[3].setPublisher(slack);
        System.out.println();
        slack.publishNews();
         */
    }

    // Ausgabe sollte ungefähr so aussehen:
    // A registered!
    //      B registered!
    //      C registered!
    //      D registered!
    //      E registered!
    //      D received Breaking News 1
    //      C received Breaking News 1
    //      B received Breaking News 1
    //      A received Breaking News 1
    //      E received Breaking News 1
    //
    //
    //      B deregistered!
    //      D deregistered!
    //
    //
    //      C received Breaking News 2
    //      A received Breaking News 2
    //      E received Breaking News 2
    //
    //
    //      B registered!
    //      C deregistered!
    //      E deregistered!
    //
    //
    //      B received Breaking News 3
    //      A received Breaking News 3
    //
    //
    //      A deregistered!
    //      B deregistered!
    //      D registered!
    //
    //
    //      D received Breaking News 4

}
