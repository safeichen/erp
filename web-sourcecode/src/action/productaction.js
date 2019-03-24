import fetch from 'isomorphic-fetch'
import {
    REQUEST_HEADER,
    maintainItem,
    maintainThenReturn,
    syncGetItem
} from "./commonfunction"

const LIST_PRODUCT_URL = "product/list";
const GET_PRODUCT_URL = "product/detail";
const ADD_PRODUCT_URL = "product/add";
const DELETE_PRODUCT_URL = "product/delete";

function listProduct(param, pageIndex, pageSize){
    return maintainThenReturn(LIST_PRODUCT_URL + "/" + pageIndex + "/" + pageSize, param);
}

function getProduct(id){
    return syncGetItem(GET_PRODUCT_URL + "/" + id, null);
}

function addProduct(param){
    return maintainThenReturn(ADD_PRODUCT_URL, param);
}

function deleteProduct(id){
    return maintainItem(DELETE_PRODUCT_URL + "/" + id, null);
}

export {
    listProduct,
    getProduct,
    addProduct,
    deleteProduct
}