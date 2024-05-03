package com.halconbit.challenge.java.lambda.java.version.eleven.http.client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AsyncHttpClient {
    
    private HttpClient httpClient   = HttpClient.newHttpClient();
    private HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create("https://www.ldapsoft.com")).build();
    private HttpResponse<String> httpResponse;
    CompletableFuture<Void> completableFuture;
    
    public void completableFuture() {
        try {
            this.completableFuture = this.httpClient.sendAsync(this.httpRequest, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body).thenAccept(System.out::println);
            this.completableFuture.get();
        } catch (InterruptedException ex) {
            Logger.getLogger(AsyncHttpClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(AsyncHttpClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}