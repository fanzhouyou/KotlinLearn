import java.security.InvalidParameterException;
import com.google.gson.Gson;

public class JsonUtil {
    private static final String TAG = "JsonUtil";

    /**
     * Gson解析不用每次都new一个，这里做一个公共的
     */
    private static final Gson GSON = new Gson();
    /**
     * 对象转换成json字符串
     * <p><b>对象的数据格式必须符合json的数据格式才能成功转换</b>
     * @param object
     * @return
     * @throws Exception
     */
    public static <T> String toJsonString(T object) throws Exception {
        if (object == null) {
            throw new InvalidParameterException();
        }
        try {
            String content = GSON.toJson(object);
            return content;
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * 对象转换成json字符串之后再转换成字节数组
     * <p><b>对象的数据格式必须符合json的数据格式才能成功转换</b>
     * @param object
     * @return
     * @throws Exception
     */
    public static <T> byte[] toJsonBytes(T object) throws Exception{
        String content = toJsonString(object);
        if (content != null) {
            return content.getBytes();
        }
        return null;
    }

    /**
     * 把json格式的字符串转换成对象
     * <p><b>对象的数据格式必须符合json的数据格式才能成功转换</b>
     * @param json
     * @param clazz
     * @return
     * @throws Exception
     */
    public static <T> T fromJsonString(Class<T> clazz, String json) throws Exception {
        if (json == null || json.length() == 0 || clazz == null) {
            throw new InvalidParameterException();
        }
        T object = null;
        long startTime = System.currentTimeMillis();
        try {
            object = GSON.fromJson(json, clazz);
        } catch (Exception e) {
            throw e;
        }

        long endTime = System.currentTimeMillis();
        return object;
    }

}
