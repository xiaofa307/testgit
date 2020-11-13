package com.chinabulker.bms.shipping.constants;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 常量类
 */
public class Constants {

    //本服务名称
    public  final static String RELATIVE_FILE_PATH = "BMS/SHasddsaING/ohohoho";

    //lot配载
    public final static String IS_ASSIGN= "1";//已配载
    public final static String NOT_ASSIGN= "0";//未配载
    public final static String DELETE_ASSIGN= "9";//作废
    public static final Map<String, String> ASSIGN_STATE_MAP = new HashMap<String, String>(){{
        put(IS_ASSIGN,"已配载");
        put(NOT_ASSIGN,"未配载");
    }};

    /*//内外贸 内贸D  外贸F
    public final static String TRADE_TYPE_IN = "D";
    public final static String TRADE_TYPE_OUT = "F";
    //买入IN  卖出OUT
    public final static String PRCHSD_SELL_TYPE_BUY = "IN";
    public final static String PRCHSD_SELL_TYPE_SELL = "OUT";
    //cpinfo中cptype
    public static final String  CP_TYPE_VESSEL = "VESSEL";//船合同
    public static final String  CP_TYPE_CARGO_COA = "CARGO_COA";// COA货物合同
    public static final String  CP_TYPE_CARGO_SINGLE  = "CARGO_SINGLE";// 单票货物合同
    public static final String  CP_TYPE_CARGO_MISC   = "CARGO_MISC";// 拼货货物合同*/

    public final static String ITM_CLASS_FRIGHT = "fright";
    public final static String ITM_CLASS_FRIGHT_CN = "运费";
    public final static String ITM_CLASS_APPEND_FRIGHT = "appendFright";
    public final static String ITM_CLASS_APPEND_FRIGHT_CN = "附加运费";
    public final static String ITM_CLASS_OILAPPEND_CHARGE = "oilAppendCharge";
    public final static String ITM_CLASS_OILAPPEND_CHARGE_CN = "燃油附加费";
    public final static String ITM_CLASS_SPACEBROKEN_CHARGE = "spaceBrokenCharge";
    public final static String ITM_CLASS_SPACEBROKEN_CHARGE_CN = "亏舱费";


    public final static Integer IS_S2RTRANS= 1;//是海进江
    public final static Integer IS_NOT_S2RTRANS= 0;//不是海进江
    public final static String S2R_TYPE_TWO= "01";//海进江业务类型二程01
    public final static String S2R_TYPE_THREE= "02";//海进江业务类型三程02

    public final static String S2R_TYPE_TWO_RINF= "1";//海进江业务类型二程1
    public final static String S2R_TYPE_THREE_RINF= "2";//海进江业务类型三程2

    final public static String VESSEL_SEA = "1"; // 海船
    final public static String VESSEL_RIVER = "2";// 江船

    /**
     * 船舶属性代码与树形工作台nodeUIType对照关系
     */
    public final static Map<String,String> VSL_ATTRIBUTE_TYPE_MAP = new HashMap<String,String>(){{
        //01-自有船
        put("01210001","01");
        //02-内部租入船
        put("01210002","02");
        //03-市场租入船
        put("01210003","03");
        put("01210004","03");
        put("01210005","03");
        //04-背靠背船
        put("01210006","04");
        put("01210007","04");
    }};

    public static final String VOYRELT_ISBEGINEDITABLE_REGVSLVOY = "regVslVoy";

    /**
     * 船舶工作台对应的角色代码 运费业务员、调度业务员、营销/租船业务员
     */
    public static final String[] VSL_ROLE_TYPE = {"bms_shipping_operator","bms_dispatching_operator","bms_shipcharge_operator"};

    public static final String BUSINESS_CODE_GENERAL = "BMS/GENERAL";

    public static final String DICTIONARY_TYPE_CODE_NODE_TYPE = "nodeType";

    public static final String VESSEL_NAME_LANG_EN = "EN";

    /**
     * 航次其他费用邮件类型
     */
    public static final String EMAIL_TYPE_UNCHECK_REMIND = "提醒航次其他费用中存在未确认费用";



    public final static String RNTIN_CP_CD_NOT= "无";//租入船舶合同 "无"，代表自由船

    public final static String RNTVCP_BLLST_NBB= "NBB";//租船合同，空放补贴类型NBB
    public final static String RNTVCP_BLLST_GBB= "GBB";//租船合同，空放补贴类型GBB


    //程租测算，制单状态
    public final static String VC_EST_STATE_INIT= "1";//初始化制单状态1 草稿
    public final static String VC_EST_STATE_APROVE= "4";//程租测算制单状态4 审批
    public final static String VC_EST_STATE_AVAILABLE= "5";//程租测算制单状态5 生效
    public final static String VC_EST_STATE_CANCEL= "9";//未配载，作废


    public final static String VOYANOT_ROUTETYPE_IN= "01";//内贸--航次安排通知单
    public final static String VOYANOT_ROUTETYPE_OUT= "02";//外贸--航次安排通知单


    public final static String VCEST_CINF_RATETYPE_DAYS= "days";//程租测算货物装卸率类型-天
    public final static String VCEST_CINF_RATETYPE_RATE= "rate";//程租测算货物装卸率类型-率


