import fetch from 'isomorphic-fetch'
import { REQUEST_HEADER, actionCreator, postQuery } from './commonfunction.js';
import { listCustomer, getCustomer, addCustomer, deleteCustomer } from './customeraction';
import { listContract, getContract, addContract, deleteContract } from './contractaction';
import { listProduct, getProduct, addProduct, deleteProduct } from './productaction';

const GET_HEADER_URL = "getHeader";

//初始化
function init(dispatch) {
    fetch(GET_HEADER_URL, {
        method: 'POST',
        credentials: 'include',
        headers: REQUEST_HEADER
    }).then((response) => {
        if (response.ok) {
            return response.json();
        }
    }).then((json) => {
        dispatch(actionCreator('header', json));
    })
}

export function erpAction(dispatch) {
    return {
        initHeader: () => {
            init(dispatch);
        },
        listCustomer: (param, pageIndex, pageSize) => {
            return listCustomer(param, pageIndex, pageSize);
        },
        getCustomer: (id) => {
            return getCustomer(id);
        },
        addCustomer: (param) => {
            return addCustomer(param);
        },
        deleteCustomer: (id) => {
            return deleteCustomer(id);
        },
        listContract: (param, pageIndex, pageSize) => {
            return listContract(param, pageIndex, pageSize);
        },
        getContract: (id) => {
            return getContract(id);
        },
        addContract: (param) => {
            return addContract(param);
        },
        deleteContract: (id) => {
            return deleteContract(id);
        },
        listProduct: (param, pageIndex, pageSize) => {
            return listProduct(param, pageIndex, pageSize);
        },
        getProduct: (id) => {
            return getProduct(id);
        },
        addProduct: (param) => {
            return addProduct(param);
        },
        deleteProduct: (id) => {
            return deleteProduct(id);
        }
    }
}
