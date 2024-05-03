
package com.halconbit.challenge.java.lambda.java.version.eleven.http.client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HttpClientExample {
    
    private HttpClient httpClient   = HttpClient.newHttpClient();
    private HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create("https://www.ldapsoft.com")).build();
    private HttpResponse<String> httpResponse;
    
    public HttpResponse<String> httpResponse() {
        try {
            this.httpResponse = this.httpClient.send(this.httpRequest, HttpResponse.BodyHandlers.ofString());
            return this.httpResponse;
        } catch (IOException ex) {
            Logger.getLogger(HttpClientExample.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(HttpClientExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}