    public final static String VCEST_CINF_RATECLAUSE_SHEX= "SHEX";//程租测算货物装卸率条款-SHEX
    public final static String VCEST_CINF_RATECLAUSE_SATSHEX= "SATSHEX";//程租测算货物装卸率条款-SATSHEX
    public final static String VCEST_CINF_RATECLAUSE_SHINC= "SHINC";//程租测算货物装卸率条款-SHINC
    public final static BigDecimal VCEST_CINF_RATECLAUSE_SHEXDAY= new BigDecimal("5.5");//程租测算货物装卸率条款-SHEX工作天5.5
    public final static BigDecimal VCEST_CINF_RATECLAUSE_SATSHEXDAY= new BigDecimal("4.5");//程租测算货物装卸率条款-SATSHEX工作天4.5
    public final static BigDecimal VCEST_WEEK= new BigDecimal("7");//week new BigDecimal("7")

    public final static String VCEST_VCVCHG_TYPE_RCV= "rcv";//程租测算费用类型，收入
    public final static String VCEST_VCVCHG_TYPE_PAY= "pay";//程租测算费用类型，支出

    public static final String NODE_ARCHIVE = "归档";
    public static final String NODE_CANCEL_ARCHIVE = "取消归档";


    /**
     * 联动测算——执行代码定义
     */
    public static final String EST_BASIC = "A"; //币制、汇率,测算基础项
    public static final String EST_VAVC = "B";  //船舶简单规范
    public static final String EST_CINF = "C";  //货物信息测算
    public static final String EST_VOYPRTS = "D";  //航次挂港信息测算
    public static final String EST_VOYDAYS = "E";  //航次天数计算测算
    public static final String EST_STARTFULE = "F";  //开始存油测算
    public static final String EST_ADDFULE = "G";  //加油信息测算
    public static final String EST_VOYFULECONSUME = "H";  //航次耗油测算
    public static final String EST_ENDFULE = "I";  //结束存油信息
    public static final String EST_STOPRENT = "J";  //停租信息测算
    public static final String EST_INCOMEANDEXPEND = "K"; //变动收入/支出合并测算
    public static final String EST_FIXEDCOST = "L"; //固定成本测算
    public static final String EST_CONCLUSION = "M"; //结论信息测算

    /**
     * 联动测算，联动项-执行代码 对应关系
     */
    public final static Map<String,String> DYANMIC_EST_TYPE = new HashMap<String,String>(){{
        put("estvavc","I,H,D,K,E,M");//船舶规范修改
        put("extraDaysInPort","I,H,D,E,M");//在港浮动天
        put("extraDaysAtSea","I,H,D,E,M");//航线天浮动比例
        put("estiinf","G,H,D,K,E,M");//挂港列表中的信息发生变化
        put("estcinf","I,H,D,K,E,M");//货物信息
        put("tuneConsumeOil","H,M");//tuneConsumeOil
        put("mktOilPrc","");//市场油价

        put("offHireDays","M");//停租时间
        put("offHireCharge","M");//停租费用
        put("otherCharge","M");//变动成本，变动支出
        put("rcvDeficitCpt","M");//亏仓补偿费
        put("rcvOilCpt","M");//燃油补偿费
        put("fixNbb","M");//NBB
        put("estportcharge","M");//租船填写的港口使费预估



    }};

    /**
     *
     */
    public static final String EST_CINF_PARAM = "estcinf";  //入参为货物信息区域内容变更联动测算请求。


    /**
     * 背靠背单据类型
     */
    public final static String INT_BTB_MODEL_TYPE_CONTRACT ="CONTRACT";// 合同
    public final static String INT_BTB_MODEL_TYPE_ARRANGEMENT_NOTE ="ARRANGEMENT_NOTE";// 航次安排通知单
    public final static String INT_BTB_MODEL_TYPE_VOYAGE_PREDICTION ="VOYAGE_PREDICTION";// 航次预测

    /**
     * 背靠背业务状态
     */
    public final static String INT_BTB_STATE_INIT= "1";//草稿
    public final static String INT_BTB_STATE_APROVE= "4";// 审批
    public final static String INT_BTB_STATE_AVAILABLE= "5";//生效
    public final static String INT_BTB_STATE_CANCEL= "9";//作废

    /**
     * 背靠背业务制单顺序号
     */
    public final static Integer INT_BTB_ORDER_NO_ONE =1;// 1
    public final static Integer INT_BTB_ORDER_NO_TWO =2;// 2
    public final static Integer INT_BTB_ORDER_NO_THREE =3;// 3
    public final static Integer INT_BTB_ORDER_NO_FOUR =4;// 4
    public final static Integer INT_BTB_ORDER_NO_FIVE =5;// 5
    public final static Integer INT_BTB_ORDER_NO_SIX =6;// 6
    public final static Integer INT_BTB_ORDER_NO_SEVEN =7;// 7
    public final static Integer INT_BTB_ORDER_NO_EIGHT =8;// 8

    /**
     * 背靠背业务模式
     */
    public final static String INT_BTB_MODEL_TYPE_VC= "VC";//VC
    public final static String INT_BTB_MODEL_TYPE_EXTERNAL_BTB= "external_BTB";// 外部背靠背
    public final static String INT_BTB_MODEL_TYPE_UNDETERMINED= "undetermined";//配船待定


    /**
     * 交叉航次，港口标识为上航次交叉/下航次交叉
     */
    public final static String VOYPRTS_PRE_CROSS= "pre";//与上航次交叉
    public final static String VOYPRTS_NEXT_CROSS= "next";//与下航次交叉

    public final static String CPINFO_FLOW_ID_SECOND= "2";


}
