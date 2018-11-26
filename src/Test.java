import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.*;

//redis 属于一种非关系型数据库，通过Spring来配置redis,主从复制以及哨兵模式
public class Test {

    static StringRedisTemplate redisTemplate;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        redisTemplate = context.getBean("redisTemplate", StringRedisTemplate.class);

//        testString();
//        testList();
//        testMap();
//        testSet();
        testZset();
    }


    private static void testZset() {
        redisTemplate.opsForZSet().add("sortedSet", "xiaoming", 80);
        redisTemplate.opsForZSet().add("sortedSet", "xiaoming1", 60);

        Set<String> sortedSet = redisTemplate.opsForZSet().range("sortedSet", 0, -1);
        for (String set : sortedSet) {
            System.out.println("set = " + set);
        }
    }

    private static void testSet() {
        redisTemplate.opsForSet().add("set");

    }

    private static void testMap() {
        //增
        redisTemplate.opsForHash().put("hash", "key1", "value1");
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("key2", "value2");
        hashMap.put("key3", "value3");
        redisTemplate.opsForHash().putAll("hash", hashMap);

        //删
        redisTemplate.opsForHash().delete("hash", "key1");

        //改
        redisTemplate.opsForHash().put("hash", "key1", "value2");

        //查
        Object o = redisTemplate.opsForHash().get("hash", "key1");
        System.out.println("o = " + o);
        Map<Object, Object> hash = redisTemplate.opsForHash().entries("hash");
        Set<Object> hash1 = redisTemplate.opsForHash().keys("hash");
        List<Object> hash2 = redisTemplate.opsForHash().values("hash");
        System.out.println("hash.toString() = " + hash.toString());
    }

    private static void testList() {
        //增
        redisTemplate.opsForList().leftPush("list", "value17");
        redisTemplate.opsForList().rightPush("list", "value18");
        redisTemplate.opsForList().leftPushAll("list", "value1", "value2", "value3", "value4", "value5");

        //删
        redisTemplate.opsForList().leftPop("list");
        redisTemplate.opsForList().rightPop("list");
        redisTemplate.opsForList().remove("list", 4, "7");

        //改
        redisTemplate.opsForList().set("list", 0, "7");

        //查
        List<String> list = redisTemplate.opsForList().range("list", 0, -1);
        System.out.println("list = " + list.toString());

    }

    private static void testString() {

        //增
        redisTemplate.opsForValue().set("key1", "value1");

        HashMap<String, String> keyAndValues = new HashMap<>();
        keyAndValues.put("key15", "value15");
        keyAndValues.put("key16", "value16");
        redisTemplate.opsForValue().multiSet(keyAndValues);

        //删
        redisTemplate.delete("key15");

        //改
        redisTemplate.opsForValue().set("key16", "value16-new");

        //查
        String oldKey1Value = redisTemplate.opsForValue().getAndSet("key1", "hello,world");
        redisTemplate.opsForValue().get("key1");
        List<String> keys = new ArrayList<>();
        keys.add("key1");
        keys.add("key2");
        List<String> strings = redisTemplate.opsForValue().multiGet(keys);

    }
}
