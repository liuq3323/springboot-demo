package com.example.util;

import java.util.HashMap;
import java.util.Map;

public class ResultNew {

    private Map<String,Object> head;
    private Object body;

    public Map<String, Object> getHead() {
        return head;
    }

    public void setHead(Map<String, Object> head) {
        this.head = head;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public static ResultNew ok(Object result){
        ResultNew resultNew = new ResultNew();
        Map map = new HashMap();
        map.put("rtnCode",Constants.RTN_CODE_SUCCESS);
        map.put("rtnMsg",Constants.RTN_MESSAGE_SUCCESS);
        return putRtnObj(resultNew,map,result);
    }

    public static ResultNew error(Object result, String code, String message){
        ResultNew resultNew = new ResultNew();
        Map map = new HashMap();
        map.put("rtnCode",code);
        map.put("rtnMsg",message);
        return putRtnObj(resultNew,map,result);
    }

    public static ResultNew error(Object result, String message) {
        ResultNew resultNew = new ResultNew();
        Map map = new HashMap();
        map.put("rtnMsg",message);
        map.put("rtnCode",Constants.RTN_CODE_FAIL);
        return putRtnObj(resultNew,map,result);
    }

    public static ResultNew error(Object result) {
        ResultNew resultNew = new ResultNew();
        Map map = new HashMap();
        map.put("rtnMsg",Constants.RTN_MESSAGE_ERROR);
        map.put("rtnCode",Constants.RTN_CODE_FAIL);
        return putRtnObj(resultNew,map,result);
    }

    public static ResultNew putRtnObj(ResultNew resultNew ,  Map map , Object result){
        resultNew.setBody(result);
        resultNew.setHead(map);
        return resultNew;
    }
}
