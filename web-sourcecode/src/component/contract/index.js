import React, { Component } from 'react';
import '../../styles/style.css';
import {
    Button,
    Icon,
    Row,
    Col,
    Popconfirm,
    Table,
    Divider,
    message,
    Breadcrumb,
    Select,
    Input
} from 'antd';
import moment from 'moment';
import copyToClipboard from 'copy-to-clipboard';
import { connect } from 'react-redux';
import { erpState } from '../../action/erpstate';
import { erpAction } from '../../action/erpaction';

const { Column } = Table;
const Option = Select.Option;
const timeFormat = "YYYY-MM-DD HH:mm";

class Contract extends Component {

    constructor(props) {
        super(props);
        this.state = {
            pagination: {
                pageSize: 20
            },
            contracts: []
        }
    }

    onChangeText(e) {
        let value = e.target.value;
        let queryCondition = Object.assign({}, this.state.queryCondition, { url: value });
        switch (e.target.name) {
            case "url":
                queryCondition = Object.assign({}, this.state.queryCondition, { url: value });
                break;
            case "allianceid":
                queryCondition = Object.assign({}, this.state.queryCondition, { allianceid: value });
                break;
            case "sid":
                queryCondition = Object.assign({}, this.state.queryCondition, { sid: value });
                break;
            case "ctm":
                queryCondition = Object.assign({}, this.state.queryCondition, { ctm: value });
                break;
            case "key":
                queryCondition = Object.assign({}, this.state.queryCondition, {
                    attributePair: Object.assign({}, this.state.queryCondition.attributePair, { key: value })
                });
                break;
            case "value":
                queryCondition = Object.assign({}, this.state.queryCondition, {
                    attributePair: Object.assign({}, this.state.queryCondition.attributePair, { value: value })
                });
                break;
            default:
                break;
        }
        this.setState({
            queryCondition
        });
    }

    onChangeSelect(value) {
        let queryCondition = Object.assign({}, this.state.queryCondition, { type: value });
        this.setState({
            queryCondition
        });
    }

    onChangePage = (pagination) => {
        const pager = { ...this.state.pagination };
        pager.current = pagination.current;
        this.setState({
            pagination
        }, () => {
            this.listContract();
        });
    }

    listContract = () => {
        const pagination = { ...this.state.pagination };
        let result = this.props.listContract(this.state.queryCondition, pagination.current || 1, pagination.pageSize || 20);
        if(!result) {
            return;
        }
        pagination.total = result.totalCount;
        this.setState({
            pagination,
            contracts: result.vos || []
        });
    }

    render() {
        return (
            <div>
                <div className="tabheader">
                    <h1>contract</h1>
                    {/* <Breadcrumb className="breadcrumb">
                        <Breadcrumb.Item>周边游榜单</Breadcrumb.Item>
                        <Breadcrumb.Item>标签商品库</Breadcrumb.Item>
                    </Breadcrumb> */}
                </div>
                
                <div className="query_box">
                    <Row className="query_mod" type="flex" align="middle">
                        <Col span={2}>
                            <div className="q_title">名称：</div>
                        </Col>
                        <Col span={4}>
                            <Input name="url" style={{ width: 300 }} placeholder="请输入"/>
                        </Col>
                    </Row>
                    <Row className="query_mod" type="flex" justify="space-between" align="middle">
                        <Col span={12}>
                        </Col>
                        <Col >
                            <Button type="primary" className="q_btn">查询</Button>
                            <Button type="primary" className="q_btn">
                                <Icon type="plus" />新增
                            </Button>
                        </Col>
                    </Row>
                    <Table className="v-table" locale={{ emptyText: '暂无数据' }} pagination={this.state.pagination}
                        dataSource={this.state.contracts} onChange={this.onChangePage}>
                        <Column title="序号" dataIndex="id" key="id" width="8%" />
                        <Column title="小程序" width="8%" render={(text, record) => {
                                // let value = record.type + "";
                                // let items = MINIPROGRAM_TYPE.filter(t => t.key == record.type);
                                // if(items.length > 0) {
                                //     value = items[0].value;
                                // }
                                return <span>{1}</span>
                            }}
                        />
                        <Column title="标题" dataIndex="name" key="name" width="8%" />
                        <Column title="URL" dataIndex="url" key="url" width="8%" />
                        <Column title="Allianceid" dataIndex="allianceid" key="allianceid" width="8%" />
                        <Column title="SID" dataIndex="sid" key="sid" width="8%" />
                        <Column title="CTM" dataIndex="ctm" key="ctm" width="8%" />
                    </Table>
                </div>
            </div>
        );
    }
}

export default connect(erpState, erpAction)(Contract);
