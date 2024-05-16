public class JavaVirtualThread {

    public static void main(String[] args){
        Runnable runnable = () -> {
            for(int i = 0; i<10;i++){
                System.out.print("Runnable for Virtual thread");
            }
        };
        Thread.ofVirtual().start(runnable);
    }
}
