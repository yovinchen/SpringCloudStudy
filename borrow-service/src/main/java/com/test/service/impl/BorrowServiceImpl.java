package com.test.service.impl;


import com.test.entity.Book;
import com.test.entity.Borrow;
import com.test.entity.User;
import com.test.entity.UserBorrowDetail;
import com.test.mapper.BorrowMapper;
import com.test.service.BorrowService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassName: BorrowServiceImpl
 * Package: com.test.service.impl
 *
 * @author yovinchen
 * @Create 2023/8/14 21:25
 */
@Service
public class BorrowServiceImpl implements BorrowService {

    @Resource
    BorrowMapper mapper;

    @Resource
    RestTemplate template;

    @Override
    public UserBorrowDetail getUserBorrowDetailByUid(int uid) {
        List<Borrow> borrow = mapper.getBorrowsByUid(uid);
//        //RestTemplate支持多种方式的远程调用
//        RestTemplate template = new RestTemplate();
//        这里通过调用getForObject来请求其他服务，并将结果自动进行封装
        //获取User信息
        User user = template.getForObject("http://userservice/user/" + uid, User.class);
        //获取每一本书的详细信息
        List<Book> bookList = borrow.stream().map(b -> template.getForObject("http://bookservice/book/" + b.getBid(), Book.class)).collect(Collectors.toList());
        return new UserBorrowDetail(user, bookList);
    }
}
