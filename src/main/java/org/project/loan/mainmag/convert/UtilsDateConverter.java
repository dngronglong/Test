package org.project.loan.mainmag.convert;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilsDateConverter implements WebBindingInitializer {
    /**
     *
     * @param text 来自页面的数据
     */

//    public Date convert(String text) {
//        System.out.println("111");
//        Date date=null;
//        SimpleDateFormat sdf=null;
//        if (StringUtils.hasLength(text)){
//            try {
//                int length=text.length();
//                if(length==10){
//                    sdf=new SimpleDateFormat("yyyy-MM-dd");
//                    System.out.println("进来了");
//                }else {
//                    sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//                }
//                date=sdf.parse(text);
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }
//        }
//        return date;
//    }

    public void initBinder(WebDataBinder binder, WebRequest webRequest) {
        System.out.println(1111);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(df, false));
    }
}
