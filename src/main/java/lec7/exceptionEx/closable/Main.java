package lec7.exceptionEx.closable;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
//
//
//
//        try(BufferedReader bufferedReader = new BufferedReader(null)){
//            bufferedReader.read();
//            //...
//        } catch (IOException e){
//            //...
//        }
//

        //try-with-resources
        try(CustomReader customReader = new CustomReader()){
            customReader.read();
            //...
        } catch (Exception e){
            //...
        }
    }


    public static class CustomReader implements AutoCloseable{
        public void read(){}

        @Override
        public void close() throws Exception {

        }
    }
}
