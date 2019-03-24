import React from 'react';
import ReactDOM from 'react-dom';
import { createStore } from 'redux';
import { Provider } from 'react-redux';
import './index.css';
import 'antd/dist/antd.css';
import App from './App';

import {HashRouter} from 'react-router-dom';
import erpReduce from './reduce/erpreduce';

let store = createStore(erpReduce);

ReactDOM.render(
    <Provider store={store}>
        <HashRouter>
            <App />
     </HashRouter>
    </Provider>, 
    document.getElementById('root')
);