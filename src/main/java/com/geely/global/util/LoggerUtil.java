/*
 * @Project: GZJK
 * @Author: zengbin
 * @Date: 2015年10月26日
 * @Copyright: 2000-2015 CMCC . All rights reserved.
 */
package com.geely.global.util;

import com.geely.global.result.ResultCode;
import org.slf4j.Logger;

/** 
* @ClassName: LoggerUtil 
* @Description: Log4J工具类
* @author zengbin
* @date 2019年11月12日 上午9:25:45
*/
public class LoggerUtil {
    
    public static void DEBUG(Logger logger, String message) {
        logger.debug(message);
    }
    
    public static void INFO(Logger logger, String message) {
        logger.info(message);
    }
    
    public static void WARN(Logger logger, String message) {
        logger.warn(message);
    }
    
    public static void ERROR(Logger logger, String message) {
        logger.error(message);
    }

    public static void ERROR(Logger logger , ResultCode resultCode , String message) {
        logger.error("errorCode ： " + resultCode.getCode() + "；" + message);
    }
    
    public static void ERROR(Logger logger, String message, Throwable e) {
        logger.error(message, e);
    }
    
    public static void ERROR(Logger logger, String message, Object... arguments) {
        logger.error(message, arguments);
    }
}
