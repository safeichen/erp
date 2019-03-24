import React, { Component } from 'react';
import { Layout } from 'antd';
import './App.css'
import './styles/header.css';
import {
  Route
} from 'react-router-dom';
import LeftMenu from './component/menu'
import BlueHeader from './component/header';
import Customer from './component/customer/index';
import Contract from './component/contract/index';
import Product from './component/product/index';

const { Sider, Content } = Layout;

class App extends Component {
  render() {
    return (
      <Layout style={{height:"100%"}}>
          <Sider trigger={null} collapsible collapsed={false} width={230}>
            <div className="logo">系統</div>
            <LeftMenu />
          </Sider>
          <Layout>
            <BlueHeader />
            <Content style={{ margin: '0 16px 24px 16px',  background: '#fff' }}>
              <Route path="/contract" component={ Contract }/>
              <Route path="/product" component={ Product }/>
              <Route path="/customer" component={ Customer }/>
            </Content>
          </Layout>
      </Layout>
    );
  }
}

export default App;
