package pro.chapter20;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("Задание по таймеру выполняется");
    }


}

class TTest {
    public static void main(String[] args) {
        MyTimerTask myTask = new MyTimerTask();
        Timer myTimer = new Timer();

        /* Установить первоначальную паузу в течение одной секундыб а затем повторять задание каждые полсекунды */

        myTimer.schedule(myTask, 1000, 500);


        try {
            Thread.sleep(5400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myTimer.cancel();
    }
}
