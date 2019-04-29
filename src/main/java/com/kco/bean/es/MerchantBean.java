package com.kco.bean.es;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.util.Date;

/**
 * @author kco1989
 * @email kco1989@qq.com
 * @date 2019-04-23 09:44
 */
@Data
@Document(indexName = "nposp_es", type = "_doc")
public class MerchantBean {
    @Id
    private String merchant_no;
    @Field
    private String merchant_name;
    private String mobilephone;
    private String agent_no;
    private String team_id;
    private Date create_date;
    private TypeNameBean type_name;
}