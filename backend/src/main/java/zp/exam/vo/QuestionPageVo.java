/***********************************************************
 * @Description : 问题列表反馈给前端的对象
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023-04-06 18:13
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class QuestionPageVo {

    /**
     * 分页时每个分页的大小
     */
    private Integer pageSize;

    /**
     * 当前是在第几页，注意要比前端传过来地小1
     */
    private Integer pageNo;

    /**
     * 一共有多少条符合条件的记录
     */
    private Long totalCount;

    /**
     * 一共有多少页
     */
    private Integer totalPage;

    /**
     * 当前页的详细数据
     */
    @JsonProperty("data")
    private List<QuestionVo> questionVoList;
}
