import React, { Component } from 'react';
import { Layout, Icon } from 'antd';
import '../styles/header.css';
import { connect } from 'react-redux';
import { erpState } from '../action/erpstate';
import { erpAction } from '../action/erpaction';

const { Header } = Layout;

class BlueHeader extends Component{
    componentDidMount() {
        //首次进入 默认加载数据
        //this.props.initHeader();
    }

    render() {
        let headerData = this.props.header;
        return(
            <Header style={{ background: '#3c8dbc', padding: 0 ,height: '50px' ,lineHeight: '50px',position: 'relative'}}>
                <div className="top-header">
                    <div className="top-right">
                        <p className="fast-link">
                            <a href="javascript:void(0);">欢迎您：{ headerData ? headerData.userId : ""}</a>
                            {/* <a href={headerData ? headerData.changePwdURL : ""}>口令</a> */}
                            <a href={headerData ? headerData.logOutURL : ""}>注销</a>
                        </p>
                    </div>
                </div>
            </Header>
        )
    }
}

export default connect(erpState, erpAction)(BlueHeader);