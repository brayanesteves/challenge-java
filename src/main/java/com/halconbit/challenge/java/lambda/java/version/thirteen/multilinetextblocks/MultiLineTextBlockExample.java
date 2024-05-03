package com.halconbit.challenge.java.lambda.java.version.thirteen.multilinetextblocks;

public class MultiLineTextBlockExample {
    
    public String multiLineTextBlock() {
        return """
               Hello World
               Using
               text blocks !
               """;
    }
    
    public String phrase() {
        return """
               {
                    {
                        employee:"Mike",
                        employeeId:10001,
                        employeeType:FT
                    }
               }
               """;
    }
    
    public String html() {
        return """
               <html>
                    <head>
                    </head>
                    
                    <body>
                        <main>
                            <p>"Java, Programing"</p>
                        </main>
                        
                        <footer>
                        </footer>
                    </body>
               </html>
               """;
    }
    
}