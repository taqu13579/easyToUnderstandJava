package chapter25;

import java.util.concurrent.CompletableFuture;

public class Sample {
    public static void main(String[] args) throws Exception {
        CompletableFuture<Void> future
                = CompletableFuture
                .supplyAsync(() -> "value")
                .thenAccept(result -> {
                  System.out.println("AAA " + result);
                });

        System.out.println("main終了");
    }
}
