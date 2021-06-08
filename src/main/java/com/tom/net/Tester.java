package com.tom.net;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;

public class Tester {
    public static void main(String[] args) {
//        //TELNET, RFC854
//        try {
////            Socket socket = new Socket("ptt.cc", 23);
////            Socket socket =  new Socket("tw.yahoo.com", 80);
//            Socket socket = new Socket("www.ibm.com", 80);
//            InputStream is = socket.getInputStream();
////            int data = is.read();
////            System.out.println(data);
//            //72, means? ASCII code
//            for (int i = 0; i < 100; i++) {
//                int data = is.read();
//                System.out.print((char)data);
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //API? Application Interface
        try {
            URL url = new URL("http://opendataap2.penghu.gov.tw/resource/files/2021-04-12/c15d4cecd22526cd9e981f56b97ec4af.json");
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            String line = in.readLine();
            while (line != null) {
                System.out.println(line);
                line = in.readLine();

            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
