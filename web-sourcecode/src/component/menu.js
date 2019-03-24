import React, { Component } from 'react';
import { Menu, Icon } from 'antd';
import '../styles/header.css';
import { connect } from 'react-redux';
import { erpState } from '../action/erpstate';
import { erpAction } from '../action/erpaction';

const SubMenu = Menu.SubMenu;


class LeftMenu extends Component{
    render() {
        let oldVersionURL = this.props.header.oldVersionMarketingURL || "";
        return(
            <Menu mode="inline" theme="dark" inlineCollapsed={false}>
                {/* <SubMenu key="sub1" title={<span><Icon type="tags" /><span>营销活动管理</span></span>}>
                    <Menu.Item key="1">
                        <Icon type="tag" />
                        <span><a style={{'color':'#FFF', textDecoration: "none"}} href={oldVersionURL + "/Activity/MarketingActivity/Index"}>活动管理</a></span>
                    </Menu.Item>
                </SubMenu> */}
                <Menu.Item key="menu1">
                    <Icon type="tags" theme="outlined" />
                    <span><a style={{'color':'#FFF', textDecoration: "none"}} href="#/contract">contract</a></span>
                </Menu.Item>
                <Menu.Item key="menu2">
                    <Icon type="tags" theme="outlined" />
                    <span><a style={{'color':'#FFF', textDecoration: "none"}} href="#/product">product</a></span>
                </Menu.Item>
                <Menu.Item key="menu3">
                    <Icon type="tags" theme="outlined" />
                    <span><a style={{'color':'#FFF', textDecoration: "none"}} href="#/customer">customer</a></span>
                </Menu.Item>
            </Menu>
        );
    }
}

export default connect(erpState, erpAction)(LeftMenu);