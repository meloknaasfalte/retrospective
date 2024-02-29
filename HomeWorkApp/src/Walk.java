

  public class Walk {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
        for (int i = 0; i < 8; i++) {
            System.out.println(i + Thread.currentThread().getName());
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
        });
    }

}

class Task implements Runnable {

    @Override
    public void run() {

    }
  }

