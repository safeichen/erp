import React, { Component } from 'react';
import {
    NavLink
  } from 'react-router-dom';
import { connect } from 'react-redux';
import { erpState } from '../action/erpstate';
import { erpAction } from '../action/erpaction';
import '../styles/nav.css';


class MainNav extends Component{
    render() {
        let oldVersionURL = this.props.header.oldVersionMarketingURL || "";
        return(
            <div className="main-nav">
                <div className="main-nav-layout">
                    {/* <a href={ oldVersionURL + "/Instruction/ins.html" }  target="_blank">配置说明</a> */}
                    <NavLink to="/contract">合同管理</NavLink>
                    <NavLink to="/product">產品管理</NavLink>
                    <NavLink to="/customer">客戶管理</NavLink>
                </div>
            </div>
        )
    }
}

export default connect(erpState, erpAction)(MainNav);