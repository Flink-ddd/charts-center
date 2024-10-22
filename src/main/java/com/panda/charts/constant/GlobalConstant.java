package com.panda.charts.constant;

/**
 * @author muxh
 * @version V1.0
 * @since 2021-08-24 18:19
 */
public class GlobalConstant {

    /**
     * 全局KEY前缀
     */
    public static final String SYSTEM_KEY_PREFIX = "search:search_center_key_";

    /**
     * 用于规格和规格明细字符串拼接
     */
    public static final String SKYU_SPECS = "#*#";

    /**
     * 订单数据的最大量
     */
    public static final Integer EXPORT_ORDER_MAX = 50000;

    /**
     * 每次批量入库的最大限制值
     */
    public static final int MAX_INSERT_SIZE = 500;

    /**
     * 调用云仓中心合作商家批处理，一批300个。
     */
    public static final Integer BATCH_SIZE = 300;

    public static final Integer JOB_BATCH_SIZE = 20;

    public static final String NULL = "null";

    /**
     * 物流状态￿设置值
     */
    public static final String LOGISTIC_DICT_FIELD = "logistic_status";
    public static final String LOGISTIC_TABLE_NAME = "order_sub";

    /**
     * 售后状态￿设置值
     */
    public static final String RETURN_DICT_FIELD = "status";
    public static final String RETURN_TABLE_NAME = "order_return";

    /**
     * 当前用户地址限制
     */
    public static final Integer USER_ADDRESS_MAX = 20;

    /**
     * 数字0
     */
    public static final Integer ZERO = 0;

    public static final Long LONG_ZERO = 0L;

    public static final String SOURCE_TYPE = "tencent";

    /**
     * 时间差值
     */
    public static final Long DATE_DIFFERENCE = 1L;

    /**
     * 默认金额
     */
    public static final Double DEFAULT_MONEY = 0.00;

    /**
     * 字符串0
     */
    public static final String ZERO_STR = "0";

    public static final String ONE_STR = "1";

    /**
     * 数字1
     */
    public static final Integer ONE = 1;

    public static final Integer TWO = 2;

    public static final Integer THREE = 3;

    public static final Integer SIX = 6;

    /**
     * 健康通行证access_token
     */
    public static final String ACCESS_TOKEN = "accessToken";
    public static final String USER_ID = "userId";
    public static final String USER_NAME = "username";
    public static final String REAL_NAME = "realname";

    /**
     * 毫秒和秒转换
     */
    public static final Integer MILLISECOND_CONVERT_SECOND = 1000;

    /**
     * 数据模板缓存key
     */
    public static final String ES_DATA_MODE = SYSTEM_KEY_PREFIX + "esDataMode";

    public static final String CHARSET_UTF_8 = "utf-8";

    public static final String ORDER_ALL_TYPE = "全部";

    public static final Integer EXPORT_ENTER_MAX = 80000;

    public static final String LOGISTICS_TYPE = "SF";

    public static final String CUSTOMER_TIPS = "为保障您的课程体验，请微信添加：";

    public static final String FREIGHT_MODE_1 = "全国包邮";

    public static final String FREIGHT_MODE_2 = "偏远地区";

    public static final String RETURN_DEFAULT_MESS = "以实际退款金额为准";

    public static final String RETURN_OTHER_MESS = "--";

    public static String RESP_KEY = "X-REQUEST-ID";

    public static String REQ_KEY = "REQ_KEY";

    public static final String SORT_ASC = "asc";

    public static final Integer VALUE_0 = 0;

    public static final Integer VALUE_1 = 1;

    public static final Integer VALUE_2 = 2;

    public static final String BEFORE_DATA = "{}";



}
