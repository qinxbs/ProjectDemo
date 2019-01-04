package PbUtils;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class JSONUtils {
    private static ObjectMapper mapper = null;
    private static String TAG = JSONUtils.class.getSimpleName();

    static {
        mapper = new ObjectMapper();
        //	mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//		mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        mapper.configure(Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
    }

    /**
     * java对象转换成JSON字符串（异常已catch）
     *
     * @param value
     * @return
     * @update:
     */
    public static String toJSONString(Object value) {
        try {
            return mapper.writeValueAsString(value);
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * 转化为JSON字符串，不处理异常
     *
     * @param value
     * @return
     * @throws Exception
     */
    public static String asJSONString(Object value) throws Exception {
        return mapper.writeValueAsString(value);
    }

    /**
     * json string 转化为java HashMap<br/>
     * 被解析的json string 为 任意层次的对象和数组的结构
     * <p>
     * <pre>
     * 例如：
     * {
     * "p1": 1,
     * "p2":
     * [
     * 1,2,
     * {
     * "a": 1,
     * "b": true
     * },
     * "s"
     * ],
     * "p3": {"x": 1,"y": true},
     * "p4": "sss"
     * }
     *
     * 转化关系如下:
     * 数组 [] ==> List,
     * 对象 {} ==> HashMap,
     * 基础类型 ==> 对应的java基础数据类型
     * </pre>
     *
     * @param jsonString
     * @return 包含复杂的不规则结构数据的HashMap
     * @author: gqming
     */
    public static Map<String, Object> toJavaMap(String jsonString) {
        try {
            // 对于泛型,比如Map<String,Object>，Java里的擦除机制是不允许使用Map<String,Object>.class的。
            // Jackson框架考虑到了这一点，如下写法就可以了：
            return mapper.readValue(jsonString, new TypeReference<Map<String, Object>>() {
            });
        } catch (Exception e) {
            return null;
        }
    }

    public static Map<String, String> jsonToMap(String jsonString) {
        try {
            // 对于泛型,比如Map<String,Object>，Java里的擦除机制是不允许使用Map<String,Object>.class的。
            // Jackson框架考虑到了这一点，如下写法就可以了：
            return mapper.readValue(jsonString, new TypeReference<Map<String, String>>() {
            });
        } catch (Exception e) {
            return null;
        }
    }

    public static String mapToJson(Map<String, String> map) {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject();
            for (String key : map.keySet()) {
                jsonObject.put(key, map.get(key));
            }
            return jsonObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * jsonString转换为java对象
     *
     * @param jsonString
     * @return
     */
    public static Object asJavaObject(String jsonString) {
        try {
            return mapper.readValue(jsonString, Object.class);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * json string to java ArrayList
     *
     * @param <E>
     * @param jsonString
     * @param clazz
     * @return
     */
    public static <E> List<E> toJavaList(String jsonString, Class<E> clazz) {
        try {
            /*E[] arr = mapper.readValue(jsonString, clazz);
            return java.util.Arrays.asList(arr);*/
            JavaType javaType = mapper.getTypeFactory().constructParametricType(List.class, clazz);
            return mapper.readValue(jsonString, javaType);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * json string to java Map list
     *
     * @param jsonString
     * @return
     */
    public static List<Map<String, Object>> toJavaMapList(String jsonString) {
        try {
            return mapper.readValue(jsonString,
                    new TypeReference<List<Map<String, Object>>>() {
                    });
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * json string to java object<E>
     *
     * @param <E>
     * @param jsonString
     * @param clazz
     * @return
     */
    public static <E> E toJavaObject(String jsonString, Class<E> clazz) {
        try {
            return mapper.readValue(jsonString, clazz);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * json string to java ArrayList or HashMap or Object
     *
     * @param jsonString
     * @return if the string start with '{' return HashMap ,otherwise return
     * ArrayList
     * @update:
     */
    public static Object toJavaObject(String jsonString) throws Exception {
        if (jsonString == null || jsonString.trim().length() == 0)
            return null;

        char s = jsonString.charAt(0);

        if (s == '{') {
            return mapper.readValue(jsonString, new TypeReference<Map<String, Object>>() {
            });
        } else if (s == '[') {
            return mapper.readValue(jsonString, new TypeReference<List<?>>() {
            });
        }
        throw new Exception("invalid json foramt");
    }

    /**
     * @param map
     * @param xxGridlb
     * @return
     * @author yuedong
     * @todo 传入xxGrid层Map，统一返回xxGridlb层数据，并格式化为List<Map<String, Object>>
     * <p>
     * 若传入的map中不包含xxGridlb节点或xxGridlb节点下数据为空，则返回一个空的list
     */
    public static List<Map<String, Object>> toLbList(Map<String, Object> map, String xxGridlb) {
        List<Map<String, Object>> resList = new ArrayList<Map<String, Object>>();
        if (map != null) {
            if (map.get(xxGridlb) != null && map.containsKey(xxGridlb)) {
                if (map != null && List.class.isAssignableFrom(map.get(xxGridlb).getClass())) {
                    resList = (List<Map<String, Object>>) map.get(xxGridlb);
                } else {
                    resList.add((Map<String, Object>) map.get(xxGridlb));
                }
			/*if (map.get(xxGridlb).getClass().getName().equals("java.util.ArrayList"))
				resList = (List<Map<String, Object>>) map.get(xxGridlb);
			else {
				resList.add((Map<String, Object>) map.get(xxGridlb));
			}*/

            }
        }
        return resList;
    }

    /**
     * bbhtCshReslb
     * @param map
     * @param xxReslb
     * @return
     */
    public static List<Map<String, Object>> toLbListReslb(Map<String, Object> map, String xxReslb) {
        List<Map<String, Object>> resList = new ArrayList<Map<String, Object>>();
        if (map != null) {
            if (map.get(xxReslb) != null && map.containsKey(xxReslb)) {
                if (map != null && List.class.isAssignableFrom(map.get(xxReslb).getClass())) {
                    resList = (List<Map<String, Object>>) map.get(xxReslb);
                } else {
                    resList.add((Map<String, Object>) map.get(xxReslb));
                }
			/*if (map.get(xxGridlb).getClass().getName().equals("java.util.ArrayList"))
				resList = (List<Map<String, Object>>) map.get(xxGridlb);
			else {
				resList.add((Map<String, Object>) map.get(xxGridlb));
			}*/

            }
        }
        return resList;
    }

    /**
     * 解析文件流
     *
     * @param is JSON 文件流
     * @return
     */
    public static String loadFile(InputStream is) {
        try {
            return mapper.readTree(is).toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
