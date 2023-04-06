/***********************************************************
 * @Description : 
 * @author      : 赵鹏(Zhao Peng)
 * @date        : 2023/04/06 17:57
 * @email       : 3126376451@qq.com
 ***********************************************************/
package zp.exam.repository;

import zp.exam.entity.ExamRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExamRecordRepository extends JpaRepository<ExamRecord, String> {
    /**
     * 获取指定用户参加过的所有考试
     *
     * @param userId 用户id
     * @return 用户参加过的所有考试
     */
    List<ExamRecord> findByExamJoinerIdOrderByExamJoinDateDesc(String userId);
}
