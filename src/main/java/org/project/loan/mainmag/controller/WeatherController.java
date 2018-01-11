package org.project.loan.mainmag.controller;

import org.project.loan.utils.GetUrl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/weather")
public class WeatherController {
    @RequestMapping(value = "/getWeather",method= RequestMethod.POST)
    public@ResponseBody String getWeather(String cityName) {
        //System.out.println(cityName);
        //WeatherBean bean=new WeatherBean();
//        WeatherWS ws=new WeatherWSLocator();
//        WeatherWSSoap_PortType ww=ws.getWeatherWSSoap();
//        ArrayOfString array=ww.getWeather("成都",null);
//        String[] list=array.getString();
//        List<String> ll= Arrays.asList(list);
//        System.out.println(ll);
//        bean.setCityName(list[1]);
//        bean.setProvince(list[0]);
//        bean.setImg(list[10]);
//        bean.setAir(list[5]);
//        bean.setWenDu(list[4]);
        return GetUrl.getJson(cityName);
    }
}
