import { combineReducers } from 'redux';
import CommonReduce from './commonreduce.js';

let reduces = Object.assign({}, CommonReduce)
const erpReduce = combineReducers(reduces)

export default erpReduce;
