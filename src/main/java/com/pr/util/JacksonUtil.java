package com.pr.util;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author: zjr
 * @create: 2022/4/8 1:03 AM
 * @description: 相同属性类转换
 **/
public class JacksonUtil {
    private static final String UTF_8 = "UTF-8";
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static final JavaTimeModule JTM = new JavaTimeModule();

    public JacksonUtil() {
    }

    public static <T> String toJSONString(T value) {
        if (value == null) {
            return null;
        } else {
            Class<?> clazz = value.getClass();
            if (clazz != Integer.TYPE && clazz != Integer.class) {
                if (clazz == String.class) {
                    return (String) value;
                } else if (clazz != Long.TYPE && clazz != Long.class) {
                    try {
                        return OBJECT_MAPPER.writeValueAsString(value);
                    } catch (JsonProcessingException var3) {
                        var3.printStackTrace();
                        return null;
                    }
                } else {
                    return "" + value;
                }
            } else {
                return "" + value;
            }
        }
    }

    public static <T> T parseObject(String json, Class<T> clazz) {
        try {
            return OBJECT_MAPPER.readValue(json, clazz);
        } catch (IOException var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public static <E> List<E> parseList(String json, Class<E> clazz) {
        try {
            return (List) OBJECT_MAPPER.readValue(json, OBJECT_MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
        } catch (IOException var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public static <K, V> Map<K, V> parseMap(String json, Class<K> kClass, Class<V> vClass) {
        try {
            return (Map) OBJECT_MAPPER.readValue(json, OBJECT_MAPPER.getTypeFactory().constructMapType(Map.class, kClass, vClass));
        } catch (IOException var4) {
            var4.printStackTrace();
            return null;
        }
    }

    public static <T> T convertToObj(Object value, Class<T> clazz) {
        try {
            String jsonString = OBJECT_MAPPER.writeValueAsString(value);
            return OBJECT_MAPPER.readValue(jsonString, clazz);
        } catch (IOException var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public static <T> List<T> convertToList(List list, Class<T> clazz) {
        try {
            String jsonString = OBJECT_MAPPER.writeValueAsString(list);
            CollectionType collectionType = TypeFactory.defaultInstance().constructCollectionType(list.getClass(), clazz);
            return (List) OBJECT_MAPPER.readValue(jsonString, collectionType);
        } catch (IOException var4) {
            var4.printStackTrace();
            return Collections.emptyList();
        }
    }

    public static <T> T nativeRead(String json, TypeReference<T> type) {
        try {
            return OBJECT_MAPPER.readValue(json, type);
        } catch (IOException var3) {
            var3.printStackTrace();
            return null;
        }
    }

    public static <T> byte[] toByteArray(T obj) {
        try {
            return OBJECT_MAPPER.writeValueAsString(obj).getBytes(Charset.forName("UTF-8"));
        } catch (JsonProcessingException var2) {
            var2.printStackTrace();
            return null;
        }
    }

    public static <T> T byteArrayToObj(byte[] data, Class<T> clazz) {
        try {
            return OBJECT_MAPPER.readValue(data, clazz);
        } catch (IOException var3) {
            var3.printStackTrace();
            return null;
        }
    }

    static {
        OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        OBJECT_MAPPER.setSerializationInclusion(Include.NON_NULL);
        JTM.addDeserializer(LocalDateTime.class, new JsonDeserializer<LocalDateTime>() {
            public LocalDateTime deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
                Long timestamp = p.getLongValue();
                return LocalDateTime.ofEpochSecond(timestamp / 1000L, 0, ZoneOffset.ofHours(8));
            }
        });
        JTM.addSerializer(LocalDateTime.class, new JsonSerializer<LocalDateTime>() {
            public void serialize(LocalDateTime value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
                gen.writeNumber(value.toInstant(ZoneOffset.ofHours(8)).toEpochMilli());
            }
        });
        OBJECT_MAPPER.registerModule(JTM);
    }
}
