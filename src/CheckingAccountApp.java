public class CheckingAccountApp {
    public static void main(String[] args) throws InterruptedException {

        final CheckingAccount ca = new CheckingAccount(100);
        Runnable r = new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                try{
                    for (int i = 0; i < 10; i++) {
                        Thread.sleep((int) (Math.random() * 200));
                        System.out.println(name + " withdraws $10: " + ca.withdraw(10));
                    }
                } catch (InterruptedException ie) {
                }

            }
        };
        Thread thdHusband = new Thread(r);
        thdHusband.setName("Husband");
        Thread thdWife = new Thread(r);
        thdWife.setName("Wife");
        thdHusband.start();
        thdWife.start();
    }
}
