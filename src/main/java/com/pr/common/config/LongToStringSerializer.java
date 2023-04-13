package com.yl.data.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * @program: troubleshoot
 * @description:
 * @author: ljc
 * @create: 2022-08-10 08:43
 **/

/**
 * 自定义LongToString序列化器
 */
public class LongToStringSerializer extends JsonSerializer<Long> {

    @Override
    public void serialize(Long value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (null != value) {
            gen.writeString(value.toString());
        } else {
            gen.writeNull();
        }
    }
}
