import fetch from 'isomorphic-fetch'
import loading from '../component/common/loading.js';
import {message} from "antd";
import $ from  'jquery'

const REQUEST_HEADER = {
    'Accept': 'application/json',
    'Content-Type': 'application/json'
}


const actionCreator = function(type, data) {
    return {
        type: type,
        data: data
    }
}

const dispatchAction=function(dispatch,actionType,actionData){
    dispatch(actionCreator(actionType,actionData));
}

const postQuery = function(title, url, param, dispatch){
    loading.show();
    fetch(url, {
        method: 'POST',
        credentials: 'include',
        headers: REQUEST_HEADER,
        body: JSON.stringify(param)
    }).then((response) => {
        loading.hide();
        if (response.ok) {
            return response.json();
        }
    }).then((json) => {
        if(0 == json.code) {
            dispatch(actionCreator(title, json.data));
        } else {
            message.error(json.message);
        }
    }).catch(function (error) { 
        //message.error(error);
        console.log(error);
    });
}

const postQueryThenReturn = function(url, param){
    let result = null;
    loading.show();
    fetch(url, {
        method: 'POST',
        credentials: 'include',
        headers: REQUEST_HEADER,
        body: JSON.stringify(param)
    }).then((response) => {
        loading.hide();
        if (response.ok) {
            return response.json();
        }
    }).then((json) => {
        if(0 == json.code) {
            result = json.data;
        } else {
            message.error(json.message);
        }
    }).catch(function (error) { 
        //message.error(error);
        console.log(error);
    });
}

const maintainItem = function(url, param){
    let result = false;
    loading.show();
    $.ajax({
        type: 'POST',
        url: url,
        async: false,
        contentType: 'application/json; charset=utf-8',
        dataType: 'json',
        data: JSON.stringify(param),
        success: function(data){
            loading.hide();
            if(0 == data.code) {
                result = true;
            } else {
                message.error(data.message);
            }
        },
        error: function(){
            loading.hide();
            message.error("操作失败");
        }
    });
    return result;
}

const maintainThenReturn = function(url, param){
    let result = null;
    loading.show();
    $.ajax({
        type: 'POST',
        url: url,
        async: false,
        contentType: 'application/json; charset=utf-8',
        dataType: 'json',
        data: JSON.stringify(param),
        success: function(json){
            loading.hide();
            if(0 == json.code) {
                result = json.data;
            } else {
                message.error(json.message);
            }
        },
        error: function(){
            loading.hide();
            message.error("操作失败");
        }
    });
    return result;
}

const syncGetItem = function(url, param){
    let result = null;
    loading.show();
    $.ajax({
        type: 'POST',
        url: url,
        async: false,
        contentType: 'application/json; charset=utf-8',
        dataType: 'json',
        data: JSON.stringify(param),
        success: function(json){
            loading.hide();
            if(0 == json.code) {
                result = json.data;
            } else {
                message.error(json.message);
            }
        },
        error: function(){
            loading.hide();
            message.error("获取失败");
        }
    });
    return result;
}

export {REQUEST_HEADER, actionCreator, dispatchAction, postQuery, postQueryThenReturn, maintainItem, maintainThenReturn, syncGetItem}