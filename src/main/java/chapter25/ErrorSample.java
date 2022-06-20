package chapter25;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class ErrorSample {
    public static void main(String[] args) {
        CompletableFuture<String> future
                = CompletableFuture
                .supplyAsync(() -> "hello")
                .orTimeout(1, TimeUnit.SECONDS)
                .whenComplete((ret, err) -> {
                   if (err == null) {
                       System.out.println("AAA " + ret);
                   } else {
                       System.out.println("エラーです。");
                   }
                });
    }
}
