package pro.chapter19;

public class LogicTest {
    public static void main(String[] args) {
        //1 - входит в группу сд юзерс
        //2 - входит в группу сд юзерс 2
        int x = 1; // first
        int y = 0; // two

        if (x!=1 || x!=2) {
            System.out.println("х - не сотрудник кк");
        }

        if ((x!=1 && x!=2) || (y!=1 && y!=2)) {

            if ((x!=1 || x!=2) && (y!=1 || y!=2)) {
                System.out.println("оба не сотрудники кк");
            }
            else if ((x==1 || x==2) && (y!=1 && y!=2)) {
                System.out.println("y не сотрудник кк");
            }
            else if ((x!=1 && x!=2) && (y==1 || y==2)) {
                System.out.println("x не сотрудник кк");
            }

        }


    }

    void inGroupSD1(int x) {

    }
}
