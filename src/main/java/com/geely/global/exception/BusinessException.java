package com.geely.global.exception;

import com.geely.global.result.ResultCode;

/** 
* @ClassName: BusinessException
* @Description: 业务异常
* @author zengbin
* @date 2019年11月12日 上午9:25:45
*/
public class BusinessException extends RuntimeException {
    
    private static final long serialVersionUID = 604122701395795861L;
    private ResultCode resultCode;
    
    public BusinessException() {
        super();
    }
    
    public BusinessException(String message) {
        super(String.format("===[errorMessage ：  %s]", message));
    }
    
    public BusinessException(ResultCode resultCode , String message) {
    	super(String.format("===[errorCode ： %s ]===[errorMessage ：  %s]===", resultCode.getCode(), message));
    	this.resultCode = resultCode;
    }

    public BusinessException(ResultCode resultCode , Integer userId , String message) {
        super(String.format("===[errorCode ： %s ]===[userId ： %s]===[errorMessage ：  %s]===", resultCode.getCode(), userId , message));
        this.resultCode = resultCode;
    }
    
    public BusinessException(ResultCode resultCode , String mobile , String message) {
        super(String.format("===[errorCode ： %s ]===[mobile ： %s]===[errorMessage ：  %s]===", resultCode.getCode(), mobile , message));
        this.resultCode = resultCode;
    }

    public BusinessException(ResultCode resultCode , Integer userId , String message, Throwable cause) {
        super(String.format("===[errorCode ： %s ]===[userId ： %s]===[errorMessage ：  %s]===", resultCode.getCode() , userId , message), cause);
        this.resultCode = resultCode;
    }
    
    public BusinessException(ResultCode resultCode , String mobile , String message, Throwable cause) {
        super(String.format("===[errorCode ： %s ]===[mobile ： %s]===[errorMessage ：  %s]===", resultCode.getCode() , mobile , message), cause);
        this.resultCode = resultCode;
    }
    
    public ResultCode getResultCode() {
        return resultCode;
    }
    
    public void setResultCode(ResultCode resultCode) {
        this.resultCode = resultCode;
    }
}
