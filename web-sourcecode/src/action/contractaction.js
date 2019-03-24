import fetch from 'isomorphic-fetch'
import {
    REQUEST_HEADER,
    maintainItem,
    maintainThenReturn,
    syncGetItem
} from "./commonfunction"

const LIST_CONTRACT_URL = "contract/list";
const GET_CONTRACT_URL = "contract/detail";
const ADD_CONTRACT_URL = "contract/add";
const DELETE_CONTRACT_URL = "contract/delete";

function listContract(param, pageIndex, pageSize){
    return maintainThenReturn(LIST_CONTRACT_URL + "/" + pageIndex + "/" + pageSize, param);
}

function getContract(id){
    return syncGetItem(GET_CONTRACT_URL + "/" + id, null);
}

function addContract(param){
    return maintainThenReturn(ADD_CONTRACT_URL, param);
}

function deleteContract(id){
    return maintainItem(DELETE_CONTRACT_URL + "/" + id, null);
}

export {
    listContract,
    getContract,
    addContract,
    deleteContract
}