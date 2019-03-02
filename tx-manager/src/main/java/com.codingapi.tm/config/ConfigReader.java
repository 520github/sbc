package com.codingapi.tm.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Title:ConfigReader
 * @Copyright: Copyright (c) 2018
 * @Description: <br>
 * @Company: sunso-fintech
 * @Created on 2019/1/20下午7:24
 * @m444@126.com
 */
@Component
public class ConfigReader {
    @Value("${tm.socket.port}")
    private int socketPort;

    @Value("${tm.socket.maxconnection}")
    private int socketMaxConnection;

    @Value("${tm.transaction.netty.hearttime}")
    private int transactionNettyHeartTime;

    @Value("${tm.transaction.netty.delaytime}")
    private int transactionNettyDelayTime;

    @Value("${tm.redis.savemaxtime}")
    private int redisSaveMaxTime;

    @Value("${tm.compensate.notifyUrl}")
    private int compensateNotifyUrl;

    @Value("${tm.compensate.auto}")
    private boolean isCompensateAuto;

    @Value("${tm.compensate.tryTime}")
    private int compensateTryTime;

    @Value("${tm.compensate.maxWaitTime}")
    private int compensateMaxWaitTime;

    private final String key_prefix = "tx:manager:default:";

    private final String key_prefix_loadbalance =  "tx:manager:loadbalance:";

    private final String key_prefix_compensate = "tx:manager:compensate:";

    public int getSocketPort() {
        return socketPort;
    }

    public int getSocketMaxConnection() {
        return socketMaxConnection;
    }

    public int getTransactionNettyHeartTime() {
        return transactionNettyHeartTime;
    }

    public int getTransactionNettyDelayTime() {
        return transactionNettyDelayTime;
    }

    public int getRedisSaveMaxTime() {
        return redisSaveMaxTime;
    }

    public int getCompensateNotifyUrl() {
        return compensateNotifyUrl;
    }

    public boolean isCompensateAuto() {
        return isCompensateAuto;
    }

    public int getCompensateTryTime() {
        return compensateTryTime;
    }

    public int getCompensateMaxWaitTime() {
        return compensateMaxWaitTime;
    }

    public String getKey_prefix() {
        return key_prefix;
    }

    public String getKey_prefix_loadbalance() {
        return key_prefix_loadbalance;
    }

    public String getKey_prefix_compensate() {
        return key_prefix_compensate;
    }
}
