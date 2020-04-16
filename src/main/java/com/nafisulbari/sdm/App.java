package com.nafisulbari.sdm;

import java.io.*;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

public class App {
    public static void main(String[] args) throws IOException {

String URL="http://www.rihatetaw-ler.com/r+xd7galmnha1/FFSetupLite.exe";

//        try (BufferedInputStream in = new BufferedInputStream(new URL(URL).openStream());
//             FileOutputStream fileOutputStream = new FileOutputStream("file")) {
//            byte dataBuffer[] = new byte[1024];
//            int bytesRead;
//            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
//
//                fileOutputStream.write(dataBuffer, 0, bytesRead);
//            }
//        } catch (IOException e) {
//            // handle exception
//        }


        ReadableByteChannel readableByteChannel = Channels.newChannel(new URL(URL).openStream());

        FileOutputStream fileOutputStream = new FileOutputStream("FILE_NAME");
        FileChannel fileChannel = fileOutputStream.getChannel();


        fileOutputStream.getChannel()
                .transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
    }
}
