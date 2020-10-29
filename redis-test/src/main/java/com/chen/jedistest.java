package com.chen;


import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

import java.util.Set;

public class jedistest {
    public static void main(String[] args) {
        System.out.println("hellow");  //连接reids
        Jedis jedis = new Jedis("192.168.110.128",6379);
        System.out.println(jedis.ping());
        System.out.println(jedis.keys("*"));
        Set<String> set = jedis.keys("*");
        for (String s:set){
            System.out.println(s+"  "+jedis.get(s));
        }
        System.out.println(jedis.move("k1",1));
        System.out.println(jedis.select(1));
        System.out.println(jedis.get("k1"));
        System.out.println(jedis.strlen("k1"));
        jedis.set("java","jedis");
        jedis.append("java","chenyulogn");

        Transaction multi = jedis.multi();
        multi.discard();
        multi.exec();


    }
}
