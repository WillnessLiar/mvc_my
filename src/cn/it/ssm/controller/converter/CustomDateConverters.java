package cn.it.ssm.controller.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDateConverters implements Converter<String,Date> {

    @Override
    public Date convert(String source) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            if(!"".equals(source)){
                return simpleDateFormat.parse(source);

            }
         } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
