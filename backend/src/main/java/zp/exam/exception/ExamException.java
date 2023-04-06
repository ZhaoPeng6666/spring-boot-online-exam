/***********************************************************
 * @Description : 
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023/04/06 17:53
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.exception;

import zp.exam.enums.ResultEnum;
import lombok.Getter;

@Getter
public class ExamException extends RuntimeException {
    private Integer code;

    public ExamException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public ExamException( Integer code, String message) {
        super(message);
        this.code = code;
    }
}
