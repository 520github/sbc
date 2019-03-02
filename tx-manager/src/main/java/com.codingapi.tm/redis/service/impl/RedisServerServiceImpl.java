package com.codingapi.tm.redis.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.codingapi.tm.config.ConfigReader;
import com.codingapi.tm.netty.model.TxGroup;
import com.codingapi.tm.redis.service.RedisServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * @Title:RedisServerServiceImpl
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/20下午7:47
 * @m444@126.com
 */
@Service
public class RedisServerServiceImpl implements RedisServerService {
    @Autowired
    private ConfigReader configReader;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public String loadNotifyJson() {
        Set<String> keys =  redisTemplate.keys(configReader.getKey_prefix_compensate()+"*");
        ValueOperations<String,String> value =  redisTemplate.opsForValue();
        JSONArray jsonArray = new JSONArray();
        for(String key: keys) {
            String json = value.get(key);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("key", key);
            jsonObject.put("value", JSONObject.parse(json));
            jsonArray.add(jsonObject);
        }
        return jsonArray.toJSONString();
    }

    @Override
    public void saveTransaction(String key, String json) {

    }

    @Override
    public TxGroup getTxGroupByKey(String key) {
        return null;
    }

    @Override
    public void saveComensateMsg(String name, String json) {

    }

    @Override
    public List<String> getKeys(String key) {
        return null;
    }

    @Override
    public List<String> getValuesByKeys(List<String> keys) {
        return null;
    }

    @Override
    public String getValueByKey(String key) {
        return null;
    }

    @Override
    public void deleteKey(String key) {

    }

    @Override
    public void saveLoadBalance(String groupName, String key, String data) {

    }

    @Override
    public String getLoadBalance(String groupName, String key) {
        return null;
    }
}
