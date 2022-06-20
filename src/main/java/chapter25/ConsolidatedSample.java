package chapter25;

import java.util.concurrent.CompletableFuture;

public class ConsolidatedSample {
    public static void main(String[] args) {
        CompletableFuture<String> future
                = CompletableFuture.supplyAsync(() -> "Value")
                .thenCompose(result -> CompletableFuture.supplyAsync(() -> "AAA " + result))
                .whenComplete((ret, err) -> {
                   if (err == null) {
                       System.out.println(ret + " AAA");
                   } else {
                       System.out.println("エラーです。");
                   }
                });
    }
}
