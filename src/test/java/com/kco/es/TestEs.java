package com.kco.es;

import com.kco.bean.es.MerchantBean;
import com.kco.es.repo.MerchantRepository;
import org.apache.lucene.search.join.ScoreMode;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.MatchPhrasePrefixQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.join.query.HasChildQueryBuilder;
import org.elasticsearch.join.query.JoinQueryBuilders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author kco1989
 * @email kco1989@qq.com
 * @date 2019-04-23 09:33
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestEs {
    @Resource
    private MerchantRepository repository;
    @Test
    public void test(){
        Iterator<MerchantBean> merchant = repository.findAllById(Arrays.asList("merchant_258121000001261")).iterator();
        while (merchant.hasNext()) {
            System.out.println("===>" + merchant.next());
        }
        System.out.println("=================");
        QueryBuilder query = QueryBuilders.queryStringQuery("258121000001261");
        Iterable<MerchantBean> search = repository.search(query);
        Iterator<MerchantBean> iterator = search.iterator();
        while (iterator.hasNext()) {
            System.out.println("===>" + iterator.next());
        }
    }

    @Test
    public void test1() {

        BoolQueryBuilder searchQuery = QueryBuilders.boolQuery().must(
                JoinQueryBuilders
                        .hasParentQuery("agent",
                                QueryBuilders.matchPhrasePrefixQuery("agent_node", "0-1446-"),
                                false)
        ).must(
                JoinQueryBuilders.hasChildQuery("mbp",
                        QueryBuilders.boolQuery()
                                .must(QueryBuilders.termQuery("bp_id", "131"))
                                .must(QueryBuilders.termsQuery("status", "1", "2", "3")),ScoreMode.None)

        ).must(
                JoinQueryBuilders.hasChildQuery("order",
                        QueryBuilders.matchAllQuery(), ScoreMode.None).minMaxChildren(1, Integer.MAX_VALUE)
        ).mustNot(
                JoinQueryBuilders.hasChildQuery("mbp", QueryBuilders.termQuery("bp_id", "174"), ScoreMode.None)
        );

        Page<MerchantBean> search = repository.search(searchQuery, PageRequest.of(0, 5));
        search.stream().forEach(System.out::println);
    }
}

