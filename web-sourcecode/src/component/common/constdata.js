const PAGE_TYPE = [
    {key: 1, value: "旅游首页"},
    {key: 2, value: "跟团游"},
    {key: 3, value: "私家团"}
];

const FLOOR_TYPE = [
    {key: 1, value: "搜索广告位", pageType: 1},
    {key: 2, value: "营销通栏", pageType: 1},
    {key: 3, value: "宫格", pageType: 1},
    {key: 4, value: "礼包弹窗", pageType: 1},
    {key: 5, value: "当地玩乐-海外", pageType: 1},
    {key: 6, value: "特价旅游", pageType: 1},
    {key: 7, value: "目的地推荐", pageType: 1},
    {key: 8, value: "旅游头条", pageType: 1},
    {key: 9, value: "特色跟团游", pageType: 2},
    {key: 10, value: "主题跟团游", pageType: 2},
    {key: 11, value: "目的地片区宫格", pageType: 3},
    {key: 12, value: "人气主题游", pageType: 3},
    {key: 13, value: "为你推荐", pageType: 3},
    {key: 14, value: "当地玩乐-国内", pageType: 1},
    {key: 15, value: "横滑卡片", pageType: 1},
    {key: 16, value: "旅行日历", pageType: 1},
    {key: 17, value: "门店", pageType: 1},
];

const USER_LABEL = [
    {key: 1, value: "有意图"},
    {key: 2, value: "无意图"},
    {key: 4, value: "行前"},
    {key: 8, value: "行中"}
];

const USER_TYPE = [
    {key: 1, value: "未领礼包的度假新用户"},
    {key: 2, value: "礼包过期的度假新用户"}
];

const PLATFORM_TYPE = [
    {key: 1, value: "Android"},
    {key: 2, value: "IOS"},
    {key: 4, value: "H5"},
];

const AREA_TYPE = [
    {key: 1, value: "境内"},
    {key: 2, value: "境外"}
];

const TEST_EDITION = [
    {key: "A", value: "A版"},
    {key: "B", value: "B版"},
    {key: "C", value: "C版"},
    {key: "D", value: "D版"},
    {key: "E", value: "E版"}
];

const THEME_PAGE_TYPE = [
    {key: 1, value: "搜索列表页"},
    {key: 2, value: "攻略文章页"},
    {key: 3, value: "产品详情页"},
    {key: 4, value: "营销专辑页"},
];

const PRIORITY_LIST= [
    {key: 0, value: "P0"},
    {key: 1, value: "P1"},
    {key: 2, value: "P2"},
    {key: 3, value: "P3"},
    {key: 4, value: "P4"},
    {key: 5, value: "P5"},
    {key: 6, value: "P6"},
    {key: 7, value: "P7"},
    {key: 8, value: "P8"},
    {key: 9, value: "P9"},
    {key: 10, value: "P10"}
];

const STORE_PREFERANCE = [
    {key: 1, value: "不偏好"},
    {key: 2, value: "不明显"}
];

const LATTICEFLOOR_DEFAULT_COUNT = 3;//宫格楼层默认行数
const LATTICE_PRE_FLOOR = 5;//宫格楼层每层固定宫格

const FORMITEMLAYOUT_4_20 = {
    labelCol:{
        xs: { span: 24 },
        sm: { span: 4 }
    },
    wrapperCol: {
        xs: { span: 24 },
        sm: { span: 20 }
    }
}

const FORMITEMLAYOUT_6_18 = {
    labelCol:{
        xs: { span: 24 },
        sm: { span: 6 }
    },
    wrapperCol: {
        xs: { span: 24 },
        sm: { span: 18 }
    }
}


export {FLOOR_TYPE,THEME_PAGE_TYPE,PAGE_TYPE, USER_LABEL, USER_TYPE, PLATFORM_TYPE, 
    AREA_TYPE, TEST_EDITION, PRIORITY_LIST, LATTICEFLOOR_DEFAULT_COUNT, LATTICE_PRE_FLOOR, 
    FORMITEMLAYOUT_4_20, FORMITEMLAYOUT_6_18, STORE_PREFERANCE}