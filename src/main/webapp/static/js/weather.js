$(function () {
    $.ajax({
        url: '/weather/getWeather',
        //url:'http://www.sojson.com/open/api/weather/json.shtml',
        type: 'POST', //GET
        async: true,    //或false,是否异步
        data: "cityName=成都",
        //dataType:'jsonp',
        //timeout:5000,    //超时时间
        dataType: 'json',    //返回的数据格式：json/org.project.xml/html/script/jsonp/text
        success: function (data) {
            //console.log(data.HeWeather5[0]);
            //var path="../images/wether/"+data.img;
            //alert(path);
            //$("#ws_im").attr("src",path);
            //$("#city").text(data.cityName);
            $("#city").text(data.HeWeather5[0].basic.city);
            $("#wendu").text(data.HeWeather5[0].daily_forecast[0].tmp.min+"℃-"+data.HeWeather5[0].daily_forecast[0].tmp.max+"℃");
            $("#air").text(data.HeWeather5[0].daily_forecast[0].wind.dir);
            $("#tq").text(data.HeWeather5[0].daily_forecast[0].cond.txt_d);
        }
    });
})