package com.example.exception;

/**
 * @Author: ZJH
 * @Date: 2019/8/30 18:10
 */
public class BaseResultCode {

    public static int FAIL_CODE = 13000;
    public static String FAIL_MSG = "操作失败，请重新请求";

    public static int NO_DATA_CODE = 13001;
    public static String NO_DATA_MSG = "数据为空";

    public static int NULL_INSPECTION_ITEM_CODE = 13003;
    public static String NULL_INSPECTION_ITEM_MSG = "诊疗单数据为空，请重新添加提交";

    public static int NULL_HEIGHTORWEIGHT_CODE = 13004;
    public static String NULL_HEIGHTORWEIGHT_MSG = "身高或体重值为0或空，无法计算";

    public static int NULL_AGE_CODE = 13005;
    public static String NULL_AGE_MSG = "年龄为空，无法计算";

    public static int UNCERTAIN_SEX_CODE = 13006;
    public static String UNCERTAIN_SEX_MSG = "性别为其他，无法计算";

    public static int NULL_ENTERAL_CODE = 13007;
    public static String NULL_ENTERAL_MSG = "肠内营养处方数据为空，请重新添加提交";

    public static int NULL_NUTRITIONAL_DIET_CODE = 13008;
    public static String NULL_NUTRITIONAL_DIET_MSG = "营养膳食数据为空，请重新添加提交";

    public static int FORBID_DELETE_CODE = 13009;
    public static String FORBID_DELETE_MSG = "已收费，不能作废";

    public static int AGE_OUT_RANGE_CODE = 13010;
    public static String AGE_OUT_RANGE_MSG = "年龄为空或者低于2岁时无法计算";

    public static int FORBID_CHARGE_CODE = 13011;
    public static String FORBID_CHARGE_MSG = "已作废，不能收费";

    public static int NO_DATE_FIND_CODE = 13012;
    public static String NO_DATE_FIND_MSG = "该体力活动/人群类型/年龄对应的数据为空，无法计算";
}
