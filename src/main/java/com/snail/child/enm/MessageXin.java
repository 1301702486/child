package com.snail.child.enm;

import com.snail.child.model.Message;

/**
 * Author: ZhangXinrui
 * Date: 2019/7/2
 * Description: No Description
 */
public enum MessageXin implements Message {
    INCORRECT_PARA(400, "提交参数错误"),
    PARENTFINDCHILD_HAS_EXIST(401, "每人只可发布一则信息，请检查您的发布列表！"),
    PARENTFINDCHILD_NOT_EXIST(402, "发布信息不存在"),
    CHILDFINDPARENT_HAS_EXIST(403, "每人只可发布一则信息，请检查您的发布列表！"),
    CHILDFINDPARENT_NOT_EXIST(404, "发布信息不存在"),
    SUSPECTED_NOT_EXIST(404, "发布信息不存在"),
    INFO_INCOMPLETE(405, "用户信息不完善"),
    NO_MATCH_RESULT(406, "无匹配结果"),
    NO_PHOTO(407, "未上传图片"),
    RELEASEUSER_NOT_EXIST(408, "发布用户不存在，邮件发送失败！"),
    SUCCESS(0, "成功!"),
    ;

    private Integer code;
    private String msg;

    MessageXin(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return msg;
    }

    public void setMessage(String msg) {
        this.msg = msg;
    }
}
