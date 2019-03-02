package com.codingapi.tm.redis.service;

import com.codingapi.tm.netty.model.TxGroup;

import java.util.List;

/**
 * @Title:RedisServerService
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/20下午5:08
 * @m444@126.com
 */
public interface RedisServerService {

    String loadNotifyJson();

    void saveTransaction(String key, String json);

    TxGroup getTxGroupByKey(String key);

    void saveComensateMsg(String name, String json);

    List<String> getKeys(String key);

    List<String> getValuesByKeys(List<String> keys);

    String getValueByKey(String key);

    void deleteKey(String key);

    void saveLoadBalance(String groupName, String key, String data);

    String getLoadBalance(String groupName, String key);
}
