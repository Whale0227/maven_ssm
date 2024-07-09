package com.whale.service.impl;

import com.whale.controller.Code;
import com.whale.dao.BookDao;
import com.whale.domain.Book;
import com.whale.exception.BusinessException;
import com.whale.exception.SystemException;
import com.whale.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiseImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    @Override
    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    @Override
    public Book getById(Integer id) {
        if(id == 1){
            throw new BusinessException(Code.BUSINESS_ERR,"哈哈哈");
        }
        // 将可能出现的异常进行包装，转换成自定义的异常
        try {
            if(id == 2) {
                int i = 1 / 0;
            }
        }catch (ArithmeticException e){
            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器访问超时，请重试！",e);
        }


        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
