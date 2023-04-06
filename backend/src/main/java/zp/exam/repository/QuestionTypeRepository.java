/***********************************************************
 * @Description : 
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023-04-06 18:00
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.repository;

import zp.exam.entity.QuestionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionTypeRepository extends JpaRepository<QuestionType, Integer> {
}
