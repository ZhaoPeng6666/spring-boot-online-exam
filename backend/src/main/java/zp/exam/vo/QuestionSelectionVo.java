/***********************************************************
 * @Description : 前端创建问题时的下拉列表选择
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023-04-06 18:13
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import zp.exam.entity.QuestionCategory;
import zp.exam.entity.QuestionLevel;
import zp.exam.entity.QuestionType;
import lombok.Data;

import java.util.List;

@Data
public class QuestionSelectionVo {
    @JsonProperty("types")
    private List<QuestionType> questionTypeList;

    @JsonProperty("categories")
    private List<QuestionCategory> questionCategoryList;

    @JsonProperty("levels")
    private List<QuestionLevel> questionLevelList;
}
