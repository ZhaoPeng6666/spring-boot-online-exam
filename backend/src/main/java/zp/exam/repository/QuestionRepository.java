/***********************************************************
 * @Description : 
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023-04-06 18:00
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.repository;

import zp.exam.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, String> {
    List<Question> findByQuestionTypeId(Integer id);
    @Query("select q from Question q order by q.updateTime desc")
    List<Question> findAll();
}
