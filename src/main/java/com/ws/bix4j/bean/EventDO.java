package com.ws.bix4j.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.time.Instant;

/**
 * Created by chenzheqi on 2017/5/3.
 */
public class EventDO {
    @JSONField(name = "eventid")
    private String eventId;
    private int source;
    private int object;
    @JSONField(name = "objectid")
    private String objectId;
    private int acknowledged;
    private Instant clock;
    private int ns;
    private int value;
    @JSONField(name = "r_eventid")
    private String  rEventId;
    @JSONField(name = "c_eventid")
    private String cEventId;
    @JSONField(name = "correlationid")
    private String correlationId;
    @JSONField(name = "userid")
    private String userId;

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getObject() {
        return object;
    }

    public void setObject(int object) {
        this.object = object;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public int getAcknowledged() {
        return acknowledged;
    }

    public void setAcknowledged(int acknowledged) {
        this.acknowledged = acknowledged;
    }

    public Instant getClock() {
        return clock;
    }

    public void setClock(Instant clock) {
        this.clock = clock;
    }

    public int getNs() {
        return ns;
    }

    public void setNs(int ns) {
        this.ns = ns;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getrEventId() {
        return rEventId;
    }

    public void setrEventId(String rEventId) {
        this.rEventId = rEventId;
    }

    public String getcEventId() {
        return cEventId;
    }

    public void setcEventId(String cEventId) {
        this.cEventId = cEventId;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
