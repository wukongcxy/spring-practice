import java.util.List;

/**
 * Created by chenxinyue on 2016/3/16.
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
            InstantiationException {
        Class clazz = Class.forName("java.util.ArrayList");
        List<String> list = ( List<String>) clazz.newInstance();
        list.add("hi");
        System.out.println(list);


    }
}

class Thread1 implements Runnable {

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p/>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override public void run() {
        ThreadLocal<String> threadLocal = new ThreadLocal<String>();
        threadLocal.set("thead1");
        say();

    }

    private void say() {
        ThreadLocal<String> threadLocal = new ThreadLocal<String>();
        System.out.println(threadLocal.get());
    }
}

class Thread2 implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p/>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override public void run() {
        ThreadLocal<String> threadLocal = new ThreadLocal<String>();
        threadLocal.set("thead2");
        say();

    }

    private void say() {
        ThreadLocal<String> threadLocal = new ThreadLocal<String>();
        System.out.println(threadLocal.get());
    }
}



