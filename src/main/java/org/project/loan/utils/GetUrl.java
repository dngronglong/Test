package org.project.loan.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class GetUrl {
    public static String getJson(String url){
        try {
            url= URLEncoder.encode(url,"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        StringBuilder json = new StringBuilder();
        String ur="https://free-api.heweather.com/v5/forecast?city="+url+"&key=8943359c415a4ab9a2964c4a8ff8f8e8";
        try {
            //System.out.println("ss"+ur);
            URL urlObject=new URL(ur);
            URLConnection uc=urlObject.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream(),"utf-8"));
            String inputLine = null;
            while ( (inputLine = in.readLine()) != null) {
                json.append(inputLine);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //String js=json.toString().replace("jQuery191034642999175022426_1489023388639","").replace("(","").replace(")","");
        return json.toString();
    }
    public static String getUrl(String hash){
        return null;
    }
}
