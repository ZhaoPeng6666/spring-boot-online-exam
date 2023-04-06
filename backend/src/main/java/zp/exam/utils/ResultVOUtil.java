/***********************************************************
 * @Description : 成功或失败时的消息返回
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023-04-06 18:04
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.utils;

import zp.exam.vo.ResultVO;

public class ResultVOUtil {

    public static ResultVO success(Integer code, String msg, Object object) {
        return new ResultVO(code, msg, object);
    }

    public static ResultVO success(Object object) {
        return new ResultVO(0, "成功", object);
    }

    public static ResultVO success() {
        return new ResultVO(0, "成功", null);
    }


    public static ResultVO error(Integer code, String msg) {
        return new ResultVO(code, msg, null);
    }
}
