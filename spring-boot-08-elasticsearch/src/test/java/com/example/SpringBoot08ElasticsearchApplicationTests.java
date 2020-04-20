package com.example;

import com.example.domain.User;
import com.example.repostory.UserRepository;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
class SpringBoot08ElasticsearchApplicationTests {

    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

    @Autowired
    private UserRepository userRepository;

    @Test
    void contextLoads() {
        this.elasticsearchRestTemplate.createIndex(User.class);
        this.elasticsearchRestTemplate.putMapping(User.class);
    }

    @Test
    public void addTest() {
        this.userRepository.save(new User(1L, "张三,法外狂徒", 20, "123456"));
    }

    @Test
    public void addListTest() {
        this.userRepository.saveAll(Stream.of(
                new User(1L, "张三,法外狂徒", 20, "123456"),
                new User(2L, "川普,手风琴大师", 21, "123456"),
                new User(3L, "德洛丽丝,贼漂亮", 22, "123456"),
                new User(4L, "威廉,被游戏玩", 23, "123456"),
                new User(5L, "小粉,我是谁，我在哪", 24, "123456")
        ).collect(Collectors.toList()));
    }

    @Test
    public void findAllTest() {
        this.userRepository.findAll().forEach(System.out::println);
    }

    @Test
    public void findTest() {
        System.out.println(this.userRepository.findById(3L));
    }

    @Test
    public void findByAgeBetweenTest() {
        this.userRepository.findByAgeBetween(22, 23).forEach(System.out::println);
    }

    @Test
    public void findByNameTest() {
        this.userRepository.findByName("德洛丽丝").forEach(System.out::println);
    }

    @Test
    public void findByQueryTest(){
        this.userRepository.findByQuery(21,24,23,25).forEach(System.out::println);
    }

    @Test
    void testNativeQuery(){
        // 自定义查询构建器
        NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
        // 构建查询
        queryBuilder.withQuery(QueryBuilders.matchQuery("name", "漂亮"));
        // 构建分页条件
        queryBuilder.withPageable(PageRequest.of(0, 2));
        // 构建排序条件
        queryBuilder.withSort(SortBuilders.fieldSort("age").order(SortOrder.DESC));
        queryBuilder.withHighlightBuilder(new HighlightBuilder().field("name").preTags("<em>").postTags("</em"));
        // 执行查询
        Page<User> userPage = this.userRepository.search(queryBuilder.build());
        System.out.println("命中数：" + userPage.getTotalElements());
        System.out.println("页数：" + userPage.getTotalPages());
        userPage.getContent().forEach(System.out::println);
        System.out.println(userPage.toString());
    }
}
