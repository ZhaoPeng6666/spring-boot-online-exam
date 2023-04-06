/***********************************************************
 * @Description : 
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023-04-06 17:59
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.repository;

import zp.exam.entity.QuestionCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionCategoryRepository extends JpaRepository<QuestionCategory, Integer> {
}
