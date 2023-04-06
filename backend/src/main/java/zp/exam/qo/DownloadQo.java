package zp.exam.qo;
 
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
/***********************************************************
 * @note      : 要下载的文件的路径
 * @author    :  赵鹏
 * @version   : V1.0 at 2023/4/6 17:55
 ***********************************************************/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DownloadQo {
    String path;
}
