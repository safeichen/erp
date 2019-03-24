import fetch from 'isomorphic-fetch'
import {
    REQUEST_HEADER,
    maintainItem,
    maintainThenReturn,
    syncGetItem
} from "./commonfunction"

const LIST_CUSTOMER_URL = "customer/list";
const GET_CUSTOMER_URL = "customer/detail";
const ADD_CUSTOMER_URL = "customer/add";
const DELETE_CUSTOMER_URL = "customer/delete";

function listCustomer(param, pageIndex, pageSize){
    return maintainThenReturn(LIST_CUSTOMER_URL + "/" + pageIndex + "/" + pageSize, param);
}

function getCustomer(id){
    return syncGetItem(GET_CUSTOMER_URL + "/" + id, null);
}

function addCustomer(param){
    return maintainThenReturn(ADD_CUSTOMER_URL, param);
}

function deleteCustomer(id){
    return maintainItem(DELETE_CUSTOMER_URL + "/" + id, null);
}

export {
    listCustomer,
    getCustomer,
    addCustomer,
    deleteCustomer
}